# Java-ping-pong-game-project

- [Description](#Description)
- [Technology](#Technology)

## Description

The "Ping Pong Ball Java Project" is a simple Java-based implementation of the classic Ping Pong game. The project utilizes Java's Swing library to create a graphical user interface for the game. Players control paddles on either side of the screen to bounce a ball back and forth. The goal is to prevent the ball from crossing their side of the screen while attempting to make the ball pass the opponent's paddle to score points.

## Technology

Project is built with:

  * Java version 17.0.2
  * Visual Studio Code Version: 1.76.0

## Project Concepts

 * #Java Swing#: The graphical user interface (GUI) components and window management are handled using Java Swing.
 * Threads: The game loop is run in a separate thread using the Runnable interface and Thread class to ensure smooth and responsive gameplay.
 * Graphics: Graphics objects are used to draw the game elements (paddles, ball, scores, centerline) on the game panel.
 * Keyboard Input: The game captures keyboard input using the KeyListener interface to control the paddles.
 * Randomization: The Random class is used to initialize the ball's direction randomly at the start of the game.
 * Collision Detection: The game uses collision detection algorithms to determine if the ball collides with the paddles or window edges.
