/**
 * 
 */
package tictactoe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zombie
 *
 */
public class Board {
	private char[] board; 
	private char[] line1;
	private char[] line2;
	private char[] line3;
	private char[] col1;
	private char[] col2;
	private char[] col3;
	private char[] diag1;
	private char[] diag2;
	private char[] winX = {'X','X','X'};
	private char[] winO = {'O','O','O'};
	private List<char[]> conditions = new ArrayList<char[]>();
	
	//Ordinal board constructor
	Board(){
		//initialization "board" array with spaces
		for (int i = 0; i < 9; i++){
			board[i]=' ';
		}
	}
	
	//Board constructor for debugging usage
	Board(char[] loadedBoard){
		if (loadedBoard.length != 9){
			for (int i = 0; i < 9; i++){
				board[i]=' ';
			}
			for (int i = 0; i < 9; i++){
				if((board[i]!=' ')||(board[i]!='X')||(board[i]!='O')){
					board[i]=' ';
				}
			}
		}
	}
	
	private void lookThrough(){
		//now fill the lines
		for(int i = 0; i < 3; i++){
			line1[i]=board[i];
		}
		for(int i = 0; i < 3; i++){
			line2[i+3]=board[i+3];
		}
		for(int i = 0; i < 3; i++){
			line3[i+3]=board[i+3];
		}
		
		//now fill the columns
		for(int i = 0; i < 9; ){
			col1[i]=board[i];
			i += 3;
		}
		for(int i = 1; i < 9; ){
			col2[i]=board[i];
			i += 3;
		}
		for(int i = 2; i < 9; ){
			col3[i]=board[i];
			i += 3;
		}
		
		//now fill the diagonals
		for(int i = 0; i < 9; ){
			diag1[i]=board[i];
			i += 4;
		}
		for(int i = 2; i < 3; ){
			diag2[i]=board[i];
			i += 2;
		}
	}
	
	
	private void rebuildCondArray(){
		conditions.clear();
		conditions.add(line1);
		conditions.add(line2);
		conditions.add(line3);
		conditions.add(col1);
		conditions.add(col2);
		conditions.add(col3);
		conditions.add(diag1);
		conditions.add(diag2);
	}
	
	
	
	private void whoWin(){
		
	}
	
	
	
	
	
	
}
