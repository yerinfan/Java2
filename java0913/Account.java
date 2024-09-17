package java0913;

public class Account {
	
	private String accNum;
	private String name;
	private int accTot;
	
	public Account(String accNum, String name, int accTot) {
		this.accNum = accNum;
		this.name = name;
		this.accTot = accTot;
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccTot() {
		return accTot;
	}

	public void setAccTot(int accTot) {
		this.accTot = accTot;
	}
	
	public void addMoney(int cost) {
		this.accTot += cost;
	}
	
	public void popMoney(int cost) {
		this.accTot -= cost;
	}
	
}
