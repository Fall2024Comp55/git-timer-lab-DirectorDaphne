import acm.graphics.*;
import acm.program.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFirstTimer extends GraphicsProgram {
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	private GLabel myLabel;
	private int numTimes;
	
	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void actionPerformed(ActionEvent e) {
		myLabel.move(5, 0);
	}
	
	public void run() {
		numTimes = 0;
		Timer t = new Timer(1000, this);
		if(numTimes == 10) {
			t.stop();
		}
		t.setInitialDelay(10);
		myLabel = new GLabel("times called?" + numTimes);
		add(myLabel);
		t.start();
	}
	
	public static void main(String[] args) {
		new MyFirstTimer().start();
	}
}