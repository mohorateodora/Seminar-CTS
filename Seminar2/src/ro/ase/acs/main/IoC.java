package ro.ase.acs.main;

import java.util.HashMap;
import java.util.Map;

public class IoC {
   private Map<Class<?>, Class<?>> map = new HashMap<>();
	
	public void register(Class<?> contract, Class<?> implementation) {
		map.put(contract, implementation);
		
	}
	
	//trebuie sa facem clasa generica
	public <T> T resolve(Class<?> contract){
		try {
			return (T) map.get(contract).newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
