package all;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class CamelCaseTests {
	static SplitterInterface splitter = new Splitter();

	@Test
	void noChange() {
		String split_name = splitter.split("name").get(0);
		assertEquals("name", split_name);
	}
	
	@Test
	void allLowerCase() {
		String split_Name = splitter.split("Name").get(0);
		assertEquals("name", split_Name);
	}
	
	@Test
	void compositeText() {
		List<String> split_parts = splitter.split("nameSurname");
		String name = split_parts.get(0);
		String surname = split_parts.get(1);
		assertEquals("name", name);
		assertEquals("surname", surname);
	}
	
	@Test
	void compositePlusUpperCaseInitial() {
		List<String> split_parts = splitter.split("NameSurname");
		String name = split_parts.get(0);
		String surname = split_parts.get(1);
		assertEquals("name", name);
		assertEquals("surname", surname);
	}
	
	@Test
	void allUpperCase() {
		String split_ID = splitter.split("ID").get(0);
		assertEquals("ID", split_ID);
	}

}
