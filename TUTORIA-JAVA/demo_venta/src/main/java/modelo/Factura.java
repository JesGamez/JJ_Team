/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Jesus
 */
public class Factura {

    private int IDFACT, IDCLI, IDVEND;
    private Date FECFAC;

    // es donde vamos a añadir a las tablas que necesitamos
    private Cliente cliente;
    private Vendedor vendedor;

    public Factura() {
    }

    public Factura(int IDFACT, int IDCLI, int IDVEND, Date FECFAC, Cliente cliente, Vendedor vendedor) {
        this.IDFACT = IDFACT;
        this.IDCLI = IDCLI;
        this.IDVEND = IDVEND;
        this.FECFAC = FECFAC;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public int getIDFACT() {
        return IDFACT;
    }

    public void setIDFACT(int IDFACT) {
        this.IDFACT = IDFACT;
    }

    public int getIDCLI() {
        return IDCLI;
    }

    public void setIDCLI(int IDCLI) {
        this.IDCLI = IDCLI;
    }

    public int getIDVEND() {
        return IDVEND;
    }

    public void setIDVEND(int IDVEND) {
        this.IDVEND = IDVEND;
    }

    public Date getFECFAC() {
        return FECFAC;
    }

    public void setFECFAC(Date FECFAC) {
        this.FECFAC = FECFAC;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Factura{" + "IDFACT=" + IDFACT + ", IDCLI=" + IDCLI + ", IDVEND=" + IDVEND + ", FECFAC=" + FECFAC + ", cliente=" + cliente + ", vendedor=" + vendedor + '}';
    }

}
