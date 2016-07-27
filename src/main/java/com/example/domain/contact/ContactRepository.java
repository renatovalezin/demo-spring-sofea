package com.example.domain.contact;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {

	List<Contact> findByNameLikeIgnoreCase(@Param("name") String name);
	
	@Query("Select distinct c From Contact c Inner Join c.phones p where p.value Like :phoneNumber ")
	List<Contact> findByPhoneNumberLike(@Param("phoneNumber") String phoneNumber);
}
