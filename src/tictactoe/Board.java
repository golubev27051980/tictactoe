/**
 * 
 */
package tictactoe;

import java.util.ArrayList;
import java.util.Iterator;
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
	private char[] halfX1 = {' ','X','X'};
	private char[] halfX2 = {'X',' ','X'};
	private char[] halfX3 = {'X','X',' '};
	private char[] halfO1 = {' ','O','O'};
	private char[] halfO2 = {'O',' ','O'};
	private char[] halfO3 = {'O','O',' '};
	private List<char[]> conditions = new ArrayList<char[]>();
	
	//Ordinal board constructor
	Board(){
		//initialization "board" array with spaces
		for (int i = 0; i < 9; i++){
			board[i]=' ';
		}
		passThrough();
	}
	
	//Board constructor for debugging usage
	Board(char[] loadedBoard){
		// if board length is wrong
		if (loadedBoard.length != 9){
			for (int i = 0; i < 9; i++){
				board[i]=' ';
			}
			//if board filled with wrong characters
			for (int i = 0; i < 9; i++){
				if((board[i]!=' ')||(board[i]!='X')||(board[i]!='O')){
					board[i]=' ';
				}
			}
		}
		passThrough();
	}
	
	/**
	 * This command pass through all 
	 * 
	 */
	private void passThrough(){
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
	
	
	private void putSymbol(char symbol, int position){
		if ((symbol!='X')||(symbol!='O')){
			reqSymbol();
		}
		if ((position < 0)||(position>8)){
			reqPosition();
		}
		board[position] = symbol;
		passThrough();
		rebuildCondArray();
		whoWin();
		halfWay();
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
	
	private void halfWay(){
		Iterator<char[]> it = conditions.iterator();
		int step = 0;
		while(it.hasNext()){
			char[] line = (char[]) it.next();
			if (line.equals(halfX1)){
				putX(step);
			}
			if (line.equals(halfX2)){
				putX(step);
			}
			if (line.equals(halfX3)){
				putX(step);;
			}
			if (line.equals(halfO1)){
				putX(step);;
			}
			if (line.equals(halfO2)){
				putX(step);;
			}
			if (line.equals(halfO3)){
				putX(step);;
			}
			step++;
		}
	}
	
	
	private void putX(int step){
		switch(step){
		case(1):
			
		case(2):
			
		case(3):
			
		case(4):
			
		case(5):
			
		case(6):
			
		case(7):
			
		case(8):	
			
		}
	}
	
	
	private void whoWin(){
		Iterator<char[]> it = conditions.iterator();
		while(it.hasNext()){
			char[] line = (char[]) it.next();
			if (line.equals(winO)){
				winOEnd();
			}
			if (line.equals(winX)){
				winXEnd();
			}
		}
	}
	
	private void winXEnd(){
		
	}
	
	private void winOEnd(){
		
	}
	
	
}
