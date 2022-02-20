package org.example.AssignmentQ4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.AssignmentQ4")
public class Config {
    @Bean
    public BankAccount getBankAccount(){
        BankAccount bankAccount1 = new BankAccount(6677,"Palash Padiya","Saving",62000);
        return bankAccount1;
    }

    @Bean
    public BankAccount getBankAccount1(){
        BankAccount bankAccount1 = new BankAccount(5496,"Nischal","Current",60000);
        return bankAccount1;
    }

}
