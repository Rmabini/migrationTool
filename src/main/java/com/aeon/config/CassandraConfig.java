package com.aeon.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.mapping.CassandraMappingContext;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;



@Configuration
@EnableCassandraRepositories(basePackages = "com.aeon.dao")
public class CassandraConfig extends AbstractCassandraConfiguration {

	private static final Log LOGGER = LogFactory.getLog(CassandraConfig.class);

	@Override
	protected String getKeyspaceName() {

		return "notification_manager";
	}

	@Bean
	public CassandraClusterFactoryBean cluster() {
		CassandraClusterFactoryBean cluster = new CassandraClusterFactoryBean();
		cluster.setContactPoints("10.201.80.81");

		cluster.setPort(9042);
		cluster.setUsername("alpha");
		cluster.setPassword("alpha123");
		LOGGER.info("Cluster created with contact points " + cluster.toString());

		return cluster;
	}

	@Bean
	public CassandraMappingContext cassandraMapping() {
		return new BasicCassandraMappingContext();
	}
}
