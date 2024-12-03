package Model;

public class Gift {
private String name;
private int price;
private String ispremium = "No";

public Gift(String name,int price,String ispremium){
	this.name=name;
	this.price =price;
	this.ispremium = ispremium;
}
public void setprice(int price) {
	this.price = price;
}
public void setcategory(String premium) {
	this.ispremium = premium;
}
public int getprice() {
	return price;
}
public boolean ispremium() {
	if(ispremium=="Yes") {
		return true;
	}
	else
	return false;
}

}
