package com.johnny.hexagonal.application.ports.out;
import com.johnny.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String ZipCode);

}
