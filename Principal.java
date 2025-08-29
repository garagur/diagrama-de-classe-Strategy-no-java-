package depois;

public class Principal {
	
	public static void main (String [] args) {
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		Orcamento orcamento = new Orcamento(1000);
		ISS iss = new ISS();
		IPVA ipva = new IPVA();
		
		calculadorDeImposto.realizaCalculo(orcamento, iss);
		calculadorDeImposto.realizaCalculo(orcamento, ipva);
	}
}
