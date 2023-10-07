package edu.jsp.sort_school.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SchoolDriver {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student(1, "Abc1", 123, "abc@123"));
		students.add(new Student(2, "Abc2", 223, "abc@123"));
		students.add(new Student(3, "Abc3", 323, "abc@123"));
		students.add(new Student(4, "Abc4", 423, "abc@123"));

		Set<School> schools = new HashSet<>();

		schools.add(new School(1, "Test school1", "Test Address1", students));
		schools.add(new School(1, "Test school1", "Test Address1", students));
		schools.add(new School(2, "Test school2", "Test Address2", students));
		schools.add(new School(2, "Test school2", "Test Address2", students));
		schools.add(new School(3, "Test school3", "Test Address3", students));
		schools.add(new School(3, "Test school3", "Test Address3", students));
		
		

//		Performing Operations on Schools
//		fetch all Schools with Id greater than 1;
		Set<School> filterSchool= schools.stream().filter(schl->schl.getId()>1).map(s->s).collect(Collectors.toSet());
		filterSchool.forEach(sc->System.out.println(sc));
		
		
//		find School with max Id;
		School MaxId= schools.stream().max((s1,s2)->(int)s1.getId()-(int)s2.getId()).get();
		System.out.println(MaxId);
		
//		find School with min Id;		
		School MinId= schools.stream().min((s1,s2)->(int)s1.getId()-(int)s2.getId()).get();
		System.out.println(MinId);
		
//		find total of Id's;
		int Ids=schools.stream().collect(Collectors.summingInt((school)->school.getId()));
		System.out.println(Ids);
		
		
		
//		Performing Operations on Students
//		fetch all Student with Id greater than 1;
		List<Student> filterStudent= students.stream().filter(schl->schl.getId()>1).map(s->s).collect(Collectors.toList());
		filterStudent.forEach(sc->System.out.println(sc));
		
		
//		find Student with max Id;
		Student MaxStId= students.stream().max((st1,st2)->(int)st1.getId()-(int)st2.getId()).get();
		System.out.println(MaxStId);
		
//		find Student with min Id;		
		Student MinStId= students.stream().min((st1,st2)->(int)st1.getId()-(int)st2.getId()).get();
		System.out.println(MinStId);
		
//		find total of Id's;
		int StIds=students.stream().collect(Collectors.summingInt((student)->student.getId()));
		System.out.println(StIds);
	}

}
