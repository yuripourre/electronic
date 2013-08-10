package br.com.etyllica.electronic.gate;

import java.util.HashMap;
import java.util.Map;

import br.com.etyllica.electronic.gate.io.Input;
import br.com.etyllica.electronic.gate.io.Output;
import br.com.etyllica.layer.Layer;

public abstract class Gate extends Layer{

	Map<String,Input> inputs = new HashMap<String,Input>();
	Map<String,Output> outputs = new HashMap<String,Output>();
	
	public abstract void process();
	
}
