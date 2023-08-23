public class Carrera {
    private Long idCarrera;
    private String nombre;

    public Carrera(Long idCarrera, String nombre) {
        this.idCarrera = idCarrera;
        this.nombre = nombre;
    }

    public Long getIdCarrera() {
        return IdCarrera;
    }

    public void setIdCarrera(Long idCarrera) {
        IdCarrera = idCarrera;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Carrera{" +
                "idCarrera=" + idCarrera +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
