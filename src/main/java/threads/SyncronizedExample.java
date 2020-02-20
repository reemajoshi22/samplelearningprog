package threads;

public class SyncronizedExample implements Runnable {
	StringBuffer buffer;
	public SyncronizedExample(StringBuffer buffer) {
		this.buffer=buffer;
	}
	public static void main(String[] args) {
		StringBuffer stringBuffer=new StringBuffer("A");
		SyncronizedExample example = new SyncronizedExample(stringBuffer);
		SyncronizedExample example2 = new SyncronizedExample(stringBuffer);
		//if we use example2 to make thread object then there is no use of syncronization
		Thread thread = new Thread(example);
		thread.setName("ONE");
		thread.start();
		
		/*try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		Thread thread2 = new Thread(example);
		thread2.setName("TWO");
		thread2.start();
		/*try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		Thread thread3 = new Thread(example);
		thread3.setName("THREE");
		thread3.start();
	}

	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<5;i++){
				System.out.println(buffer+" "+Thread.currentThread().getName()+ " "+i);
				buffer.setCharAt(0, (char) (buffer.charAt(0)+1));
				/*try {
					Thread.sleep(80000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			}
		}
	}

}
