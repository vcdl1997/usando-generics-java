package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	private List<T> list = new ArrayList<>();
	
	public PrintService() {}
	
	public List<T> getList() {
		return list;
	}

	public void addValue(T value) {
		this.getList().add(value);
	}
	
	public T first() {
		if(this.getList().isEmpty()) {
			throw new IllegalArgumentException("List is empty");
		}
		
		return this.getList().get(0);
	}
	
	public void print() {
		int contador = 0;
		StringBuilder sb = new StringBuilder("[");
		
		for(T value : this.getList()) {
			++contador;
			sb.append(value).append(contador == this.getList().size() ? "]" : ", ");
		}
		
		System.out.println(sb.toString());
	}
}
