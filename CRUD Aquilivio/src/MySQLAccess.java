import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class MySQLAccess {

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	final private String host = "localhost";
	final private String user = "root";
	final private String passwd = "";
	
	//Metodo que cadastrada um calcado no banco de dados
	public String cadastrarCalcado(String nomeCalcado, double tamanhoCalcado, String categoriaCalcado, String corCalcado, double precoCalcado, String marcaCalcado, String dataCadastroCalcado, double quantidadeEstoqueCalcado, String descricaoCalcado) throws Exception {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://" + host + "/crud_aquilivio",user,passwd);
			statement = connect.createStatement();
			statement.executeUpdate("insert into calcados values ('" + nomeCalcado + "', " + tamanhoCalcado + ", '" + categoriaCalcado + "', '" + corCalcado + "', " + precoCalcado + ", '" + marcaCalcado + "', '" + dataCadastroCalcado + "', " + quantidadeEstoqueCalcado + ", '" + descricaoCalcado + "');");
			
			return "Calcado Registrado Com Sucesso!";
		}
		catch (Exception e)
		{
			throw e;
		}
	}
	
	//Metodo que pega o nome do calcado no banco de dados
	public List<String> pegarNomeDosCalcados() throws Exception {
			
		List<String> nomeCalcados = new ArrayList<>();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://" + host + "/crud_aquilivio",user,passwd);
			statement = connect.createStatement();
			resultSet = statement.executeQuery("select nomeCalcado from calcados;");

			while (resultSet.next()) 
			{
				String nome = resultSet.getString("nomeCalcado");
				nomeCalcados.add(nome);
			}
		} 
		catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(null, "Erro na Conexao com o Banco de Dados");
		}
		return nomeCalcados;
	}
	
	//Metodo que pega as informacoes do calcado no banco de dados
	public ResultSet pegarInformacoesDoCalcado(String nomeDoCalcado) throws Exception {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://" + host + "/crud_aquilivio",user,passwd);
			statement = connect.createStatement();
			resultSet = statement.executeQuery("select * from calcados where nomeCalcado = '" + nomeDoCalcado + "';");
			return resultSet;
		}
		catch (Exception e)
		{
			throw e;
		}
	}
	
	//Metodo que altera as informcoes do calcado no banco de dados
	public String alterarDadoDoCalcado(String nomeDoCalcado, double tamanhoCalcado, String categoriaCalcado, String corCalcado, double precoCalcado, String marcaCalcado, double quantidadeEstoqueCalcado, String descricaoCalcado) throws Exception {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://" + host + "/crud_aquilivio",user,passwd);
			statement = connect.createStatement();
			statement.executeUpdate("update calcados set tamanhoCalcado = " + tamanhoCalcado + ", categoriaCalcado = '" + categoriaCalcado + "', corCalcado = '" + corCalcado + "', precoCalcado = " + precoCalcado + ", marcaCalcado = '" + marcaCalcado + "', quantidadeEstoqueCalcado = " + quantidadeEstoqueCalcado + ", descricaoCalcado = '" + descricaoCalcado + "' where nomeCalcado = '" + nomeDoCalcado + "';");
			
			return "Dados Alterados Com Sucesso!";
		}
		catch (Exception e)
		{
			throw e;
		}
	}
	
	//Metodo que exclui o calcado especificado pelo usuario no banco de dados
	public String deletarCalcado(String nomeDoCalcado) throws Exception {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://" + host + "/crud_aquilivio",user,passwd);
			statement = connect.createStatement();
			statement.executeUpdate("delete from calcados where nomeCalcado = '" + nomeDoCalcado + "'");
			
			return "Calcado Deletada Com Sucesso!";
		}
		catch (Exception e)
		{
			throw e;
		}
	}
	
	//Metodo que filtra todos os calcados do banco de dados 
	public ResultSet filtrarTodosCalcados() throws Exception {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://" + host + "/crud_aquilivio",user,passwd);
			statement = connect.createStatement();
			resultSet = statement.executeQuery("select * from calcados;");
			return resultSet;
		}
		catch (Exception e)
		{
			throw e;
		}
	}
	
	//Metodo que filtra os calcados no banco de dados de maneira mais especifica usando argumentos em String
	public ResultSet filtrarCalcadosComFiltroSelecionado(String filtroEscolhido, String filtroEscolhidoPeloUsuario) throws Exception {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://" + host + "/crud_aquilivio",user,passwd);
			statement = connect.createStatement();
			resultSet = statement.executeQuery("select * from calcados where " + filtroEscolhido + " = '" + filtroEscolhidoPeloUsuario + "' or " + filtroEscolhido + " LIKE '%" + filtroEscolhidoPeloUsuario + "%';");
			return resultSet;
		}
		catch (Exception e)
		{
			throw e;
		}
	}

	//Metodo que filtra os calcados no banco de dados de maneira mais especifica usando argumentos em numeral
	public ResultSet filtrarCalcadosComFiltroSelecionadoPorDadosNumericos(String filtroEscolhido, double filtroEscolhidoPeloUsuario) throws Exception {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://" + host + "/crud_aquilivio",user,passwd);
			statement = connect.createStatement();
			resultSet = statement.executeQuery("select * from calcados where " + filtroEscolhido + " <= " + filtroEscolhidoPeloUsuario + ";");
			return resultSet;
		}
		catch (Exception e)
		{
			throw e;
		}
	}
}