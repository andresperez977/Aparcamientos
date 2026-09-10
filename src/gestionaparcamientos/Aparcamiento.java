package gestionaparcamientos;

public class Aparcamiento {

    private String ciudad;
    private String nombre;
    private int capacidad;
    private int cochesAparcados;

    public Aparcamiento(String ciudad, String nombre, int capacidad) {
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.cochesAparcados = 0;
    }

    public void entrarCoche() {
        if (cochesAparcados < capacidad) {
            cochesAparcados++;
        }
    }

    public void salirCoche() {
        if (cochesAparcados > 0) {
            cochesAparcados--;
        }
    }

    public int getCochesAparcados() {
        return cochesAparcados;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
