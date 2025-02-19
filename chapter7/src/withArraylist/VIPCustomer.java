package withArraylist;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID){
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.2;
		this.agentID = agentID;
	}
	
	public int calcPrice(int price) {
		bonusPoint += (int)(price*bonusRatio);
		return price -= (int)(price*salesRatio);
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID +"입니다.";
	}
}
