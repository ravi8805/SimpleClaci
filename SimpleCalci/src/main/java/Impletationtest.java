import org.apache.log4j.Logger;

import com.kanap.learining.daoImpl.SimpleCalciImpl;
import com.kanap.learning.customException.SimplCalciExceptioHandling;
import com.kanap.learning.domain.InputObject;
import com.kanap.learning.domain.OutputObject;

public class Impletationtest {

	final static Logger logger = Logger.getLogger(Impletationtest.class);
	public static void main(String[] args) throws SimplCalciExceptioHandling {
		// TODO Auto-generated method stub

		SimpleCalciImpl calci = new SimpleCalciImpl();
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
		OutputObject exp = new OutputObject();
		try {
			exp = calci.addition(input);
		} catch (NumberFormatException ex) {
			logger.error("Impletationtest: main method--To learn log4j ");
			logger.error("Learning how to debug a program ");
			throw new SimplCalciExceptioHandling(" **********");
		} catch (Exception ex) {
			throw new SimplCalciExceptioHandling("This is Custom Excpetion" + ex);
		}
	}

}
