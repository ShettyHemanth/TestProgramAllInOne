package com.hemanth.AllinOneProgram.aspect;

import com.hemanth.AllinOneProgram.controller.StudentController;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass
{
    Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Before("execution(public * com.hemanth.AllinOneProgram.controller.StudentController.addStudents(..))")
    public void beforeLogPost()
    {
        logger.info("Post Method Begins ");

    }
    @Before("execution(public * com.hemanth.AllinOneProgram.controller.StudentController.getAllAccounts(..))")
    public void beforeLogGet()
    {
        logger.info("This is Inside Get Method");
    }

    @Before("execution(public * com.hemanth.AllinOneProgram.controller.StudentController.deleteStudents(..))")
    public void beforeDelete()
    {
        logger.info("This is Inside Delete method");
    }

    @Before("execution(public * com.hemanth.AllinOneProgram.controller.StudentController.updateStudents(..))")
    public void beforeUpdate()
    {
        logger.info("This is Inside Update method");
    }


}
