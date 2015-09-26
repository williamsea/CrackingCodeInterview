package Ch3.StacksAndQueues;

import java.util.LinkedList;

public class Ch3_7_AnimalShelter {
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	
	private int order = 0;
	
	public void enqueue(Animal a){
		a.setOrder(order);
		order++;
		
		if(a instanceof Dog){
			dogs.add((Dog) a);
		}
		else if(a instanceof Cat){
			cats.add((Cat) a);
		}
	}
	
	public Animal dequeueAny(){
		if(dogs.size()==0){
			return dequeueCats();
		}
		else if (cats.size()==0){
			return dequeueDogs();
		}

		Cat cat = cats.peek();
		Dog dog = dogs.peek();
		
		if(dog.isOlderThan(cat)){
			return dequeueDogs();
		}
		else{
			return dequeueCats();
		}
	}
	
	public Animal dequeueCats(){
		return cats.poll();
	}
	
	public Animal dequeueDogs(){
		return dogs.poll();
	}
	
	public static void main(String[] args){
		Ch3_7_AnimalShelter shelter = new Ch3_7_AnimalShelter();
		shelter.enqueue(new Dog("d1"));
		shelter.enqueue(new Cat("c1"));
		shelter.enqueue(new Dog("d2"));
		shelter.enqueue(new Dog("d3"));
		shelter.enqueue(new Cat("c2"));
		shelter.enqueue(new Cat("c3"));
		System.out.print(shelter.dequeueAny().name+'\n');
		System.out.print(shelter.dequeueDogs().name+'\n');
		System.out.print(shelter.dequeueCats().name+'\n');
		System.out.print(shelter.dequeueCats().name+'\n');
		System.out.print(shelter.dequeueDogs().name+'\n');
		System.out.print(shelter.dequeueAny().name+'\n');
	}
}
