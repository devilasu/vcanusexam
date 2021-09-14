package bread2;

import java.util.LinkedHashMap;
import java.util.Map;

public class SugarBread extends Bread{
	private String breadType;
	private Map<String,Integer> recipe;
	
	public SugarBread() {
		init("sugar",100,50,200);
	}
	
	private void init(String type, Integer flour, Integer water, Integer cream) {
		breadType = type;
		recipe = new LinkedHashMap<String, Integer>();
		recipe.put("flour", flour);
		recipe.put("water", water);
		recipe.put("cream", cream);
	}
	@Override
	public String getBreadType() {
		return breadType;
	}

	@Override
	public Map<String,Integer> getRecipe() {
		return recipe;
	}

	@Override
	public void addRecipe() {
		// TODO Auto-generated method stub
		
	}
	
}
