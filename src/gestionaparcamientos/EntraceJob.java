package gestionaparcamientos;

public class EntraceJob extends Thread {
	
	private Aparcamiento parking;

	public EntraceJob(Aparcamiento parking1) {
		
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(parking);
	}
	
}
