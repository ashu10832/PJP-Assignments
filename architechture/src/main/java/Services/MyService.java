package Services;

import Contracts.IMyService;
import DAO.DAO;
import Exceptions.NameTooShortException;
import Models.Record;

public class MyService implements IMyService {
	
	private DAO dao;

	
	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}

	
	public MyService() {
	}
	
	@Override
	public void add(String fname,String lname) throws NameTooShortException{
		createRecord(fname, lname);
		
	}
	
	private void createRecord(String fname,String lname) throws NameTooShortException {
		if(validate(fname) && validate(lname)) {
			dao.insert(new Record(fname,lname));
		} else {
			throw new NameTooShortException("Name too short");
		}
		
	}
	
	private boolean validate(String name) {
		return name.length()>=4;
	}
	
}
