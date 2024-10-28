package Ejercicio4;

public class VariosHilosR {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			HiloCR hcr=new HiloCR(i);
			Thread th=new Thread(hcr);
			th.start();
			
		}

	}

}
