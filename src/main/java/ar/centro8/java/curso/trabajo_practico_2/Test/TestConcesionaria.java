package ar.centro8.java.curso.trabajo_practico_2.Test;

import ar.centro8.java.curso.trabajo_practico_2.entidades.Auto;
import ar.centro8.java.curso.trabajo_practico_2.entidades.Concesionario;
import ar.centro8.java.curso.trabajo_practico_2.entidades.Moto;


public class TestConcesionaria {
    public static void main(String[] args) {
        Concesionario concesionario1 = new Concesionario();
        concesionario1.agregarVehiculo( new Auto("Peugeot", "206", 200000.0, 4));
        concesionario1.agregarVehiculo(new Moto("Honda", "Titan", 60000.0, "125c")); 
        concesionario1.agregarVehiculo(new Auto("Peugeot", "208", 250000.0, 5)); 
        concesionario1.agregarVehiculo(new Moto("Yamaha", "YBR", 80500.50, "160c")); 
        concesionario1.mostrarLista();
        concesionario1.separador();

        concesionario1.mayorPrecio();
        concesionario1.menorPrecio();
        concesionario1.vehiculoConLetra();
        concesionario1.separador();

        concesionario1.ordenMayorMenor();
        concesionario1.separador();

        concesionario1.ordenNatural();
    }
}


