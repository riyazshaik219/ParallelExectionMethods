import org.testng.annotations.Test;

public class MethodParallelExecution {

	


	@Test
	public void testOne() throws InterruptedException {
		
		for(int i=0;i<=10;i++) {
			
		System.out.println("testOne values are:"+i);
		Thread.sleep(20);
	}
	}
	@Test
	public void testTwo() throws InterruptedException {
		

		for(int i=100;i<=110;i++) {
			
		System.out.println("testTwo values are:"+i);
		Thread.sleep(20);
	}
		
		
	}
	
}
