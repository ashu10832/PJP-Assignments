package main;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

class Timer implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuestionManager quesManager = new QuestionManager();
		
		System.out.println("Starting Corona Quiz...");
		
		int score = 0;
		
		for(int i = 0;i<quesManager.getNumOfQues();i++) {
			Question q = quesManager.getRandomQues();
			System.out.println("---------------------------------");
			System.out.println(q.getQuestion());
			List<String> options = q.getOptions();
			
			int opt = 1;
			for(String option:options) {
				System.out.println(opt + ":" + option + "\n");
				opt++;
			}
			
			System.out.println("Enter correct option number: ");
				
			Timer t = new Timer();
			
			Thread thread = new Thread(t);
			thread.start();
			
			Scanner scanner = new Scanner(System.in);
			int answer = 0;
			while(thread.isAlive()) {
				try {
					if(System.in.available() > 0) {
						answer = scanner.nextInt();
						thread.interrupt();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
			if(answer == 0) {
				System.out.println("\nTime's Up!!\n\n");
			}
			else {
				if(answer == q.getCorrectOpt()) {
					System.out.println("Right Answer!");
					score++;
				}
				else {
					System.out.println("Wrong Answer!");
				}
			}	
		}
		System.out.println("---------------------------------");
		System.out.println("\n\nQuiz Ended!\n");
		System.out.println("Your got " + score + " right out of " + quesManager.getNumOfQues());
		
		
		// Show user a ques
		// start the daemon thread and add a sleep of 10 seconds
		// if the user answers within that time, then the daemon thread should stop 
		//   and next question shud come up
		// else daemon thread will say timeout and application will close
		
		
	}

}
