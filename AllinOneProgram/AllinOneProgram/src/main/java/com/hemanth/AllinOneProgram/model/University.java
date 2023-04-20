package com.hemanth.AllinOneProgram.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data

@NoArgsConstructor
@ToString
@Entity
public class University
{

   @Id
   @GeneratedValue(strategy = GenerationType.UUID)
   UUID uid;

   @OneToOne()
   @JoinColumn(name = "student_id",referencedColumnName = "usn")
   private Student stud;

    int year;


}
