package corejava;

public class MulitipliactionThread extends Thread {
	public void run() {
		try 
		{
			int p=6 ,v;
			for(int i=1;i<=10;i++) {
				v=p*i;
				Thread.sleep(40);
				//System.out.println(n + " * " + i +  " = " + n * i);
				
				System.out.println(v);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String args[]) {
		MulitipliactionThread t=new MulitipliactionThread();
		t.start();
	}

}	


