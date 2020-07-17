package com.lisz;

import com.lisz.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockTest {
	//@Mock
	private static PersonService mockService;

	@Test
	public void test() {
		mockService = Mockito.mock(PersonService.class);
		System.out.println(mockService);
		Mockito.when(mockService.getName()).thenReturn("Hello!");
		System.out.println(mockService.getName());
	}
}
