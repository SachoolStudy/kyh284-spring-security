package com.example.study01.mybatis;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan(basePackages = {"com.example.study01.dao"})
public class MybatisConfig {
	@Bean
	public <SqlSessionFatory> SqlSessionFactory sqlsessionFactory(DataSource dataSource) throws Exception{
		final SqlSessionFactoryBean sessionFactory= new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sessionFactory.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
		return sessionFactory.getObject();
	}
	
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception{
		final SqlSessionTemplate sqlSessionTemplate=new SqlSessionTemplate(sqlSessionFactory);
		return sqlSessionTemplate;
	}
}
