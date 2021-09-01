package ua.lviv.lgs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UniversityRepository extends CrudRepository<University, Long>,JpaRepository<University, Long>{

	List<University> readByName(String name);

	
	
}
