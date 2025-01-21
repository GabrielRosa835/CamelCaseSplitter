package all;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class CamelCaseTests {
	static SplitterInterface splitter = new Splitter();

	@Test
	void noChange() {
		String name = "name";
		String split_nome = splitter.split(name).get(0);
		assertEquals("nome", split_name);
	}
	
	@Test
	void allLowerCase() {
		String Name = "Name";
		String split_Nome = splitter.split(Name).get(0);
		assertEquals("nome", split_Name);
	}
	
	@Test
	void compositeText() {
		String compositeName = "compositeName";
		List<String> split_list = splitter.split(compositeName);
		String composite = split_list.get(0);
		String name = split_list.get(1);
		assertEquals("composite", composite);
		assertEquals("name", name);
	}
	
	@Test
	void compositePlusUpperCaseInitial() {
		String CompositeName = "CompositeName";
		List<String> split_list = splitter.split(CompositeName);
		String composite = split_list.get(0);
		String name = split_list.get(1);
		assertEquals("composite", composite);
		assertEquals("name", name);
	}
	
	@Test
	void allUpperCase() {
		String ID = "ID";
		String split_ID = splitter.split(ID).get(0);
		assertEquals("CPF", split_ID);
	}

}
