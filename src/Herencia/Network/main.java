package Herencia.Network;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        mensaje mensaje = new mensaje("Kevin","Hola me llamo Kevin", 1);
        mensaje.darLike();
        System.out.println(mensaje);



        fotografia fotografia = new fotografia("Paquito", 1, "Foto de un paisaje", "Foto 1");
        System.out.println(fotografia);


    }
}
