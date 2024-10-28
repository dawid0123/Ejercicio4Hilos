package Ejercicio4;

public class HiloCR implements Runnable{

	int c;

	public HiloCR(int c) {
		super();
		this.c = c;
		System.out.println("Creando hilo "+c);
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hilo "+c+" linea "+i);
		}
	}
	
	
}
