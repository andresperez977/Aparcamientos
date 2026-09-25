package gestionaparcamientos;

public class EntraceJob extends Thread {
	
	private Aparcamiento parking;

	public EntraceJob(Aparcamiento parking1, String string) {
		parking = parking1;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(parking + "object address from thread " + Thread.currentThread().getName() );
		System.out.println("End the job" + Thread.currentThread().getName());
		
		
		for (int i = 0; i < 10; i++) {
			
			parking.entrarCoche();
		}
	}
	
}
