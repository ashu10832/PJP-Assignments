package com.ashugupta.pjp.week10.meetings.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashugupta.pjp.week10.meetings.Models.Meeting;
import com.ashugupta.pjp.week10.meetings.Models.Participant;
import com.ashugupta.pjp.week10.meetings.Service.MeetingService;

@RestController
@RequestMapping("/meetings")
public class MeetingsController {
	
	@Autowired
	MeetingService meetingService;
	
	@GetMapping
	public List<Meeting> getAllMeetings() {
		return meetingService.fetchAllMeetings();
	}
	
	@GetMapping("/{meetingId}")
	public Meeting getMeetingById(@PathVariable("meetingId") int meetingId) {
		return meetingService.fetchMeetingById(meetingId);
	}
	
	@GetMapping("/{meetingId}/participant")
	public List<Participant> getParticipantOfMeeting(@PathVariable("meetingId") int meetingId){
		return meetingService.fetchParticipantOfMeeting(meetingId);
	}

}
