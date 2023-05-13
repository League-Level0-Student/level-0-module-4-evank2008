package _99_extra.pong;

import javax.swing.JOptionPane;
import java.util.Random;
import processing.core.PApplet;

public class Pong extends PApplet {
    static final int WIDTH = 1600;
    static final int HEIGHT = 1000;
    Random velIncrease = new Random();
    int xSpeed = 8;
    int ballX = 390;
    int ballY = 290;
   	int ySpeed = -4;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    background(0,0,0);
   	fill(255,255,255);
    //controlling the ball
   		ellipse(ballX, ballY, 20, 20);
    	ballX+=xSpeed;
    	ballY+=ySpeed;
    	if(ballX > width ||ballX < 0){
    	    xSpeed = -xSpeed;
    	}
    	if(ballY < 0){
    	    ySpeed = -ySpeed;
    	}
    	if(ballY>height) {
    		JOptionPane.showMessageDialog(null, "You failed");
    		ballX = 390;
    		ballY = 290;
    		ySpeed = -4;
    	}
    //platform
    	    fill(255,255,255);
    	    rect(mouseX-100,900,200,30);
    	
    	    if(ballY>880 && ballY<910){
    	    	if(ballX-mouseX<100 && mouseX-ballX<100) {
    	    		ySpeed=-ySpeed;
    	    	}
    	    }
    	    
    	    
    	    
    	    
    	    }
    		

    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
}