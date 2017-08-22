package com.aeon.mysql.dao;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository  extends CrudRepository<Message, Long>{

	List<Csv> findByCreationdateBetween( Date from,  Date to);
    
	@Query("from message where id=?1")
	Message findOne(Long id);
}
