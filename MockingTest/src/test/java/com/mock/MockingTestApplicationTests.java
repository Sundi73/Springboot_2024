package com.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.powermock.api.mockito.PowerMockito;
import org.springframework.boot.test.context.SpringBootTest;


import com.mock.dao.UserDao;
import com.mock.service.UserService;

@SpringBootTest
class MockingTestApplicationTests {

	@Test
	public void testGetNameById() {
		UserDao mockDao = PowerMockito.mock(UserDao.class);
		PowerMockito.when(mockDao.findNameById(101)).thenReturn("Nick");
		
		UserService service = new UserService(mockDao);
		String name = service.getNameByUserID(101);
		
		assertEquals("Nick",name);
	}
	
	
	public void testGetEmailById() {
		UserDao mockDao = PowerMockito.mock(UserDao.class);
		PowerMockito.when(mockDao.findEmailById(103)).thenReturn("nick@gmail.com");
		
		UserService service = new UserService(mockDao);
		String email = service.getEmailByUserId(103);
		assertEquals("nick@gmail.com", email);
	}
}
