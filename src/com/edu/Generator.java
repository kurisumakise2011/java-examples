package com.edu;

public interface Generator<T extends HtmlGenerateRequest> {
    String generate(T request);

    boolean applicable(Class<?> clazz);
}
