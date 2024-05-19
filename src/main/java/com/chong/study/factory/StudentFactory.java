package com.chong.study.factory;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import com.chong.study.pojo.Student;

public class StudentFactory {
    public static Student createStudent() {
        Random random = new Random();
        String name = RandomStringUtils.randomAlphabetic(5);
        float chinese = random.nextFloat() * 100;
        float english = random.nextFloat() * 100;
        float math = random.nextFloat() * 100;
        return new Student(name, chinese, english, math);
    }
}
