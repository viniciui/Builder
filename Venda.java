import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private Cliente cliente = new Cliente();
	private Funcionario funcionario = new Funcionario();
	private Frete frete = new Frete();
	private String data;
	private List<ItemVenda> itensVendidos = new ArrayList<ItemVenda>();
	
	
	public Venda(String data) {
		this.data = data;
	}
	
	public Venda() {
		
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public Frete getFrete() {
		return frete;
	}
	
	public void setFrete(Frete frete) {
		this.frete = frete;
	}
	
	public List<ItemVenda> getItensVendidos() {
		return itensVendidos;
	}
	
	public void setItensVendidos(List<ItemVenda> itensVendidos) {
		this.itensVendidos = itensVendidos;
	}
	
	public void addItem(ItemVenda itemVenda) {
		itensVendidos.add(itemVenda);
		
	}