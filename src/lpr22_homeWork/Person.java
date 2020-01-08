package lpr22_homeWork;

/** 
 * ���� ������� � ���������� <b>name</b> �� <b>age</b>.
 * @autor ����� ������
*/

public class Person {
	 /** ���� ��'� */
	private String name;
	 /** ���� �� */
	private int age;
	 /** 
     * ����������� - ��������� ������ ��'���� � ������� ����������
     * @param name - ��'�
     * @param age - ��
     * @see Person#Person()
     */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	 /**
     * ������� ��������� �������� ���� {@link Person#name}
     * @return ����� ��'� �������
     */
	public String getName() {
		return name;
	}
	 /**
     * ������� ������������ �������� ���� {@link Person#name}
     * @param name - ��'�
     */
	public void setName(String name) {
		this.name = name;
	}
	 /**
     * ������� ��������� �������� ���� {@link Person#age}
     * @return ����� �� �������
     */
	public int getAge() {
		return age;
	}
	 /**
     * ������� ������������ �������� ���� {@link Person#age}
     * @param age - ��
     */
	public void setAge(int age) {
		this.age = age;
	}
	 /**
     * ����� ������ ���������� ��� ��'��� � �������� ������
     * @param name - ��'�
     * @param age - ��
     * @see Person#Person()
     */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	 /**
     * �����, �� �������� �������� ��������� ����� ����� ��� ������ ��'����
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
     * ����� �������� ������ ���� ��'����
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
