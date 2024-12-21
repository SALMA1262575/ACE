package org.sid.controles.Service;

import org.sid.controles.Dto.StudentDto;

import java.util.Date;
import java.util.List;

public interface StudentService {
public StudentDto saveStudent(StudentDto studentDto);
public List<StudentDto> getStudentByDateNaissance (Date date);
}
