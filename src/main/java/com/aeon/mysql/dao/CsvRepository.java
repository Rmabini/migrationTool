package com.aeon.mysql.dao;


import java.util.Date;
import org.springframework.data.repository.CrudRepository;

public interface CsvRepository  extends CrudRepository<Csv, Long>{

	Iterable<Csv> findByDateUploadedBetween( Date from,  Date to);

}
