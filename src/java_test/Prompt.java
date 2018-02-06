package java_test;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calandar1 cal = new Calandar1();
	

		
		int month = 1;
		
		while (true) {
			
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			
			if(month == -1) {
				break;
			}
			if(month > 12) {
				continue;
			}
			cal.printCalandar(2018,month);	
		}
	
		System.out.println("The End !!.");
		
		//	cal.printSampleCalandar();
			scanner.close();
	}		
	
	public static void main(String[] args) {
		
			Prompt p = new Prompt();
			p.runPrompt();
			
			
			
				
			}
			
			
			
				
			
		}
	


	

