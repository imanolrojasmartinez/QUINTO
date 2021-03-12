import java.util.Scanner;

public class DatosPersonales {
	private String name;
	private String surname;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public DatosPersonales(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public DatosPersonales() {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}	
		
	@Override
	public String toString() {
		return "DatosPersonales [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}
	
	public void askPersonalData() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input the name of the person");
		String name1 = input.next();
		System.out.println("Input the surname of the person");
		String surname1 = input.next();
		System.out.println("Input the age of the person");
		int age1 = input.nextInt();
		DatosPersonales Persona = new DatosPersonales(name1, surname1, age1);
		System.out.println(Persona.toString());
	}
}