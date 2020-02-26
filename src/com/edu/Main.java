package com.edu;

public class Main {

    public static void main(String[] args) {
        EmailRequest emailRequest = new EmailRequest();
        emailRequest.provider = "mts";
        emailRequest.corporate = true;
        emailRequest.email = "test@gmal.com";
        emailRequest.meta = new CommonInfo();
        emailRequest.meta.payload = "abc";
        emailRequest.meta.id = "sahay7y89u81";

        SmsRequest smsRequest = new SmsRequest();
        smsRequest.info = new CommonInfo();
        smsRequest.info.id = "saduyy7981u99";
        smsRequest.info.payload = "def";
        smsRequest.number = "123456789";
        smsRequest.maySendToViber = true;

        HtmlGeneratorService service = new HtmlGeneratorService();

        System.out.println(service.provideHtml(emailRequest));
        System.out.println("===============================");
        System.out.println(service.provideHtml(smsRequest));
    }
}
