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
		System.out.println("¬вед≥ть 1, щоб додати учасника клубу");
		System.out.println("¬вед≥ть 2, щоб додати тваринку до учасника клубу");
		System.out.println("¬вед≥ть 3, щоб иидалити тваринку з учасника клубу");
		System.out.println("¬вед≥ть 4, щоб видалити учасника з клубу");
		System.out.println("¬вед≥ть 5, щоб видалити конкретну тваринку з≥ вс≥х власник≥в");
		System.out.println("¬вед≥ть 6, щоб вивести на екран зооклуб");
		System.out.println("¬вед≥ть 7, щоб вийти з програми");
		
	    switch (sc.next()) {
	        case "1": {
	        	System.out.println("¬вед≥ть ≥м'€:");
                String name = sc.next();
 
                System.out.println("¬вед≥ть в≥к");
                int age = sc.nextInt();
                map.put(new Person(name, age), new ArrayList<>());
	        } System.out.println(map.toString());
	            break;
	        case "2": {
	        	 System.out.println("¬вед≥ть ≥м'€ учасника клубу: ");
	             String name = sc.next();
	             System.out.println("¬вед≥ть в≥к учасника клубу: ");
	             int age = sc.nextInt();
	             Person person = new Person(name, age);
	             if (map.containsKey(person)) {
	                    System.out.println("¬вед≥ть ≥м'€ тваринки");
	                    String name1 = sc.next();
	                    System.out.println("¬вед≥ть вид тваринки");
	                    String type = sc.next();
	                    map.get(person).add(new Animal(name1, type));
	                } else {
	                    System.out.println("“акого учасника не знайдено");
	                } 
	            } System.out.println(map.toString());
	 
	                break;
	        case "3": {
	        System.out.println("¬вед≥ть ≥м'€ учасника клубу: ");
            String name = sc.next();
            System.out.println("¬вед≥ть в≥к учасника клубу: ");
            int age = sc.nextInt();
            Person person = new Person(name, age);
            if (map.containsKey(person)) {
                System.out.println("¬вед≥ть ≥м'€ тваринки");
                String name1 = sc.next();
                System.out.println("¬вед≥ть вид тваринки");
                String type = sc.next();
               Animal animal = new Animal(name1, type);
                map.get(person).remove(map.get(person).indexOf(animal));
            } else {
                System.out.println("“акоњ твринки не знайдено");
            } 

        } System.out.println(map.toString());
            break;
	        case "4": {
	        System.out.println("¬вед≥ть ≥м'€ учасника клубу: ");
	        String name = sc.next();
	        System.out.println("¬вед≥ть в≥к учасника клубу: ");
	        int age = sc.nextInt();;
	        Person person = new Person(name, age);
	        if (map.containsKey(person)) {
	            map.remove(person);
	            } else {
	            System.out.println("“акого учасника не знайдено");
	           }
	 
	        } System.out.println(map.toString());
	            break;    	
	        case "5": {
	        	 System.out.println("¬вед≥ть  вид тваринки");
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
	                    System.out.println("“акого учасника не знайдено");
	                }
	            } System.out.println(map.toString());
	        break;
	       
	        case "7": {
	        	 sc.close();
 
                break;
            }
 
            default:
                System.out.println("¬и ввели нев≥рне число");
                break;
            }
 
        }
 
    }

