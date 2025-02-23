public class Person {
	String name;
	int age;
	String address;
	
	public Person(String name, int age, String address) {
		this.name= name;
		this. age= age;
		this.address= address;
	}
	
	public void display() {
		System.out.println("Name: "+ name+ " Age: "+ age);
	}
	
	public static void main(String[]args) {
		Person p1= new Person("Sara", 20, "Tarlac City");
		Person p2= new Person("Vincent", 23, "Makati City");
		Person p3= new Person("Francis", 25, "Mandaluyong City");
		Person p4= new Person("Carmel", 60, "Cavite City");
		Person p5= new Person("Noel", 61, "Quezon City");
		
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		p5.display();
	}
}
