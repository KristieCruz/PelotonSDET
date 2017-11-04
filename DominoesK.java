/* This program simulates the game of Dominoes.
 * Objective of the game: To pair matching domino pieces.
 * Winner: First person to have zero dominoes remaining.
 * 
 * Rules:
 * 1. The first domino to be placed on the board is the highest tile and thus, this determines if either the Computer
 *    or the Player plays first.
 * 2. The first tile is placed (by either the Computer or the Player depending on who had the highest tile).
 * 3. The opposite player places a tile matching a tile already on the board.
 * 4. The turns continue until one of the player has zero dominoes remaining.
 * 5. The first player with zero dominoes is the winner. 
 * 
 * Set-up:
 * There are 28 dominoes in a set. 
 * Each player is dealt 14 dominoes. 
 * 
 * Description of Steps for Program: 
 * I created ArrayLists for the set of Domino tiles, 
 * the set of tiles the Player is dealt 
 * and the set of tiles the Computer is dealt. 
 * Every time they each have a turn, their ArrayList diminishes in size by 1. 
 * I coded loops to create the set of dominoes and deal them. 
 * The placement of the first tile is done by a search loop of all the dominoes. 
 * Whoever puts down the first & highest domino, waits for their opponent to play a turn.
 * Then, the game continues until there is a winer. 
 */

import javax.swing.*;
import javax.swing.JOptionPane;//To ask how many user's name
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.awt.Point;  //for point method 



public class DominoesK
{
 
  private static ArrayList<Point> Domino= new ArrayList<Point>();
  private static ArrayList<Point> PlayerHand = new ArrayList<Point>();
  private static ArrayList<Point> ComputerHand = new ArrayList<Point>();
  
  public static void main (String []args)
  {
    DominoesA dominoes = new DominoesA(); 
    //Point [] Domino= new Point [28];

    
  //String userName;
  
   //Get the name of player in the game
  //userName = JOptionPane.showInputDialog("Hello Player,\nWhat is your name?");
    
    //Display username  
  //  JOptionPane.showMessageDialog(null, "Welcome, " + userName +"." +  "\nGood luck!");
   
    //int tracker= 0;
 
  }
  
  public static class JDominoButton extends JButton {
    
    private Point _dominoValue;
    
    public JDominoButton(Point dominoValue) {
      _dominoValue = dominoValue;
      String dominoText = (int) dominoValue.getX() + " | " + (int) dominoValue.getY();
      setText(dominoText);
    }
    
    public JDominoButton() {}
    
    public Point getDominoValue() {
      return _dominoValue;
    }
    
    public void setDominoValue(Point dominoValue) {
      _dominoValue = dominoValue;
      String dominoText = (int) dominoValue.getX() + " | " + (int) dominoValue.getY();
      setText(dominoText);
    }
    
  }
  
  public static void DealingHands()
  {
    //Create a Random class object
    Random tileGenerator = new Random();
    
    //Distribute 14 tiles to each player: the player and the computer. 
    for (int i= 0; i <14; i ++)
    {
      int k= tileGenerator.nextInt(27-i);
      PlayerHand.add(Domino.get(k));  
      Domino.remove(k);
    }
    for (int j=0; j<14; j++)
    {
      ComputerHand.add(Domino.get(j));
    }
    
    /*
    
    //Placement of first domino
    Point playerHighest = new Point (0,0);
    Point computerHighest = new Point (0,0);
    int playerInd = 0;
    int compInd = 0;
    for (int i = 0; i < 14; i++)
    {
      if ((playerHighest.x <= PlayerHand.get(i).x && playerHighest.y <= PlayerHand.get(i).y) || (playerHighest.x <= PlayerHand.get(i).y && playerHighest.y <= PlayerHand.get(i).x))
      { playerHighest = PlayerHand.get(i);
        playerInd = i;
      }
      if ((computerHighest.x <= ComputerHand.get(i).x && computerHighest.y <= ComputerHand.get(i).y) || (computerHighest.x <= ComputerHand.get(i).y && computerHighest.y <= ComputerHand.get(i).x))
      { computerHighest = ComputerHand.get(i);
        compInd = i;
      }
    }
    if ((computerHighest.x <= playerHighest.x && computerHighest.y <= playerHighest.y) || (computerHighest.x <= playerHighest.y && computerHighest.y <= playerHighest.x)) 
    { PlayerHand.remove(playerInd);
      return playerHighest;
    }
    
    ComputerHand.remove(compInd);
    return computerHighest;
    
    */
    //Two-Dimensional Array 
    // dominoes[][] = new tile[x][y];
    //Domino[1][5]  if (x==y, y==y, x==x)
    
  }
  
  public static void PlayerTurn()
  {
    if (TurnChecker())
    {
    JOptionPane.showMessageDialog(null, "Your turn. Choose a tile and a location for it." );
    //player choose tile, save to local;
    //player choose location, save to local;
    //test valid turn;
    //while (turn invalid)
    //{
    //ask to choose new tile and location;
    //test valid turn again;
    //}
    //place tile in location
    //remove tile from hand
    
    //arraylist diminishes by 1 each turn
    }
   // else
      //skip turn;
  }
  public static Point ComputerTurn()
  {
    JOptionPane.showMessageDialog(null, "Wait for Opponent's turn.");
    //cycle through tiles
        //cycle through locations
             //test valid turn
             //if valid
                 //place tile in loaction
                 //remove tile from hand
    //if gets to end of loop
      //skip turn
    return null;
  }
  
  private boolean Checker()//tile and location (add these parameters when Andy knows what to input here)
 {//let the player choose a tile and the checker will compare if x or y is equal to the piece is sticking out of the piece they want to place 
  //  return true;
 // 
  return true; 
  }
 private static boolean TurnChecker()
 {
   //cycles through all tiles and all locations
   //if it finds a valid location, return true
   //if reaches end of loops, return false
  return true;
  }
 
public static class DominoesA
{     
  JLabel jPlayer1Name = new JLabel("Player");
  
  JDominoButton[] jPlayer1Bones = new JDominoButton[14];
  
  JLabel jPlayer2Name = new JLabel("Opponent");
  
  JDominoButton[] jPlayer2Bones = new JDominoButton[14];  
  
  JDominoButton[] jBoardBones = new JDominoButton[28];
  
  JFrame window = new JFrame();
  
  int curBoardBoneIdx = 0;
  
  final int JBONE_WIDTH = 36;
  
  boolean isComputersTurn;
  
  public DominoesA() 
  {
    window.setSize(1024, 768);
    
    
    for (int x = 0; x< 7 ; x++)     
    {       
      for (int y= 0; y<7 ; y++)      
      {       
        if (x<=y)   
        {
          //Domino[tracker]= new Point (x,y);
          Domino.add(new Point (x,y)); 
          //tracker++;
        }
      }
    }
    
   
    DealingHands(); 
    
    /*
    //System.out.println(Domino);
    System.out.println(PlayerHand);
    System.out.println(ComputerHand);
    PlayerTurn();
    ComputerTurn();
    */
    
    
    initPlayer1();
    initPlayer2();
    
    initBoard();
    
    window.setLayout(null);
    window.setVisible(true);
    
    isComputersTurn = new Random().nextBoolean();
    updateTurnGUI();
    
    if (isComputersTurn) {
      makeComputerMove();
    }
  }
  
  public void updateTurnGUI() {
    int numPlayer1VisibleBones = 0, numComputerVisibleBones = 0;
    int numPlayer1ValidBones = 0, numComputerValidBones = 0;
 
    if (curBoardBoneIdx > 0) {
      JDominoButton jLastBoardBone = jBoardBones[curBoardBoneIdx - 1];
      for (int i = 0; i < jPlayer1Bones.length; i++) {
        JDominoButton jBone = jPlayer1Bones[i];
        if (jBone.isVisible()) {
          numPlayer1VisibleBones++;
          if (checkMove(jLastBoardBone.getDominoValue(), jBone.getDominoValue()) != null) {
            numPlayer1ValidBones++;
          }
        }
      }
      
      for (int i = 0; i < jPlayer2Bones.length; i++) {
        JDominoButton jBone = jPlayer2Bones[i];
        if (jBone.isVisible()) {
          numComputerVisibleBones++;
          if (checkMove(jLastBoardBone.getDominoValue(), jBone.getDominoValue()) != null) {
            numComputerValidBones++;
          }
        }
      }
    }
      
    if (curBoardBoneIdx > 0 && (numPlayer1VisibleBones == 0 || (numPlayer1ValidBones == 0 && numComputerValidBones == 0 && numPlayer1VisibleBones < numComputerVisibleBones))) {
      jPlayer1Name.setText("<html><b><font color='green'>Player WINS</font></b></html>");
      jPlayer2Name.setText("<html><b><font color='red'>Opponent LOSES</font></b></html>");
    } else if (curBoardBoneIdx > 0 && (numComputerVisibleBones == 0 || (numPlayer1ValidBones == 0 && numComputerValidBones == 0 && numPlayer1VisibleBones > numComputerVisibleBones))) {
      jPlayer1Name.setText("<html><b><font color='red'>Player LOSES</font></b></html>");
      jPlayer2Name.setText("<html><b><font color='green'>Opponent WINS</font></b></html>");
    } else if (curBoardBoneIdx > 0 && (numPlayer1ValidBones == 0 && numComputerValidBones == 0 && numPlayer1VisibleBones == numComputerVisibleBones)) {
      jPlayer1Name.setText("<html><b><font color='green'>Player TIES</font></b></html>");
      jPlayer2Name.setText("<html><b><font color='green'>Opponent TIES</font></b></html>");
    } else {
      if (isComputersTurn) {
        jPlayer1Name.setText("<html>Player</html>");
        jPlayer2Name.setText("<html><b>Opponent:</b> It's your turn</html>");
      } else {
        jPlayer1Name.setText("<html><b>Player:</b> It's your turn</html>");
        jPlayer2Name.setText("<html>Opponent</html>");
      }
    }
  }
  
  public void initBoard() 
  {
    for (int i = 0; i < jBoardBones.length; i++) 
    {
      jBoardBones[i] = new JDominoButton();
      jBoardBones[i].setBounds(0 + (i * (JBONE_WIDTH + 2)), 350, JBONE_WIDTH, 15);
      jBoardBones[i].setVisible(false);
      window.add(jBoardBones[i]);
    }
  }
  
  public void initPlayer1() 
  {
    jPlayer1Name.setBounds(0, 0, 300, 20);
    window.add(jPlayer1Name);
    
    for (int i = 0; i < jPlayer1Bones.length; i++) 
    {
      Point thisPoint = PlayerHand.get(i);
      //String thisBoneText = (int) thisPoint.getX() + " | " + (int) thisPoint.getY();
      jPlayer1Bones[i] = new JDominoButton(thisPoint);
      jPlayer1Bones[i].setBounds(0 + (i * (JBONE_WIDTH + 2)), 100, JBONE_WIDTH, 15);
      jPlayer1Bones[i].addMouseListener(new java.awt.event.MouseAdapter() 
      {
        public void mouseClicked(java.awt.event.MouseEvent evt) 
        {
          if (isComputersTurn)
            return;
          
          JDominoButton jBone = ((JDominoButton) evt.getSource());
          Point newBoardPoint = jBone.getDominoValue();
          if (curBoardBoneIdx > 0) {
            JDominoButton jLastBoardBone = jBoardBones[curBoardBoneIdx - 1];
            newBoardPoint = checkMove(jLastBoardBone.getDominoValue(), jBone.getDominoValue());
            if (newBoardPoint == null) {
              makeComputerMove();
              return;
            }
          }
          
          //jBoardBones[curBoardBoneIdx].setText(jBone.getText());
          jBoardBones[curBoardBoneIdx].setDominoValue(newBoardPoint);
          jBoardBones[curBoardBoneIdx].setVisible(true);
          jBone.setVisible(false);
          curBoardBoneIdx++;
          makeComputerMove();
        }
      });
      window.add(jPlayer1Bones[i]);
    }
  }
  
  public void initPlayer2() 
  {
    jPlayer2Name.setBounds(0, 500, 300, 20);
    window.add(jPlayer2Name);
    
    for (int i = 0; i < jPlayer2Bones.length; i++) 
    {
      Point thisPoint = ComputerHand.get(i);
      //String thisBoneText = (int) thisPoint.getX() + " | " + (int) thisPoint.getY();
      jPlayer2Bones[i] = new JDominoButton(thisPoint);
      jPlayer2Bones[i].setBounds(0 + (i * (JBONE_WIDTH + 2)), 600, JBONE_WIDTH, 15);
      /*
      jPlayer2Bones[i].addMouseListener(new java.awt.event.MouseAdapter() 
      {
        public void mouseClicked(java.awt.event.MouseEvent evt) 
        {
          JButton jBone = ((JButton) evt.getSource());
          jBoardBones[curBoardBoneIdx].setText(jBone.getText());
          jBoardBones[curBoardBoneIdx].setVisible(true);
          jBone.setVisible(false);
          curBoardBoneIdx++;
        }
      });
      */
      window.add(jPlayer2Bones[i]);
    }
  }
  
  public void makeComputerMove() {
    isComputersTurn = true;
    updateTurnGUI();
    
    // do actual move
    for (int i = 0; i < jPlayer2Bones.length; i++) 
    {
      if (jPlayer2Bones[i].isVisible()) {
        JDominoButton jBone = jPlayer2Bones[i];
        
        Point newBoardPoint = jBone.getDominoValue();
        if (curBoardBoneIdx > 0) {
          JDominoButton jLastBoardBone = jBoardBones[curBoardBoneIdx - 1];
          newBoardPoint = checkMove(jLastBoardBone.getDominoValue(), jBone.getDominoValue());
          if (newBoardPoint == null)
            continue;
        }
        
        //jBoardBones[curBoardBoneIdx].setText(jBone.getText());
        jBoardBones[curBoardBoneIdx].setDominoValue(newBoardPoint);
        jBoardBones[curBoardBoneIdx].setVisible(true);
        jBone.setVisible(false);
        curBoardBoneIdx++;
        break;
      }
    }
    
    
    //try {
    //  Thread.sleep(2000);
    //} catch (java.lang.InterruptedException e) {}
    
    isComputersTurn = false;
    updateTurnGUI();
  }
  
  public Point checkMove(Point curBone, Point nextBone) {
    
    if (curBone.getY() == nextBone.getX()) {
      return nextBone;
    } else if (curBone.getY() == nextBone.getY()) {
      return new Point((int) nextBone.getY(), (int) nextBone.getX());
    }
    return null;
    //(0, 1) (1, 2)
    
  }
}







}




