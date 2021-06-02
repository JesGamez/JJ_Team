/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.VendedorD;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import modelo.Vendedor;

/**
 *
 * @author Jesus
 */
@Named(value = "vendedorC")
@SessionScoped
public class VendedorC implements Serializable {

    private VendedorD dao;
    private Vendedor vendedor;
    private List<Vendedor> lstvendedor;

    public VendedorC() {
        vendedor = new Vendedor();
        dao = new VendedorD();
        lstvendedor = new ArrayList();

    }

    public void listar() {
        try {
            lstvendedor = dao.listar();
        } catch (Exception e) {
            System.out.println("Error en VendedorC " + e.getMessage());
        }
    }

    @PostConstruct
    public void construir() {
        listar();
    }

    public void eliminar(Vendedor ven) {
        try {
            dao.eliminar(ven);
            listar();
            limpiar();
        } catch (Exception e) {
            System.out.println("Error VendedorC eliminar " + e.getMessage());
        }
    }

    public void registrar() {
        try {
            dao.registrar(vendedor);
            listar();
            limpiar();
        } catch (Exception e) {
            System.out.println("error en Registrar vendedorC " + e.getMessage());
        }
    }

    public void obtenerDatos(Vendedor ven) {
        this.vendedor = ven;
    }

    public void modificar() {
        try {
            dao.modificar(vendedor);
            listar();
            limpiar();
        } catch (Exception e) {
            System.out.println("Error en modificar vendedorC " + e.getMessage());
        }
    }

    public void limpiar() {
        vendedor = new Vendedor();
    }

    
    public VendedorD getDao() {
        return dao;
    }

    public void setDao(VendedorD dao) {
        this.dao = dao;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Vendedor> getLstvendedor() {
        return lstvendedor;
    }

    public void setLstvendedor(List<Vendedor> lstvendedor) {
        this.lstvendedor = lstvendedor;
    }
    
    

}
