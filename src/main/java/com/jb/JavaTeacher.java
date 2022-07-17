package com.jb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavaTeacher implements Teacher {

    //todo: why it is not recommended to use field injection
    private final Book teachingBook;
    private final boolean remote;

    @Autowired
    public JavaTeacher(@Qualifier("javaBook") Book teachingBook, @Value("${school.remote}") boolean remote) {
        this.teachingBook = teachingBook;
        this.remote = remote;
    }

    @Override
    public String getSentence() {
        String[] sentences = teachingBook.getSentences();
        int randomIndex = (int) (Math.random() * sentences.length);
        return String.format("%s:%s\n", remote ? "Home" : "Office", sentences[randomIndex]);
    }
}
