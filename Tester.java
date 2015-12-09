import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Genius store = new Genius(3);
		Scanner scan = new Scanner(System.in);		
		String name;
		String problem;	
		while(true){
		System.out.println("1: Add a Customer");
		System.out.println("2: Peek at next Customer");
		System.out.println("3: Find place in line");
		System.out.println("4: Change problem");
		System.out.println("5: Get line length");
		System.out.println("6: Dequeue next customer");
		System.out.println("7: Exit");
		System.out.print("What's your choice? ");
		int choice = scan.nextInt();
		System.out.println();
		System.out.println();
		System.out.println();
		switch(choice)
		{
		case 1:
			System.out.print("Please enter problem: ");
			problem = scan.next();
			System.out.print("Please enter name: ");
			name = scan.next();
			Customer temp = new Customer(name, problem);
			store.enqueue(temp);
			break;	
		case 2:
			System.out.println(store.peek());
			break;
		case 3:
			System.out.print("Please enter name: ");
                        name = scan.next();
			System.out.println(store.findPlace(name) + 1);
			break;
		case 4:
			System.out.print("Please enter problem: ");
                       	problem = scan.next();
                        System.out.print("Please enter name: ");
                        name = scan.next();
			store.changeProblem(name, problem);
			break;
		case 5:
			System.out.println(store.lineLength());
			break;
		case 6:
			System.out.println("Just dequeued customer " + store.dequeue().returnName());
			break;
		case 7:
			System.exit(0);
			break;
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}

}
}
