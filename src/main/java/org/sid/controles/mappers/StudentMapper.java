package org.sid.controles.mappers;

import org.modelmapper.ModelMapper;
import org.sid.controles.Dto.StudentDto;
import org.sid.controles.dao.entities.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    private final ModelMapper mapper= new ModelMapper();
    private Student fromStudentDtoToStudent(StudentDto studentDto){
        return mapper.map(studentDto,Student.class);
    }
    public StudentDto fromStudentToStudentDto(Student student){
        return mapper.map(student,StudentDto.class);
    }
}
