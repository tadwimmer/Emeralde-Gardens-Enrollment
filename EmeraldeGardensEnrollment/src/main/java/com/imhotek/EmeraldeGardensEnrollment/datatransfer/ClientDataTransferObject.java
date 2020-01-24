package com.imhotek.EmeraldeGardensEnrollment.datatransfer;

import java.time.LocalDate;

public class ClientDataTransferObject {
    private String furstNane;
    private String lastName;
    private LocalDate birthDay;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;

    public String getFurstNane() {
        return furstNane;
    }

    public void setFurstNane(String furstNane) {
        this.furstNane = furstNane;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
