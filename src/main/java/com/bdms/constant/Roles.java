package com.bdms.constant;

public enum Roles {

    ADMIN("A"), USER("U") , PATIENT("P");

    private String value;

    Roles (String value){
    }

    public String getValue() {
        return value;
    }
}
