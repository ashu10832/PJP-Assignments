package com.ashugupta.pjp.week10.meetings.Models;

public class Participant {
	private int pId;
	private String name;
	private int meetingId;
	
	public Participant() {
		// TODO Auto-generated constructor stub
	}
	
	public Participant(int pId, String name, int meetingId) {
		super();
		this.pId = pId;
		this.name = name;
		this.meetingId = meetingId;
	}

	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMeetingId() {
		return meetingId;
	}
	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}

	@Override
	public String toString() {
		return "Participant [pId=" + pId + ", name=" + name + ", meetingId=" + meetingId + "]";
	}
	

}
