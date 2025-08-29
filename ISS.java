package depois;
//CONCRETESTRATEGY
public class ISS implements Imposto {

	@Override //- SIGNIFICA SOBREESCREVENDO
	public double CalculaImposto(Orcamento orcamento) {

		return orcamento.getValor()*0.15;
	}

}
