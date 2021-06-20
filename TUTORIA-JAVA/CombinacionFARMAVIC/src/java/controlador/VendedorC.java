/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.VendedorImpl;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import modelo.Vendedor;

/**
 *
 * @author Jesus
 */
@Named(value = "vendedorC")
@SessionScoped
public class VendedorC implements Serializable {

    /**
     * Creates a new instance of VendedorC
     */
    private Vendedor ven;
    private VendedorImpl dao;
    private List<Vendedor> listadoVen;

    public VendedorC() {
        ven = new Vendedor();
        dao = new VendedorImpl();
        listadoVen = new ArrayList<>();
    }
    
    public void registrar() {
        try {
            dao.registrar(ven);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "OK", "Registrado con éxito"));
            limpiar();
            listar();
        } catch (Exception e) {
            System.out.println("Error en REGISTRAR VendedorC" + e.getMessage());
        }

    }
    
    public void limpiar() {
        ven = new Vendedor();
    }

    public void listar() {
        try {
            listadoVen = dao.listar();
        } catch (Exception e) {
            System.out.println("Error en LISTAR VendedorC: " + e.getMessage());
        }
    }
    
    @PostConstruct
    public void construir() {
        listar();
    }

    public Vendedor getVen() {
        return ven;
    }

    public void setVen(Vendedor ven) {
        this.ven = ven;
    }

    public VendedorImpl getDao() {
        return dao;
    }

    public void setDao(VendedorImpl dao) {
        this.dao = dao;
    }

    public List<Vendedor> getListadoVen() {
        return listadoVen;
    }

    public void setListadoVen(List<Vendedor> listadoVen) {
        this.listadoVen = listadoVen;
    }
    
    
    
    

}
