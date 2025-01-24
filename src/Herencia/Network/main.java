package Herencia.Network;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Publicacion> listadepublicaciones = new ArrayList<>();

        Usuario kevin = new Usuario("Kevin", 2);
        Mensaje mensaje = new Mensaje(kevin,"Hola me llamo Kevin", 1);
        mensaje.darLike();
        listadepublicaciones.add(mensaje);

        Mensaje mensaje1 = new Mensaje(kevin, "Hoy es viernes", 1);
        mensaje1.darLike();
        mensaje1.darLike();
        mensaje1.darLike();
        mensaje1.disLike();
        listadepublicaciones.add(mensaje1);

        Usuario paquito = new Usuario("Paquito", 1);
        Fotografia fotografia = new Fotografia(paquito, 1, "Foto de un paisaje", "Fotopaisaje.jpg");
        fotografia.darLike();
        fotografia.darLike();
        listadepublicaciones.add(fotografia);

        publicacionDe(kevin, listadepublicaciones);


    }
    public static void publicacionDe(Usuario usuario, List <Publicacion> listadepublicaciones){
        listadepublicaciones.stream()
                .filter(Publicacion -> Publicacion.getUsuario().getNombre().equals(usuario.getNombre()))
                .forEach(System.out::println);

    }
}
