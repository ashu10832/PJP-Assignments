package com.ashugupta.pjp.week10.participants.Service;

import java.util.List;

import com.ashugupta.pjp.week10.participants.Models.Participant;

public interface ParticipantService {
	List<Participant> fetchAllParticipants();

	Participant fetchParticipantById(int pid);

}
