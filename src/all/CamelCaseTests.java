package all;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class CamelCaseTests {
	static SplitterInterface splitter = new Splitter();

	@Test
	void noChange() {
		String nome = "nome";
		String split_nome = splitter.split(nome).get(0);
		assertEquals("nome", split_nome);
	}
	
	@Test
	void allLowerCase() {
		String Nome = "Nome";
		String split_Nome = splitter.split(Nome).get(0);
		assertEquals("nome", split_Nome);
	}
	
	@Test
	void compositeText() {
		String nomeComposto = "nomeComposto";
		List<String> split_list = splitter.split(nomeComposto);
		String nome = split_list.get(0);
		String composto = split_list.get(1);
		assertEquals("nome", nome);
		assertEquals("composto", composto);
	}
	
	@Test
	void compositePlusUpperCaseInitial() {
		String NomeComposto = "NomeComposto";
		List<String> split_list = splitter.split(NomeComposto);
		String nome = split_list.get(0);
		String composto = split_list.get(1);
		assertEquals("nome", nome);
		assertEquals("composto", composto);
	}
	
	@Test
	void allUpperCase() {
		String CPF = "CPF";
		String split_CPF = splitter.split(CPF).get(0);
		assertEquals("CPF", split_CPF);
	}

}
