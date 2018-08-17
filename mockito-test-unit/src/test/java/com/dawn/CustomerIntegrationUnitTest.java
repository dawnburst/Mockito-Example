package com.dawn;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dawn.controller.CustomerController;
import com.dawn.dao.CustomerDao;
import com.dawn.resource.Customer;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MockitoTestUnit.class)
public class CustomerIntegrationUnitTest {
	
	@Autowired
    private CustomerDao customerDao;

    @Autowired
    private CustomerController customerController;

    @Test
    public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {
        Mockito.when(customerDao.getCustomer(1)).thenReturn( new Customer(1, "Shahar", "Zror", "C"));

        String testName = customerController.getCustomerStr(1);
        
        Assert.assertEquals("Customer [id=1, firstName=Shahar, lastName=Zror, customerType=C] STR", testName);
    }
	
}
