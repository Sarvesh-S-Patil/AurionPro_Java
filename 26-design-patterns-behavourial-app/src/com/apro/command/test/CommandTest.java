package com.apro.command.test;

import com.apro.command.model.Device;
import com.apro.command.model.Radio;
import com.apro.command.model.Remote;
import com.apro.command.model.TV;
import com.apro.command.model.TurnOffCommand;
import com.apro.command.model.TurnOnCommand;

public class CommandTest {
	
	public static void main(String[] args) {
		Device tv = new TV();
		TurnOnCommand tvTurnOn = new TurnOnCommand(tv);
		TurnOffCommand tvTurnOff = new TurnOffCommand(tv);
		
		Device radio = new Radio();
		TurnOnCommand radioTurnOn = new TurnOnCommand(radio);
		TurnOffCommand radioTurnOff = new TurnOffCommand(radio);
		
		Remote remote = new Remote();
		remote.setCommand(tvTurnOn);
		remote.execute();
		remote.setCommand(tvTurnOff);
		remote.execute();
		
		remote.setCommand(radioTurnOn);
		remote.execute();
		remote.setCommand(radioTurnOff);
		remote.execute();
		
	}

}
