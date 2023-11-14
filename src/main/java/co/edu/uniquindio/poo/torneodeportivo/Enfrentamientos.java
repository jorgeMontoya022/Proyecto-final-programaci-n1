package co.edu.uniquindio.poo.torneodeportivo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

import java.time.LocalDate;

public class Enfrentamientos {
    private final String direccion;
    private String lugar;
    private LocalDate fechaHora;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private Collection<Juez> jueces;
    private Resultado resultado;
    private EstadoEnfrentamientos estado;

    public Enfrentamientos (String direccion, String lugar, LocalDate fechaHora,Equipo equipoLocal,Equipo equipoVisitante, EstadoEnfrentamientos estado) {

        ASSERTION.assertion(direccion != null, "La dirección es requerida");
        ASSERTION.assertion(equipoLocal != null, "El equipo local es requerido");
        ASSERTION.assertion(equipoVisitante != null, "El equipo visitante es requerido");
        ASSERTION.assertion(lugar != null, "El nombre del lugar es requerido");
        ASSERTION.assertion(fechaHora != null, "La fecha y hora son requeridas");
        ASSERTION.assertion(jueces != null, "El nombre es requerido");
        ASSERTION.assertion(resultado !=null, "El puntaje no puede ser negativo");

        this.direccion = direccion;
        this.lugar = lugar;
        this.fechaHora = fechaHora;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.jueces = new ArrayList<>();
        this.estado = estado;

        
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

    

    public String getDireccion() {
        return direccion;
    }


    public Equipo getEquipoLocal() {
        return equipoLocal;
    }


    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }


    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

  
    public Collection<Juez> getJueces() {
        return Collections.unmodifiableCollection(jueces);
    }

    public void setJueces(Collection<Juez> jueces) {
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

    
}

 