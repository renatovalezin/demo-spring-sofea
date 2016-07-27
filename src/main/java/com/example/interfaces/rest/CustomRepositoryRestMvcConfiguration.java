package com.example.interfaces.rest;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import com.example.domain.calendar.Event;
import com.example.domain.contact.Contact;
import com.example.domain.contact.PhoneNumber;

@Configuration
public class CustomRepositoryRestMvcConfiguration extends RepositoryRestMvcConfiguration {	
	
	@Override
	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {		
		config.exposeIdsFor(Contact.class);
		config.exposeIdsFor(PhoneNumber.class);
		config.exposeIdsFor(Event.class);
		config.setBasePath("/repository");
	}
}
