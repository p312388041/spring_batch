package com.chong.study.batch.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.chong.study.pojo.Student;

public class StudentItemReader implements ItemReader<Student>{
 

    @Override
    public Student read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        return null;
    }
}
