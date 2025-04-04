package StarPatterns;

public class ObjectCreation2 {
	//parameterless constructor
	int i;
	int j;
	public ObjectCreation2() {
		i = 10;
		j = 20;
	}
	//Parameterized Constructor
	public ObjectCreation2(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public int add() {
		return i+j;
	}

	public static void main(String[] args) {
		ObjectCreation2 OC1 = new ObjectCreation2(45, 76);
		ObjectCreation2 OC2 = new ObjectCreation2(68, 39);
		ObjectCreation2 OC3 = new ObjectCreation2();
		
		
		System.out.println(OC1.add());
		System.out.println(OC2.add());
		System.out.println(OC3.add());
		
		
		

	}

}
