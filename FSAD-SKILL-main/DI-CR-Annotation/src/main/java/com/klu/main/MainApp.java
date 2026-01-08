package com.klu.main;
import com.klu.config.*;
import com.klu.model.CourseRegistration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		CourseRegistration cr=context.getBean(CourseRegistration.class);
		cr.display();

	}

}
