package org.hitech.dao;
import java.util.HashMap;
import org.hitech.model.Course;
import org.hitech.model.Student;
public class Student_Course_DAO {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		HashMap<Student,Course>hashmap =new HashMap<>();
	   hashmap.put(new Student(1,"gauri","BE"),new Course(111,"anudip",3.8));	
	   System.out.println(hashmap); 
	}
}
