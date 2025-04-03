import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestInscripciones{
    Materia paradigmas, disenio, gestionDeDatos, algoritmos;
    Inscripcion inscripcion;

    @BeforeEach
    public void init(){
        algoritmos = new Materia("Algoritmos", List.of());
        paradigmas = new Materia("Paradigmas", List.of(algoritmos));
        disenio = new Materia("Disenio", List.of(paradigmas));
        gestionDeDatos = new Materia("Gestion de Datos", List.of(paradigmas));
    }

    @Test
    public void primeraInscripcion(){
        Alumno tomas = new Alumno("Tomas", 2037002, List.of(algoritmos, paradigmas));
        Inscripcion inscripcion1 = new Inscripcion(tomas, List.of(gestionDeDatos, disenio));
        Assertions.assertTrue(inscripcion1.aprobada());
    }

    @Test
    public void segundaInscripcion(){
        Alumno tomas = new Alumno("Tomas", 2037002, List.of(algoritmos));
        Inscripcion inscripcion1 = new Inscripcion(tomas, List.of(gestionDeDatos, disenio));
        Assertions.assertTrue(inscripcion1.aprobada());
    }
}