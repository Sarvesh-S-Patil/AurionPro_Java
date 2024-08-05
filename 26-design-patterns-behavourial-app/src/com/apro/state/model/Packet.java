package com.apro.state.model;

public class Packet {
	IPacketState packetState;
	
	
	public Packet(IPacketState packetState) {
		super();
		this.packetState = packetState;
	}

	public void nextState() {
		packetState.next(this);
	}
	
	public void previousState() {
		packetState.previous(this);
	}
	public void currentState() {
		packetState.current(this);
	}

}
