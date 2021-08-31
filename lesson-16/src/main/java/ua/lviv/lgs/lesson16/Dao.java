package ua.lviv.lgs.lesson16;

public interface Dao {
	void delete(int index);
	void read(int index);
	Student add(Student student);
	void readall();
}
