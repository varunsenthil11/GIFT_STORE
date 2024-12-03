package Controller;
import Service.*;
import java.util.*;
public class Main {
public static void main(String[] args) {
	GiftService s = new Implementation();
	ArrayList<String> l = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	s.displaygifts();
	System.out.println("\nEnter number of products");
	int n = sc.nextInt();
	System.out.println("Enter products:");
	for(int i=0;i<n;i++) {
		String str = sc.next();
		l.add(str);
	}
	try {
		
	System.out.println(s.totalprice(l));
	
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	sc.close();
}
}
