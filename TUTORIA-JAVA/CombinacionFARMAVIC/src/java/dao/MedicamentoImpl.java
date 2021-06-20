/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import modelo.Medicamento;
import servicios.UtilToSql;

/**
 *
 * @author Jesus
 */
public class MedicamentoImpl extends Conexion implements CRUD<Medicamento> {

    @Override
    public void registrar(Medicamento modelo) throws Exception {
       String sql = "INSERT INTO MEDICAMENTO (PRESMED, GENMED, COMMED, PRECMED, FVMED, STOCMED, FORMED, "
               + "LOTMED, IDPROV, ESTMED) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getPRESMED());
            ps.setString(2, modelo.getGENMED());
            ps.setString(3, modelo.getCOMMED());
            ps.setDouble(4, modelo.getPRECMED());
            ps.setDate(5, UtilToSql.convertDate(modelo.getFVMED()));
            ps.setInt(6, modelo.getSTOCMED());
            ps.setString(7, modelo.getFORMED());
            ps.setString(8, modelo.getLOTMED());
            ps.setInt(9, 1 );
            ps.setString(10, "A");
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en registrar MedicamentoImpl:" + e.getMessage());
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void modificar(Medicamento modelo) throws Exception {
        
    }

    @Override
    public void eliminar(Medicamento modelo) throws Exception {
       
    }

    @Override
    public List<Medicamento> listar() throws Exception {
        List<Medicamento> listado = null;
        Medicamento medi;
        String sql = "SELECT * FROM MEDICAMENTO";
        try {
            listado = new ArrayList();
            Statement st = this.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                medi = new Medicamento();
                medi.setIDMED(rs.getInt("IDMED"));
                medi.setPRESMED(rs.getString("PRESMED"));
                medi.setGENMED(rs.getString("GENMED"));
                medi.setCOMMED(rs.getString("COMMED"));
                medi.setPRECMED(rs.getDouble("PRECMED"));
                medi.setFVMED(rs.getDate("FVMED"));
                medi.setSTOCMED(rs.getInt("STOCMED"));
                medi.setFORMED(rs.getString("FORMED"));
                medi.setLOTMED(rs.getString("LOTMED"));
                medi.setIDPROV(rs.getInt("IDPROV"));
                listado.add(medi);
                System.out.println("ENVIANDO MEDICAMENTOS");
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println("Error en listar MedicamentoImpl: " + e.getMessage());
        } finally {
            this.cerrar();
        }  
        return listado;          
    }

       
    
}
