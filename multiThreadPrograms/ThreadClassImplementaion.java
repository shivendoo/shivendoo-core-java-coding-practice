package multiThreadPrograms;

public class ThreadClassImplementaion {

	public static void main(String[] args) {

		// this is implementation via Thread class
//				Thread hello = new HelloClass();
//				Thread hi = new HiClass();
//				hello.start();
//				hi.start();				
//				try{hi.join();}catch(Exception e){}

		// This is implementation via Runnable Interface
		
//				Runnable HI = new HiRunnableInterfaceClass();
//				Runnable HELLO = new HelloRunnableInterfaceClass();
//		
//				Thread hiThread = new Thread(HI);
//				Thread helloThread = new Thread(HELLO);
//				hiThread.start();
//				helloThread.start();
				
				
				
		// This is implementation via Runnable Interface using  LAMBDA 
				
				Runnable Lamda_Hi =() -> {
						for (int i = 0; i < 6; i++) {
							System.out.println("HI Lamda");
							try{Thread.sleep(500);}catch(Exception e){}
						}
				};
				
				Runnable Lamd_Hello = () -> {
						for (int i = 0; i < 6; i++) {
							System.out.println("HELLO Lamds");
							try{Thread.sleep(500);}catch(Exception e){}
						}
				};
		
				Thread HiLambdaThread = new Thread (Lamda_Hi);
				Thread HelloLambdaThread = new Thread (Lamd_Hello);
				
				HiLambdaThread.start();
				HelloLambdaThread.start();
				
				
// main class method - 
		System.out.println("this is main class thread");

	}

}
