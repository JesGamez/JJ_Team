/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jesus
 */
public class FacturaDetalle {
    private int IDFACDET,CANTFACDET,IDFACT,IDPROD;
    
    private Factura factura;
    private Producto producto;

    public FacturaDetalle() {
    }

    public FacturaDetalle(int IDFACDET, int CANTFACDET, int IDFACT, int IDPROD, Factura factura, Producto producto) {
        this.IDFACDET = IDFACDET;
        this.CANTFACDET = CANTFACDET;
        this.IDFACT = IDFACT;
        this.IDPROD = IDPROD;
        this.factura = factura;
        this.producto = producto;
    }

    public int getIDFACDET() {
        return IDFACDET;
    }

    public void setIDFACDET(int IDFACDET) {
        this.IDFACDET = IDFACDET;
    }

    public int getCANTFACDET() {
        return CANTFACDET;
    }

    public void setCANTFACDET(int CANTFACDET) {
        this.CANTFACDET = CANTFACDET;
    }

    public int getIDFACT() {
        return IDFACT;
    }

    public void setIDFACT(int IDFACT) {
        this.IDFACT = IDFACT;
    }

    public int getIDPROD() {
        return IDPROD;
    }

    public void setIDPROD(int IDPROD) {
        this.IDPROD = IDPROD;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "FactDetalle{" + "IDFACDET=" + IDFACDET + ", CANTFACDET=" + CANTFACDET + ", IDFACT=" + IDFACT + ", IDPROD=" + IDPROD + ", factura=" + factura + ", producto=" + producto + '}';
    }
    
    
}
