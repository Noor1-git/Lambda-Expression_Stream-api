package edu.jsp.sort_employees;

public class Employee {

	private int id;
	private String name;
	private long contact;
	private String password;

	public Employee(int id, String name, long contact, String password) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.password = password;
	}

	public Employee() {
		super();
	}

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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", contact=" + contact + ", password=" + password + "]\n";
	}

	@Override
	public int hashCode() {
		Integer ID=Integer.valueOf(id);
		Long CONTACT=Long.valueOf(contact);
		
		return ID.hashCode()+CONTACT.hashCode()+name.hashCode()+password.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee employee=(Employee)obj;
		if (this.hashCode()==employee.hashCode()) {
			return true;
		}else {
			return false;
		}
	}
}