package bread;
/**
 * �����Լ��� �����ϴ� Ŭ����
 * @author �迵��
 *
 */
public class BreadMaker {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TypeBreadFactory typeBreadFactory = new TypeBreadFactory();
		
		breadPrint(typeBreadFactory.createBread("Cream"));
		breadPrint(typeBreadFactory.createBread("Sugar"));
		breadPrint(typeBreadFactory.createBread("Butter"));
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
