
package listadeprodutos.jdbc;

import javax.swing.JOptionPane;

public class testeConexao {
    public static void main(String[] args) {
        
        try {
            new daoConexao().getConexao();
            JOptionPane.showMessageDialog(null, "Conexao Bem Sucedida!");
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel conectar ao banco de dados" + err);
        }
    }
}
    
