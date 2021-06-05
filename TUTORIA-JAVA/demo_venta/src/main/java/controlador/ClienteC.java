/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.ClienteD;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import modelo.Cliente;

/**
 *
 * @author Jesus
 */
@Named(value = "clienteC")
@SessionScoped
public class ClienteC implements Serializable {

    private ClienteD dao;
    private Cliente cliente;
    private List<Cliente> lstcliente;

    public ClienteC() {
        cliente = new Cliente();
        dao = new ClienteD();
        lstcliente = new ArrayList();
    }

    public void listar() {
        try {
            lstcliente = dao.listar();
        } catch (Exception e) {
            System.out.println("Error ClienteC: " + e);
        }

    }

    @PostConstruct
    public void construir() {
        listar();
    }

    public void eliminar(Cliente cli) {
        try {
            dao.eliminar(cli);
            listar();
            limpiar();
        } catch (Exception e) {
            System.out.println("error ClienteC eliminar" + e.getMessage());
        }

    }

    public void registrar() {
        try {
            dao.registrar(cliente);
            listar();
            limpiar();
        } catch (Exception e) {
            System.out.println("error en REGISTRAR clienteC" + e.getMessage());
        }

    }

    public void obtenerDatos(Cliente cli) {
        this.cliente = cli;
    }

    public void modificar() {
        try {

            dao.modificar(cliente);
            listar();
            limpiar();
        } catch (Exception e) {
            System.out.println("error en MODIFICAR clienteC" + e.getMessage());
        }
    }

    public void limpiar() {
        cliente = new Cliente();
    }

    
    
    public ClienteD getDao() {
        return dao;
    }

    public void setDao(ClienteD dao) {
        this.dao = dao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getLstcliente() {
        return lstcliente;
    }

    public void setLstcliente(List<Cliente> lstcliente) {
        this.lstcliente = lstcliente;
    }

}
