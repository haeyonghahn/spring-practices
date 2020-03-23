package com.douzone.container.soundsystem;

import javax.inject.Named;

import org.springframework.stereotype.Component;

//@Component("HSRpapper3Final")
//@Component("highSchoolRapper3Final")
@Named("highSchoolRapper3Final")
public class HighSchoolRapper3Final implements CompactDisc {

	private String title = "지구멸망";
	private String artist = "양승호";
	
	
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + title + " by " + artist);
	}

}
