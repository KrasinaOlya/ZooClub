package lpr22_homeWork;

/** 
 * клас персона зі значеннями <b>name</b> та <b>age</b>.
 * @autor Ольга Красіна
*/

public class Person {
	 /** Поле ім'я */
	private String name;
	 /** Поле вік */
	private int age;
	 /** 
     * Конструктор - створення нового об'єкта з певними значеннями
     * @param name - ім'я
     * @param age - вік
     * @see Person#Person()
     */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	 /**
     * Функція отримання значення поля {@link Person#name}
     * @return вертає ім'я персони
     */
	public String getName() {
		return name;
	}
	 /**
     * функція налаштування значення поля {@link Person#name}
     * @param name - ім'я
     */
	public void setName(String name) {
		this.name = name;
	}
	 /**
     * Функція отримання значення поля {@link Person#age}
     * @return вертає вік персони
     */
	public int getAge() {
		return age;
	}
	 /**
     * функція налаштування значення поля {@link Person#age}
     * @param age - вік
     */
	public void setAge(int age) {
		this.age = age;
	}
	 /**
     * Метод виводу інформації про об'єкт у зручному форматі
     * @param name - ім'я
     * @param age - вік
     * @see Person#Person()
     */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	 /**
     * Метод, що дозволяє отримати унікальний цілий номер для даного об'єкту
     */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	 /**
     * Метод перевірки рівності двох об'єктів
     */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}
