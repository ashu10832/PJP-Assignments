package com.ashugupta.pjp.week10.meetings.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ashugupta.pjp.week10.meetings.Models.Meeting;
import com.ashugupta.pjp.week10.meetings.Models.Participant;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;

@Service
public class MeetingServiceImpl implements MeetingService{
	
	static List<Meeting> list = new ArrayList();
	static {
		Meeting meeting = new Meeting(1,"Java","1","2");
		Meeting meeting1 = new Meeting(2,"Python","1","2");
		Meeting meeting2 = new Meeting(3,"Node","1","2");
		Meeting meeting3 = new Meeting(4,"C++","1","2");

		list.add(meeting);
		list.add(meeting1);
		list.add(meeting2);
		list.add(meeting3);

	}
	
	@Autowired
	RestTemplate restTemplate;
	
    @Autowired
    private EurekaClient eurekaClient;

	@Override
	public List<Meeting> fetchAllMeetings() {
		return list;
	}

	@Override
	public Meeting fetchMeetingById(int meetingId) {
		Meeting returnValue = null;
		for(Meeting meeting : list) {
			if(meeting.getMeetingId() == meetingId) {
				returnValue = meeting;
			}
		}
		return returnValue;
	}

	@Override
	public List<Participant> fetchParticipantOfMeeting(int meetingId) {
		
        Application application = eurekaClient.getApplication("participant-ws");
        InstanceInfo instanceInfo = application.getInstances().get(0);
        String resourceUrl = "http://" + instanceInfo.getIPAddr() + ":" + instanceInfo.getPort() + "/participants";

		ResponseEntity<List<Participant>> response = restTemplate
				.exchange(resourceUrl,
                HttpMethod.GET,
                null, 
                new ParameterizedTypeReference<List<Participant>>() {
        });
		System.out.println(response.getStatusCodeValue());
		List<Participant> participants = response.getBody();
		List<Participant> returnValue = new ArrayList<>();
		for(Participant p: participants) {
			if(p.getMeetingId() == meetingId) {
				returnValue.add(p);
			}
		}
		return returnValue;
	}

}
