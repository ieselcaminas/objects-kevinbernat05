package Ejercicios_POO.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Banco> bancos = new ArrayList<Banco>();

        Banco bbva = new Banco("BBVA",1);
        bancos.add(bbva);
            Sucursal a = new Sucursal(1,"Castellon", bbva);
            Sucursal b = new Sucursal(2,"Valencia", bbva);
                Cliente kevin = new Cliente("Kevin", "13124A");
                    CuentaCorriente cKevin = new CuentaCorriente(123);
                    Prestamo pKevin = new Prestamo(1, 100, kevin);

        bbva.addSucursal(a);
        bbva.addSucursal(b);
        a.addCuentas(cKevin);
        cKevin.addClientes(kevin);
        kevin.addCuenta(cKevin);
        kevin.addPrestamo(pKevin);



        Banco caixa = new Banco("Caixa", 2);
        bancos.add(caixa);
        Sucursal c = new Sucursal(1,"Almazora",caixa);

        caixa.addSucursal(c);

        for(Banco banco : bancos) {
            System.out.println(banco);

            for(Sucursal s: banco.getSucursales()){
                System.out.println("\t" +s);

                for (CuentaCorriente cuentaCorriente : s.getCuentas()) {
                    System.out.println("\t\t" +cuentaCorriente);

                    for(Cliente cliente : cuentaCorriente.getClientes()){
                        System.out.println("\t\t\t" +cliente);

                        for (Prestamo p : cliente.getPrestamos()){
                            System.out.println("\t\t\t\t" + p);
                        }
                    }
                }
            }
        }
    }
}
