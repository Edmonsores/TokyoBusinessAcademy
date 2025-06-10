
public class SalesDepartment extends Department {
	    private int unitPrice;
	    private int customerCount;

	    public SalesDepartment(String id, String name, int targetAmount, int unitPrice, int customerCount) {
	        super(id, name, targetAmount);
	        this.unitPrice = unitPrice;
	        this.customerCount = customerCount;
	    }

	    public int calculateSales() {
	        return unitPrice * customerCount;
	    }

	    public String judgeTarget() {
	        if (calculateSales() >= targetAmount) {
	            return "目標達成";
	        } else {
	            return "目標額に届かない";
	        }
	    }

	    public void displayInfo() {
	        System.out.println("売り場ID: " + id);
	        System.out.println("名称: " + name);
	        System.out.println("目標額: " + targetAmount + "円");
	        System.out.println("売上額: " + calculateSales() + "円");
	        System.out.println("達成状況: " + judgeTarget());
	        System.out.println(" ");
	    }
	}
