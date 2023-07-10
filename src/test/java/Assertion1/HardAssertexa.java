package Assertion1;
import org.testng.Assert;

public void m1()
{
	System.out.println("step1");
	String expdata="Qspider";
	String actdata="qspider";
	Assert.assertEquals(actdata, expdata);
	System.out.println("step2");
	System.out.println("step3");
}
public void m2()
{
	System.out.println("step4");
	org.testng.Assert.assertEquals(true, true);
	System.out.println("step4");
}
}