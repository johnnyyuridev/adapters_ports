package com.johnny.hexagonal.adapters.out;

import com.johnny.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.johnny.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.johnny.hexagonal.application.core.domain.Address;
import com.johnny.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String ZipCode) {
        var addressResponse = findAddressByZipCodeClient.find(ZipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }


}
