package org.sid.controles.Dto;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class StudentDto {
    private String name ;
    private  String email ;
    private LocalDate dateNaissance;
}
