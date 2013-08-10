package br.com.etyllica.electronic.gate.io;

public class IO {
	
	protected boolean powered = false;
	
	public IO(){
		super();
	}

	public boolean isPowered() {
		return powered;
	}

	public void setPowered(boolean powered) {
		this.powered = powered;
	}
	
}
