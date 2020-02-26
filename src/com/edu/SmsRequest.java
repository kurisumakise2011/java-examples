package com.edu;

public class SmsRequest implements HtmlGenerateRequest {
    CommonInfo info;
    String number;
    boolean maySendToViber;

    @Override
    public CommonInfo getMeta() {
        return null;
    }
}
