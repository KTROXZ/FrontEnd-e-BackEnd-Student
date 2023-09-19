package com.students.studentsbackend.dtos;

public record StudentResponse(
    long id,
    String name,
    String email,
    String phone,
    String address,
    String course
)  {
    
}
