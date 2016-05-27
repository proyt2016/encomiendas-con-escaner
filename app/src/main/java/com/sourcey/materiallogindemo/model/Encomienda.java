package com.sourcey.materiallogindemo.model;

/**
 * Created by maxi on 16/05/2016.
 */
public class Encomienda {
    private Integer viajeId;
    private String emisorNombre;
    private String origenId;
    private String destinoId;
    private String ReceptorNombre;
    private String id;

    public String getOrigenId() {
        return origenId;
    }

    public void setOrigenId(String origenId) {
        this.origenId = origenId;
    }



    public String getDestinoId() {
        return destinoId;
    }

    public void setDestinoId(String destinoId) {
        this.destinoId = destinoId;
    }


    public void setId(String id) {
        this.id = id;
    }



    public String getReceptorNombre() {
        return ReceptorNombre;
    }

    public void setReceptorNombre(String receptorNombre) {
        ReceptorNombre = receptorNombre;
    }



    public Integer getViajeId() {
        return viajeId;
    }

    public void setViajeId(Integer viajeId) {
        this.viajeId = viajeId;
    }



    public Encomienda(String cod, String nom) {
        this.id = cod;
        this.emisorNombre = nom;

    }

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    /**
     * @return The nombre
     */
    public String getNombre() {
        return emisorNombre;
    }

    /**
     * @param nombre The nombre
     */
    public void setNombre(String nombre) {
        this.emisorNombre = nombre;
    }

    public String toString() {
        return this.id + " " + this.emisorNombre;
    }

}