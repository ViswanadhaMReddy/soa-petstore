package com.acme.services;

import com.acme.model.Account;

import javax.jws.WebService;

@WebService(endpointInterface = "com.acme.services.AccountService",
        name = "AccountService",
        serviceName = "AccountService",
        portName = "AccountPortType",
        targetNamespace = "http://acme.com/services")
//        wsdlLocation = "xml/accountservice.wsdl")
public class AccountServiceImpl implements AccountService {

    @Override
    public Account modifyAccount(Account account) {
        return account;
    }

    @Override
    public String deleteAccount(Account account) {
        return "deleted";
    }

    @Override
    public Account createAccount(Account account) {
        return account;
    }
}
