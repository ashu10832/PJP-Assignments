package com.ashugupta.pjp.week10.participants.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashugupta.pjp.week10.participants.Models.Participant;
import com.ashugupta.pjp.week10.participants.Service.ParticipantService;

@RestController
@RequestMapping("/participants")
public class ParticipantController {
	
	
	@Autowired
	ParticipantService participantService;
	
	@GetMapping
	public List<Participant> getAllParticipants() {
		return participantService.fetchAllParticipants();
	}
	
	@GetMapping("/{pId}")
	public Participant getParticipantById(@PathVariable("pId") int pid) {
		return participantService.fetchParticipantById(pid);
	}
	
	
	

}
