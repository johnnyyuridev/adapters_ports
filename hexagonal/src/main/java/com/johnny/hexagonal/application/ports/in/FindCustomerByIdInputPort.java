package com.johnny.hexagonal.application.ports.in;

import com.johnny.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}