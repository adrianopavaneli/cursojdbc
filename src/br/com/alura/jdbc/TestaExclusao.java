package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestaExclusao {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o codigo do produto a excluir: ");
		int n = sc.nextInt();
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		PreparedStatement stm = connection.prepareStatement("delete from produto where id = ?");
		stm.setInt(1, n);
		stm.execute();
		Integer linhasModificadas = stm.getUpdateCount();
		
		
		
			System.out.println("Foram modificadas " + linhasModificadas + " linhas");
			
		
		
		
		
		
		
		connection.close();
		sc.close();
	}

}
