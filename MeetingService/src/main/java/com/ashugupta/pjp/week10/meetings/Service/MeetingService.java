package com.ashugupta.pjp.week10.meetings.Service;

import java.util.List;

import com.ashugupta.pjp.week10.meetings.Models.Meeting;
import com.ashugupta.pjp.week10.meetings.Models.Participant;

public interface MeetingService {
	
	List<Meeting> fetchAllMeetings();
	
	Meeting fetchMeetingById(int meetingId);
	
	List<Participant> fetchParticipantOfMeeting(int meetingId);

}
