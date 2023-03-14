package bytebank_encapsulado;

public class TesteGetESet {

	public static void main(String[] args) {
		//Conta conta = new Conta(Aqui é construtor);
		//quando vazio, é o construtor padrão do Java. 
		Conta conta = new ContaCorrente(123,1234);
		
		conta.setNumero(1234);
		conta.setNumero(12345);

		System.out.println(conta.getNumero());
		
		Cliente cliente = new Cliente();
		
		conta.setTitular(cliente);
		cliente.setNome("Carol");
		cliente.setCpf("123456789");
		cliente.setRg("12346");
		
		System.out.println(cliente.getNome());
		System.out.println(conta.getTitular().getNome());
		
		Conta conta1 = new ContaPoupanca(123,12345);
	}

}
