/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.FacturaDetalleD;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import modelo.FacturaDetalle;

/**
 *
 * @author Jesus
 */
@Named(value = "facturaDetalleC")
@SessionScoped
public class FacturaDetalleC implements Serializable {

    private FacturaDetalleD dao;
    private FacturaDetalle facturaDetalle;
    private List<FacturaDetalle> lstFacturaDetalle;
    
    public FacturaDetalleC() {
        facturaDetalle = new FacturaDetalle();
        dao = new FacturaDetalleD();
        lstFacturaDetalle = new ArrayList();
    }
    
    public void listar() {
        try {
            lstFacturaDetalle = dao.listar();
        } catch (Exception e) {
            System.out.println("Error en listar FacturaDetalleC " + e.getMessage());
        }
    }

    @PostConstruct
    public void construir() {
        listar();
    }

     public void eliminar(FacturaDetalle fac) {
        try {
            dao.eliminar(fac);
            listar();
            limpiar();
        } catch (Exception e) {
            System.out.println("Error FacturaDetalleC eliminar " + e.getMessage());
        }
    }

    public void registrar() {
        try {
            dao.registrar(facturaDetalle);
            listar();
            limpiar();

        } catch (Exception e) {
            System.out.println("error en Registrar FacturaDetalleC " + e.getMessage());
        }
    }

    public void obtenerDatos(FacturaDetalle fac) {
        this.facturaDetalle = fac;
    }

    public void modificar() {
        try {
            dao.modificar(facturaDetalle);
            limpiar();
        } catch (Exception e) {
            System.out.println("error ");
        }
    }
    
     
    public void limpiar() {
        facturaDetalle = new FacturaDetalle();
    }

    
    
    public FacturaDetalleD getDao() {
        return dao;
    }

    public void setDao(FacturaDetalleD dao) {
        this.dao = dao;
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
