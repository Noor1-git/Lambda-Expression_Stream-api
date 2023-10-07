package edu.jsp.sort_school.entity;

import java.util.List;

public class School {

	private int id;
	private String name;
	private String address;

	private List<Student> students;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public School(int id, String name, String address, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.students = students;
	}

	public School() {
		super();
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", address=" + address + ", students=" + students + "]\n";
	}

	@Override
	public int hashCode() {
		Integer ID = id;
		return ID.hashCode() + name.hashCode() + address.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this.hashCode()==((School)(obj)).hashCode()) {
			return true;
		} else {
			return false;
		}
	}

}
