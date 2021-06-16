/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Jesus
 */
public class Cancer {
    
//    ColumnNames":["ct","ucz","ucs","ma","secs","bn","bc","nn","mitosis","cancer_type","Scored Labels","Scored Probabilities"]
           
    @Getter @Setter int ct,ucz,ucs,ma, secs, bn, bc, nn, mitosis, cancer_type;
    
    // resultado
    @Getter @Setter String ScoredLabels,resultado;
    @Getter @Setter Double ScoredProbabilities;
   
    
}
