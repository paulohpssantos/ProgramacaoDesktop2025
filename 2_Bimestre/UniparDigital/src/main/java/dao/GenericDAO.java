/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexaoBD.ConexaoPostgres;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author paulodossantos
 */
public abstract class GenericDAO<Objeto> {
    
    public Connection conn = null;
    
    public GenericDAO(){
        conn = ConexaoPostgres.getConnection();
    }
    
    protected abstract Objeto construirObjeto(ResultSet rs);
    
    public abstract boolean salvar(Objeto obj);
    
    public abstract boolean atualizar(Objeto obj);
    
    public ArrayList<Objeto> retornarLista(String sql){
        
    }
}
