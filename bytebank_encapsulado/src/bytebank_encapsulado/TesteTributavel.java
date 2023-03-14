package bytebank_encapsulado;

public class TesteTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 1234);
		cc.deposita(100);

		SeguroVida sv = new SeguroVida();

		CalculadorImposto ci = new CalculadorImposto();
		ci.registra(cc);
		ci.registra(sv);

		System.out.println(ci.getTotalImposto());

	}

}
