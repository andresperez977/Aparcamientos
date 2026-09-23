package gestionaparcamientos;

public class ParallelParkAccess {
public static void main(String[] args) {
	
	Aparcamiento aparcamiento1 = new Aparcamiento("Madrid", "Park1", 1000);
	Aparcamiento aparcamiento2 = new Aparcamiento("Sevilla", "Park2", 2000);
	Empresa empresa = new Empresa("Pararel");
	empresa.registrarAparcamiento(aparcamiento1);
	empresa.registrarAparcamiento(aparcamiento2);
	
	
	int numOfThread = 40;
	Thread[] threads = new Thread[numOfThread];
	for (int i = 0; i < threads.length; i++) {
		
	}
	Thread t1 = new EntraceJob(aparcamiento1);
	Thread t2 = new EntraceJob(aparcamiento1);
	
	t1.start();
	t2.start();
	try {
		t1.join();
		t2.join();
	} catch (Exception e) {
		// TODO: handle exception
	}
}

}
