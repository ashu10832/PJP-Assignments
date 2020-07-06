package com.ashugupta.pjp.week10.participants.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ashugupta.pjp.week10.participants.Models.Participant;

@Service
public class ParticipantServiceImpl implements ParticipantService {
	static List<Participant> list;
	
	static {
		list = new ArrayList<>();
		Participant p = new Participant(1,"Ashu",1);
		Participant p1 = new Participant(2,"Vishu",1);
		Participant p2 = new Participant(3,"Kaku",2);
		Participant p3 = new Participant(4,"Mamu",3);
		Participant p4 = new Participant(5,"Sonu",4);
		list.add(p);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);


		
	}

	@Override
	public List<Participant> fetchAllParticipants() {
		return list;
	}

	@Override
	public Participant fetchParticipantById(int pid) {
		Participant returnValue = null;
		for(Participant p: list) {
			if(p.getpId() == pid) {
				returnValue = p;
				break;
			}
		}
		return returnValue;
	}

}
