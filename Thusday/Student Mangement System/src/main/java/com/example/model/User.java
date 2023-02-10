package com.example.model;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
	@Table(name = "studentdetails")
	public class  {

		@Id
		private int id;
		
		@Column(length = 30 , nullable = false)
		@NotBlank(message="Please Enter Your studentName!!!")
		private String uName;

		@Column(length = 30 , nullable = false, unique = true)
		@NotBlank(message="Please Enter Your studentName!!!")
		@Email
		private String userEmail;
		
		@Column(length = 10 , nullable = false, unique = true)
		private long phnNumber;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getsName() {
			return sName;
		}

		public void setuName(String sName) {
			this.uName = uName;
		}

		public String getUserEmail() {
			return userEmail;
		}

		public void setStudentEmail(String studentEmail) {
			this.sEmail = SEmail;
		}

		public long getPhnNumber() {
			return phnNumber;
		}

		public void setPhnNumber(long phnNumber) {
			this.phnNumber = phnNumber;
		}
		
		
	}