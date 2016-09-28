package cn.java8.learn.runnable;

public class RunnableTest {
	public static void main(String[] args){
		System.out.println("=======RunnableTest======");
		
		/********Normal Implementation**********/
		Runnable r1 = new Runnable(){

			@Override
			public void run() {
				System.out.println("Hello world one!");
			}
			
		};
		
		r1.run();
		
		/********Lambda Implementation**********/
		
		Runnable r2 = () -> System.out.println("Hello world two");
		r2.run();
	}
}
