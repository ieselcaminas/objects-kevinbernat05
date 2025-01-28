package Ejercicios_POO.ejercicio3;

public class main {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("kevin",100);

        c.ingresar(-100);

        System.out.println(c);
    }
}
