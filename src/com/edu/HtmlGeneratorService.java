package com.edu;

import java.util.HashSet;
import java.util.Set;

public class HtmlGeneratorService {
    private Set<Generator<HtmlGenerateRequest>> generators = new HashSet<Generator<HtmlGenerateRequest>>() {{
        // spring will resolve them
        add((Generator)new EmailGenerator());
        add((Generator)new SmsGenerator());
    }};

    public String provideHtml(HtmlGenerateRequest request) {
        return resolveAndThen(request.getClass()).generate(request);
    }

    private Generator<HtmlGenerateRequest> resolveAndThen(Class<?> clazz) {
        return generators.stream()
                .filter(generator -> generator.applicable(clazz))
                .findFirst()
                .orElseThrow(UnsupportedOperationException::new);
    }
}
