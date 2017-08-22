package com.aeon.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aeon.controller.MigrationController;
import com.aeon.controller.service.MigrateStrategy;
import com.aeon.dao.CsvRepositoryCassandra;
import com.aeon.mysql.dao.Csv;
import com.aeon.mysql.dao.CsvRepository;

import ch.qos.logback.core.net.SyslogOutputStream;

@Component
public class CsvMigrationImpl implements MigrateStrategy {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MigrationController.class);
	
	@Autowired
	private CsvRepository repository;
    
	@Autowired
	private CsvRepositoryCassandra cassandraRepository;
	
	
	public CsvMigrationImpl() {
		super();
	}
	
	

	@Override
	public void  migrateDuration( Date from, Date to) {
		LOGGER.info("from {}" ,from);
        LOGGER.info("to {}",to);
        LOGGER.info("table {}","csv");
        AtomicInteger counter = new AtomicInteger(0);
		List<Csv> csvs = repository.findByDateUploadedBetween(from,to);
		LOGGER.info("csv {}",csvs);
		LOGGER.info("result size {}",csvs.size());
		csvs.stream()
		.forEach((csv)->{
			
			cassandraRepository.save(new com.aeon.dao.Csv(
					UUID.randomUUID().toString(), // csvId
					csv.getBrandId(), //brandId
					csv.getContent(), //content
					counter.getAndIncrement(), //row count
					csv.getDateUploaded(), 
					false,
					csv.getFileName(),
					csv.getHeader(),
					"system",
					csv.getDateUploaded(),
					csv.getTitle(),
					csv.getUploadedBy()
					));
		});
		
		Iterable<com.aeon.dao.Csv> cassandraCsv = cassandraRepository.findAll();
		
		cassandraCsv.forEach(System.out::print);
		
		/*
	  public Csv(String csvId, Integer brandId, String content, Integer csvRowCount, Date dateUploaded, Boolean deleted,
			String fileName, String header, String modifiedBy, Date modifiedDate, String title, String uploadedBy) {
		super();
		this.csvId = csvId;
		this.brandId = brandId;
		this.content = content;
		this.csvRowCount = csvRowCount;
		this.dateUploaded = dateUploaded;
		this.deleted = deleted;
		this.fileName = fileName;
		this.header = header;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.title = title;
		this.uploadedBy = uploadedBy;
	}

	*/	
	}
}