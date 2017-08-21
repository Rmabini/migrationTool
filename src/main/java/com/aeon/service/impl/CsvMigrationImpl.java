package com.aeon.service.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aeon.controller.MigrationController;
import com.aeon.controller.service.MigrateStrategy;
import com.aeon.mysql.dao.Csv;
import com.aeon.mysql.dao.CsvRepository;

@Component
public class CsvMigrationImpl implements MigrateStrategy {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MigrationController.class);
	
	@Autowired
	public CsvRepository repository;

	public CsvMigrationImpl() {
		super();
	}
	
	

	@Override
	public void  migrateDuration( Date from, Date to) {
		LOGGER.info("from {}" ,from);
        LOGGER.info("to {}",to);
        LOGGER.info("table {}","csv");
        
		Iterable<Csv> csvs = repository.findByDateUploadedBetween(from,to);
		 LOGGER.info("csv {}",csvs);
		csvs.forEach(System.out::println);
	
	}
}