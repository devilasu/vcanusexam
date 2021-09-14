package bread2;

import java.util.HashMap;
import java.util.Map;

public class TypeBreadFactory {
	Map<String, Bread> breads = new HashMap<String,Bread>();
	public TypeBreadFactory() throws Exception{
		breads.put("Cream", cookCream());
		breads.put("Butter", cookButter());
		breads.put("Sugar", cookSugar());
	}
	public Bread createBread(String type) throws Exception {
		return breads.get(type);
	}
	
	public Bread cookCream() {
		return new CreamBread();
	}
	public Bread cookButter() {
		return new ButterBread();
	}
	public Bread cookSugar() {
		return new SugarBread();
	}
}
