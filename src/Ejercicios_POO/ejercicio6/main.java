package Ejercicios_POO.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Area> areas = new ArrayList<>();
        List<Facultad> facultades = new ArrayList<>();

        Area medicina = new Area("Medicina");
        areas.add(medicina);

        Departamento principal = new Departamento(1, "Principal");
        medicina.addDepartamento(principal);

        Departamento secundario = new Departamento(2, "Secundario");
        medicina.addDepartamento(secundario);

        Catedra comportamiento = new Catedra("Comportamiento");
        principal.addCatedra(comportamiento);

        Catedra cerebro = new Catedra("Cerebro");
        principal.addCatedra(cerebro);

        Profesor sergio = new Profesor("Sergio", 213124, principal);
        principal.addProfesor(sergio);

        Profesor paquito = new Profesor("Paquito", 12414, principal);
        principal.addProfesor(paquito);
        paquito.addCatedra(cerebro);
        paquito.addCatedra(comportamiento);

        Facultad jaume = new Facultad("Castellon", 10);
        facultades.add(jaume);
        jaume.addCatedra(cerebro);
        jaume.addCatedra(comportamiento);

        for (Area area : areas) {
            System.out.println(areas);

            for (Departamento departamento : area.getDepartamentos()) {
                System.out.println("\t" + departamento);

                for (Profesor profesor : departamento.getProfesores()) {
                    System.out.println("\t\t" + profesor);

                    for (Catedra catedra : profesor.getCatedras()) {
                        System.out.println("\t\t\t" + catedra);
                    }
                }
            }
        }
        for (Facultad facultad : facultades) {
            System.out.println(facultad);

            for (Catedra catedra : facultad.getCatedras()) {
                System.out.println("\t" + catedra);
            }
        }
    }

 }
