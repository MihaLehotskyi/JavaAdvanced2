package ua.lviv.lgs.lesson16;

import java.util.List;

public class DaoLayer implements Dao{
	private List<Student> list;
	
	public DaoLayer() {
		
	}

	@Override
	public void delete(int index) {
		list.remove(index);
	}

	@Override
	public void read(int index) {
		System.out.println("----------------");
		System.out.println(list.get(index));
	}

	@Override
	public Student add(Student student) {
		list.add(student);
		return student;
	}

	@Override
	public void readall() {
		System.out.println("------------------");
		for (int i = 0; i < list.size(); i++) {
			 System.out.println(list.get(i));
		}
		
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	
}
