package br.com.etyllica.electronic.gate;

import java.awt.Color;

import br.com.etyllica.core.video.Grafico;
import br.com.etyllica.electronic.gate.io.Input;
import br.com.etyllica.electronic.gate.io.Output;

public class NOR extends Gate{

	public NOR(){
		
		this.inputs.put("A",new Input());
		this.inputs.put("B",new Input());
		
		this.outputs.put("C",new Output());
		
	}
	
	@Override
	public void process(){
		
		if(this.inputs.get("A").isPowered()||this.inputs.get("B").isPowered()){
			outputs.get("C").setPowered(false);
		}else{
			outputs.get("C").setPowered(true);
		}
		
	}

	@Override
	public void draw(Grafico g) {
		g.setColor(Color.BLACK);
		//Draw Upper Arc
		g.drawArc(x-27, y, 55, 20, 0, 90);
		//Draw Down Arc
		g.drawArc(x-27, y, 55, 20, 270, 90);
		//Draw Back Arc
		g.drawArc(x-46, y-12, 50, 45, 336, 50);
		
		//Draw Inversor
		g.drawCircle(x+31, y+10, 3);
		
		//Draw Input A
		g.drawLine(x-5, y+5, x+2, y+5);
		
		//Draw Input B
		g.drawLine(x-5, y+15, x+2, y+15);
		
		//Draw Output C
		g.drawLine(x+35, y+10, x+40, y+10);
	}
}
