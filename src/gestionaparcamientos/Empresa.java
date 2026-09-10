package gestionaparcamientos;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private List<Aparcamiento> aparcamientos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        aparcamientos = new ArrayList<>();
    }

    public void registrarAparcamiento(Aparcamiento aparcamiento) {
        aparcamientos.add(aparcamiento);
    }

    public List<Aparcamiento> buscarPorCiudad(String ciudad) {

        List<Aparcamiento> resultado = new ArrayList<>();

        for (Aparcamiento aparcamiento : aparcamientos) {
            if (aparcamiento.getCiudad().equalsIgnoreCase(ciudad)) {
                resultado.add(aparcamiento);
            }
        }

        return resultado;
    }

    public List<Aparcamiento> consultarAparcamientos() {
        return aparcamientos;
    }
}
