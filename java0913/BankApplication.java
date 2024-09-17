package java0913;

public class BankApplication {

	Account[] accs;
	private int last = 0;
	
	public BankApplication() {
		this.accs = new Account[100];
	}
	
	public Account getAccAt(int index) {
		return accs[index];
	}
	
	public void addAcc(Account acc) {
		this.accs[last] = acc;
		last++;
	}
	
	public int getLength() {
		return last;
	}
	
	public void inputMoney(String accNum, int money) {
		int index = checkAcc(accNum);
		if (index == -1) {
			System.out.println("계좌가 존재하지 않습니다.");
		}
		
		accs[index].addMoney(money);
		
		System.out.println("입금되었습니다.");
	}

	public void outputMoney(String accNum, int money) {
		int index = checkAcc(accNum);
		if (index == -1) {
			System.out.println("계좌가 존재하지 않습니다.");
		}
		
		accs[index].popMoney(money);
		
		System.out.println("출금되었습니다.");
	}
	
	private int checkAcc(String accNum) {
		for (int i = 0; i < last; i++) {
			if (accs[i].getAccNum().equals(accNum)) {
				return i;
			}
		}
	
		return -1;
	}
	
	public void showAcc(int i) {
		System.out.printf("%s %s %d\n", accs[i].getAccNum(), accs[i].getName(), accs[i].getAccTot());
	}
}
