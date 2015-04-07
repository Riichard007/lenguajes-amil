package Serializacion;

import java.io.Serializable;

public class Direccion implements Serializable{
    private String colonia;
    private String municipio;
    private String estado;

    public Direccion(String colonia, String municipio, String estado) {
        this.colonia = colonia;
        this.municipio = municipio;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
}
