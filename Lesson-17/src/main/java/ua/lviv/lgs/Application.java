package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		UniversityService us = ctx.getBean(UniversityService.class);
		University u = new University();
		u.setAcredetationLevel("o");
		u.setName("i");
		u.setNumberOfInstitutes(1);
		u.setNumberOfStudents(4);
		u.setUniversityAdress("o");
		us.add(u);
		us.deleteByid(3);
		System.out.println(us.readById(2));
		us.updateName(2, "LNULP");
		us.readAll().stream().forEach(System.out::println);
		System.out.println(us.readByName("LNULP"));
	}

}
