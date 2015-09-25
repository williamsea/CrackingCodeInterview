package Ch3.StacksAndQueues;

public class Ch3_1_ArrayFixedDivisionStack {
	int stackSize = 100;
	int[] buffer = new int[stackSize*3];
	int[] stackPointer = {-1, -1, -1};//Pointers track top element
	
	void push(int stackNum, int value){
		stackPointer[stackNum]++;
		buffer[absTopOfStack(stackNum)] = value;
	}
	
	/**
	 * return index of top of stack in buffer
	 * @param stackNum
	 * @return
	 */
	int absTopOfStack(int stackNum){
		return stackNum*stackSize+stackPointer[stackNum];
	}
	
	int pop(int stackNum){
		int value = buffer[absTopOfStack(stackNum)];//take top value
		buffer[absTopOfStack(stackNum)] = 0;//clean top value in buffer
		stackPointer[stackNum]--;//lower the top pointer
		return value;
	}
	
	int peek(int stackNum){
		return buffer[absTopOfStack(stackNum)];
	}
	
	
	
}
