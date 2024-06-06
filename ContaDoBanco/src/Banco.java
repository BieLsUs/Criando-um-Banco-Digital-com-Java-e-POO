import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	List<ListCliente> clientList;
	
	public Banco() {
		this.clientList = new ArrayList<>();
	}
	
	public void adiciornarCliente(String nome, int idade) {
		if(idade >= 18 ) {
			ListCliente clientes = new ListCliente(nome, idade);
			this.clientList.add(clientes);	
		}else {
			System.out.println(nome + " é necessário ter no mínimo 18 anos para ser cliente em nosso Banco!" + "\n");
		}
	}
	
	public void exibirClientes() {
		if(!clientList.isEmpty()) {
			System.out.println(this.clientList + "\n");
		}else {
			System.out.println("A lista está vazia");
		}
	}

}