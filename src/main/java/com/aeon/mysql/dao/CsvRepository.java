package com.aeon.mysql.dao;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CsvRepository  extends CrudRepository<Csv, Long>{

	List<Csv> findByDateUploadedBetween( Date from,  Date to);
    
	@Query("from csv where id=?1")
	Csv findOne(Integer id);
}
