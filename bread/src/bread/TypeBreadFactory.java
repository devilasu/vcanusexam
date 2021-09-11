package bread;

import java.util.HashMap;
import java.util.Map;

public class TypeBreadFactory {
	Map<String, Bread> breads = new HashMap<String,Bread>();
	public TypeBreadFactory() {
		breads.put("cream", new CreamBread());
		breads.put("butter", new ButterBread());
		breads.put("sugar", new SugarBread());
	}
	public Bread createBread(String type) {
		//이미 만들어진 동일한 Bread가 리턴된다. (수정 필요.)
		return breads.get(type);
	}
}
