package bread2;

import java.util.Map;

public abstract class Bread {
	public abstract String getBreadType();
	public abstract Map<String,Integer> getRecipe();
	public abstract void addRecipe();
}
