package CollectionsII;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Store {

	String type, name;

	public Store(String type, String name) {
		this.type = type;
		this.name = name;

	}

	public void display() {
		System.out.println("This store is " + name);
	}

	public abstract void workingHours();

}

class Nike extends Store {

	public Nike(String type, String name) {
		super(type, name);

	}

	@Override
	public void workingHours() {
		System.out.println(name + " works from 10am till 6pm");

	}

}

class Costco extends Store {

	public Costco(String type, String name) {
		super(type, name);
	}

	@Override
	public void workingHours() {
		System.out.println(name + " works from 8am til 8pm");

	}

}

class Amazon extends Store {

	public Amazon(String type, String name) {
		super(type, name);

	}

	@Override
	public void workingHours() {
		System.out.println(name + " works 24/7");

	}

}

class UserDefinedClassesInMap {

	public static void main(String[] args) {

		Map<Integer, Store> storeMap = new LinkedHashMap<>();
		storeMap.put(1, new Amazon("online", "Amazon"));
		storeMap.put(2, new Costco("wholesale", "Costco"));
		storeMap.put(3, new Nike("retail", "Nike"));

		System.out.println(storeMap);

		// 1 way to get all VALUE objects
		Collection<Store> coll = storeMap.values();

		for (Store store : coll) {
			store.workingHours();
			store.display();

		}

		// 2nd way to get all entries using ENTRY SET!

		Set<Entry<Integer, Store>> storeSet = storeMap.entrySet();

		for (Entry<Integer, Store> e : storeSet) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		// 3rd way - get all keys -> get value of specified key
		Set<Integer> keys = storeMap.keySet();

		for (Integer k : keys) {
			Store obj = storeMap.get(k);
			obj.display();
			obj.workingHours();
		}
		Iterator<Entry<Integer, Store>> it = storeSet.iterator();
		while(it.hasNext()) {
			
			Entry<Integer, Store> ent = it.next();
			Integer keyss= ent.getKey();
			
			
		}

	}

}