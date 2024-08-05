package com.apro.command.model;

public class TurnOffCommand implements Command{
	Device device;
	

	public TurnOffCommand(Device device) {
		this.device = device;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		device.turnOff();
		
	}

}
