package com.apro.state.model;

public class Ordered implements IPacketState {

	@Override
	public void next(Packet packet) {
		packet.packetState=new Shipped();
		System.out.println("Packet is moved to Shipped");
	}

	@Override
	public void previous(Packet packet) {
		System.out.println("The status of packet is moved to previous Ordered");
		
	}

	@Override
	public void current(Packet packet) {
		System.out.println("Current state of packet is ordered");
		
	}

}
