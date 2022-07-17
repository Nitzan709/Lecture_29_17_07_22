package com.jb;

import org.springframework.stereotype.Component;

@Component("theBestTeacher")
public class KotlinTeacher implements Teacher {
    @Override
    public String getSentence() {
        return "Class members are public by default, and classes themselves are final by default."
                + " Meaning that creating a derived class is disabled"
                + " unless the base class is declared with the open keyword.";
    }
}
