package Receipt;

import java.util.ArrayList;

public class OrderOutput {

	public void outputBill(ArrayList<OrderArr> orderData) {
		int discount = 0;
		int totalPrice = 0;
		
		System.out.println();
		System.out.println();
		System.out.println("\n\n              [������]              \n");
		System.out.println("������(������) / 123-45-67890 / ����");
		System.out.println("����Ư���� ������ ������� 20�� 20,  4��");		
		System.out.println("20-6049-2611  /  20190430-01-0012");
		System.out.println("2019-04-30 9:31:21");
		System.out.println("-----------------------------------");
		System.out.printf("%s \t %s \t %3s \t %6s\n", "��ǰ��", "����", "�ܰ�", "�ݾ�");
		for(int i = 0; i < orderData.size(); i++) {
			totalPrice += orderData.get(i).count * orderData.get(i).price;
			System.out.printf("%s \t %2d \t %3d�� \t %7d��\n", orderData.get(i).name, orderData.get(i).count, orderData.get(i).price,
					orderData.get(i).count * orderData.get(i).price);
		}
		System.out.println("-----------------------------------");
		System.out.printf("%s %23d��\n", "�� �� �� ��", totalPrice);
		System.out.printf("%s %23d��\n", "�� �� �� ��", discount);
		System.out.println("-----------------------------------");
		System.out.printf("%s %10s %10d�� \n", "**���γ��� :", "����", discount);
		System.out.println("-----------------------------------");
		System.out.printf("%s %17d��\n", "�ΰ��� ������ǰ����:", (totalPrice-discount)-(totalPrice-discount)/10);
		System.out.printf("%s %27d��\n", "�ΰ���:", (totalPrice-discount)/10);
		System.out.println("-----------------------------------");
		System.out.println("     *** �ſ��������(����)[1]***");
		System.out.println("");
		System.out.printf("%s %25s\n", "ī������:", "����üũ");
		System.out.printf("%s %26s\n", "ī���ȣ:", "1234-56**-****-7890");
		System.out.println("�Һΰ���: �Ͻú�");
		System.out.printf("%s %25d��\n", "�Ǹűݾ�:", (totalPrice-discount) - (totalPrice-discount)/10);	
		System.out.printf("%s %26d��\n", "�ΰ���:", (totalPrice-discount)/10);
		System.out.printf("%s %25d��\n", "���αݾ�:", totalPrice-discount);
		System.out.println("���ι�ȣ: 12345678");
		System.out.printf("%s %s\n", "�����Ͻ�:", "2019-04-30 9:31:21");
		System.out.printf("%s %d\n", "��������ȣ:", 123456789);
		System.out.println("EDC ����ǥ");
	}
	
}
