package ClasesObjectosMetodos;

class Singer {
	String nickName;
	int ageA;
	
	void sing() {
		System.out.println("Y " +nickName+ " canta así..\r\n" + "Tu jugaste en fuego\r\n" + "Y encendiste mi corazón\r\n" 
	+ "Ahora que no te tengo estoy quemándome de amor...");
	}
}
public class GettersSetters {
//Set es establecer valor para mi atributo
	
	public static void main(String[] args) {
		Singer singer1 = new Singer();
		singer1.nickName="Brayan Amadeus";
		singer1.ageA=12;
		singer1.sing();
		

	}

}
