package ua.lviv.lgs.lesson16;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {
	
	@Bean(name = "StudentDao")
	public DaoLayer getDaoLayer() {
		DaoLayer daolayer = new DaoLayer();
		List list = new ArrayList<Student>();
		daolayer.setList(list);
		return daolayer;
		
	}
	

	@Bean(name = "consoleEventLogger")
	public ConsoleEventLogger getConsoleEventLogger() {
		return new ConsoleEventLogger();
	}

	@Bean(name = "student")
	public Student getStudent() {
		Student student = new Student();
		student.setName("Vitalii");
		student.setAge(18);
		student.setId(1);
		return student;
	}
}
