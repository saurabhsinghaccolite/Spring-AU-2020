package com.SpringAU;

import java.util.Random;

public class Consumer implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		Random rand = new Random(); 
		int qt = rand.nextInt(9)+1;
		int fr = rand.nextInt(4);
		while(true)
		{
			synchronized (Market.list)
			{
				try {
				Thread.sleep(500);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				if(Market.list.get(fr).qty>0)
				{
					int min = Math.min(Market.list.get(fr).qty, qt);
					Market.list.get(fr).qty  =Market.list.get(fr).qty - min;
					System.out.println(Thread.currentThread().getName()+" bought "+ min+Market.list.get(fr).name);
				}
				
				Market.list.notifyAll();
				try
				{
					Market.list.wait();
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}

			}
			
			
			
		}
		
	}
	
}
