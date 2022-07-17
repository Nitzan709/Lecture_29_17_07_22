package com.jb;

import org.springframework.stereotype.Component;

@Component
public class KotlinBook implements Book{

    @Override
    public String[] getSentences() {
        return new String[]{
                "Class members are public by default.",
                "Kotlin is modern, but already matured programming language.",
                "Kotlin is an open-source statically typed programing language."
        };
    }
}
