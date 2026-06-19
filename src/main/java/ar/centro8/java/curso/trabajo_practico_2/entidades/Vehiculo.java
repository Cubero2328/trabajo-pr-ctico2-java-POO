package ar.centro8.java.curso.trabajo_practico_2.entidades;

import java.text.NumberFormat;
import java.util.Locale;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public abstract class Vehiculo implements Comparable<Vehiculo> {
    private final String marca;
    private final String modelo;
    @Setter
    private Double precio;
    
    
    public String formatearPrecio() {
        // Formatea comn el formato de Argentina usa punto para los miles y coma para los decimales
        final NumberFormat formato = NumberFormat.getNumberInstance(new Locale("es", "AR")); 
        formato.setMinimumFractionDigits(2); // le exige un minimo de 2 digitos
        formato.setMaximumFractionDigits(2); // le exige un maximo de 2 digitos
        return "$" + formato.format(precio); // agrega el signo $ adelante del precio
    }
    
    @Override
    public int compareTo(Vehiculo o) {
        String thisVehiculo = this.getMarca() + this.getModelo() + this.getPrecio();
        String oVehiculo = o.getMarca() + o.getModelo() + o.getPrecio();
        return thisVehiculo.compareTo(oVehiculo);
    }

    
    
}


