import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testes {

	@Test
	void testeBuilder() {
		Produto banana = new Produto("Banana", 1.00);
		Produto batata = new Produto("Batata", 5.00);
		Venda venda = new VendaBuilder()
				.data("10/03/2020")
				.clientePF("José", "000")
				.item(3, banana)
				.item(5, batata)
				.build();
		
		assertEquals("Pessoa Física: Nome: José, CPF: 000" +
					"\nFuncionário: null" +
					"\nFrete: 0.0" +
					"\nData da compra: 10/03/2020" +
					"\nTipos de produtos diferentes: 2", venda.toString());
	}

	@Test
	void testeBuilder2() {
		Produto iphone = new Produto("Iphone", 5.000);
		Produto mackBook = new Produto("MackBook", 7.000);
		Venda venda = new VendaBuilder()
				.data("10/03/2020")
				.funcionario("João")
				.frete(100.00)
				.clientePJ("Apple", "000")
				.item(1, iphone)
				.item(5, mackBook)
				.build();
		
		assertEquals("Pessoa Jurídica: Razão Social: Apple, CNPJ: 000" +
					"\nFuncionário: João" +
					"\nFrete: 100.0" +
					"\nData da compra: 10/03/2020" +
					"\nTipos de produtos diferentes: 2", venda.toString());
	}

	
}