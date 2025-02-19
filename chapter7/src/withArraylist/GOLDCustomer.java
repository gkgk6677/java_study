package withArraylist;

public class GOLDCustomer extends Customer {
//	protected int customerID;
//	protected String customerName;
//	protected String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
	
	int newprice;
	double salesRatio;
	
	public GOLDCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		this.salesRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		bonusPoint += (int)(price*bonusRatio);
		return (int)(price -= price*salesRatio);
	}
	
}
