package javaCollectionProgrmas;

import java.util.Comparator;

public class Student implements Comparable<Student>,Comparator<Student> {

	private int rollNumber;
	private String Name;
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", Name=" + Name + "]";
	}
	
	public Student(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		Name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	@Override
	public int compareTo(Student o) {
	  	//this.getRollNumber().compareTo(o.getRollNumber());
	  	return this.getRollNumber() > o.getRollNumber() ? 1 : this.getRollNumber() < o.getRollNumber() ? -1 :0 ; 
		//return 0;
	}

	@Override
	public int compare(Student o1, Student o2) {
		
		return 0;
	}
	
	
}
