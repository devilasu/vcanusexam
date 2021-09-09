package bread;

public class TypeBreadFactory {
	public Bread createBread(String type) {
		Bread bread = null;
		
		switch(type) {
		case "cream":
			bread = new CreamBread();
			break;
		case "sugar":
			bread = new SugarBread();
			break;
		case "butter":
			bread = new ButterBread();
			break;
		}
		return bread;
	}
}
