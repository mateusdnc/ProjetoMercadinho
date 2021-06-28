package conexao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    public Statement stm;
    public ResultSet rs;

    Properties config = new Properties();
    String host = null;
    String usuario = null;
    String senha = null;
    String bd = null;

    public String caminho = null;
    public Connection conn;

    public void CarregaDados() throws Exception {
        try {
            FileInputStream fis = new FileInputStream("config.properties");

            Properties config = new Properties();
            config.load(fis);
            System.out.println(config.getProperty("Host"));
            host = config.getProperty("Host");
            usuario = config.getProperty("Usuario");
            senha = config.getProperty("Senha");
            bd = config.getProperty("Banco_de_Dados");
            caminho = "jdbc:mysql://" + host + ":3306/" + bd;
        } catch (IOException ioe) {
            throw new Exception(ioe);
        }
    }

    public void Conexao() {
        try {
            CarregaDados();
            conn = DriverManager.getConnection(caminho, usuario, senha);
            System.out.println("Conectado com sucesso!");

        } catch (SQLException ex) {

            System.out.println("Ocorreu um erro ao conectar!\n" + ex);
        } catch (Exception ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Desconecta() {
        try {
            conn.close();
            System.out.println("Deconectado");
        } catch (SQLException i) {
            System.out.println("Ocorreu um erro ao desconectar\n" + i);
        }
    }

    public void executaSQL(String sql) {

        try {

            Conexao();
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
        } catch (SQLException re) {
            System.out.println("Ocorreu um erro\n" + re);
        }
    }

    public void excluiid(String sql) {

        try {

            Conexao();
            stm = conn.createStatement();
            stm.executeUpdate(sql);
        } catch (SQLException re) {
            System.out.println("Ocorreu um erro\n" + re);
        }
    }

    public void atualizar(String sql) {

        try {

            Conexao();
            stm = conn.createStatement();
            stm.executeUpdate(sql);
        } catch (SQLException re) {
            System.out.println("Ocorreu um erro\n" + re);
        }
    }

}
