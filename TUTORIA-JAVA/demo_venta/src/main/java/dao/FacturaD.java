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
import modelo.Factura;
import modelo.Vendedor;

/**
 *
 * @author Jesus
 */
public class FacturaD extends Conexion implements ICRUD<Factura> {

    @Override
    public void registrar(Factura modelo) throws Exception {
        this.conectar();
        try {
            String sql = "insert into FACTURA (FECFAC,IDCLI,IDVEND)\n"
                    + "VALUES (?,?,?)";
            PreparedStatement ps = this.getCn().prepareStatement(sql);

            ps.setDate(1, new java.sql.Date(modelo.getFECFAC().getTime()));
            ps.setInt(2, modelo.getIDCLI());
            ps.setInt(3, modelo.getIDVEND());

            ps.executeUpdate();
            ps.close();

        } catch (Exception e) {
            System.out.println("Error REGISTRAR facturaD" + e.getMessage());
            e.printStackTrace();
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Factura modelo) throws Exception {
        this.conectar();
        String sql = "UPDATE FACTURA SET FECFAC=?, "
                + "IDCLI=?, IDVEND=? ";

        try {
            PreparedStatement ps = this.getCn().prepareStatement(sql);

            ps.setDate(1, new java.sql.Date(modelo.getFECFAC().getTime()));
            ps.setInt(2, modelo.getIDCLI());
            ps.setInt(3, modelo.getIDVEND());

            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {

            System.out.println("Error en modificar Factura DAO: " + e.getMessage());
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(Factura modelo) throws Exception {
        this.conectar();
        String sql = "DELETE FROM FACTURA WHERE IDFACT=?";
        try {
            PreparedStatement ps = this.getCn().prepareStatement(sql);

            ps.setInt(1, modelo.getIDFACT());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error en elminar Factura DAO: " + e.getMessage());
            e.printStackTrace();
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<Factura> listar() throws Exception {
        List<Factura> lista = null;

        this.conectar();
        try {
            System.out.println("haciendo consulta");

            String sql = "select \n"
                    + "factura.IDFACT,\n"
                    + "factura.FECFAC,\n"
                    + "factura.IDCLI,\n"
                    + "factura.IDVEND,\n"
                    + "\n"
                    + "vendedor.nomapevend,\n"
                    + "vendedor.puevend,\n"
                    + "\n"
                    + "cliente.nomapecli,\n"
                    + "cliente.TELCLI\n"
                    + "\n"
                    + "from factura\n"
                    + "inner join cliente\n"
                    + "on factura.IDCLI = cliente.IDCLI\n"
                    + "inner join vendedor\n"
                    + "on vendedor.IDVEND = factura.IDVEND;";

            Statement st = this.getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            lista = new ArrayList();
            while (rs.next()) {
                Factura factura = new Factura();
                Vendedor vendedor = new Vendedor();
                Cliente cliente = new Cliente();

                vendedor.setNOMAPEVEND(rs.getString("NOMAPEVEND"));
                vendedor.setPUEVEND(rs.getString("PUEVEND"));

                cliente.setNOMAPECLI(rs.getString("NOMAPECLI"));
                cliente.setTELCLI(rs.getString("TELCLI"));

                factura.setIDFACT(rs.getInt("IDFACT"));
                factura.setFECFAC(rs.getDate("FECFAC"));
                factura.setIDCLI(rs.getInt("IDCLI"));
                factura.setIDVEND(rs.getInt("IDVEND"));

                // es donde llamamos a las clases de los modelos que necesitamos
                factura.setCliente(cliente);
                factura.setVendedor(vendedor);

                lista.add(factura);
                System.out.println("Enviando Factura");
            }
            rs.close();
            st.close();

        } catch (SQLException e) {
            System.out.println("Error en FACTURA D LISTA" + e.getMessage());
        } finally {
            this.Cerrar();
        }
        return lista;
    }
}
