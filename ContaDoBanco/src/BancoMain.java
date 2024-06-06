
public class BancoMain {
	
	public static void main(String[] args) {
//		Criando o NEW Banco para imprimir a lista de clientes;
		Banco listCliente = new Banco();
//		Criando dois clientes (clienteP1) e (clienteP2);
		Cliente clienteP1 = new Cliente();
		Cliente clienteP2 = new Cliente();
		clienteP1.setTitular("Pedro");
		clienteP2.setTitular("josé");
		
//		Inserindo os dois clientes nas distintas constas bancária;
		Conta ContaP = new ContaPoupança(clienteP1);
		Conta ContaC = new ContaCorrente(clienteP2);
		
		ContaP.depositar(200.5);
		ContaP.transferir(132.34, ContaC);
		
//		Adição de clientes a lista de clientes;
		listCliente.adiciornarCliente("Pedro", 20);
		listCliente.adiciornarCliente("Isaque", 15);
		listCliente.adiciornarCliente("Lucas", 17);
		listCliente.adiciornarCliente("José", 34);
		
		listCliente.exibirClientes();
		
		
//		Impriminto os extratos das contas bancárias;
		ContaP.imprimirExtrato();
		ContaC.imprimirExtrato();
	}
		
		
}
