package edu.jsp.sort_school.entity;

import java.util.Objects;

public class Student {

	private int id;
	private String name;
	private long contact;
	private String password;

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

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Student(int id, String name, long contact, String password) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.password = password;
	}

	public Student() {
		super();
	}


	@Override
	public int hashCode() {
		Integer ID=id;
		Long CONTACT=contact;
		return ID.hashCode()+CONTACT.hashCode()+name.hashCode()+password.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this.hashCode()==((Student)(obj)).hashCode()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contact=" + contact + ", password=" + password + "]";
	}
}