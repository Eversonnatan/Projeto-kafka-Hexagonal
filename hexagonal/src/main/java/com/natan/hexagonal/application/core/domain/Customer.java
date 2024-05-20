package com.natan.hexagonal.application.core.domain;

public class Customer {

    public  Customer(){
        this.isValidCpf = false;

    }


    public Customer(String id, Boolean isValidCpf, String cpf, Address address, String name) {
        this.id = id;
        this.isValidCpf = isValidCpf;
        this.cpf = cpf;
        this.address = address;
        this.name = name;
    }

    private  String id;

    private  String name;

    private Address address;

    private String cpf;

    private Boolean isValidCpf;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
