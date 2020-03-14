
public class itemVenda {
	private Produto produto
	private int quantidade;

	public itemVenda(Produto produto, int quantidade) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	public itemVenda(){
	
	}

	public int getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
