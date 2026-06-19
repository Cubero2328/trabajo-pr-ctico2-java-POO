package ar.centro8.java.curso.trabajo_practico_2.entidades;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Moto extends Vehiculo{
    private String cilindrada;

    public Moto(String marca, String modelo, Double precio, String cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + " // " + "Modelo: " + getModelo() + " // " + "Cilindrada: " + getCilindrada() + " // " + "Precio: " + formatearPrecio();
    }
}
