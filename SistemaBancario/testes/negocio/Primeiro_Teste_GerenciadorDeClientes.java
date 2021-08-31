package negocio;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Primeiro_Teste_GerenciadorDeClientes {

	@Test
	public void testGerenciadorDeClientes() {
		
		
	 {//Criando meus clientes
		Cliente cliente01 = new Cliente (1, "Clodoaldo" ,  99 , "clodolado@gmail.com" , 1 , true);
		Cliente cliente02 = new Cliente (2, "Jacinto"    ,69 , "jacinto@gmail.com" , 1 , true);
		Cliente cliente03 = new Cliente(3, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		
		
		// Criando uma lista como todos os clientes
		List<Cliente> clientesDoBanco = new ArrayList<>();
		
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		clientesDoBanco.add(cliente03);
		
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		assertThat(cliente.getId(), is(1));
		assertThat(cliente.getNome(), is ("Clodoaldo"));
		assertThat(cliente.getIdade(), is (99));
		
		
		
		
	}

}
	@Test
	public void testRemoveCliente() {

		//Criando meus clientes
		Cliente cliente01 = new Cliente (1, "Clodoaldo" ,  99 , "Clodoado@gmail.com" , 1 , true);
		Cliente cliente02 = new Cliente (2, "Jacinto"    ,69 , "Jacinto@gmail.com" , 1 , true);
		Cliente cliente03 = new Cliente(3, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		
		//Criando novamente uma lista de clientes
		List<Cliente> clientesDoBanco = new ArrayList();
		
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		clientesDoBanco.add(cliente03);
		
		//Iniciando
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		// Usando o comando para remover o cliente 1 (Clodoaldo)
		boolean clienteRemovido = gerClientes.removeCliente(1);
		
		assertThat(clienteRemovido, is (true));
		
	
	}

}
