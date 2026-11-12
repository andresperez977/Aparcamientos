package Actividades;

import java.util.Random;

public class Practicas {
	static Random ramdom = new Random();

	public static void main(String[] args) {
		int[] array = new int[1000];

		ramdom.nextInt();
		System.err.println(ramdom.nextInt());

		for (int i = 0; i < array.length; i++) {
			array[i] = ramdom.nextInt();
		}

		int num = 500;
		Thread hilo = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("numero seleccionado" + num);

				System.out.println("buscando en el array...");

				boolean encontrado = false;

				for (int i = 0; i < array.length; i++) {
					if (array[i] == num) {
						System.out.println("se encontro el número" + num + "en la posición " + i);

						encontrado = true;
					}
				}
				if (!encontrado) {
					System.out.println("el número no se ha encontrado");
				}
			}
		});
		hilo.start();
	}
}
