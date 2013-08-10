package br.com.etyllica.electronic.gate;

import java.awt.Color;

import br.com.etyllica.core.video.Grafico;
import br.com.etyllica.electronic.gate.io.Input;
import br.com.etyllica.electronic.gate.io.Output;

public class OR extends Gate{

	public OR(){
		
		this.inputs.put("A",new Input());
		this.inputs.put("B",new Input());
		
		this.outputs.put("C",new Output());
		
	}
	
	@Override
	public void process(){
		
		if(this.inputs.get("A").isPowered()||this.inputs.get("B").isPowered()){
			outputs.get("C").setPowered(true);
		}else{
			outputs.get("C").setPowered(false);
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
		
		//Draw Input A
		g.drawLine(x-5, y+5, x+2, y+5);
		
		//Draw Input B
		g.drawLine(x-5, y+15, x+2, y+15);
		
		//Draw Output C
		g.drawLine(x+29, y+10, x+34, y+10);
	}
}
