package com.xiudun.action;

import java.util.Scanner;

import com.xiudun.beans.Person;
import com.xiudun.service.PersonService;
import com.xiudun.service.PersonServiceImpl;

public class PersonAction {
	public static void main(String []args) {
		
		PersonService personService = new PersonServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		
		do {
			System.out.println("1save,2delete,3show,4exit");
			int key = sc.nextInt();
			switch(key) {
				case 1:
					Person person = new Person();
					System.out.println("�����룺����");
					person.setUsername(sc.next());
					System.out.println("�����룺�Ա�");
					person.setSex(sc.next());
					System.out.println("�����룺����");
					person.setPassword(sc.next());
					
					personService.save(person);
					System.out.println("��ӳɹ�");
					break;
				case 2:
					break;
				case 3:
					personService.findAll();
					break;
				case 4:
					break;
				
			}
				
		}while(flag);
		
	}
}
