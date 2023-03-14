package bytebank_encapsulado;

public class TesteSaca {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente(123,1234);
		
		cc.deposita(500);
		try {
		cc.saca(600);
		}catch(SaldoInsuficienteException ex){
			System.out.println("Exception: " + ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println(cc.getSaldo());
	}

}
