package br.com.etyllica.electronic.battery;

import java.awt.Color;

import br.com.etyllica.core.video.Grafico;

public class USBPower extends Battery {

	public USBPower(){
		volts = 5;
		amps = 500;
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
	}

	@Override
	public void draw(Grafico g) {
		
		//Draw Metal Part
		g.setColor(Color.GRAY);
		g.fillRect(x+5, y, 10, 2);
		g.setColor(Color.BLACK);
		g.drawRect(x+5, y, 10, 2);
		
		//Fill the Upper Part
		g.setColor(Color.ORANGE);
		g.fillRect(x, y+2, 20, 10);
		//Draw the Plus Signal
		g.setColor(Color.BLACK);
		g.drawLine(x+10, y+5, x+10, y+10);
		g.drawLine(x+7, y+7, x+13, y+7);
		
		//Fill the Down Part		
		g.fillRect(x, y+12, 20, 30-2);
		
		//Draw Contours
		g.drawRect(x, y+2, 20, 40-2);
		
		//Draw the Minus Signal
		g.setColor(Color.WHITE);
		g.drawLine(x+7, y+35, x+13, y+35);
	}
	
}
