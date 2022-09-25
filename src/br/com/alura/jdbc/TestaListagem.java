package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.alura.jdbc.dao.ConnectionFactory;

public class TestaListagem {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection connection = criaConexao.recuperarConexao();
		
		System.out.println("Fechando conexao!");
		
		
		PreparedStatement stm = connection.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		stm.execute();
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			Integer id = rst.getInt("id");
			System.out.println(id);
			String nome = rst.getString("nome");
			System.out.println(nome);
			String descricao = rst.getString("descricao");
			System.out.println(descricao);
			
		}
		
		
		
	connection.close();
		
		
	}
	
}
