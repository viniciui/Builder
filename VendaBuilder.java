public class VendaBuilder{
	private Venda venda;
	
	public VendaBuilder() {
		venda = new Venda();
	}
	
	public VendaBuilder data(String data) {
		venda.setData(data);
		return this;
	}

	public VendaBuilder clientePF(String nomeCliente, String cpf) {
		venda.setCliente(new ClientePF(nomeCliente, cpf));
		return this;
	}
	
	public VendaBuilder clientePJ(String razaoSocial, String cnpj) {
		venda.setCliente(new ClientePJ(razaoSocial, cnpj));
		return this;
	}
	
	public VendaBuilder frete(double valorFrete) {
		venda.setFrete(new Frete(valorFrete));
		return this;
	}
	
	public VendaBuilder funcionario(String nome) {
		venda.setFuncionario(new Funcionario(nome));
		return this;
	}
	
	public VendaBuilder item(int quantidade, Produto produto) {
		venda.addItem(new itemVenda(quantidade, produto));
		return this;
	}

	public Venda build() {
		return venda;
	}
	
}