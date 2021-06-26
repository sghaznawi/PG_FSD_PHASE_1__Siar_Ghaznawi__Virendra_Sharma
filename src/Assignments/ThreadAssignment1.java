package Assignments;

public class ThreadAssignment1 extends Thread{

	 
		public void run(){  
			System.out.println("running thread name is:"+Thread.currentThread().getName());  
			   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
			   System.out.println("running thread state is:"+ Thread.currentThread().getState());
			   System.out.println("The thread group is:"+Thread.currentThread().getThreadGroup());
			   System.out.println("The thread id is:"+Thread.currentThread().getId());
			   System.out.println("Is my thread alive or not? :  "+Thread.currentThread().isAlive());
			   System.out.println("Is my thread Daemon or not? :  "+Thread.currentThread().isDaemon());
		  }  
		
		 public static void main(String args[]){  
		  
			 ThreadAssignment1 t1=new ThreadAssignment1();  
			 ThreadAssignment1 t2=new ThreadAssignment1();
			 ThreadAssignment1 t3=new ThreadAssignment1();
			 ThreadAssignment1 t4=new ThreadAssignment1();
		  
		  t1.setName("Thread 1");
		  t2.setName("Thread 2");
		  t3.setName("Thread 3");
		  t4.setName("Thread 4");
		 
		  t1.setPriority(Thread.MIN_PRIORITY);  
		  t2.setPriority(Thread.MIN_PRIORITY);  
		  t3.setPriority(Thread.MAX_PRIORITY);  
		  t4.setPriority(Thread.NORM_PRIORITY);  
		  
		  t1.setDaemon(true);
		  
		  t1.start();
		  t2.start();
		  t3.start();
		  t4.start();
		   
		 }  

}



/*Assignment 1:
Just create 4 thread in the process system
1- Give each thread a name
2. set the 2 thread pririty as Min  and other two as norm and maximum
3. set one thread as daemon (any thread)
4. start the threads at same time and inside the function fetch the values
  - check the status of thread and is dead or alive
  - check status of threads anf fetch theri ids also
*/