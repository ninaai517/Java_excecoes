package bytebank_encapsulado;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException{
		ContaCorrente cc = new ContaCorrente(-123, 123);
		cc.deposita(100);

		System.out.println();

		ContaPoupanca cp = new ContaPoupanca(123, 1234);
		cp.deposita(200);

		cc.saca(300);

		System.out.println();
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

	}

}