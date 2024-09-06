package com.johnny.hexagonal.adapters.out.client.mapper;

import com.johnny.hexagonal.adapters.out.client.response.AddressResponse;
import com.johnny.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);

}
