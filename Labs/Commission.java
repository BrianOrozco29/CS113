package labs;

public class Commission extends Hourly{
	private double total;
	private double commissionRate;
	
	public Commission(String eName, String eAddress, String ePhone,
			String socSecNumber, double rate, double commiRate){
		super (eName, eAddress, ePhone, socSecNumber, rate);
		this.commissionRate = commiRate;
		total = 0;
	}
	
	public void addSales(double totalSales){
		total += totalSales;
	}
	
	public double pay(){
		return super.pay() + (total * commissionRate);
	}
	
	public String toString(){
		return super.toString() + '\n' + total;
	}
}
