/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.FacturaD;
import dao.FacturaDetalleD;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import modelo.Factura;
import modelo.FacturaDetalle;

/**
 *
 * @author Jesus
 */
@Named(value = "pruebaC")
@SessionScoped
public class PruebaC implements Serializable {

    private FacturaD dao;
    private Factura factura;
    private List<Factura> lstFactura;

    private FacturaDetalleD daoDetalle;
    private FacturaDetalle facturaDetalle;
    private List<FacturaDetalle> lstFacturaDetalle;

    public PruebaC() {
        factura = new Factura();
        dao = new FacturaD();
        lstFactura = new ArrayList();

        facturaDetalle = new FacturaDetalle();
        daoDetalle = new FacturaDetalleD();
        lstFacturaDetalle = new ArrayList();

    }

    public void listar() {
        try {

            lstFacturaDetalle = daoDetalle.listar();
            lstFactura = dao.listar();

        } catch (Exception e) {
            System.out.println("Error en listar PruebaC " + e.getMessage());
        }
    }

    @PostConstruct
    public void construir() {
        listar();
    }

    public void eliminar(FacturaDetalle fac2, Factura fac) {
        try {
            daoDetalle.eliminar(fac2);
            dao.eliminar(fac);
            listar();

            limpiar();
        } catch (Exception e) {
            System.out.println("Error FacturaC eliminar " + e.getMessage());
        }
    }

    public void registrar() {
        try {
            dao.registrar(factura);
            listar();
            factura = lstFactura.get(lstFactura.size()-1);
            System.out.println("VAMO A PROBAR XD = " + factura.getIDFACT());
            registrarDetalle(factura);
            limpiar();
            
        } catch (Exception e) {
            System.out.println("error en Registrar FacturaC " + e.getMessage());
        }
    }

    public void registrarDetalle(Factura factura) {
        try {
            daoDetalle.registrarDetalle(facturaDetalle, factura);
            listar();
            limpiar();

        } catch (Exception e) {
            System.out.println("error en Registrar FacturaC " + e.getMessage());
        }
    }

    public void obtenerDatos(Factura fac, FacturaDetalle fac2) {
        this.factura = fac;
        this.facturaDetalle = fac2;
    }

    public void modificar() {
        try {
            dao.modificar(factura);
            daoDetalle.modificar(facturaDetalle);
            limpiar();
        } catch (Exception e) {
            System.out.println("error en modificar FacturaC " + e.getMessage());
        }
    }

    public void limpiar() {
        factura = new Factura();
        facturaDetalle = new FacturaDetalle();
    }

    public FacturaD getDao() {
        return dao;
    }

    public void setDao(FacturaD dao) {
        this.dao = dao;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public List<Factura> getLstFactura() {
        return lstFactura;
    }

    public void setLstFactura(List<Factura> lstFactura) {
        this.lstFactura = lstFactura;
    }

    public FacturaDetalleD getDaoDetalle() {
        return daoDetalle;
    }

    public void setDaoDetalle(FacturaDetalleD daoDetalle) {
        this.daoDetalle = daoDetalle;
    }

    public FacturaDetalle getFacturaDetalle() {
        return facturaDetalle;
    }

    public void setFacturaDetalle(FacturaDetalle facturaDetalle) {
        this.facturaDetalle = facturaDetalle;
    }

    public List<FacturaDetalle> getLstFacturaDetalle() {
        return lstFacturaDetalle;
    }

    public void setLstFacturaDetalle(List<FacturaDetalle> lstFacturaDetalle) {
        this.lstFacturaDetalle = lstFacturaDetalle;
    }

}
