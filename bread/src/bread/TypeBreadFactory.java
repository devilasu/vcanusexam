package bread;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class TypeBreadFactory {
	Map<String, Bread> breads = new HashMap<String,Bread>();
//	public TypeBreadFactory() {
//		breads.put("Cream", new CreamBread());
//		breads.put("Butter", new ButterBread());
//		breads.put("Sugar", new SugarBread());
//	}
	public Bread createBread(String type) throws Exception {
		Class<?> tClass = Class.forName("bread."+type+"Bread");
		Constructor<?> cs = tClass.getConstructor();
		Bread creamBread = (Bread) cs.newInstance();
		//�̹� ������� ������ Bread�� ���ϵȴ�. (���� �ʿ�.)
		return creamBread;
	}
}
