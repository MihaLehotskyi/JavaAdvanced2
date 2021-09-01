package ua.lviv.lgs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String name;
	@Column
	private String acredetationLevel;
	@Column
	private int numberOfInstitutes;
	@Column
	private int numberOfStudents;
	@Column
	private String universityAdress;
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public University() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcredetationLevel() {
		return acredetationLevel;
	}

	public void setAcredetationLevel(String acredetationLevel) {
		this.acredetationLevel = acredetationLevel;
	}

	public int getNumberOfInstitutes() {
		return numberOfInstitutes;
	}

	public void setNumberOfInstitutes(int numberOfInstitutes) {
		this.numberOfInstitutes = numberOfInstitutes;
	}

	public String getUniversityAdress() {
		return universityAdress;
	}

	public void setUniversityAdress(String universityAdress) {
		this.universityAdress = universityAdress;
	}

	@Override
	public String toString() {
		return "University [name=" + name + ", acredetationLevel=" + acredetationLevel + ", numberOfInstitutes="
				+ numberOfInstitutes + ", universityAdress=" + universityAdress + "]";
	}
	
	
}
