package com.shan.employee;

public class Remote {
	
	Television television = new Television();
	
	private final Command onCommand = () -> { television.onFunction();};
	
	private final Command offCommand = () -> { television.offFunction();};

	
	public void pressButton(String bName)
	{
		switch(bName)
		{
		case "ON" : onCommand.execute();
					break;
		case "OFF": offCommand.execute();
				    break;
		}
	}
}
