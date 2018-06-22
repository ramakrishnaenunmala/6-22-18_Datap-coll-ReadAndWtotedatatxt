package com.sample;

import java.util.ArrayList;
import java.util.Iterator;

public class Testcollectopn3 {
public static void main(String[] args) {
	
	Student s1=new Student(101, "hari", 26);
	Student s2=new Student(103, "kiran", 24);
	Student s3=new Student(105, "taran", 22);
	
	ArrayList<Student> list=new ArrayList<>();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	
	Iterator itr=list.iterator();
	while (itr.hasNext()) {
		Student st = (Student) itr.next();
		System.out.println(st.rollNo+ " "+st.name+" "+st.age);
	}

}
}
