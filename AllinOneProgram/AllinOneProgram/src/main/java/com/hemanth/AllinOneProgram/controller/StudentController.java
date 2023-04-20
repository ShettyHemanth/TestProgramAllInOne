package com.hemanth.AllinOneProgram.controller;


import com.hemanth.AllinOneProgram.aspect.AspectClass;
import com.hemanth.AllinOneProgram.model.Student;
import com.hemanth.AllinOneProgram.service.StudentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController
{
    @Autowired
    StudentService ss;

    @Autowired
    AspectClass aspectClass;
    @Autowired
    RabbitTemplate rbt;

    Logger logger = LoggerFactory.getLogger(StudentController.class);



    @GetMapping("/details")
    public List<StudentDto> getAllAccounts()
    {

        //aspectClass.beforeLog();
        return ss.getAllStudents();



    }






    @RequestMapping(method = RequestMethod.POST,value = "/users")
    public StudentDto addStudents(@Valid @RequestBody StudentDto stud)
    {

        return ss.addStudents(stud);
    }



    @RequestMapping(method=RequestMethod.DELETE,value ="/del" )
    public void deleteStudents(@RequestBody StudentDto stud)
    {

        ss.deleteStudents(stud);
    }


    @RequestMapping(method = RequestMethod.DELETE,value="/del/{id}")
    public void deleteStudents(@PathVariable int id)
    {
        logger.info("Inside the delete  Method  for delete the data ");
        ss.deleteStudentsId(id);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/up")
    public void updateStudents(@RequestBody StudentDto stud)
    {

        logger.info("Inside the Put  Method  for updating the data ");
        ss.updateStudent(stud);
    }

    @RequestMapping(method = RequestMethod.GET,value="/details/{id}")
    public Optional<Student> getById(@PathVariable int id)
    {

        logger.info("Inside the Get By Id   Method  for adding the data ");
        return ss.getById(id);

    }






}
