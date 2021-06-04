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
public class Producto {

    private int IDPROD, VALCOMP, VALVENT;
    private String NOMPROD;

    public Producto() {
    }

    public Producto(int IDPROD, int VALCOMP, int VALVENT, String NOMPROD) {
        this.IDPROD = IDPROD;
        this.VALCOMP = VALCOMP;
        this.VALVENT = VALVENT;
        this.NOMPROD = NOMPROD;
    }

    public int getIDPROD() {
        return IDPROD;
    }

    public void setIDPROD(int IDPROD) {
        this.IDPROD = IDPROD;
    }

    public int getVALCOMP() {
        return VALCOMP;
    }

    public void setVALCOMP(int VALCOMP) {
        this.VALCOMP = VALCOMP;
    }

    public int getVALVENT() {
        return VALVENT;
    }

    public void setVALVENT(int VALVENT) {
        this.VALVENT = VALVENT;
    }

    public String getNOMPROD() {
        return NOMPROD;
    }

    public void setNOMPROD(String NOMPROD) {
        this.NOMPROD = NOMPROD;
    }

    @Override
    public String toString() {
        return "Producto{" + "IDPROD=" + IDPROD + ", VALCOMP=" + VALCOMP + ", VALVENT=" + VALVENT + ", NOMPROD=" + NOMPROD + '}';
    }

}
