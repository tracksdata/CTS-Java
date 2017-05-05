package com;

/*
 * 
 * --> Threads communicate primarily by sharing access 
 *    to fields and the objects reference fields refer to.
 * 
 * --> This form of communication is extremely efficient,
 *     but makes two kinds of errors possible
 * 
 * 
 *        thread interference and memory consistency errors.
 *       
 *       
 *  The tool needed to prevent these errors is "synchronization"
 *  
 *  
 *  
 *  
 *  synchronization can introduce thread contention
 *  
 *  
 *  to executes one or more threads more slowly, or even suspend their execution.
 *  
 *  Starvation and livelock are forms of thread contention.
 *  
 *  
 *  
 *  Starvation
 *  -----------
 *  
 *  Starvation describes a situation where a thread is unable to gain regular
 *  access to shared resources and is unable to make progress. 
 * 
 * 
 * Livelock
 * -----------
 * 
 * A thread often acts in response to the action of another thread.
 * If the other thread's action is also a response to the action of another thread,
 * then livelock may result.
 * 
 * 
 * 
 *       
 * 
 * 
 */

//------------------------------------------------------------------------------------------------------

//Thread Interference
//--------------------

class Counter {
	
	private int c = 0;

	public void increment() {
		c++;
	}

	public void decrement() {
		c--;
	}

	public int value() {
		return c;
	}

}


//Thread A: Retrieve c.
//Thread B: Retrieve c.
//Thread A: Increment retrieved value; result is 1.
//Thread B: Decrement retrieved value; result is -1.
//Thread A: Store result in c; c is now 1.
//Thread B: Store result in c; c is now -1.


//------------------------------------------------------------------------------------------------------

//  Synchronized Methods


class SynchronizedCounter {
    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }
}


/*
 * Synchronized methods enable a simple strategy for 
 * preventing thread interference and memory consistency errors
 * 
 */


//------------------------------------------------------------------------------------------------------



//Intrinsic Locks and Synchronization


/*
 *  --> Every object has an intrinsic lock associated with it.
 *  
 *  -->  a thread that needs exclusive and consistent access to an object's
 *       fields has to acquire the object's intrinsic lock before accessing them,
 *       and then release the intrinsic lock when it's done with them. 
 * 
 * 
 *     
       Synchronized Statements
    
		public void addName(String name) {
		    synchronized(this) {
		        lastName = name;
		        nameCount++;
		    }
		    nameList.add(name);
		}


		Synchronized statements are also useful for 
		improving concurrency with fine-grained synchronization. 
	
 * 
 */


class MsLunch {
    private long c1 = 0;
    private long c2 = 0;
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void inc1() {
        synchronized(lock1) {
            c1++;
        }
    }

    public void inc2() {
        synchronized(lock2) {
            c2++;
        }
    }
}





public class Thread_Syncronization_Ex {

}
