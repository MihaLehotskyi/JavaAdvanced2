package ua.lviv.lgs;

import java.util.List;


public interface UniversityService {
	University add(University university);
	
	University readById(long id);
	
	University updateName(long id,String name);
	
	List<University> readByName(String name);
	
	List<University> readAll();

	void deleteByid(long id);
}
