package Controllers;

import org.mockito.Mockito;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import Exceptions.NameTooShortException;
import Services.MyService;


// Tests for Controllers

class MainControllerTest {
	
	
	@Mock
	MyService myService;
	MainController mainController;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		mainController = new MainController(myService);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void addShouldCallAddInService() throws NameTooShortException {
		Mockito.doNothing().when(myService).add(Mockito.anyString(), Mockito.anyString());
		mainController.add("abcd", "abcd");	
		Mockito.verify(myService).add(Mockito.anyString(), Mockito.anyString());
	}
	
	@Test
	void addShouldThrowANameTooShortException() throws NameTooShortException {
		Mockito.doThrow(NameTooShortException.class).when(myService).add(Mockito.anyString(), Mockito.anyString());
		Assertions.assertThrows(NameTooShortException.class, () -> mainController.add("abc", "abc"));

	}

}
