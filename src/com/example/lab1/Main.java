package com.example.lab1;
// ctrl + Shift + o 
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student s = new Student();
		s.setNo(1);
		s.setName("Ȧ�浿");
		s.setAge(20);
		
		list.add(s);
		
		// �ѹ��� �����
		list.add(new Student(2,"ö��",22));
		
		// List ������ ���
		// ��� 1 (using get)
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i).toString());
		}
		
		// List �ȿ� ���� ���� (index ����)
		list.remove(1);
		
		// ��� 2
		for(Student ss : list)
		{
			System.out.println(ss.toString());
		}
		
	}

}
