package com.example.domain.calendar;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Event {

	@Id
	@GeneratedValue
	private Long id;
	
	private String title;
	
	private String type;
		
	private Date start;
	private Date end;
		
}
