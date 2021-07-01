package Receipt;

import java.util.ArrayList;

public class ReceiptMain {
	public static void main(String[] args) {

		ArrayList<OrderArr> orderData = new ArrayList<OrderArr>();
		Orderinput input = new Orderinput();
		OrderOutput output = new OrderOutput();

		do {
			OrderArr item = new OrderArr(0, 0, 0, null, null);
			input.inputOrder(item, orderData);
			input.inputAdd();
		} while(input.addOrder == 1);
		
		output.outputBill(orderData);
	}
	
}

