package com.SpringAU;

public class Producer implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
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
				for (int i = 0; i < Market.list.size(); i++)
				{
					if(Market.list.get(i).qty<Market.list.get(i).maxqty)
					{
						Market.list.get(i).qty = Market.list.get(i).maxqty;
						System.out.println(Thread.currentThread().getName()+" added "+Market.list.get(i).name);;
					}
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
