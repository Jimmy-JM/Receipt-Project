package Receipt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Orderinput {
	public Scanner myInput = new Scanner(System.in);
	int addOrder = 0;
	
		public void inputOrder(OrderArr item, ArrayList<OrderArr> orderData) {
			while(true) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/ConvenienceStore", "root", "123456");
					Statement stmt = conn.createStatement();
					
					System.out.print("\n제품번호"
							+ "\n1. 엘도라다"
							+ "\n2. 오예스"
							+ "\n3. 꼬북칩"
							+ "\n4. 오감자"
							+ "\n5. 포카칩"
							+ "\n6. 홈런볼"
							+ "\n7. 프링글스"
							+ "\n8. 닭다리"
							+ "\n9. 칙촉"
							+ "\n10. 새우깡"
							+ "\n구매하실 제품번호를 입력해주세요 : ");
					item.no = myInput.nextInt();
					ResultSet rset = stmt.executeQuery("select * from snack where no =" + item.no);	
					
					if (rset.next()) {
						System.out.println("---------------------------");
						System.out.printf("%s %2d원   제조사:%s\n", rset.getString(2), rset.getInt(3), rset.getString(4));
						System.out.println("---------------------------");
						item.name = rset.getString(2);
						item.price = rset.getInt(3);
					} else {
						System.out.println("해당하는 상품이 없습니다.");
					}
	
					System.out.print("\n구매수량을 입력해주세요 : ");
					item.count = myInput.nextInt();
					
					orderData.add(item);
	
					rset.close();
					stmt.close();
					conn.close();
				} catch(Exception e) {
					e.printStackTrace();
					}
			break;
			}
		}
		
		public void inputAdd() {	
			do {
				System.out.printf("\n추가구매 여부를 확인해주세요.\n(1.추가구매, 2.구매종료) : ");
				addOrder = myInput.nextInt();
			} while (addOrder < 1 || addOrder > 2);
		}
	
}
	