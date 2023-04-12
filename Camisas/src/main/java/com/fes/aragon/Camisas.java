package com.fes.aragon;

public enum Camisas {
    MC(1,"Camisa de Manga Corta", 190), CasualML(2,"Camisa Casual de Manga Larga", 230), FromalML(3,"Camisa Formal de Manga Larga", 310);

    private final int idCamisa;
    private final String nombreCamisa;
    private final int precio;

    Camisas (int idCamisa,String nombreCamisa, int precio){
        this.idCamisa = idCamisa;
        this.nombreCamisa = nombreCamisa;
        this.precio = precio;
    }

    public int getIdCamisa() {
        return idCamisa;
    }
    public String getNombreCamisa() {
        return nombreCamisa;
    }
    public int getPrecio() {
        return precio;
    }

}
