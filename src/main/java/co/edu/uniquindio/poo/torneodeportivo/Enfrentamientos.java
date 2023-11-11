package co.edu.uniquindio.poo.torneodeportivo;

import java.util.List;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

import java.time.LocalDate;

public class Enfrentamientos {
    private String lugar;
    private LocalDate fechaHora;
    private List<Equipo> equipos;
    private List<Juez> jueces;
    private Resultado resultado;
    private EstadoEnfrentamientos estado;

    public Enfrentamientos (String nombre, String lugar, LocalDate fechaHora, List<Equipo> equipos, List<Juez> jueces) {

        ASSERTION.assertion(nombre != null, "El nombre es requerido");
        ASSERTION.assertion(lugar != null, "El nombre del lugar es requerido");
        ASSERTION.assertion(fechaHora != null, "La fecha y hora son requeridas");
        ASSERTION.assertion(equipos!= null && !equipos.isEmpty(), "El numero de equipos debe ser mayor a cero");
        ASSERTION.assertion(jueces != null, "El nombre es requerido");
        ASSERTION.assertion(resultado !=null, "El puntaje no puede ser negativo");

        this.lugar = lugar;
        this.fechaHora = fechaHora;
        this.equipos = equipos;
        this.jueces = jueces;
        this.estado = EstadoEnfrentamientos.PENDIENTE;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Juez> getJueces() {
        return jueces;
    }

    public void setJueces(List<Juez> jueces) {
        this.jueces = jueces;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public EstadoEnfrentamientos getEstado() {
        return estado;
    }

    public void setEstado(EstadoEnfrentamientos estado) {
        this.estado = estado;
    }

    public class Resultado {
        private int puntosEquipo1;
        private int puntosEquipo2;

        public Resultado(int puntosEquipo1, int puntosEquipo2) {
        this.puntosEquipo1 = puntosEquipo1;
        this.puntosEquipo2 = puntosEquipo2;
    }

        public int getPuntosEquipo1() {
            return puntosEquipo1;
        }

        public void setPuntosEquipo1(int puntosEquipo1) {
            this.puntosEquipo1 = puntosEquipo1;
        }

        public int getPuntosEquipo2() {
            return puntosEquipo2;
        }

        public void setPuntosEquipo2(int puntosEquipo2) {
            this.puntosEquipo2 = puntosEquipo2;
        }
    }
    
}

 