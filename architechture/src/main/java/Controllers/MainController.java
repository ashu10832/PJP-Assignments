package Controllers;

import Exceptions.NameTooShortException;
import Services.MyService;

public class MainController {
	
	MyService myService;
	
	
	
	public MainController(MyService myService) {
		this.myService = myService;
	}
	
	public MainController() {
	}
	
	
	
	public void add(String fname,String lname) throws NameTooShortException {
		
		try {
			myService.add(fname,lname);
		} catch (NameTooShortException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		
		
	}

}
