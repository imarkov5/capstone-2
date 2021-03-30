<h1>The Problem Solving Framework : 'UPER'</h1>
Saving to the new branch
* U = "Understand"
* P = "Plan"
* E = "Execute"
* R = "Reflect" / "Refactor"

<h2>1. Understanding the Problem</h2>
* I'm going to make a Hangman, 2D terminal game.
* A player will be given a random word and, a description to guess. 
* A player can make 6 mistakes.
* After each mistake, a part of the hangman will be drawn. Game is over when all 6 mistakes spent and a hangman is fully drawn
* 
*
*
*
<h2>
    2. Planning the Solution
</h2>
* I created a draftForUml file where I created the first draft of the hangman game.
* There will be an interface Game with methods that Board will implement.
* Enum class Word that will have words with descriptions
* Class HangmanDrawing is going to be responsible to draw a hangman
* Implement functionality of the game
* Implement scoring with serializing
* Implement different colors
* Implement threading
* Refactor to abide Object Oriented Design and Principles
<h2>
    3. Executing the Plan
</h2>
*Started with TDD, wrote basic tests for drawing hangman, getting a word, changing a word to char array, hiding a word
*Created Enum class word
*Created Game interface, HangmanSketch, Board classes and HangmanApp with main method
*Implemented basic functionality in Board class. Need to refactor later.
*Created Player class with highest score and score history fields
*Implemented a function that will restart or quit the game depending on user input
*Created ScoreRepository and ScoreWriter, implemented saving average score data to external file with Serializable interface.
*Created Enum classes for fonts and colors, worked on UI
<h2>
    4. Reflection / Refactor
</h2>
*
*
*
*
*
*
*
*