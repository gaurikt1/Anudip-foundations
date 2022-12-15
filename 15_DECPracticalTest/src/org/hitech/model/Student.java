package org.hitech.model;

import java.util.Objects;

public class Student {
      private int studentId;
      @Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", qualification=" + qualification
				+ "]";
	}
	private String studentname;
      private String qualification;
         
       public Student(int stId,String stname, String stqualification) {
			
			this.studentId=stId;
			this.studentname =stname;
			this.qualification=stqualification;
       }
       public Student() {
       }
       
       @Override
	public int hashCode() {
		return Objects.hash(qualification, studentId, studentname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(qualification, other.qualification) && studentId == other.studentId
				&& Objects.equals(studentname, other.studentname);
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
}