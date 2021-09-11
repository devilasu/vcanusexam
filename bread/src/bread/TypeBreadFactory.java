package bread;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class TypeBreadFactory {
	Map<String, Constructor<?>> breads = new HashMap<String,Constructor<?>>();
	public TypeBreadFactory() throws Exception{
		breads.put("Cream", CreamBread.class.getConstructor());
		breads.put("Butter", ButterBread.class.getConstructor());
		breads.put("Sugar", SugarBread.class.getConstructor());
	}
	public Bread createBread(String type) throws Exception {
		
		return (Bread) breads.get(type).newInstance();
//		java reflection을 이용한 방법. 
//		Class<?> tClass = Class.forName("bread."+type+"Bread");
//		Constructor<?> cs = tClass.getConstructor();
//		Bread creamBread = (Bread) cs.newInstance();
//		return creamBread;
	}
}
