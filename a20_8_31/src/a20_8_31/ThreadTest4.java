package a20_8_31;

public class ThreadTest4 {

	public static void main(String[] args) {
		Thread kim=new Thread(new Runnable() {
			int num=0;
			public void run() {
				while(true) {
					System.out.println(num);
					try {
					Thread.sleep(1000);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
					num++;
				}
				
			}
		
		});
		 kim.start();
		}
}
