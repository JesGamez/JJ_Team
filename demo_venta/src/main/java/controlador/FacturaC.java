/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.FacturaD;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import modelo.Factura;

/**
 *
 * @author Jesus
 */
@Named(value = "facturaC")
@SessionScoped
public class FacturaC implements Serializable {

    private FacturaD dao;
    private Factura factura;
    private List<Factura> lstFactura;

    public FacturaC() {
        factura = new Factura();
        dao = new FacturaD();
        lstFactura = new ArrayList();
    }

    public void listar() {
        try {
            lstFactura = dao.listar();
        } catch (Exception e) {
            System.out.println("Error en listar FacturaC " + e.getMessage());
        }
    }

    @PostConstruct
    public void construir() {
        listar();
    }

     public void eliminar(Factura fac) {
        try {
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
            limpiar();

        } catch (Exception e) {
            System.out.println("error en Registrar FacturaC " + e.getMessage());
        }
    }

    public void obtenerDatos(Factura fac) {
        this.factura = fac;
    }

    public void modificar() {
        try {
            dao.modificar(factura);
            limpiar();
        } catch (Exception e) {
            System.out.println("error ");
        }
    }
    
     
    public void limpiar() {
        factura = new Factura();
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

    
    
}
