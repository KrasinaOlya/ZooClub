package lpr22_homeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ZooClub {
	Map<Person,List<Animal>> map=new HashMap<>();
    Scanner sc = new Scanner(System.in);
	public void method () {
		System.out.println("������ 1, ��� ������ �������� �����");
		System.out.println("������ 2, ��� ������ �������� �� �������� �����");
		System.out.println("������ 3, ��� �������� �������� � �������� �����");
		System.out.println("������ 4, ��� �������� �������� � �����");
		System.out.println("������ 5, ��� �������� ��������� �������� � ��� ��������");
		System.out.println("������ 6, ��� ������� �� ����� �������");
		System.out.println("������ 7, ��� ����� � ��������");
		
	    switch (sc.next()) {
	        case "1": {
	        	System.out.println("������ ��'�:");
                String name = sc.next();
 
                System.out.println("������ ��");
                int age = sc.nextInt();
                map.put(new Person(name, age), new ArrayList<>());
	        } System.out.println(map.toString());
	            break;
	        case "2": {
	        	 System.out.println("������ ��'� �������� �����: ");
	             String name = sc.next();
	             System.out.println("������ �� �������� �����: ");
	             int age = sc.nextInt();
	             Person person = new Person(name, age);
	             if (map.containsKey(person)) {
	                    System.out.println("������ ��'� ��������");
	                    String name1 = sc.next();
	                    System.out.println("������ ��� ��������");
	                    String type = sc.next();
	                    map.get(person).add(new Animal(name1, type));
	                } else {
	                    System.out.println("������ �������� �� ��������");
	                } 
	            } System.out.println(map.toString());
	 
	                break;
	        case "3": {
	        System.out.println("������ ��'� �������� �����: ");
            String name = sc.next();
            System.out.println("������ �� �������� �����: ");
            int age = sc.nextInt();
            Person person = new Person(name, age);
            if (map.containsKey(person)) {
                System.out.println("������ ��'� ��������");
                String name1 = sc.next();
                System.out.println("������ ��� ��������");
                String type = sc.next();
               Animal animal = new Animal(name1, type);
                map.get(person).remove(map.get(person).indexOf(animal));
            } else {
                System.out.println("���� ������� �� ��������");
            } 

        } System.out.println(map.toString());
            break;
	        case "4": {
	        System.out.println("������ ��'� �������� �����: ");
	        String name = sc.next();
	        System.out.println("������ �� �������� �����: ");
	        int age = sc.nextInt();;
	        Person person = new Person(name, age);
	        if (map.containsKey(person)) {
	            map.remove(person);
	            } else {
	            System.out.println("������ �������� �� ��������");
	           }
	 
	        } System.out.println(map.toString());
	            break;    	
	        case "5": {
	        	 System.out.println("������  ��� ��������");
	                String type = sc.next();
	                Set<Person> keySet = map.keySet();
	                for (Person key : keySet) {
	                    ListIterator<Animal> iterator = map.get(key).listIterator();
	                    while (iterator.hasNext()) {
	                        Animal animal = (Animal) iterator.next();
	                        if (animal.getType().equals(type)) {
	                            iterator.remove();
	                        }
	                    }
	                }
	 
	            } System.out.println(map.toString());
	                break;	
	        case "6": {
	        	 Set<Person> keySet = map.keySet();
	                for (Person key : keySet) {
	                    for (Animal animal : map.get(key)) {
	                        System.out.println(key + " " + animal);
	                    }
	                    if (map.get(key).isEmpty()) {
	                        System.out.println(key);
	                    }
	                }
	                if (map.isEmpty()) {
	                    System.out.println("������ �������� �� ��������");
	                }
	            } System.out.println(map.toString());
	        break;
	       
	        case "7": {
	        	 sc.close();
 
                break;
            }
 
            default:
                System.out.println("�� ����� ������ �����");
                break;
            }
 
        }
 
    }

