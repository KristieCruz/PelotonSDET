DominoesK: 
Simulator of traditional Domino game (user vs computer developed in my freshman year of college)
This program simulates the game of Dominoes.
Objective of the game: To pair matching domino pieces.
 Winner: First person to have zero dominoes remaining.
 Rules:
 1. The first domino to be placed on the board is the highest tile and thus, this determines if either the Computer
    or the Player plays first.
 2. The first tile is placed (by either the Computer or the Player depending on who had the highest tile).
 3. The opposite player places a tile matching a tile already on the board.
 4. The turns continue until one of the player has zero dominoes remaining.
 5. The first player with zero dominoes is the winner. 
 Set-up:
 There are 28 dominoes in a set. 
 Each player is dealt 14 dominoes. 
 Description of Steps for Program: 
 I created ArrayLists for the set of Domino tiles, 
 the set of tiles the Player is dealt 
 and the set of tiles the Computer is dealt. 
 Every time they each have a turn, their ArrayList diminishes in size by 1. 
 I coded loops to create the set of dominoes and deal them. 
 The placement of the first tile is done by a search loop of all the dominoes. 
 Whoever puts down the first & highest domino, waits for their opponent to play a turn.
 Then, the game continues until there is a winner. 
