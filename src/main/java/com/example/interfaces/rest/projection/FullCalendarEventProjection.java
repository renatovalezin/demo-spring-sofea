package com.example.interfaces.rest.projection;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.example.domain.calendar.Event;
import com.example.interfaces.json.serializer.DateToIsoJsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Projection(name = "fullCalendarEvent", types = { Event.class }) 
public interface FullCalendarEventProjection {

	
	String getTitle();

	@JsonSerialize(using=DateToIsoJsonSerializer.class)	
	Date getStart();
	
	@JsonSerialize(using=DateToIsoJsonSerializer.class)
	Date getEnd();
		
}
