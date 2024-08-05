package com.apro.command.model;

public class TurnOnCommand implements Command {
	
	Device device;
	

	public TurnOnCommand(Device device) {
		super();
		this.device = device;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		device.turnOn();
		
	}

}
