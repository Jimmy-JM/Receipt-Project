package Receipt;

import java.util.ArrayList;

public class OrderOutput {

	public void outputBill(ArrayList<OrderArr> orderData) {
		int discount = 0;
		int totalPrice = 0;
		
		System.out.println();
		System.out.println();
		System.out.println("\n\n              [영수증]              \n");
		System.out.println("편의점(서현점) / 123-45-67890 / 전상열");
		System.out.println("서울특별시 강남구 테헤란로 20길 20,  4층");		
		System.out.println("20-6049-2611  /  20190430-01-0012");
		System.out.println("2019-04-30 9:31:21");
		System.out.println("-----------------------------------");
		System.out.printf("%s \t %s \t %3s \t %6s\n", "상품명", "수량", "단가", "금액");
		for(int i = 0; i < orderData.size(); i++) {
			totalPrice += orderData.get(i).count * orderData.get(i).price;
			System.out.printf("%s \t %2d \t %3d원 \t %7d원\n", orderData.get(i).name, orderData.get(i).count, orderData.get(i).price,
					orderData.get(i).count * orderData.get(i).price);
		}
		System.out.println("-----------------------------------");
		System.out.printf("%s %23d원\n", "합 계 금 액", totalPrice);
		System.out.printf("%s %23d원\n", "할 인 금 액", discount);
		System.out.println("-----------------------------------");
		System.out.printf("%s %10s %10d원 \n", "**할인내역 :", "없음", discount);
		System.out.println("-----------------------------------");
		System.out.printf("%s %17d원\n", "부가세 과세물품가액:", (totalPrice-discount)-(totalPrice-discount)/10);
		System.out.printf("%s %27d원\n", "부가세:", (totalPrice-discount)/10);
		System.out.println("-----------------------------------");
		System.out.println("     *** 신용승인정보(고객용)[1]***");
		System.out.println("");
		System.out.printf("%s %25s\n", "카드종류:", "신협체크");
		System.out.printf("%s %26s\n", "카드번호:", "1234-56**-****-7890");
		System.out.println("할부개월: 일시불");
		System.out.printf("%s %25d원\n", "판매금액:", (totalPrice-discount) - (totalPrice-discount)/10);	
		System.out.printf("%s %26d원\n", "부가세:", (totalPrice-discount)/10);
		System.out.printf("%s %25d원\n", "승인금액:", totalPrice-discount);
		System.out.println("승인번호: 12345678");
		System.out.printf("%s %s\n", "승일일시:", "2019-04-30 9:31:21");
		System.out.printf("%s %d\n", "가맹점번호:", 123456789);
		System.out.println("EDC 매출표");
	}
	
}
