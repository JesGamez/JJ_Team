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
import modelo.Vendedor;

/**
 *
 * @author Jesus
 */
public class VendedorD extends Conexion implements ICRUD<Vendedor>{

    @Override
    public void registrar(Vendedor modelo) throws Exception {
        this.conectar();

        try {
            String sql = "insert into VENDEDOR (NOMAPEVEND,SEXVEND,EDAVEND,PUEVEND)\n"
                    + "VALUES (?,?,?,?)";
            PreparedStatement ps = this.getCn().prepareStatement(sql);

            ps.setString(1, modelo.getNOMAPEVEND());
            ps.setString(2, modelo.getSEXVEND());
            ps.setString(3, modelo.getEDAVEND());
            ps.setString(4, modelo.getPUEVEND());

            ps.executeUpdate();
            ps.close();

        } catch (Exception e) {
            System.out.println("Error REGISTRAR clienteD" + e.getMessage());
            e.printStackTrace();
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Vendedor modelo) throws Exception {
                this.conectar();
        String sql = "update VENDEDOR set NOMAPEVEND=?, SEXVEND=?, EDAVEND=?, PUEVEND=? WHERE IDVEND = ?";
        try {
            PreparedStatement ps = this.getCn().prepareStatement(sql);

            ps.setString(1, modelo.getNOMAPEVEND());
            ps.setString(2, modelo.getSEXVEND());
            ps.setString(3, modelo.getEDAVEND());
            ps.setString(4, modelo.getPUEVEND());
            ps.setInt(5, modelo.getIDVEND());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en MODIFICAR vendedorD" + e.getMessage());
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(Vendedor modelo) throws Exception {
        this.conectar();
        String sql = "DELETE FROM VENDEDOR WHERE IDVEND = ? ";
        try {
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setInt(1, modelo.getIDVEND());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error en eliminar VendedorD" + e.getMessage());
            e.printStackTrace();
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<Vendedor> listar() throws Exception {
        List<Vendedor> lista = null;
        Vendedor vendedor;
        this.conectar();
        try {
            System.out.println("haciendo consulta");
            String sql = "SELECT * FROM Vendedor";
            Statement st = this.getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            lista = new ArrayList();
            while (rs.next()) {
                vendedor = new Vendedor();
                vendedor.setIDVEND(rs.getInt("IDVEND"));
                vendedor.setNOMAPEVEND(rs.getString("NOMAPEVEND"));
                vendedor.setSEXVEND(rs.getString("SEXVEND"));
                vendedor.setEDAVEND(rs.getString("EDAVEND"));
                vendedor.setPUEVEND(rs.getString("PUEVEND"));
                lista.add(vendedor);
                System.out.println("Enviando cliente");
            }
            rs.close();
            st.close();

        } catch (SQLException e) {
            System.out.println("Error en VendedorD LISTA" + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }
    
}
