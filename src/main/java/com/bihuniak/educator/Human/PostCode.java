package com.bihuniak.educator.Human;

import javax.persistence.Embeddable;

@Embeddable
public class PostCode {
    private String number;
    private String cityPostCode;

    public PostCode(String number, String cityPostCode) {
        this.number = number;
        this.cityPostCode = cityPostCode;
    }

    public PostCode() {
    }
}
