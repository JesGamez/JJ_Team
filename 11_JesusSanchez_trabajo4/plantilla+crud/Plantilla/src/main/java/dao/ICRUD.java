/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author Jesus
 */
public interface ICRUD<Generico> {

    void registrar(Generico modelo) throws Exception;

    void modificar(Generico modelo) throws Exception;

    void eliminar(Generico modelo) throws Exception;

    List<Generico> listar() throws Exception;
}
