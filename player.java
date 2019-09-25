 package ticTacToe;

public class player {
	private String name;
	private char symbol;
	private int pcount;
	public player(String name , char symbol){
	 setName(name);
	 setSymbol(symbol);
 }
	public char getSymbol() {
		return symbol;
	}
 public String getname() {
	 return name;
 }
 public void setSymbol(char s) {
	 if(s!='\0')
	 this.symbol = s;
 }
 public void setName(String name) {
	 this.name= name;
 }
 public int getcount() {
	 return pcount;
 }
 public void setcount() {
	 pcount++;
 }
}
