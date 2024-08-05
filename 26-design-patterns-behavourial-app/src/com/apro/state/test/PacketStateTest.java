package com.apro.state.test;

import com.apro.state.model.Ordered;
import com.apro.state.model.Packet;

public class PacketStateTest {
	public static void main(String[] args) {
		Packet packet = new Packet(new Ordered());
		packet.nextState(); //shipped
		packet.currentState(); //shipped
		
		packet.previousState(); //ordered
		packet.currentState(); //ordered
		
		packet.nextState(); //shipped
		packet.nextState(); //delivered
		packet.nextState(); //next delivered
		packet.currentState(); //delivered
	}

}
