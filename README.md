
Introduction
-----------
Desktop application that implements the famous game tic-tac-toe. JavaFX is used for the GUI and search algorithm is used to find the optimum move for the computer. You can play against a friend over local network or on the same machine or you can play against the computer.

How To Build
--------------
This project is built with Netbeans, use it to open, build and run the project.

How To Play
-----------
The first thing you see when you open the game is the main menu.

* One Vs Computer:
	- Play Against the computer, the AI we used is Alpha Beta Pruning, to find the best move.
* One Vs One:
	- Play against Another player on the same machine.
* One Vs One Online:
	You use this when you want to play over LAN. it gives the user the choice to host or join.
	- Host: The app shows the the ip and port the app is listening to
          for the app to detect the correct ip, You need to disable all the network intefaces expect the one that is working.
          otherwise you need to find the ip yourself.
	- Join: this is used to play agianst the player who is hosting.
