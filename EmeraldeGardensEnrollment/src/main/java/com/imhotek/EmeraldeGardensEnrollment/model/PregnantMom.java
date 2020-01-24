package com.imhotek.EmeraldeGardensEnrollment.model;

import java.time.LocalDate;

public class PregnantMom implements Client {

    private long id;

    private String firstName;
    private String lastName;
    private LocalDate birthdate;

    private Address currentAddress;
    private PhoneNumber contactPhone;

    public PregnantMom() {
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public LocalDate getBirthDate() {
        return null;
    }

    @Override
    public long getId() {
        return 0;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public PhoneNumber getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(PhoneNumber contactPhone) {
        this.contactPhone = contactPhone;
    }
}
