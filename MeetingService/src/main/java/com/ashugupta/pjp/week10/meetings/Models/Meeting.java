package com.ashugupta.pjp.week10.meetings.Models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class Meeting {
	
	private int meetingId;
	private String topic;
	private String startTime;
	private String endTime;
	
	public Meeting() {
		
	}
	
	public Meeting(int meetingId, String topic, String startTime, String endTime) {
		super();
		this.meetingId = meetingId;
		this.topic = topic;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	
	public int getMeetingId() {
		return meetingId;
	}
	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Meeting [meetingId=" + meetingId + ", topic=" + topic + ", startTime=" + startTime + ", endTime="
				+ endTime + "]";
	}

	

}
