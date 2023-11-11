package co.edu.uniquindio.poo.torneodeportivo;

import java.util.List;
import java.time.LocalDate;

public class Enfrentamientos {
    private String lugar;
    private LocalDate fechaHora;
    private List<Equipo> equipos;
    private List<Juez> jueces;
    private Resultado resultado;
    private EstadoEnfrentamiento estado;

    public Enfrentamiento(String lugar, LocalDate fechaHora, List<Equipo> equipos, List<Juez> jueces) {
        this.lugar = lugar;
        this.fechaHora = fechaHora;
        this.equipos = equipos;
        this.jueces = jueces;
        this.estado = EstadoEnfrentamiento.PENDIENTE;
    }

    //Faltan los getters y setters

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