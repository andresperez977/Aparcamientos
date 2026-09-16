package gestionaparcamientos;

public class ParallelParkAccess {
public static void main(String[] args) {
	
	Aparcamiento aparcamiento1 = new Aparcamiento("Madrid", "Park1", 1000);
	Aparcamiento aparcamiento2 = new Aparcamiento("Sevilla", "Park2", 2000);
	Empresa empresa = new Empresa("Pararel");
	empresa.registrarAparcamiento(aparcamiento1);
	empresa.registrarAparcamiento(aparcamiento2);
	
	Thread t1 = new EntraceJob(aparcamiento1);
	Thread t2 = new EntraceJob(aparcamiento1);
	
	t1.start();
	t2.start();
}

}
