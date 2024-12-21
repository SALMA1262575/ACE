package org.sid.controles.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.sid.controles.Dto.StudentDto;
import org.sid.controles.dao.StudentRepository;
import org.sid.controles.dao.entities.Student;
import org.sid.controles.mappers.StudentMapper;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentManager implements StudentService {
    private StudentRepository studentRepository;
    private StudentMapper studentMapper ;

    @Override
    public StudentDto saveStudent(StudentDto studentDto) {

        return null;
    }

    @Override
    public List<StudentDto> getStudentByDateNaissance(Date date) {
        return null;
    }
}
