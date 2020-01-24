package com.imhotek.EmeraldeGardensEnrollment.model;

public class Address {

    private final String street1;
    private final String street2;
    private final String city;
    private final String state;
    private final String zip;
    private final String type;

    public Address(String street1, String street2, String city, String state, String zip, String type) {
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.type = type;
    }

    public String getStreet1() {
        return street1;
    }

    public String getStreet2() {
        return street2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getType() {
        return type;
    }

}
