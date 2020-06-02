package DAO;

import Contracts.IDAO;
import Models.Record;

public class DAO implements IDAO {

	public void insert(Record record) {
		System.out.println("New Record Added");
	}
	
	

}
