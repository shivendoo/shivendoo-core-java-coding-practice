package javaCollectionProgrmas;

import java.util.Comparator;

public class ComparatorStudentRollNum implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		return o1.getRollNumber() > o2.getRollNumber() ? 1 : o1.getRollNumber() < o2.getRollNumber() ? -1 :0 ;
		
	}

}
