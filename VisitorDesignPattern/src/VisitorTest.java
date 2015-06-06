import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class VisitorTest {

	public static void main(String [] args){
		
		TaxVisitor taxCalc = new TaxVisitor();
		TaxHolidayVisitor taxHolidayCals = new TaxHolidayVisitor();
		
		List objectsList = new ArrayList();
		
		//populating the list	
		objectsList.add( new Necessity(3.47).accept(taxCalc));
		objectsList.add( new Liquor(11.99).accept(taxCalc));
		objectsList.add( new Tobacco(19.99).accept(taxCalc));
				
		//Display the objects
		objectsList.forEach(object -> System.out.println(object));
		
	}
	
	
}
