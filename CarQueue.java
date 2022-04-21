import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class CarQueue {
	private Queue<Integer> direction;
	private Random randInt;

	public void addToQueue() {
		class QueueClass implements Runnable{
			@Override
			public void run() {
				while(true) {
					try {
						direction.add(randInt.nextInt(4));
						Thread.sleep(200);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		QueueClass r = new QueueClass();
		Thread t = new Thread(r);
		t.start();
	}
	
	public int deleteQueue() {
		return direction.remove();
	}
	
	public CarQueue() {
		direction = new ArrayDeque<Integer>();
		randInt = new Random();
		direction.add(randInt.nextInt(4));
		direction.add(randInt.nextInt(4));
		direction.add(randInt.nextInt(4));
		direction.add(randInt.nextInt(4));
		direction.add(randInt.nextInt(4));
	}

}
