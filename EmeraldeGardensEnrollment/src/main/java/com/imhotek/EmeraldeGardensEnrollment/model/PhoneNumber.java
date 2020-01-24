package com.imhotek.EmeraldeGardensEnrollment.model;

public class PhoneNumber {

    private final int areaCode;
    private final int prefix;
    private final int number;
    private final Integer extension;

    private final String type;

    public PhoneNumber(int areaCode, int prefix, int number, int extension, String type) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.number = number;
        this.extension = extension;
        this.type = type;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getPrefix() {
        return prefix;
    }

    public int getNumber() {
        return number;
    }

    public int getExtension() {
        return extension;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "("+areaCode+") "+prefix+"-"+number+(null!=extension?"ext: "+extension : "");
    }
}
