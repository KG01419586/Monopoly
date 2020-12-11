package Mono;

import Mono.GUI.Startup;

public class control {
	private elements gui;
	
	public control() 
	{
		gui= new Startup();
	}
	
	public void startGUI() 
	{
		gui.createGUI();
	}

}
