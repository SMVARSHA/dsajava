
package sjb.dsa;

public class Stack
{
	private int[] array;
	private int size;
	private int top;
				
				
		
	public Stack(int size) {
		
		this.size = size;
		array=new int[size];
		top=-1;		
	}
	 public boolean isfull(){
	    	 return (top==size-1);
	    }
	 public boolean isempty() {
	     return(top==size-1);
	 }
	 public int peek() {
	   if(isempty()) {
		System.out.println("empty");
		return -1;
	   }
	    return array[top];
	    		
		}
	    	
		

	  public void push(int item)
		{
			if(isfull()) {
				System.out.println("Stack is full");
				return;
			}
			array[++top]=item;
		}
	  public int pop() {
			if(isempty()) {
				System.out.println("empty");
				return -1;
				
			}
			int item=array[top--];
			return top;
		}	
		public void display() {
			for(int i=top;i>=0;i--) {
				System.out.println(array[i]);
			}
			size=5;
		    top=2;
		}
			
		


		
	}



