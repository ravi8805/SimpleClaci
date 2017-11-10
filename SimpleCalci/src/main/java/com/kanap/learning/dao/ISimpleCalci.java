package com.kanap.learning.dao;

import com.kanap.learning.customException.SimplCalciExceptioHandling;
import com.kanap.learning.domain.InputObject;
import com.kanap.learning.domain.OutputObject;

public interface ISimpleCalci {
	
	
	public OutputObject addition(InputObject input) throws SimplCalciExceptioHandling;
	
	public OutputObject subtarct(InputObject input);
	
	public OutputObject multiply(InputObject input);
	
	public OutputObject division(InputObject input);

}
