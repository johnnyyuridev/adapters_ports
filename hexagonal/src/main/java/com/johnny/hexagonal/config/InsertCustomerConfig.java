package com.johnny.hexagonal.config;

import com.johnny.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.johnny.hexagonal.adapters.out.InsertCustomerAdapter;
import com.johnny.hexagonal.adapters.out.SendCpfForValidationAdapter;
import com.johnny.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfForValidationAdapter sendCpfForValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfForValidationAdapter);
    }

}