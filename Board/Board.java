package Board;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {
		
	ArrayList<Integer> nums = new ArrayList<Integer>();
	ArrayList<String> titles = new ArrayList<String>();
	ArrayList<String> contents = new ArrayList<String>();
	
	int num = 1;
	Scanner sc = new Scanner(System.in);
	public void run() {
		
		
	
		while(true) {
			System.out.print("��ɾ �Է����ּ���:");
			String order = sc.nextLine();
			
			if(order.equals("help")) {
			  System.out.println("add : �Խù� ���");
			  System.out.println("list: �Խù� ��� ��ȸ");
			}
			else if(order.equals("add")) {
				System.out.print("������ �Է����ּ���:");
				String title = sc.nextLine();
				System.out.print("������ �Է����ּ���:");
				String content = sc.nextLine();
				
				
				nums.add(num);
				titles.add(title);
				contents.add(content);
				
				num++;
				System.out.println("�Խù��� ����Ǿ����ϴ�.");
			}
			else if(order.equals("list")) {
				
				for(int i = 0; i < titles.size(); i++) {
					
					
					System.out.println("��ȣ:"+ nums.get(i));
					System.out.println("����:"+titles.get(i));
					System.out.println("--------------------------");
				}
			}
			else if(order.equals("update")) {
				System.out.print("������ �Խù� ��ȣ:");
				int Num = Integer.parseInt(sc.nextLine());
				
				int standard = Num;
				int check = checkupdate(standard);
				
				if(check == -1) {
					System.out.println("���� �Խù� ��ȣ�Դϴ�.");
					
				} else {
					System.out.print("����:");
					String title = sc.nextLine();
					
					System.out.print("����:");
					String content = sc.nextLine();
					
					
					titles.set(check, title);
					contents.set(check, content);
					
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				}
				
				
				
			}
			
			System.out.println("============================");
		}
		
		
		
	}

	private int checkupdate(int standard) {
		
		for(int i = 0; i < nums.size(); i++) {
			if(standard == nums.get(i)) {
				return standard;
			}
		}
		
		return -1;
	}
	
}	
