/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Vendedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Jesus
 */
public class VendedorImpl extends Conexion implements CRUD<Vendedor>{

    @Override
    public void registrar(Vendedor modelo) throws Exception {
        String sql = "INSERT INTO VENDEDOR (NOMVEN, APEVEN, DNIVEN, TELFVEN, DIRVEN, IDUBI, ESTVEN) "
                + "VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getNOMVEN());
            ps.setString(2, modelo.getAPEVEN());
            ps.setString(3, modelo.getDNIVEN());
            ps.setString(4, modelo.getTELFVEN());
            ps.setString(5, modelo.getDIRVEN());
            ps.setString(6, "150501");
            ps.setString(7, "A");
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en registrar VendedorImpl:" + e.getMessage());
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void modificar(Vendedor modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Vendedor modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vendedor> listar() throws Exception {
        List<Vendedor> listado = null;
        Vendedor vend;
        String sql = "SELECT * FROM VENDEDOR";
        try {
            listado = new ArrayList();
            Statement st = this.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                vend = new Vendedor();
                vend.setIDVEN(rs.getInt("IDVEN"));
                vend.setNOMVEN(rs.getString("NOMVEN"));
                vend.setAPEVEN(rs.getString("APEVEN"));
                vend.setDNIVEN(rs.getString("DNIVEN"));
                vend.setTELFVEN(rs.getString("TELFVEN"));
                vend.setDIRVEN(rs.getString("DIRVEN"));
                vend.setIDUBI(rs.getString("IDUBI"));
                listado.add(vend);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println("Error en listaTodos VendedorImpl" + e.getMessage());
        } finally {
            this.cerrar();
        }
        return listado;
    }
    
}
