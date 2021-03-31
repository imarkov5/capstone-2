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
*Created Game class. 
*Worked on OOD:
*Player, Board, and HangmanSketch are Singleton OOD pattern classes to insure that only one instance of each class created.
*Implemented inheritance by extending Game class in Board class.
*Enum classes: Word, ColorFont, FunFont
*Implemented composition: Game has a Player, Words, HangmanSketch
*Implemented Single Responsibility: Player is responsible for keeping scores and score history; HangmanSketch class is responsible for drawing Hangman
*Single Responsibility cont.: Game is responsible for getting guesses, counting scores, printing tableau; Board is responsible for Welcome screen, instructions and starting game.
*Implemented Behavioral design pattern, Mediator: Game is a mediator, provides loose coupling by keeping Player, HangmanSketch, Board, Word from referring to each other explicitly.
*Implemented Observer design pattern (One-to-Many dependency) in Game where state of the Game object pushes and pulls new data to/from the other objects. When Game changes state, dependents do to, Player, HangmanSketch, ScoreRepo and ScoreWriter.
*Observer cont.: For Example: playGame in Game changes Average Score and adds to Score history in Player object; Also sets Hangman state of HangmanSketch.
*Observer cont.: Game methods change states of ScoreWriter and ScoreRepository objects, calling serializing and deserializing methods from those objects.
<h2>
    4. Reflection / Refactor
</h2>
*Next time I would implement GUI
*Draw custom hangman
*Implement 2 player option
*Also would take more time to study OOD and try to find better/cleaner organization.
*Different difficulty levels
*Option to choose a theme, Java, history, geography and so on.
*
*