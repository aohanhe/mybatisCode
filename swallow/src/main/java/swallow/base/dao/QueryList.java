package swallow.base.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.javassist.expr.NewArray;

public class QueryList<T extends Enum>   implements Map<Integer, Query<T>>{
	private ArrayList<Query<T>> arrayList=new ArrayList();

	public int size() {
		// TODO Auto-generated method stub
		return arrayList.size();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return arrayList.size()==0;
	}

	public boolean containsKey(Object key) {
		if(key instanceof Integer)
			return ((Integer)key)<arrayList.size()&&((Integer)key)>=0;
		
		return false;
	}

	public boolean containsValue(Object value) {
		return arrayList.contains(value);
		 
	}

	public Query<T> get(Object key) {
		// TODO Auto-generated method stub
		int index=0;
		if ( key instanceof String) {
			index = Integer.parseInt((String)key);
		}
		if(key instanceof Integer){
			index = (Integer) key;
		}
		
		return arrayList.get(index);
	}

	public void put(Query<T> value)
	{
		arrayList.add(value);
	}
	
	public Query<T> put(Integer key, Query<T> value) {
		// TODO Auto-generated method stub
		//return arrayList.add(index, element);;
		return null;
	}

	public Query<T> remove(Object key) {
		Query<T> re= arrayList.get((Integer)key);
		arrayList.remove((Integer)key);
		return re;
	}

	public void putAll(Map<? extends Integer, ? extends Query<T>> m) {
		// TODO Auto-generated method stub
		
	}

	public void clear() {
		arrayList.clear();		
	}

	public Set<Integer> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Query<T>> values() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<java.util.Map.Entry<Integer, Query<T>>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
