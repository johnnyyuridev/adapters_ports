package com.johnny.hexagonal.application.core.usecase;

import com.johnny.hexagonal.application.core.domain.Customer;
import com.johnny.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import com.johnny.hexagonal.application.ports.in.FindCustomerByIdInputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort{

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }

}
