package com.johnny.hexagonal.application.ports.out;

import com.johnny.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
