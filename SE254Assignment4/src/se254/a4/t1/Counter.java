package se254.a4.t1;
//This is an example class to be used for reflection in T1
public class Counter {
	public int c;

	public void increment() { 
		c = c--; //faulty increment
	}

	public void decrement() { 
		c = c++; //faulty decrement
	}	

	public void reset() { 
		c = 1; //Resets c. Faulty reset, c should rather be 0 
	}
}
