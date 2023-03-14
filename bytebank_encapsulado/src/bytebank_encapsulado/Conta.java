package bytebank_encapsulado;

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	Cliente titular;
	private static int total;

	// Construtor: regra de negócio do código.
	public Conta(int agencia, int numero) {
		
		if(agencia < 1) {
			throw new IllegalArgumentException("Número da agencia invalido");
		}
		if(numero< 1) {
			throw new IllegalArgumentException("Número da agencia invalido");
		}
		total++;
		System.out.println("Conta(s) total no Bytebank: " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Bem vindo conta Número: " + numero);

	}

//Métodos:
	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + " Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta contaDestino) throws SaldoInsuficienteException {
		if (this.saldo >= valor) {
			saca(valor);
			contaDestino.deposita(valor);

		}

	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Conta.total;

	}

	public boolean saca() {

		return false;
	}
}
