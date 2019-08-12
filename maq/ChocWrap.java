package maq;

public class ChocWrap {

	public static void main(String[] args) {
		
		int money = 20;
		int price = 3;
		int w = 5;
		
		int count = money/price;
		int wrap = count;
		
		while(wrap>=w) {
			count += wrap/w;
			wrap = wrap/w + wrap%w;
		}
		
		System.out.println(count);

	}

}
