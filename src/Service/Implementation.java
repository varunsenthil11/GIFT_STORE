package Service;

import java.util.*;
import Repository.*;

public class Implementation implements GiftService {
	private int cost =0;
	Repoimplementation r = new Repoimplementation();
public void displaygifts() {
	r.initialize();
	r.displaygifts();
}
public int totalprice(ArrayList<String> l) throws Exception {
	for(int i=0;i<l.size();i++) {
		String h = l.get(i);
		cost +=r.getprice(h);
		if(cost==0)
		throw new Exception("The product list you have provided is not in store");
	}
	return cost;
}
}
