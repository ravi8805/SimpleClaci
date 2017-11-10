package com.kanap.learining.daoImpl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kanap.learning.customException.SimplCalciExceptioHandling;
import com.kanap.learning.domain.InputObject;
import com.kanap.learning.domain.OutputObject;

public class SimpleCalciImplTest {

	SimpleCalciImpl calci = null;

	@Before
	public void setUp() throws Exception {
		calci = new SimpleCalciImpl();
	}

	@After
	public void tearDown() throws Exception {
		calci = null;
	}

	@Test
	public void testAddition() throws SimplCalciExceptioHandling {
		// 1)Input
		Integer input1 = 10;
		Integer input2 = 30;
		InputObject input = new InputObject();
		input.setInput1(input1);
		input.setInput2(input2);
		// 2)Expected output
		OutputObject output = new OutputObject();
		output.setOutputParam1(input1);
		output.setOutputParam2(input2);
		output.setResutl(40);
		// 3)Actual output
		OutputObject exp= new OutputObject();
		exp = calci.addition(input);
		// Assertion
		assertEquals(output, exp);
	}

}
