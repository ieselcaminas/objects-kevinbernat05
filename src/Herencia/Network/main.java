package Herencia.Network;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<publicacion> listadepublicaciones = new ArrayList<>();

        mensaje mensaje = new mensaje("Kevin","Hola me llamo Kevin", 1);
        mensaje.darLike();
        listadepublicaciones.add(mensaje);
        mensaje mensaje1 = new mensaje("Kevin", "Hoy es viernes", 1);
        mensaje1.darLike();
        mensaje1.darLike();
        mensaje1.darLike();
        mensaje1.disLike();
        listadepublicaciones.add(mensaje1);

        fotografia fotografia = new fotografia("Paquito", 1, "Foto de un paisaje", "Fotopaisaje.jpg");
        fotografia.darLike();
        fotografia.darLike();
        listadepublicaciones.add(fotografia);

        publicacionDe("Kevin", listadepublicaciones);


    }
    public static void publicacionDe(String usuario, List <publicacion> listadepublicaciones){
        listadepublicaciones.stream()
                .filter(publicacion -> publicacion.getUsuario().equals(usuario))
                .forEach(System.out::println);
    }
}
