package ping_pong_game;

import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame{
    GamePanel panel;
	
    //create a GameFrame to play the game
	GameFrame(){
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Ping Pong Ball Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
