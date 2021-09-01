package ua.lviv.lgs;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UniversityServiceImpl implements UniversityService{
	@Autowired
	private UniversityRepository ur;
	@Override
	public University add(University university) {
		return ur.save(university);
	}

	@Override
	public University readById(long id) {
		return ur.getById(id);
	}

	@Override
	public University updateName(long id,String name) {
		University u = ur.findById(id).get();
		u.setName(name);
		return ur.saveAndFlush(u);
	}

	
	@Override
	public void deleteByid(long id) {
		ur.deleteById(id);
		
	}

	@Override
	public List<University> readAll() {
		
		return ur.findAll();
	}

	@Override
	public List<University> readByName(String name) {
		return ur.readByName(name);
	}

}
