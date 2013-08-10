package br.com.etyllica.electronic.gate;

import java.awt.Color;

import br.com.etyllica.core.video.Grafico;
import br.com.etyllica.electronic.gate.io.Input;
import br.com.etyllica.electronic.gate.io.Output;

public class NAND extends Gate{

	public NAND(){

		this.inputs.put("A",new Input());
		this.inputs.put("B",new Input());

		this.outputs.put("C",new Output());

	}

	@Override
	public void process(){

		if(this.inputs.get("A").isPowered()&&this.inputs.get("B").isPowered()){
			outputs.get("C").setPowered(false);
		}else{
			outputs.get("C").setPowered(true);
		}

	}

	@Override
	public void draw(Grafico g) {
		g.setColor(Color.BLACK);
		
		g.drawLine(x, y, x+20, y);
		g.drawLine(x, y, x, y+20);
		g.drawLine(x, y+20, x+20, y+20);

		g.drawArc(x+10, y, 20, 20, 270, 180);
		//Draw Inversor
		g.drawCircle(x+33, y+10, 3);

		//Draw Input A
		g.drawLine(x-5, y+5, x, y+5);

		//Draw Input B
		g.drawLine(x-5, y+15, x, y+15);
		
		//Draw Output C
		g.drawLine(x+36, y+10, x+41, y+10);
	}
}
