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
					
					System.out.print("\n��ǰ��ȣ"
							+ "\n1. �������"
							+ "\n2. ������"
							+ "\n3. ����Ĩ"
							+ "\n4. ������"
							+ "\n5. ��īĨ"
							+ "\n6. Ȩ����"
							+ "\n7. �����۽�"
							+ "\n8. �ߴٸ�"
							+ "\n9. Ģ��"
							+ "\n10. �����"
							+ "\n�����Ͻ� ��ǰ��ȣ�� �Է����ּ��� : ");
					item.no = myInput.nextInt();
					ResultSet rset = stmt.executeQuery("select * from snack where no =" + item.no);	
					
					if (rset.next()) {
						System.out.println("---------------------------");
						System.out.printf("%s %2d��   ������:%s\n", rset.getString(2), rset.getInt(3), rset.getString(4));
						System.out.println("---------------------------");
						item.name = rset.getString(2);
						item.price = rset.getInt(3);
					} else {
						System.out.println("�ش��ϴ� ��ǰ�� �����ϴ�.");
					}
	
					System.out.print("\n���ż����� �Է����ּ��� : ");
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
				System.out.printf("\n�߰����� ���θ� Ȯ�����ּ���.\n(1.�߰�����, 2.��������) : ");
				addOrder = myInput.nextInt();
			} while (addOrder < 1 || addOrder > 2);
		}
	
}
	