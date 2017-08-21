package com.aeon.controller;

import java.util.Date;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aeon.controller.service.MigrateStrategy;
import com.aeon.service.impl.CsvMigrationImpl;

@RestController
public class MigrationController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MigrationController.class);
    
	@Autowired
	private ConfigurableApplicationContext context;
	
	private MigrateStrategy service;
     
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeon.controller.MigrateStrategy#migrateDuration(java.lang.String,
	 * java.util.Date, java.util.Date)
	 */
	@RequestMapping(value = "migration", method = { RequestMethod.POST })
	public ResponseEntity<?> migrateDuration(@RequestParam("tableName") String tableName,
			@RequestParam("from") @DateTimeFormat(pattern = "yyyy-MM-dd") Date from,
			@RequestParam("to") @DateTimeFormat(pattern = "yyyy-MM-dd") Date to) {

		service = factory(tableName);
		service.migrateDuration(from, to);

		return ResponseEntity.accepted().build();
	}

	private MigrateStrategy factory(String tableName) {
		MigrateStrategy object = null;
		
		switch (tableName) {
		case "CSV":
			object = context.getBean(CsvMigrationImpl.class);
			break;
            //TODO create implementation for other table  
		default:
			break;
		}
		return object;
	}

}
