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
public class Vendedor {
    private int IDVEND;
    private String NOMAPEVEND,SEXVEND,EDAVEND,PUEVEND;

    public Vendedor() {
    }

    public Vendedor(int IDVEND, String NOMAPEVEND, String SEXVEND, String EDAVEND, String PUEVEND) {
        this.IDVEND = IDVEND;
        this.NOMAPEVEND = NOMAPEVEND;
        this.SEXVEND = SEXVEND;
        this.EDAVEND = EDAVEND;
        this.PUEVEND = PUEVEND;
    }

    public int getIDVEND() {
        return IDVEND;
    }

    public void setIDVEND(int IDVEND) {
        this.IDVEND = IDVEND;
    }

    public String getNOMAPEVEND() {
        return NOMAPEVEND;
    }

    public void setNOMAPEVEND(String NOMAPEVEND) {
        this.NOMAPEVEND = NOMAPEVEND;
    }

    public String getSEXVEND() {
        return SEXVEND;
    }

    public void setSEXVEND(String SEXVEND) {
        this.SEXVEND = SEXVEND;
    }

    public String getEDAVEND() {
        return EDAVEND;
    }

    public void setEDAVEND(String EDAVEND) {
        this.EDAVEND = EDAVEND;
    }

    public String getPUEVEND() {
        return PUEVEND;
    }

    public void setPUEVEND(String PUEVEND) {
        this.PUEVEND = PUEVEND;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "IDVEND=" + IDVEND + ", NOMAPEVEND=" + NOMAPEVEND + ", SEXVEND=" + SEXVEND + ", EDAVEND=" + EDAVEND + ", PUEVEND=" + PUEVEND + '}';
    }

    
    
}
