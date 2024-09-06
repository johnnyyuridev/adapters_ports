package com.johnny.hexagonal.application.ports.out;

import com.johnny.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);

}
