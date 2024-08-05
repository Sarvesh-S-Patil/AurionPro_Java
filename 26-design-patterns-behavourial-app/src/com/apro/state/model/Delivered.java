package com.apro.state.model;

public class Delivered implements IPacketState{

	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet is moved to next delivered");
		
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		packet.packetState=new Shipped();
		System.out.println("Packet is moved to delivered");
		
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet is in delivered state");
		
	}

}
