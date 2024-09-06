package com.johnny.hexagonal.application.ports.in;

import com.johnny.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
