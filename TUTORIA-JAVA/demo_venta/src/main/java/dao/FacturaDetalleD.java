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
import modelo.Factura;
import modelo.FacturaDetalle;
import modelo.Producto;

/**
 *
 * @author Jesus
 */
public class FacturaDetalleD extends Conexion implements ICRUD<FacturaDetalle> {

    @Override
    public void registrar(FacturaDetalle modelo) throws Exception {
        this.conectar();
        try {
            String sql = "insert into FACTURA_DETALLE (CANTFACDET,IDFACT,IDPROD)\n"
                    + "VALUES (?,?,?)";
            PreparedStatement ps = this.getCn().prepareStatement(sql);

            ps.setInt(1, modelo.getCANTFACDET());
            ps.setInt(2, modelo.getIDFACT());
            ps.setInt(3, modelo.getIDPROD());

            ps.executeUpdate();
            ps.close();

        } catch (Exception e) {
            System.out.println("Error REGISTRAR facturaDetalleD" + e.getMessage());
            e.printStackTrace();
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(FacturaDetalle modelo) throws Exception {
        this.conectar();
        String sql = "UPDATE FACTURA_DETALLE SET CANTFACDET=?, "
                + "IDFACT=?, IDPROD=? ";

        try {
            PreparedStatement ps = this.getCn().prepareStatement(sql);

            ps.setInt(1, modelo.getCANTFACDET());
            ps.setInt(2, modelo.getIDFACT());
            ps.setInt(3, modelo.getIDPROD());

            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {

            System.out.println("Error en modificar facturaDetalleD DAO: " + e.getMessage());
        } finally {
            this.Cerrar();
        }
    }
//    IDFACDET int  NOT NULL IDENTITY,
//    CANTFACDET int  NOT NULL,
//    IDFACT int  NOT NULL,
//    IDPROD int  NOT NULL,

    @Override
    public void eliminar(FacturaDetalle modelo) throws Exception {
        this.conectar();
        String sql = "DELETE FROM FACTURA_DETALLE WHERE IDFACDET=?";
        try {
            PreparedStatement ps = this.getCn().prepareStatement(sql);

            ps.setInt(1, modelo.getIDFACDET());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error en elminar facturaDetalleD DAO: " + e.getMessage());
            e.printStackTrace();
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<FacturaDetalle> listar() throws Exception {
        List<FacturaDetalle> lista = null;

        this.conectar();
        try {
            System.out.println("haciendo consulta");

            String sql = "select \n"
                    + "factura.FECFAC,\n"
                    + "\n"
                    + "FACTURA_DETALLE.IDFACDET,\n"
                    + "FACTURA_DETALLE.CANTFACDET,\n"
                    + "FACTURA_DETALLE.IDFACT,\n"
                    + "FACTURA_DETALLE.IDPROD,\n"
                    + "\n"
                    + "PRODUCTO.NOMPROD,\n"
                    + "PRODUCTO.VALCOMP,\n"
                    + "PRODUCTO.VALVENT\n"
                    + "\n"
                    + "from FACTURA_DETALLE\n"
                    + "inner join FACTURA\n"
                    + "on factura.IDFACT = FACTURA_DETALLE.IDFACT\n"
                    + "inner join PRODUCTO\n"
                    + "on PRODUCTO.IDPROD = FACTURA_DETALLE.IDPROD ";

            Statement st = this.getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            lista = new ArrayList();
            while (rs.next()) {
                FacturaDetalle facturaDetalle = new FacturaDetalle();
                Producto producto = new Producto();
                Factura factura = new Factura();

                facturaDetalle.setIDFACDET(rs.getInt("IDFACDET"));
                facturaDetalle.setCANTFACDET(rs.getInt("CANTFACDET"));
                facturaDetalle.setIDFACT(rs.getInt("IDFACT"));
                facturaDetalle.setIDPROD(rs.getInt("IDPROD"));

                producto.setNOMPROD(rs.getString("NOMPROD"));
                producto.setVALCOMP(rs.getInt("VALCOMP"));
                producto.setVALVENT(rs.getInt("VALVENT"));

                
                factura.setFECFAC(rs.getDate("FECFAC"));

                // es donde llamamos a las clases de los modelos que necesitamos
                facturaDetalle.setProducto(producto);
                facturaDetalle.setFactura(factura);

                lista.add(facturaDetalle);
                System.out.println("Enviando Factura detalle");
            }
            rs.close();
            st.close();

        } catch (SQLException e) {
            System.out.println("Error en FACTURAdetalle D LISTA" + e.getMessage());
        } finally {
            this.Cerrar();
        }
        return lista;
    }
}
