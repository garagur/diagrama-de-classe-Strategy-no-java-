package depois;
//CONCRETESTRATEGY
public class IPVA implements Imposto {

	@Override //- SIGNIFICA SOBREESCREVENDO
	public double CalculaImposto(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor()*0.5;
	}

}
