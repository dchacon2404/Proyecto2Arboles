package Modelo;


public class ClaseVirtual {
    
    private String nombreCurso;
    private String temaCurso;
    private int codigoCurso;
    private String sede;
    private String docente;
    private String dia;
    private String horaInicio;
    private String horaFin;

    //Este constructor se usa en la clase ControladorClases
    public ClaseVirtual() {
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getTemaCurso() {
        return temaCurso;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public String getSede() {
        return sede;
    }

    public String getDocente() {
        return docente;
    }

    public String getDia() {
        return dia;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setTemaCurso(String temaCurso) {
        this.temaCurso = temaCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
}
