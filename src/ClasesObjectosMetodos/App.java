package ClasesObjectosMetodos;
class Person{
	//Intanciar variables (dato o estado)
	int age;
	String name;
	
	//Las clases pueden contener datos y subrutinas (métodos)
	void introduce() {
		for(int i=0; i<3; i++) {
			System.out.println("Hi, my name is: "+name+". I am "+age+" years old.");
		}
	}
}

public class App {

	public static void main(String[] args) {
		//Crear objeto "Person"
		Person person1 = new Person();
		//Dar los atributos al objeto Person
		person1.name="Cris";
		person1.age=25;
		person1.introduce();
		//crear otra persona
		Person person2 = new Person();
		person2.name="Frank";
		person2.age=27;
		person2.introduce();
	}

}
