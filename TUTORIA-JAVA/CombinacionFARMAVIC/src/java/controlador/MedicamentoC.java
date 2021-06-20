/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.MedicamentoImpl;
import javax.inject.Named;
import javax.enterprise.context.ConversationScoped;
import java.io.Serializable;
import modelo.Medicamento;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Jesus
 */
@Named(value = "medicamentoC")
@ConversationScoped
public class MedicamentoC implements Serializable {

    private Medicamento med;
    private MedicamentoImpl dao;
    private List<Medicamento> listadomed;

    public MedicamentoC() {
        med = new Medicamento();
        dao = new MedicamentoImpl();
        listadomed = new ArrayList<>();
    }

     public void registrar() throws Exception {
        try {
            dao.registrar(med);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "OK", "Registrado con éxito"));
            listar();
            limpiar();
        } catch (Exception e) {
            System.out.println("Error en REGISTRAR MedicamentoC" + e.getMessage());
        }

    }
     
      public void limpiar() {
        med = new Medicamento();

    }

    public void listar() {
        try {
            listadomed = dao.listar();
        } catch (Exception e) {
            System.out.println("Error en LISTAR MedicamentoC: " + e.getMessage());
        }
    }
    
    @PostConstruct
    public void construir() {
        listar();
    }

    public Medicamento getMed() {
        return med;
    }

    public void setMed(Medicamento med) {
        this.med = med;
    }

    public MedicamentoImpl getDao() {
        return dao;
    }

    public void setDao(MedicamentoImpl dao) {
        this.dao = dao;
    }

    public List<Medicamento> getListadomed() {
        return listadomed;
    }

    public void setListadomed(List<Medicamento> listadomed) {
        this.listadomed = listadomed;
    }

   
    
    
}
