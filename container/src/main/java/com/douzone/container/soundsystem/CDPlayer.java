package com.douzone.container.soundsystem;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

	// Wiring 01 : 바이너리 주입(CGLib)
	//@Inject (자바 표준 Wiring 어노테이션)
	@Autowired // (스프링 Wiring 어노테이션)
	@Qualifier("highSchoolRapper3Final") 
	private CompactDisc cd;
	
	public CDPlayer() {
		
	}
	
	// Wiring 02 : 생성자 주입
	// @Autowired
	public CDPlayer(@Qualifier("highSchoolRapper3Final") CompactDisc cd) {
		this.cd = cd;
	}
	
	// Wiring 03 : setter 사용
	// @Autowired
	public void setCompackDisc(@Qualifier("highSchoolRapper3Final") CompactDisc cd) {
		this.cd = cd;
	}

	// Wiring 04 : 일반 메소드 사용
	// @Autowired		
	public void insertCompactDisc(@Qualifier("highSchoolRapper3Final") CompactDisc cd) {
		
	}
	
	public void play() {
		cd.play();
	}

}
