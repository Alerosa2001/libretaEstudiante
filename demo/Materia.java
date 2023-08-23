public class Materia {
    private Long idMateria;
    private String nombre;
    private Integer anio;
    private Long idCarrera;
    private Long idProfesor;
    private Long idAyudante;

    public Materia(Long idMateria, String nombre, Integer anio, Long idCarrera, Long idProfesor, Long idAyudante) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
        this.idCarrera = idCarrera;
        this.idProfesor = idProfesor;
        this.idAyudante = idAyudante;
    }


    public Long getIdMateria() {
        return IdMateria;
    }

    public void setIdMateria(Long idMateria) {
        IdMateria = idMateria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getAnio() {
        return Anio;
    }

    public void setAnio(Integer anio) {
        Anio = anio;
    }

    public Long getIdCarrera() {
        return IdCarrera;
    }

    public void setIdCarrera(Long idCarrera) {
        IdCarrera = idCarrera;
    }

    public Long getIdProfesor() {
        return IdProfesor;
    }

    public void setIdProfesor(Long idProfesor) {
        IdProfesor = idProfesor;
    }

    public Long getIdAyudante() {
        return IdAyudante;
    }

    public void setIdAyudante(Long idAyudante) {
        IdAyudante = idAyudante;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Materia{" +
                "idMateria=" + idMateria +
                ", nombre='" + nombre + '\'' +
                ", anio=" + anio +
                ", idCarrera=" + idCarrera +
                ", idProfesor=" + idProfesor +
                ", idAyudante=" + idAyudante +
                '}';
    }
}
