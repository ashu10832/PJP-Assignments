package Services;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import DAO.DAO;
import Exceptions.NameTooShortException;
import Models.Record;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyServiceTest {
	
	MyService myService;
	@Mock
	DAO dao;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		myService = new MyService();
		myService.setDao(dao);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void addShouldCreateANewRecord() throws NameTooShortException {
		myService.add("abcd", "abcd");
		Mockito.verify(dao).insert(Mockito.any(Record.class));
	}
	
	@Test
	void addShouldThrowNameTooShortException() {
		Assertions.assertThrows(NameTooShortException.class, () -> myService.add("abc", "abc"));
	}

}
