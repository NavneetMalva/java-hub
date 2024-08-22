package common;

class Person3 {
	int age;
	String name, country;

	public Person3() {
		super();
	}

	public Person3(int age, String name, String country) {
		super();
		this.age = age;
		this.name = name;
		this.country = country;
	}

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

public class GetSetEx02 {
	
	public static void main(String[] args) {
		
		Person3 person = new Person3();
		person.setAge(24);
		person.setName("Rick");
//		person.setCountry("US");  // if commented, country will be null
		System.out.println(person);
		
		Person3 person3 = new Person3(13,"Morty","Mars");
		System.out.println(person3);
		
	}

}
