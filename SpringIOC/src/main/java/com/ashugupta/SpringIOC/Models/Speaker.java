package com.ashugupta.SpringIOC.Models;

public class Speaker {
	
	private int vol_level;
	private String speaker_type;
	public int getVol_level() {
		return vol_level;
	}
	public void setVol_level(int vol_level) {
		this.vol_level = vol_level;
	}
	public String getSpeaker_type() {
		return speaker_type;
	}
	public void setSpeaker_type(String speaker_type) {
		this.speaker_type = speaker_type;
	}
	public Speaker(int vol_level, String speaker_type) {
		this.vol_level = vol_level;
		this.speaker_type = speaker_type;
	}
	@Override
	public String toString() {
		return "Speaker [vol_level=" + vol_level + ", speaker_type=" + speaker_type + "]\n";
	}

}
