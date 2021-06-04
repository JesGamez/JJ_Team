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
import modelo.Producto;

/**
 *
 * @author Jesus
 */
public class ProductoD extends Conexion implements ICRUD<Producto> {

    @Override
    public void registrar(Producto modelo) throws Exception {
        this.conectar();
        try {
            String sql = "insert into PRODUCTO (NOMPROD,VALCOMP,VALVENT)\n"
                    + "values (?,?,?)";
            PreparedStatement ps = this.getCn().prepareStatement(sql);

            ps.setString(1, modelo.getNOMPROD());
            ps.setInt(2, modelo.getVALCOMP());
            ps.setInt(3, modelo.getVALVENT());

            ps.executeUpdate();
            ps.close();

        } catch (Exception e) {
            System.out.println("Error REGISTRAR productoD" + e.getMessage());
            e.printStackTrace();
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Producto modelo) throws Exception {
        this.conectar();
        String sql = "update PRODUCTO set NOMPROD=?, VALCOMP=?, VALVENT=? WHERE IDPROD = ?";
        try {
            PreparedStatement ps = this.getCn().prepareStatement(sql);

            ps.setString(1, modelo.getNOMPROD());
            ps.setInt(2, modelo.getVALCOMP());
            ps.setInt(3, modelo.getVALVENT());
            ps.setInt(4, modelo.getIDPROD());

            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en MODIFICAR ProductoD" + e.getMessage());
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(Producto modelo) throws Exception {
        this.conectar();
        String sql = "delete from PRODUCTO WHERE IDPROD =? ";
        try {
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setInt(1, modelo.getIDPROD());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error en eliminar ProductoD" + e.getMessage());
            e.printStackTrace();
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<Producto> listar() throws Exception {
        List<Producto> lista = null;
        Producto producto;
        this.conectar();
        try {
            System.out.println("haciendo consulta");
            String sql = "SELECT * FROM PRODUCTO";
            Statement st = this.getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            lista = new ArrayList();
            while (rs.next()) {
                producto = new Producto();

                producto.setIDPROD(rs.getInt("IDPROD"));
                producto.setNOMPROD(rs.getString("NOMPROD"));
                producto.setVALCOMP(rs.getInt("VALCOMP"));
                producto.setVALVENT(rs.getInt("VALVENT"));

                lista.add(producto);
                System.out.println("Enviando producto");
            }
            rs.close();
            st.close();

        } catch (SQLException e) {
            System.out.println("Error en ProductoD LISTA" + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }
}
