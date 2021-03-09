package com.mycompany.sistemarestaruante;




public class Venta {

private String NombreDelPlato;
private int cantidadVendida;
private int precioPagado; 
private String NumeroDeDocumento;
private String tipoDeDocumento; 
private String fecha;

    public Venta() {
    }


    public Venta(String NombreDelPlato, int cantidadVendida, int precioPagado, String NumeroDeDocumento, String tipoDeDocumento,String fecha) {
        this.NombreDelPlato = NombreDelPlato;
        this.cantidadVendida = cantidadVendida;
        this.precioPagado = precioPagado;
        this.NumeroDeDocumento = NumeroDeDocumento;
        this.tipoDeDocumento = tipoDeDocumento;
        this.fecha = fecha;
    }

    public String getNombreDelPlato() {
        return NombreDelPlato;
    }

    public void setNombreDelPlato(String NombreDelPlato) {
        this.NombreDelPlato = NombreDelPlato;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public int getPrecioPagado() {
        return precioPagado;
    }

    public void setPrecioPagado(int precioPagado) {
        this.precioPagado = precioPagado;
    }

    public String getNumeroDeDocumento() {
        return NumeroDeDocumento;
    }

    public void setNumeroDeDocumento(String NumeroDeDocumento) {
        this.NumeroDeDocumento = NumeroDeDocumento;
    }

    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(String tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }
    

 
   


   


}
