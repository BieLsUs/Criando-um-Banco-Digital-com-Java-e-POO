import java.util.concurrent.ThreadLocalRandom;

public abstract class Conta implements InterfaceConta {
	
	protected static final int AGENCIA_PADRAO = 425;
	
	
	protected int numero;
	protected int agencia;
	protected double saldo;
	protected Cliente cliente;
	protected Banco banco;
	
	
	public Conta(Banco banco) {
		this.banco = banco;
	}
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = valorAleatorio();
		this.cliente = cliente;
	}

	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		}else {
			System.out.println("Saldo insuficiente!");
			System.exit(0);
		}
	}
	
	public void depositar (double valor) {
		saldo += valor;
	}

	public void transferir(double valor, InterfaceConta destinatario) {
		if(saldo >= valor) {
			this.sacar(valor);
			destinatario.depositar(valor);
		}else {
			System.out.println("Saldo insuficiente!");
			System.exit(0);
		}
	}
	
	
	public int getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	

	public void imprimirInfoConta() {
		System.out.println("Titular: " + this.cliente.getTitular());
		System.out.println("Agência: " + this.agencia);
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: " + this.saldo + "\n");
	}
	
//	Cria um valor Random(aleatório) para o número;
	private static int valorAleatorio() {
	       return (int) ThreadLocalRandom.current().nextDouble(1,1000);
	    }
}
