package com.app.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	
	private int sid;
	private String sname;
	private List<Integer> phones;
	private Set<String> city;
	private Map<Integer, String> course;
	private Properties db;
	public Student() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Integer> getPhones() {
		return phones;
	}
	public void setPhones(List<Integer> phones) {
		this.phones = phones;
	}
	public Set<String> getCity() {
		return city;
	}
	public void setCity(Set<String> city) {
		this.city = city;
	}
	public Map<Integer, String> getCourse() {
		return course;
	}
	public void setCourse(Map<Integer, String> course) {
		this.course = course;
	}
	public Properties getDb() {
		return db;
	}
	public void setDb(Properties db) {
		this.db = db;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", phones=" + phones + ", city=" + city + ", course="
				+ course + ", db=" + db + "]";
	}
	
	
	
}
