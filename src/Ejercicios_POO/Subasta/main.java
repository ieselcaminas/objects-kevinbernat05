package Ejercicios_POO.Subasta;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Subasta> subastas = new ArrayList<>();
        List<Pujador> pujadores = new ArrayList<>();

        Pujador Kevin = new Pujador("Kevin");
        Pujador Paquito = new Pujador("Paquito");
        pujadores.add(Kevin);
        pujadores.add(Paquito);

        Subasta Museo = new Subasta("05/03/2025");

        subastas.add(Museo);

        Lote arte = new Lote(1, 500, Museo);
        Museo.addLote(arte);
            Articulo jarron = new Articulo("Jarron", 200, arte);
            Articulo cuadro = new Articulo("Cuadro", 300, arte);
            arte.addArticulo(jarron);
            arte.addArticulo(cuadro);

        Lote medieval = new Lote(2, 1500, Museo);
        Museo.addLote(medieval);
            Articulo espada = new Articulo("Espada", 800, arte);
            Articulo armadura = new Articulo("Armadura", 700, arte);
            medieval.addArticulo(espada);
            medieval.addArticulo(armadura);

        Puja arteK = new Puja(Kevin,800, arte);
        Puja arteP = new Puja(Paquito, 1000, arte);
        arte.addPuja(arteK);
        arte.addPuja(arteP);

        Kevin.addPuja(arteK);
        Paquito.addPuja(arteP);

        Museo.cerrarSubasta();

        for (Subasta subasta : subastas) {
            System.out.println(subasta);

            for (Lote lote : subasta.getLotes()) {
                System.out.println(lote);

                for (Articulo articulo : lote.getArticulos()) {
                    System.out.println("\t" + articulo);
                }
            }
        }
    }
}
