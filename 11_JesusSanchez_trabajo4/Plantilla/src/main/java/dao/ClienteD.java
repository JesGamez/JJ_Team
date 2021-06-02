/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

/**
 *
 * @author Jesus
 */
public class ClienteD extends Conexion {

    public void registrar(Cliente modelo) throws Exception {
        this.conectar();
        /*
    private int IDCLI;
    private String NOMAPECLI, DIRCLI, SEXCLI, TELCLI;
    private int EDACLI;
         */
        try {
            String sql = "insert into CLIENTE (IDCLI,NOMAPECLI,DIRCLI,TELCLI,SEXCLI,EDACLI,ESTCLI)\n"
                    + "VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = this.getCn().prepareStatement(sql);

            ps.setInt(1, modelo.getIDCLI());
            ps.setString(2, modelo.getNOMAPECLI());
            ps.setString(3, modelo.getDIRCLI());
            ps.setString(4, modelo.getTELCLI());
            ps.setString(5, modelo.getSEXCLI());
            ps.setInt(6, modelo.getEDACLI());
            ps.setString(7, "A");

            ps.executeUpdate();
            ps.close();

        } catch (Exception e) {
            System.out.println("Error REGISTRAR clienteD" + e.getMessage());
            e.printStackTrace();
        } finally {
            this.Cerrar();
        }
    }

    public void modificar(Cliente modelo) throws Exception {
        this.conectar();
        String sql = "update cliente set NOMAPECLI=?, DIRCLI=?, TELCLI=?, SEXCLI=?, EDACLI=? WHERE idcli = ?";
        try {
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            
            ps.setString(1, modelo.getNOMAPECLI());
            ps.setString(2, modelo.getDIRCLI());
            ps.setString(3, modelo.getTELCLI());
            ps.setString(4, modelo.getSEXCLI());
            ps.setInt(5, modelo.getEDACLI());
            ps.setInt(6, modelo.getIDCLI());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en MODIFICAR clienteD" + e.getMessage());
        } finally {
            this.Cerrar();
        }

    }

    public void eliminar(Cliente modelo) throws Exception {
        this.conectar();
        String sql = "update cliente set ESTCLI ='I' WHERE IDCLI =? ";
        try {
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setInt(1, modelo.getIDCLI());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error en eliminar ClienteD" + e.getMessage());
            e.printStackTrace();
        } finally {
            this.Cerrar();
        }
    }

    public List<Cliente> listar() throws Exception {
        List<Cliente> lista = null;
        Cliente cliente;
        this.conectar();
        try {
            System.out.println("haciendo consulta");
            String sql = "SELECT * FROM CLIENTE where ESTCLI='A'";
            Statement st = this.getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            lista = new ArrayList();
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setIDCLI(rs.getInt("IDCLI"));
                cliente.setNOMAPECLI(rs.getString("NOMAPECLI"));
                cliente.setDIRCLI(rs.getString("DIRCLI"));
                cliente.setTELCLI(rs.getString("TELCLI"));
                cliente.setSEXCLI(rs.getString("SEXCLI"));
                cliente.setEDACLI(rs.getInt("EDACLI"));
                lista.add(cliente);
                System.out.println("Enviando cliente");
            }
            rs.close();
            st.close();

        } catch (SQLException e) {
            System.out.println("Error en ClienteD LISTA" + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }
}
