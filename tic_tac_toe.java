package ticTacToe;
import java.util.Scanner;
public class tic_tac_toe {
	Scanner s = new Scanner(System.in);
	private player p1,p2;
	private board board;
	public void start_game() {
			player p1 = TakeInput(1);
			player p2 = TakeInput(2);
			while(p1.getSymbol()==p2.getSymbol()) {
			System.out.println("Symbol already taken!! Try again!!");
			System.out.println("enter symbol for player 2");
			p2.setSymbol(s.next().charAt(0));
		}
			board = new board(p1.getSymbol(),p2.getSymbol());
			
			int status = board.INCOMPLETE;
			boolean p1_turn = true;
			while(status == board.INCOMPLETE || status == board.INVALID) {
				if(p1_turn) {
				System.out.println("player 1 : " + p1.getname() + "'s chance");
				System.out.println("enter x:");
				int x = s.nextInt();
				System.out.println("enter y:");
				int y = s.nextInt();
				status = board.playMove(p1.getSymbol(),x,y);
				if(status!= board.INVALID) {
					p1_turn=false;
					board.print();
				}
				else {
					System.out.println("Invalid move..Try again!!");
				}
				}
				else {
						System.out.println("player 2 :" + p2.getname()+ "'s chance");
						System.out.println("enter x:");
						int x = s.nextInt();
						System.out.println("enter y:");
						int y = s.nextInt();
						status = board.playMove(p2.getSymbol(),x,y);
						if(status!= board.INVALID) {
							p1_turn=true;
							board.print();
						}
						else {
							System.out.println("Invalid move..Try again!!");
						}
			}
			}
			if(status==board.PLAYER_1_WINS) {
				System.out.println("player 1: "+ p1.getname() + " wins!!" );
			}
			if(status==board.PLAYER_2_WINS) {
				System.out.println("player 2: "+ p2.getname() + " wins!!" );
			}
			if(status==board.DRAW) {
				System.out.println("game draw" );
			}
			
	}
	private player TakeInput(int num) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name of" + num + "player");
		String name = s.nextLine();
		System.out.println("enter symbol for player" + num);
		char symbol = s.next().charAt(0);
		return new player(name , symbol);
	}
	public static void main(String[] args) {
		tic_tac_toe t = new tic_tac_toe();
		t.start_game();
		
	}

}
