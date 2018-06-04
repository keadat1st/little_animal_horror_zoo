# Module 1 Mandatory assignment: Little Animal Horror Zoo

## Exercise solution: Little Animal Horror Zoo 
* java files
  * [Game.java](Game.java)
  * [Rabbit.java](Rabbit.java) 
  * [Snake.java](Snake.java)
* class diagram
  * [Class Diagram](class_diagram_horror_zoo_game.png)

# Exercise Description
## Exercise: Little Animal Horror Zoo

Imagine that you are designing a computer game. The game is text based, 
meaning that no graphics are involved, so only a text story printed in the console.

The game is at the moment not able to take any instructions from the person who 
plays the game (you), but it can only do what you will code it to do. You can think of it 
as a “Demo” game that shows how it could be played, but in fact are not playable yet.

The game consists of 2 animals: a _Rabbit_ and a _Snake_.
It also consists of coordinate system with an x and y axis, 10 on each axis. 
So the animals can be located by the number they are on.    
In this text based game you can not see where the animal are at a given time, 
but instead they should “tell” their position to the console, every time they have moved, like this: 

_“I am the nice rabbit, i am now standing on square 1, 3”_   
_“I am the evil snake, i am now standing on the square 3, 10”_

So both the rabbit and the snake should be able to **_move( )_**, 
and they should both be able to **_tellPosition( )_**.   
The _Snake_ should be able to **_kill( )_** the _Rabbit_ if they are on the same coordinates, and when  this is done it should say:    

_"Ahhrrrrrr im eating you ha ha!"_    

The _Rabbit_ should be able to **_beeg( )_** for its life, just before it is killed, (maybe if the _Snake_ is 
on a neighboring square), and when  this is done it should say:    

_"Nooooo Please don´t eat me!!"_

You here have some requirements.
We skipped the Use case Diagram, the Use Cases and the System Sequence Diagrams for now, but a 
Domain Model for this game could look like this:

## Domain Model

![Domain Model](https://github.com/dat16j/little_animal_horror_zoo/raw/master/DomainModel.png)


You should do this in groups 2-3 persons, and you should upload your class diagram, and your 
java files (all in a zip file) on fronter, before next class on monday.




<address style:"text-align: right">© KEA, clbo 21-09-2016</address>
