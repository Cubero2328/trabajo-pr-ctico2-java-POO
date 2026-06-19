package ar.centro8.java.curso.trabajo_practico_2.entidades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import ar.centro8.java.curso.trabajo_practico_2.interfaz.IConcesionario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Concesionario implements IConcesionario{
    private List<Vehiculo> vehiculos;

    public Concesionario() {
        this.vehiculos = new ArrayList<>();
    }

    public void mostrarLista(){
        vehiculos.forEach(System.out::println);
    }

    public void separador(){
        System.out.println("\n=============================\n");
    }


    public void agregarVehiculo (Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    /**
     * Metodo de la interfaz IConcesionario
     * Muestra los vehculos mas caros del concesionario
    */
    @Override
    public void mayorPrecio(){
        Double precioMax = vehiculos
            .stream()
            .max(Comparator.comparingDouble(Vehiculo::getPrecio))
            .get()
            .getPrecio();
            
        vehiculos   
                .stream()
                .filter(v->v.getPrecio().equals(precioMax))
                .forEach(v-> System.out.println("Vehículo más caro: " + v.getMarca() + " " + v.getModelo()));
    }

    /**
     * Metodo de la interfaz IConcesionario
     * Muestra los vehculos mas baratos del concesionario
     */
    @Override
    public void menorPrecio(){
        Double precioMin = vehiculos
            .stream()
            .min(Comparator.comparingDouble(Vehiculo::getPrecio))
            .get()
            .getPrecio();
        
        vehiculos
                .stream()
                .filter(v->v.getPrecio().equals(precioMin))
                .forEach(v-> System.out.println("Vehículo más barato: " + v.getMarca() + " " + v.getModelo()));
    }


    // cambiar codigo a uno el cual pueda buscar cualquier letra
    // busca los vehiculos que contenga la letra asignada
    public void vehiculoConLetra(){
        Vehiculo contengaLetra = vehiculos
                .stream()
                .filter(v->v.getModelo().toLowerCase().contains("y"))
                .findFirst()
                .get();
        System.out.println("Vehículo que contiene en el modelo la letra 'Y': " + contengaLetra.getMarca() + " " + contengaLetra.getModelo() + " " + contengaLetra.formatearPrecio());
    }
    
    // ordena los vehiculos de mayor a menor precio
    public void ordenMayorMenor(){
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        vehiculos
                .stream()
                .sorted(Comparator.comparing(Vehiculo::getPrecio).reversed())
                .forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo()));
    }

    // ordena a los vehiculos por orden natural
    public void ordenNatural(){
        System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio): ");
        TreeSet<Vehiculo> setVehiculo;
        setVehiculo = new TreeSet<>();
        setVehiculo.addAll(vehiculos);
        setVehiculo.forEach(System.out::println);
    }

}
