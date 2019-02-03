package extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Numbers {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			Random r = new Random();
			int num = r.nextInt(51);
			if(i==4) {
				System.out.print(num);
			}else {
				System.out.print(num+"-");
			}
			JOptionPane.showMessageDialog(null, num);
		}
	}
	
}
