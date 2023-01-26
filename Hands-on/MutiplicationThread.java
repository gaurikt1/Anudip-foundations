package corejava;

public class MutiplicationThread extends Thread{
	
		public void run() 
		{
			
			try 
			{
				int num=6;
				for(int i=1;i<=10;i++) {
					Thread.sleep(1000);  
					System.out.println(num*i);  
				}
			}
			catch(Exception e) {
			System.out.println(e);
		}

	}
	    public static void main(String[]args) {
	    	MutiplicationThread t=new multiplicationThread();
		t.start();
		
	}
		
	}