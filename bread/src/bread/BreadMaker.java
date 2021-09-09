package bread;

public class BreadMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeBreadFactory typeBreadFactory = new TypeBreadFactory();
		
		breadPrint(typeBreadFactory.createBread("cream"));
		breadPrint(typeBreadFactory.createBread("sugar"));
		breadPrint(typeBreadFactory.createBread("butter"));
		
	}
	
	public static void breadPrint(Bread bread) {
		System.out.println("BreadType: "+bread.getBreadType());
		System.out.println("recipe");
		bread.getRecipe().forEach((key,value)->{
			System.out.println(key+": "+value);
		});
		System.out.println();
	}

}
