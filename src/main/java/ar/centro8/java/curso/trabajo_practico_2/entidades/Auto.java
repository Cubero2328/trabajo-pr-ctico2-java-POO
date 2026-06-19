package ar.centro8.java.curso.trabajo_practico_2.entidades;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Auto extends Vehiculo {
    private int puertas;

    public Auto(String marca, String modelo, Double precio, int puertas) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + " // " + "Modelo: " + getModelo() + " // " + "Puertas: " + getPuertas() +" // " + "Precio: " + formatearPrecio();
    }

}
