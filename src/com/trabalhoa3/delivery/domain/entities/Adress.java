package com.trabalhoa3.delivery.domain.entities;

public class Adress {
    private String street, pubicPlace, city, complement, reference;
    private int number;
    private int[] cep= new int[10];
    private char[] federationUnit = new char[2];
    private Location latLong;

    public Adress(String street, String pubicPlace, String city, String complement, String reference, int number, int[] cep, char[] federationUnit) {
        this.street = street;
        this.pubicPlace = pubicPlace;
        this.city = city;
        this.complement = complement;
        this.reference = reference;
        this.number = number;
        this.cep = cep;
        this.federationUnit = federationUnit;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPubicPlace() {
        return pubicPlace;
    }

    public void setPubicPlace(String pubicPlace) {
        this.pubicPlace = pubicPlace;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getCep() {
        return cep;
    }

    public void setCep(int[] cep) {
        this.cep = cep;
    }

    public char[] getFederationUnit() {
        return federationUnit;
    }

    public void setFederationUnit(char[] federationUnit) {
        this.federationUnit = federationUnit;
    }
}
