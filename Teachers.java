package com.learners.Teachers;

import javax.persistence.*;

@Entity
@Table(name="Teacher")

public class Teachers {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Column(name="Tea_id")
	private int Tea_id;
	
	
	@Column(name="Tea_Name")
	private String Tea_Name;
	
	@Column(name="Tea_sub")
	private String Tea_sub;
	
	@Column(name="Tea_mbl")
	private long Tea_mbl;

	public Teachers(int tea_id, String tea_Name, String tea_sub, long tea_mbl) {
		super();
		Tea_id = tea_id;
		Tea_Name = tea_Name;
		Tea_sub = tea_sub;
		Tea_mbl = tea_mbl;
	}

	public int getTea_id() {
		return Tea_id;
	}

	public void setTea_id(int tea_id) {
		Tea_id = tea_id;
	}

	public String getTea_Name() {
		return Tea_Name;
	}

	public void setTea_Name(String tea_Name) {
		Tea_Name = tea_Name;
	}

	public String getTea_sub() {
		return Tea_sub;
	}

	public void setTea_sub(String tea_sub) {
		Tea_sub = tea_sub;
	}

	public long getTea_mbl() {
		return Tea_mbl;
	}

	public void setTea_mbl(long tea_mbl) {
		Tea_mbl = tea_mbl;
	}

	@Override
	public String toString() {
		return "Teachers [Tea_id=" + Tea_id + ", Tea_Name=" + Tea_Name + ", Tea_sub=" + Tea_sub + ", Tea_mbl=" + Tea_mbl
				+ ", getTea_id()=" + getTea_id() + ", getTea_Name()=" + getTea_Name() + ", getTea_sub()=" + getTea_sub()
				+ ", getTea_mbl()=" + getTea_mbl() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
