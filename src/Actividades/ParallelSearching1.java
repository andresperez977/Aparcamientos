
package Actividades;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class ParallelSearching1 {

	static Random random = new Random();

	public static void main(String[] args) {

		int[] array = new int[1000];

		// Rellenamos el array con numeros aleatorios
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt();
		}

		// Numero que queremos buscar
		int num = 500;

		// Variable compartida por los dos hilos
		// Indica si el numero ya se ha encontrado
		AtomicBoolean encontrado = new AtomicBoolean(false);

		System.out.println("Numero seleccionado: " + num);
		System.out.println("Buscando en el array...");

		// Primer hilo: busca en la primera mitad
		Thread hilo1 = new Thread(new Runnable() {
			@Override
			public void run() {

				for (int i = 0; i < array.length / 2; i++) {

					// Si el otro hilo ya lo encontro, paramos
					if (encontrado.get()) {
						return;
					}

					if (array[i] == num) {
						if (encontrado.compareAndSet(false, true)) {
							System.out.println("Hilo 1: numero encontrado en la posicion " + i);
						}
						return;
					}
				}

				System.out.println("Hilo 1: busqueda terminada");
			}
		});

		// Segundo hilo: busca en la segunda mitad
		Thread hilo2 = new Thread(new Runnable() {
			@Override
			public void run() {

				for (int i = array.length / 2; i < array.length; i++) {

					// Si el otro hilo ya lo encontro, paramos
					if (encontrado.get()) {
						return;
					}

					if (array[i] == num) {
						if (encontrado.compareAndSet(false, true)) {
							System.out.println("Hilo 2: numero encontrado en la posicion " + i);
						}
						return;
					}
				}

				System.out.println("Hilo 2: busqueda terminada");
			}
		});

		// Iniciamos los dos hilos
		hilo1.start();
		hilo2.start();

		// Esperamos a que terminen los dos hilos
		try {
			hilo1.join();
			hilo2.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		// Comprobamos si se ha encontrado el numero
		if (!encontrado.get()) {
			System.out.println("El numero no se ha encontrado");
		}
	}
}
