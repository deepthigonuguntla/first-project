package MatrixPatternsExamples;

public class CalculateElectricBill {
	int bill;
	public void electricbill(int units) {
		if(units>0&&units<=50) 
		{
			 bill=units;
			 
		}
		else if (units>51&&units<100)
		{
			 bill=units*2;
		}
		else if (units>101&&units<300)
		{
			 bill=units*3;
		}
		else 
		{
		bill=units*5;	
		}
		System.out.println("electricity bill is----->"+bill);
	}

	public static void main(String[] args) {
		CalculateElectricBill cal=new CalculateElectricBill();
		cal.electricbill(0);

	}

}
