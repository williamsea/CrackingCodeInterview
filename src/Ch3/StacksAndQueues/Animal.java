package Ch3.StacksAndQueues;

public abstract class Animal {
	int order;
	String name;
	
	protected Animal(String name){
		this.name = name;
	}
	
	public int getOrder(){
		return order;
	}
	
	public void setOrder(int order){
		this.order = order;
	}
	
	public boolean isOlderThan(Animal a){
		return this.order<=a.getOrder();
	}
	
}
