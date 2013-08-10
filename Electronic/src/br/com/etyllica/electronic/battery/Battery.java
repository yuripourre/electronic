package br.com.etyllica.electronic.battery;

import br.com.etyllica.electronic.gate.Gate;

public abstract class Battery extends Gate{

	protected double volts = 5;
	protected double amps = 5;
	
	protected boolean power = true;
	
	public Battery() {
		super();
	}
	
}
