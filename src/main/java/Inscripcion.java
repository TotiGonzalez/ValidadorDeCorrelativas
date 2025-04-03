import java.util.ArrayList;
import java.util.List;


public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasAnotadas;

    public Inscripcion(Alumno alumno, List<Materia> materiasAnotadas) {
        this.alumno = alumno;
        this.materiasAnotadas = new ArrayList<Materia> (materiasAnotadas);
    }

    public List<Materia> getMateriasAnotadas() {
        return materiasAnotadas;
    }

    public Boolean aprobada(){
        return this.getMateriasAnotadas()
                .stream()
                .allMatch(m -> alumno.puedeAnotarseA(m));
    }
}