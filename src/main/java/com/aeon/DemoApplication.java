package com.aeon;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.aeon.dao.Csv;

import com.aeon.dao.CsvRepositoryCassandra;
import com.aeon.mysql.dao.Message;
import com.aeon.mysql.dao.MessageRepository;





@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
	    
	    /*CsvRepositoryCassandra csvRepository = context.getBean(CsvRepositoryCassandra.class);
		Iterable<Csv> csvs = csvRepository.findAll();
		long time = retrnDate();
		Timestamp timestamp = new Timestamp(time);
		csvs.forEach(System.out::println);
		*/
		//csvRepository.save(new Csv(UUID.randomUUID().toString(),"thrid Content",timestamp));
		/*Iterable<Csv> csvs2 = csvRepository.findAll();
		csvs2.forEach(System.out::println);
		
		com.aeon.mysql.dao.CsvRepository mysqlReposity = context.getBean(com.aeon.mysql.dao.CsvRepository.class);
		*/
		//mysqlReposity.save(new com.aeon.mysql.dao.Csv( "Content", timestamp));
		
		/*
		com.aeon.mysql.dao.Csv mysqlCsv = mysqlReposity.findOne(1);
        System.out.println(mysqlCsv);
        */
        //
		
		MessageRepository messageRepository = context.getBean(MessageRepository.class);
		
		Message ms = messageRepository.findOne(Long.valueOf(10));
		System.out.println(ms);
		
		context.close();
	}
	
	private static long retrnDate() {
		
		String string_date = "12-December-2012";
		long milliseconds = 000;
		SimpleDateFormat f = new SimpleDateFormat("dd-MMM-yyyy");
		try {
		    Date d = f.parse(string_date);
		    milliseconds = d.getTime();
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		return milliseconds;
	}
}
