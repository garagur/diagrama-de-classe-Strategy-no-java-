package depois;
// context
public class CalculadorDeImposto {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double resultado = imposto.CalculaImposto(orcamento);
		System.out.println(resultado);
		} 
}
