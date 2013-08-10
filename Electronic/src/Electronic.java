import br.com.etyllica.Etyllica;
import br.com.etyllica.electronic.BasicCircuit;


public class Electronic extends Etyllica{

	public Electronic() {
		super(800, 600);
	}

	@Override
	public void startGame() {
		setMainApplication(new BasicCircuit(w, h));
	}

}
