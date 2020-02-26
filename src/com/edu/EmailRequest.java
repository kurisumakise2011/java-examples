package com.edu;

public class EmailRequest implements HtmlGenerateRequest {
    CommonInfo meta;
    String email;
    String provider;
    boolean corporate;

    @Override
    public CommonInfo getMeta() {
        return meta;
    }

}
