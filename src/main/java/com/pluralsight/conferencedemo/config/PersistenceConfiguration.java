package com.pluralsight.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
//    @Bean
//    public DataSource dataSource() {
//        DataSource ds = DataSourceBuilder.create()
//                .url("jdbc:mysql://localhost:3306/firstsbapp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC")
//                .username("root")
//                .password("pluralsight")
//                .build();
//        System.out.println("My custom datasource bean has been initialized and set!");
//        return ds;
//    }
}
