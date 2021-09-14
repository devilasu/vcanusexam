package bread2;

public class BreadMaker {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
				TypeBreadFactory typeBreadFactory = new TypeBreadFactory();
				Bread b1 = typeBreadFactory.createBread("Cream");
				Bread b2 = typeBreadFactory.createBread("Cream");
				b1.addRecipe();
				
				System.out.println(b1);
				
				breadPrint(b1);
				breadPrint(b2);
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
