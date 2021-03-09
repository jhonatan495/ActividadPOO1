
package com.mycompany.sistemarestaruante;



public class Cliente {
  
   private String tipoDeDocumento;
   private String NumeroDeDocumento;
   private String NombreCompleto;
   private String NombreDeEmpresa;

    public Cliente() {
    }

    public Cliente(String tipoDeDocumento, String NumeroDeDocumento, String NombreCompleto, String NombreDeEmpresa) {
        this.tipoDeDocumento = tipoDeDocumento;
        this.NumeroDeDocumento = NumeroDeDocumento;
        this.NombreCompleto = NombreCompleto;
        this.NombreDeEmpresa = NombreDeEmpresa;
    }

    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(String tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public String getNumeroDeDocumento() {
        return NumeroDeDocumento;
    }

    public void setNumeroDeDocumento(String NumeroDeDocumento) {
        this.NumeroDeDocumento = NumeroDeDocumento;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getNombreDeEmpresa() {
        return NombreDeEmpresa;
    }

    public void setNombreDeEmpresa(String NombreDeEmpresa) {
        this.NombreDeEmpresa = NombreDeEmpresa;
    }

 
    
   
}
