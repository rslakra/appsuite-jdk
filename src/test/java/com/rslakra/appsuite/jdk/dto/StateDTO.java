package com.rslakra.appsuite.jdk.dto;

/**
 * Author: Rohtash Singh Lakra
 * Created: 5/26/20 9:27 PM
 * Version: 1.0.0
 */
public class StateDTO {

    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StateDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
