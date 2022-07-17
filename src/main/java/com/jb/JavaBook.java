package com.jb;

import org.springframework.stereotype.Component;

@Component
public class JavaBook implements Book {
    @Override
    public String[] getSentences() {
        return new String[]{
                "Java was originally designed by James Gosling.",
                "Java is compiled to ByteCode.",
                "Java is actually an island in Indonesia.",
                "All java code is written in inside classes."
        };
    }
}
