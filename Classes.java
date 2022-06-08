package com.learners.Classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Class")

public class Classes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Column(name="cls_id")
	private int cls_id;
	
	
	@Column(name="Cls_Name")
	private String Cls_Name;
	
	@Column(name="Cls_Tea")
	private String Cls_Tea;
	
	@Column(name="Cls_Timings")
	private String Cls_Timings;
	
	@Column(name="Cls_stu")
	private int Cls_stu;
	
	
	@Column(name="Cls_Remarks")
	private String Cls_Remarks;


	public Classes(int cls_id, String cls_Name, String cls_Tea, String cls_Timings, int cls_stu, String cls_Remarks) {
		super();
		this.cls_id = cls_id;
		Cls_Name = cls_Name;
		Cls_Tea = cls_Tea;
		Cls_Timings = cls_Timings;
		Cls_stu = cls_stu;
		Cls_Remarks = cls_Remarks;
	}


	public int getCls_id() {
		return cls_id;
	}


	public void setCls_id(int cls_id) {
		this.cls_id = cls_id;
	}


	public String getCls_Name() {
		return Cls_Name;
	}


	public void setCls_Name(String cls_Name) {
		Cls_Name = cls_Name;
	}


	public String getCls_Tea() {
		return Cls_Tea;
	}


	public void setCls_Tea(String cls_Tea) {
		Cls_Tea = cls_Tea;
	}


	public String getCls_Timings() {
		return Cls_Timings;
	}


	public void setCls_Timings(String cls_Timings) {
		Cls_Timings = cls_Timings;
	}


	public int getCls_stu() {
		return Cls_stu;
	}


	public void setCls_stu(int cls_stu) {
		Cls_stu = cls_stu;
	}


	public String getCls_Remarks() {
		return Cls_Remarks;
	}


	public void setCls_Remarks(String cls_Remarks) {
		Cls_Remarks = cls_Remarks;
	}


	@Override
	public String toString() {
		return "Classes [cls_id=" + cls_id + ", Cls_Name=" + Cls_Name + ", Cls_Tea=" + Cls_Tea + ", Cls_Timings="
				+ Cls_Timings + ", Cls_stu=" + Cls_stu + ", Cls_Remarks=" + Cls_Remarks + ", getCls_id()=" + getCls_id()
				+ ", getCls_Name()=" + getCls_Name() + ", getCls_Tea()=" + getCls_Tea() + ", getCls_Timings()="
				+ getCls_Timings() + ", getCls_stu()=" + getCls_stu() + ", getCls_Remarks()=" + getCls_Remarks()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
