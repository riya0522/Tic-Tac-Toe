package ticTacToe;

public class board {
	private char board[][];
private int board_size=3;
private int count;
private char p1symbol , p2symbol;
public final static int PLAYER_1_WINS =1;
public final static int PLAYER_2_WINS =2;
public final static int DRAW =3;
public final static int INCOMPLETE =4;
public final static int INVALID =5;

public board(char p1symbol , char p2symbol) {
	board = new char[board_size][board_size];
	for(int i =0 ; i <board_size ; ++i) {
		for(int j =0 ; j<board_size ; ++j) {
			board[i][j] = ' ';
		}
	}
	this.p1symbol=p1symbol;
	this.p2symbol=p2symbol;
}
public int playMove(char Symbol , int x , int y) {
	if(x<0 || x>=board_size || y<0 || y>=board_size || board[x][y] !=' ') {
		return INVALID;
	}
	board[x][y] = Symbol;
	count++;
	if(board[x][0] == board[x][1]&& board[x][1] ==board[x][2]) {
		return Symbol== p1symbol? PLAYER_1_WINS: PLAYER_2_WINS;
	}
	if(board[0][y] == board[1][y]&& board[1][y] ==board[2][y]) {
		return Symbol== p1symbol? PLAYER_1_WINS: PLAYER_2_WINS;
	}
	if(board[0][0] !=' '&& board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
		return Symbol== p1symbol? PLAYER_1_WINS: PLAYER_2_WINS;	
	}
	if(board[2][0] !=' '&& board[2][0] == board[1][1] && board[2][0] == board[0][2]) {
		return Symbol== p1symbol? PLAYER_1_WINS: PLAYER_2_WINS;	
	}
	if(count==board_size*board_size) {
		return DRAW;
	}
	return INCOMPLETE;
	
}
public void print() {
	System.out.println("------------------------------------");
	for(int i =0 ; i <board_size ; ++i) {
		for(int j =0 ; j<board_size ; ++j) {
			System.out.print("| " +board[i][j] + " |");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("------------------------------------");
}
}
