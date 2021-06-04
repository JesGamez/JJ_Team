/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.ProductoD;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import modelo.Producto;

/**
 *
 * @author Jesus
 */
@Named(value = "productoC")
@SessionScoped
public class ProductoC implements Serializable {

    private ProductoD dao;
    private Producto producto;
    private List<Producto> lstProducto;

    public ProductoC() {
        producto = new Producto();
        dao = new ProductoD();
        lstProducto = new ArrayList();
    }

    public void listar() {
        try {
            lstProducto = dao.listar();
        } catch (Exception e) {
            System.out.println("Error ProductoC listar: " + e);
        }
    }

    @PostConstruct
    public void construir() {
        listar();
    }

    public void eliminar(Producto pro) {
        try {
            dao.eliminar(pro);
            listar();
            limpiar();
        } catch (Exception e) {
            System.out.println("error ProductoC eliminar" + e.getMessage());
        }

    }

    public void registrar() {
        try {
            dao.registrar(producto);
            listar();
            limpiar();
        } catch (Exception e) {
            System.out.println("error en REGISTRAR productoC" + e.getMessage());
        }

    }

    public void obtenerDatos(Producto pro) {
        this.producto = pro;
    }

    public void modificar() {
        try {

            dao.modificar(producto);
            listar();
            limpiar();
        } catch (Exception e) {
            System.out.println("error en MODIFICAR productoC" + e.getMessage());
        }
    }

    public void limpiar() {
        producto = new Producto();
    }

    public ProductoD getDao() {
        return dao;
    }

    public void setDao(ProductoD dao) {
        this.dao = dao;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getLstProducto() {
        return lstProducto;
    }

    public void setLstProducto(List<Producto> lstProducto) {
        this.lstProducto = lstProducto;
    }

}
