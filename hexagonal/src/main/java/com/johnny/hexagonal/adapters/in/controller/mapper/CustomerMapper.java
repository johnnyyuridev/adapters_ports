package com.johnny.hexagonal.adapters.in.controller.mapper;


import com.johnny.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.johnny.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.johnny.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
//Mapping usado para ignorar campos indesejados

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target= "address",ignore = true)
    @Mapping(target= "isValidCpf",ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);
    CustomerResponse toCustomerResponse(Customer customer);

}
