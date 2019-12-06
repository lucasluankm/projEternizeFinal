/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.ConexaoSql;
import Dados.Clientes;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author 277550
 */
public class ClientesDAO {
    
    private ConexaoSql conn;
    
    public ClientesDAO() {
        try {
            this.conn = new ConexaoSql();
        } catch(ClassNotFoundException ex) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE,null,ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public boolean inserir(Clientes prod) {
        try {
            String sql="INSERT INTO clientes (cod_cli,nome_cli,preco)VALUES (?,?,?)";
            PreparedStatement ps=this.conn.getConexao().prepareStatement(sql);
            
            ps.setString(1,prod.get());
        }
    }
    
}
