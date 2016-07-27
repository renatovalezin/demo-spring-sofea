package com.example.domain.contact;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PhoneNumber {
	
	@Id
	@GeneratedValue
	private Long id;
	
	String value;
}
