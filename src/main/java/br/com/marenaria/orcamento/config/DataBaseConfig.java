package br.com.marenaria.orcamento.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataBaseConfig {
	
	@Bean
    public DataSource dataSource(){
       DriverManagerDataSource dataSource = new DriverManagerDataSource();
//       dataSource.setDriverClassName("com.mysql.jdbc.Driver");
       dataSource.setUrl("jdbc:mysql://localhost:3306/controleorcamento?useTimezone=true&serverTimezone=UTC&useSSL=false");
       dataSource.setUsername( "root" );
       dataSource.setPassword( "" );
       return dataSource;
    }

}
