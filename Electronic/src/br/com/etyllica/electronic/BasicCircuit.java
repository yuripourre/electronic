package br.com.etyllica.electronic;

import java.awt.Color;

import br.com.etyllica.core.application.Application;
import br.com.etyllica.core.event.GUIEvent;
import br.com.etyllica.core.event.KeyboardEvent;
import br.com.etyllica.core.event.PointerEvent;
import br.com.etyllica.core.video.Grafico;
import br.com.etyllica.electronic.battery.Battery;
import br.com.etyllica.electronic.battery.USBPower;
import br.com.etyllica.electronic.gate.AND;
import br.com.etyllica.electronic.gate.Gate;
import br.com.etyllica.electronic.gate.NAND;
import br.com.etyllica.electronic.gate.NOR;
import br.com.etyllica.electronic.gate.OR;
import br.com.etyllica.electronic.gate.XOR;

public class BasicCircuit extends Application{

	public Battery bateria = new USBPower();
	public Gate and1 = new AND();
	public Gate nand1 = new NAND();
	
	public Gate or1 = new OR();
	public Gate nor1 = new NOR();
	public Gate xor1 = new XOR();
	
	public BasicCircuit(int w, int h){
		super(w,h);
	}
	
	@Override
	public void update(GUIEvent event) {
		//return GUIEvent.NONE;
	}

	@Override
	public void load() {
		
		bateria.setX(20);
		bateria.setY(20);
		
		and1.setX(70);
		and1.setY(25);
		
		nand1.setX(70);
		nand1.setY(50);
		
		or1.setX(70);
		or1.setY(75);
		
		nor1.setX(70);
		nor1.setY(100);
		
		xor1.setX(70);
		xor1.setY(125);
		
		loading = 100;
	}

	@Override
	public void draw(Grafico g) {
		
		//g.setColor(Color.WHITE);
		//g.fillRect(0, 0, largura, altura);
		
		bateria.draw(g);
		and1.draw(g);
		nand1.draw(g);
		
		or1.draw(g);
		nor1.draw(g);
		xor1.draw(g);
	}

	@Override
	public GUIEvent updateKeyboard(KeyboardEvent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GUIEvent updateMouse(PointerEvent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
