package com.zensar;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
@EnableAutoConfiguration(exclude= {
		DataSourceAutoConfiguration.class,
		DataSourceTransactionManagerAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class
}) // to disable jpa configuration and enable hibernate jpa configuration
public class SpringbootProductRestserviceApplication {
@Autowired
private Environment env;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootProductRestserviceApplication.class, args);
		
	}
	@Bean(name="dataSource")
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
		dataSource.setUrl(env.getProperty("spring.datasource.url"));
		dataSource.setUsername(env.getProperty("spring.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.datasource.password"));
		System.out.println("## getDataSource:" + dataSource);
		return dataSource;
	}
	
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getsessionFactory(DataSource dataSource) throws IOException
	{
		Properties properties=new Properties();
		
		//see: application properties
		properties.put("hibernate.dialect",env.getProperty("spring.jpa.properties.hibernate.dialect"));
		properties.put("hibernate.show_sql", env.getProperty("spring.jpa.show_sql"));
		LocalSessionFactoryBean factoryBean= new LocalSessionFactoryBean();
		
		//package contain entity classes
		
		factoryBean.setPackagesToScan(new String[] { "com.zensar.entities" });
		factoryBean.setDataSource(dataSource);
		factoryBean.setHibernateProperties(properties);
		factoryBean.afterPropertiesSet();
		
		//
		SessionFactory sf=factoryBean.getObject();
		System.out.println("## getSessionFactory" +sf);
		return sf;
		
	}
		@Autowired
		@Bean(name="hibernateTemplate")
		public HibernateTemplate gethiHibernateTemplate(SessionFactory sessionFactory)
			{
				HibernateTemplate hibernateTemplate=new HibernateTemplate(sessionFactory);
				return hibernateTemplate;
			}
		@Autowired
		@Bean(name="transactionManager")
		public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
			{
			HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
			return transactionManager;
			}
		
}
