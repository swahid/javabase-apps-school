/**
 * 
 */
package org.javabase.apps.config;

import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Configuration 
@EnableTransactionManagement
@PropertySource("classpath:META-INF/properties/database.properties")
public class DBConfig {
	
    @Autowired
    private Environment env;
        
	@Bean
	public HibernateTemplate hibernateTemplate() {
		return new HibernateTemplate(sessionFactory());
	}
	@Bean
	public SessionFactory sessionFactory() {
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		lsfb.setDataSource(getDataSource());
		lsfb.setPackagesToScan("org.javabase.apps");
		lsfb.setHibernateProperties(hibernateProperties());
		try {
			lsfb.afterPropertiesSet();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lsfb.getObject();
	}
	@Bean
	public DataSource getDataSource() {
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName(env.getProperty("database.driver"));
	    dataSource.setUrl(env.getProperty("database.url"));
	    dataSource.setUsername(env.getProperty("database.root"));
	    dataSource.setPassword(env.getProperty("database.password"));
	    return dataSource;
	}
	@Bean
	public HibernateTransactionManager hibTransMan(){
		return new HibernateTransactionManager(sessionFactory());
	}
        private Properties hibernateProperties() {
            Properties properties = new Properties();
            properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
            properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
            properties.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
            properties.put("hibernate.enable_lazy_load_no_trans", "true");
            properties.put("hibernate.hbm2ddl.import_files", "import.sql");
            return properties;        
       }	
}
