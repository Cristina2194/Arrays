package ClasesObjectosMetodos;

class Singer {
	String nickName;
	int ageA;
	
	void sing() {
		System.out.println("Y " +nickName+ " canta as�..\r\n" + "Tu jugaste en fuego\r\n" + "Y encendiste mi coraz�n\r\n" 
	+ "Ahora que no te tengo estoy quem�ndome de amor...");
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
