package ping_pong_game;

import java.awt.*;
import java.util.*;

public class Ball  extends Rectangle{
    Random random;
	int xVelocity;
	int yVelocity;
	int initialSpeed = 2;
	
//represent a ball object in a game
	Ball(int x, int y, int width, int height){
		super(x,y,width,height);
		random = new Random();
		int randomXDirection = random.nextInt(2);
		if(randomXDirection == 0)
			randomXDirection--;
		setXDirection(randomXDirection*initialSpeed);
		
		int randomYDirection = random.nextInt(2);
		if(randomYDirection == 0)
			randomYDirection--;
		setYDirection(randomYDirection*initialSpeed);
		
	}
	
//set the X direction of the ball
	public void setXDirection(int randomXDirection) {
		xVelocity = randomXDirection;
	}

//set the Y direction of the ball
	public void setYDirection(int randomYDirection) {
		yVelocity = randomYDirection;
	}

//move the ball in the game
	public void move() {
		x += xVelocity;
		y += yVelocity;
	}

//draw the ball is white
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x, y, height, width);
	}
}
