package Ejercicios_POO.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String DNI;
    private List<Prestamo> prestamos;
    private List<CuentaCorriente> cuentas;

    public Cliente(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.prestamos = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
    public void addPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }
    public List<CuentaCorriente> getCuentas() {
        return cuentas;
    }
    public void addCuenta(CuentaCorriente cuenta) {
        this.cuentas.add(cuenta);
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.DNI;
    }
}
