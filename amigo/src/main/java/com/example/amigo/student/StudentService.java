package com.example.amigo.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Yuvam",
                        "yuvam@gmail.com",
                        LocalDate.of(2000, Month.JUNE, 4),
                        20
                )
        );
    }
}
