package com.abc.springjpa.controller;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "com.abc.springjpa")
@EnableTransactionManagement
public class AppConfig {

	@Bean
	public DriverManagerDataSource getDriverManagerDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/batch10db");
		dataSource.setUsername("batch10");
		dataSource.setPassword("batch10");
		
		return dataSource;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean getLocalContainerEntityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setDataSource(getDriverManagerDataSource());
		factoryBean.setPackagesToScan("com.abc.springjpa.entity");
		factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.show_sql", "true");
		
		factoryBean.setJpaProperties(properties);
		
		return factoryBean;		
	}
	
	@Bean
	public JpaTransactionManager getJpaTransactionManager() {
		JpaTransactionManager txnManager = new JpaTransactionManager();				
		txnManager.setEntityManagerFactory(getLocalContainerEntityManagerFactoryBean().getObject());		
		return txnManager;		
	}
}
