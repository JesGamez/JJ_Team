/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import lombok.Data;
import modelo.Cancer;
import org.primefaces.json.JSONObject;
import servicios.ApiRest;

/**
 *
 * @author Jesus
 */
@Named(value = "cancerC")
@SessionScoped
@Data
public class CancerC implements Serializable {
    Cancer cancer;
    public CancerC() {
        cancer = new Cancer();
        cancer.setCt(5);
        cancer.setUcz(1);
        cancer.setUcs(1);
        cancer.setMa(1);
        cancer.setSecs(2);
        cancer.setBn(1);
        cancer.setBc(3);
        cancer.setNn(1);
        cancer.setMitosis(1);
    }
    public void mostarDatos() throws IOException, InterruptedException {
        try {
            JSONObject cadenaJson = ApiRest.datosAPI(cancer);
         
            cancer.setScoredLabels(cadenaJson.getString("Scored Labels"));
            cancer.setScoredProbabilities(cadenaJson.getDouble("Scored Probabilities"));
            
            
            if (cancer.getScoredLabels().equals("4")) {
                cancer.setResultado("Segun nuestro modelo, puedes tener un cancer maligno");
            } else {
                cancer.setResultado("Segun nuestro modelo, puedes tener un cancer benigno");
            }
        } catch (Exception e) {
            System.out.println("Error en mostrarDatosC: " + e.getMessage());
            e.printStackTrace();
        }

    }


}
