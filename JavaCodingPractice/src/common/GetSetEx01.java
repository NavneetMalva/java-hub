package common;

class Person2 {
	int age;
	String name, country;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", country=" + country + "]";
	}

}

public class GetSetEx01 {

	public static void main(String[] args) {
		Person2 person = new Person2();
		person.setAge(25);
		person.setName("Summer");
		person.setCountry("India");
		
		System.out.println(person.getAge());
		System.out.println(person);
	}

}
