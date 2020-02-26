package com.edu;

public class SmsGenerator implements Generator<SmsRequest> {
    @Override
    public String generate(SmsRequest smsRequest) {
        return "<html><head>" +
                "<title>Sms</title>" +
                "</head>" +
                "<body>" +
                "<h3>Meta</h3>" +
                "<p>ID " + smsRequest.info.id + "</p>" +
                "<p>payload " + smsRequest.info.payload + "</p>" +
                "</br>" +
                "<p> number " + smsRequest.number + "</p>" +
                "<p> viber enabled " + smsRequest.maySendToViber + "</p>" +
                "</body>" +
                "</html>";
    }

    @Override
    public boolean applicable(Class<?> clazz) {
        return clazz == SmsRequest.class;
    }
}
