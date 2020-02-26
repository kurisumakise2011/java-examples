package com.edu;

public class EmailGenerator implements Generator<EmailRequest> {
    @Override
    public String generate(EmailRequest emailRequest) {
        return "<html><head>" +
                "<title>Email</title>" +
                "</head>" +
                "<body>" +
                "<h3>Meta</h3>" +
                "<p>ID " + emailRequest.meta.id + "</p>" +
                "<p>payload " + emailRequest.meta.payload + "</p>" +
                "</br>" +
                "<p> email " + emailRequest.email + "</p>" +
                "<p> corporate " + emailRequest.corporate + "</p>" +
                "<p> provider " + emailRequest.provider + "</p>" +
                "</body>" +
                "</html>";
    }

    @Override
    public boolean applicable(Class<?> clazz) {
        return clazz == EmailRequest.class;
    }
}
