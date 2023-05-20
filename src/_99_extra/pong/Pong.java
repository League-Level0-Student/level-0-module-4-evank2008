package _99_extra.pong;

import javax.swing.JOptionPane;
import java.util.Random;
import processing.core.PApplet;

public class Pong extends PApplet {
    static final int WIDTH = 1600;
    static final int HEIGHT = 1000;
    int xSpeed = 8;
    int ballX = 390;
    int ballY = 290;
   	int ySpeed = -4;
   	int balls = 3;
   	int frame = 0;
   	int platformX = 800;
   	int score = 0;
   	int score1 = 0;
   	int score2 = 0;
   	int score3 = 0;
   	int highScore = 0;
   	int platformSpeed=25;
   	boolean gameState = true;
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

       	//showing lives
       	textSize(24);
       	text("BALLS",1497,50);
       	switch(balls) {
       	case 0:
       		gameState=false;
       		break;
       	case 1:
       		fill(200,200,200);
       		ellipse(1560,90,20,20);
       		break;
       	case 2:
       		fill(200,200,200);
       		ellipse(1560,90,20,20);
       		ellipse(1530,90,20,20);
       		break;
       	case 3:
       		fill(200,200,200);
       		ellipse(1560,90,20,20);
       		ellipse(1530,90,20,20);
       		ellipse(1500,90,20,20);
       		break;
       	}
       	//showing score
       	text("SCORE",20,50);
       	text(score,50,90);
       	//ending screen text
    		if(gameState == false) {
    			fill(255,255,255);
    			background(0,0,0);
    			textSize(40);
	    		
    			text("GAME OVER",690,450);
    			textSize(30);
        		text("High Score: "+highScore,705,500);
			
        		textSize(20);
        		text("Press any key to restart",700,550);
    			
    				if(keyPressed) {
    					restart();
    				}
    			
    				}
    		
    		
    		if(gameState == true) {
   	
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
    	//when you miss the ball
    	if(ballY>height) {
    		
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		balls-=1;
    		ballX = 390;
    		ballY = 290;
    		ySpeed = -4;
    		switch(balls) {
    		case 0:
    			score3 = score;
    			if(score1 > score2 && score1 > score3)
    	        {
    	            highScore = score1;
    	        }
    	        else if(score2 > score3)
    	        {
    	            highScore = score2;
    	        }
    	        else
    	        {
    	           highScore = score3;
    	        }
    			break;
    		case 1: 
    			score2 = score;
    			break;
    		case 2: score1 = score;
    		}
    		score = 0;
    	}
    //platform
    	    fill(255,255,255);
    	    rect(platformX-100,900,200,30);
    	//when the ball hit
    	    if(ballY>880 && ballY<910){
    	    	if(ballX-platformX<100 && platformX-ballX<100) {
    	    		ySpeed=-ySpeed-1;
    	    		xSpeed-=1;
    	    		score+=1;
    	    		platformSpeed+=2;
    	    		
    	    	}
    	    }
    	  
    		
    		}
    
    	    }
    		
public void keyPressed() {

	if(keyCode==LEFT) {
		platformX-=platformSpeed;
	}
	if(keyCode==RIGHT) {
		platformX+=platformSpeed;
	}
	if(platformX<0) {
		platformX=0;
	}
	if(platformX>1400) {
		platformX=1400;
	}
}
public void restart() {
	 xSpeed = 8;
     ballX = 390;
     ballY = 290;
   	 ySpeed = -4;
   	 balls = 3;
   	 frame = 0;
   	 platformX = 800;
   	 score = 0;
   	 score1 = 0;
   	 score2 = 0;
   	 score3 = 0;
   	 highScore = 0;
   	 platformSpeed=25;
   	 gameState = true;
}
static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
}