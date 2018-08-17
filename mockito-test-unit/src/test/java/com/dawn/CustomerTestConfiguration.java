package com.dawn;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.dawn.dao.CustomerDao;

@Profile("test")
@Configuration
public class CustomerTestConfiguration {

	@Bean
    @Primary
    public CustomerDao customerDao() {
        return Mockito.mock(CustomerDao.class);
    }
	
}
