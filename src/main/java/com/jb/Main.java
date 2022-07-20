package com.jb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfiguration.class);

        Teacher teacher0 = context.getBean("javaTeacher", Teacher.class);
        Teacher teacher1 = context.getBean("javaTeacher", Teacher.class);

        if (teacher0 == teacher1) {
            System.out.println("We both refer to the same instance in memory!");
        } else {
            System.out.println("We refer to different objets in memory!");
        }

        System.out.println(teacher0.getSentence());
        System.out.println(teacher1.getSentence());
    }
}
