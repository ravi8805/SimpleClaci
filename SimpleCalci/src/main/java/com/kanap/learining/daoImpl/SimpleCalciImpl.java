package com.kanap.learining.daoImpl;

import org.apache.log4j.Logger;

import com.kanap.learning.customException.SimplCalciExceptioHandling;
import com.kanap.learning.dao.ISimpleCalci;
import com.kanap.learning.domain.InputObject;
import com.kanap.learning.domain.OutputObject;

public class SimpleCalciImpl implements ISimpleCalci {

	/**
	 * This method is to perform Simple Calculation- Addition
	 * @author hxc0493
	 * @param input Object
	 * @return OutputObject
	 * @exception I/O Exception
	 *  
	 */
	
	final static Logger logger = Logger.getLogger(SimpleCalciImpl.class);
	public OutputObject addition(InputObject input) throws SimplCalciExceptioHandling{
		
		OutputObject out=new OutputObject();
		Integer param1= input.getInput1();
		Integer param2= Integer.parseInt("sd;f;skdf");
		
		Integer result;
		try {
			result=param1+param2;
		}
		catch(NumberFormatException ex) {
			logger.error("To learn log4j ");
			logger.error("Learning how to debug a program ");
			throw new SimplCalciExceptioHandling("This is exception measage");
		}
		catch(Exception ex) {
			logger.error("To learn log4j ");
			throw new SimplCalciExceptioHandling("This is Custom Excpetion"+ex);
		}
		out.setOutputParam1(param1);
		out.setOutputParam2(param2);
		out.setResutl(result);
		
		return out;
	}

	public OutputObject subtarct(InputObject input) {
		OutputObject out=new OutputObject();
		Integer param1= input.getInput1();
		Integer param2= input.getInput2();
		
		Integer result= param1-param2;
		
		out.setOutputParam1(param1);
		out.setOutputParam2(param2);
		out.setResutl(result);
		
		return out;
	}

	public OutputObject multiply(InputObject input) {
		OutputObject out=new OutputObject();
		Integer param1= input.getInput1();
		Integer param2= input.getInput2();
		
		Integer result= param1*param2;
		
		out.setOutputParam1(param1);
		out.setOutputParam2(param2);
		out.setResutl(result);
		
		return out;
	}

	public OutputObject division(InputObject input) {
		OutputObject out=new OutputObject();
		Integer param1= input.getInput1();
		Integer param2= input.getInput2();
		
		Integer result= param1/param2;
		
		out.setOutputParam1(param1);
		out.setOutputParam2(param2);
		out.setResutl(result);
		
		return out;
	}

}
