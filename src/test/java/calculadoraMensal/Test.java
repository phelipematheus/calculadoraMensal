package calculadoraMensal;

import java.util.Calendar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import junit.framework.Assert;

public class Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void dataDoNegocioEhImutavel() {
	     // se criar um negocio no dia 15...
	     Calendar c = Calendar.getInstance();
	     c.set(Calendar.DAY_OF_MONTH, 15);
	}

}
