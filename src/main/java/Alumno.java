import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private Integer legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, Integer legajo, List<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>(materiasAprobadas);
    }

    public Boolean puedeAnotarseA(Materia m) {
        return correlatividadesValidas(m);
    }

    public Boolean correlatividadesValidas(Materia m) {
        return m.getCorrelativas()
                .stream()
                .allMatch((correlativa) ->
                        this.materiasAprobadas.contains(correlativa) && this.correlatividadesValidas(correlativa));
    }
}