package com.example.lab1;
// ctrl + Shift + o 
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student s = new Student();
		s.setNo(1);
		s.setName("홀길동");
		s.setAge(20);
		
		list.add(s);
		
		// 한번에 만들기
		list.add(new Student(2,"철수",22));
		
		// List 데이터 출력
		// 방법 1 (using get)
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i).toString());
		}
		
		// List 안에 내용 삭제 (index 기준)
		list.remove(1);
		
		// 방법 2
		for(Student ss : list)
		{
			System.out.println(ss.toString());
		}
		
	}

}
