package com.stackroute.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
@PropertySource(value = "classpath:mysql.properties")
public class AppDbConfiguration {

	@Value("${jdbc.drverClass}")
	private String driver;
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String user;
	
	@Value("${jdbc.password}")
	private String password;
	
//	@Bean
//	public DataSource getDataSource() {
//	DriverManagerDataSource ds = new DriverManagerDataSource();
//	ds.setDriverClassName(driver);
//	ds.setUrl(url);
//	ds.setUsername(user);
//	ds.setPassword(password);
//	return ds;
//	}
	
	@Bean
	public DataSource getH2DataSource() {
		return new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.HSQL)
				.addScript("classpath:sql/schema.sql")
				.addScript("classpath:sql/test-data.sql").build();
	}
	
	
	@Bean
	public JdbcTemplate getTemplate(DataSource ds) {
		
		JdbcTemplate template = new JdbcTemplate(ds);
		template.setResultsMapCaseInsensitive(true);
		
		return template;
	}
	
}
