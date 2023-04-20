package com.hemanth.AllinOneProgram.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Entity
@Getter
@Setter

@NoArgsConstructor
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    int  usn;

    @NotNull(message = "Name is mandatory")

    String name;

    @NotNull
    @NotBlank
    String branch;

    @NotNull(message = "email cannot be null")
    @NotBlank
    String email;




    @OneToOne(mappedBy ="stud",cascade = CascadeType.ALL)
    private University university;

    public Student(int usn, String name, String branch, String email, University university) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.email = email;
        this.university = university;
    }
}

