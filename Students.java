package com.learners.Students;

import javax.persistence.*;

@Entity
@Table(name="Student")

public class Students {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Column(name="stu_id")
	private int stu_id;
	
	@Column(name="Stu_Name")
	private String Stu_Name;
	
	@Column(name="Stu_Course")
	private String Stu_Course;
	
	@Column(name="Stu_Mbl")
	private long Stu_Mbl;

	public Students(int stu_id, String stu_Name, String stu_Course, long stu_Mbl) {
		super();
		this.stu_id = stu_id;
		Stu_Name = stu_Name;
		Stu_Course = stu_Course;
		Stu_Mbl = stu_Mbl;
	}

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}

	public String getStu_Name() {
		return Stu_Name;
	}

	public void setStu_Name(String stu_Name) {
		Stu_Name = stu_Name;
	}

	public String getStu_Course() {
		return Stu_Course;
	}

	public void setStu_Course(String stu_Course) {
		Stu_Course = stu_Course;
	}

	public long getStu_Mbl() {
		return Stu_Mbl;
	}

	public void setStu_Mbl(long stu_Mbl) {
		Stu_Mbl = stu_Mbl;
	}

	@Override
	public String toString() {
		return "Students [stu_id=" + stu_id + ", Stu_Name=" + Stu_Name + ", Stu_Course=" + Stu_Course + ", Stu_Mbl="
				+ Stu_Mbl + ", getStu_id()=" + getStu_id() + ", getStu_Name()=" + getStu_Name() + ", getStu_Course()="
				+ getStu_Course() + ", getStu_Mbl()=" + getStu_Mbl() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}

