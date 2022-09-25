package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.alura.jdbc.dao.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection connection = criaConexao.recuperarConexao();
		connection.close();

	}

}
