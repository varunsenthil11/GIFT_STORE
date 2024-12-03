package Repository;
import java.util.*;
import Model.*;
public class Repoimplementation implements GiftRepository {
  private Map<String,Gift> map = new HashMap<>();
  public void initialize() {
	  Gift g = new Gift("Teddybear",1000,"yes");
	  map.put("Teddybear",g);
	  Gift g1 = new Gift("Polarbear",1000,"yes");
	  map.put("Polarbear",g1);
	  Gift g2 = new Gift("Chocolate",1000,"yes");
	  map.put("Chocolate",g2);
	  Gift g3 = new Gift("Pen",1000,"yes");
	  map.put("Pen",g3);
  }
  public void addgifts(String name,int cost,String premium) {
	  Gift g = new Gift(name,1000,premium);
	  map.put(name,g);
  }
  public void displaygifts() {
	  for(String name : map.keySet()) {
		  System.out.println(name);
		  Gift h = map.get(name);
		  System.out.println("price : "+h.getprice()+" " +"Premium : "+h.ispremium()+"\n");
	  }
  }
  public int getprice(String name) {
	  Gift h = map.get(name);
	  if(h==null)
	  return 0;
	 return h.getprice();
  }
  
}
