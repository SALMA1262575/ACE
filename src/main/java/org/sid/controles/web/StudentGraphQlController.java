package org.sid.controles.web;

import lombok.AllArgsConstructor;
import org.sid.controles.Dto.StudentDto;
import org.sid.controles.Service.StudentManager;
import org.sid.controles.Service.StudentService;
import org.sid.controles.dao.entities.Student;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller
@AllArgsConstructor
public class StudentGraphQlController {
    private StudentService studentService;

    @MutationMapping
    public StudentDto saveStudent(@Argument StudentDto student) {
        return studentService.saveStudent(student);
    }

    @QueryMapping
    public List<StudentDto> getStudentByDateNaissance(@Argument Date dateNaissance){
        return studentService.getStudentByDateNaissance(dateNaissance);
    }










}
