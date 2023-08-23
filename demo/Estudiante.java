public class Estudiante {
    private Long IdEstudiante;
    private Long IdPersona;
    private Integer Legajo;

    public Estudiante(Long IdEstudiante, Long IdPersona, Integer Legajo) {
        this.IdEstudiante = IdEstudiante;
        this.IdPersona = IdPersona;
        this.Legajo = Legajo;
    }

    public Long getIdEstudiante() {
        return IdEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        IdEstudiante = idEstudiante;
    }

    public Long getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(Long idPersona) {
        IdPersona = idPersona;
    }

    public Integer getLegajo() {
        return Legajo;
    }

    public void setLegajo(Integer legajo) {
        Legajo = legajo;
    }

}

