
public class Liquor implements Visitable {

	private double price;
	
	//This is a constructor which will set up the produce price
	Liquor(double item){
		price = item;
	}
	
	//getting the price for the product
	public double getPrice() {
			return price;
	}

	@Override
	public double accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

}
