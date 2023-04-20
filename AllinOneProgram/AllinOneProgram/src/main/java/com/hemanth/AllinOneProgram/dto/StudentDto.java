package com.hemanth.AllinOneProgram.dto;

import com.hemanth.AllinOneProgram.model.University;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class StudentDto
{
int usn;

String name;

String branch;

String email;

private University university;

    public StudentDto(int usn, String name, String branch, String email, University university) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.email = email;
        this.university = university;
    }

    public StudentDto(int usn, String name, String branch, String email) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.email = email;
    }
}
