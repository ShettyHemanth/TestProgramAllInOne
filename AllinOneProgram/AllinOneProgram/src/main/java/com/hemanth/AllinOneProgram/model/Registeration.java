package com.hemanth.AllinOneProgram.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
public class Registeration
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int rid;

  public Registeration(String name, String year, String email) {
    this.name = name;
    this.year = year;
    this.email = email;
  }

  String name;

  String year;

  String email;



}
