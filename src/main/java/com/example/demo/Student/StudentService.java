package com.example.demo.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents()
    {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L,"mariam","mariam@gmail.com", LocalDate.of(2000, Month.JANUARY,12),15));
        return list;
    }
}
