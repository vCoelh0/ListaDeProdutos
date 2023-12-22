
package listadeprodutos;

import java.sql.Connection;
import listadeprodutos.jdbc.daoConexao;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUDClass {

    public void adicionarProduto(String nome, int quantidade){
    String sql = "insert into tb_produtos (nome, quantidade) values (? ,?)";
    Connection conn = daoConexao.getConexao();
    
    try{
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, nome);
    ps.setInt(2, quantidade);
    
    ps.execute();
    }
   catch (SQLException e){
            e.printStackTrace();
        }  
    }
    
    public void removerProduto(String nome){
        String sql = "delete from tb_produtos where nome = (?)";
        Connection conn = daoConexao.getConexao();
        
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nome);
            ps.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
