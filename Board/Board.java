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
			System.out.print("명령어를 입력해주세요:");
			String order = sc.nextLine();
			
			if(order.equals("help")) {
			  System.out.println("add : 게시물 등록");
			  System.out.println("list: 게시물 목록 조회");
			}
			else if(order.equals("add")) {
				System.out.print("제목을 입력해주세요:");
				String title = sc.nextLine();
				System.out.print("내용을 입력해주세요:");
				String content = sc.nextLine();
				
				
				nums.add(num);
				titles.add(title);
				contents.add(content);
				
				num++;
				System.out.println("게시물이 저장되었습니다.");
			}
			else if(order.equals("list")) {
				
				for(int i = 0; i < titles.size(); i++) {
					
					
					System.out.println("번호:"+ nums.get(i));
					System.out.println("제목:"+titles.get(i));
					System.out.println("--------------------------");
				}
			}
			else if(order.equals("update")) {
				System.out.print("수정할 게시물 번호:");
				int Num = Integer.parseInt(sc.nextLine());
				
				int standard = Num;
				int check = checkupdate(standard);
				
				if(check == -1) {
					System.out.println("없는 게시물 번호입니다.");
					
				} else {
					System.out.print("제목:");
					String title = sc.nextLine();
					
					System.out.print("내용:");
					String content = sc.nextLine();
					
					
					titles.set(check, title);
					contents.set(check, content);
					
					System.out.println("수정이 완료되었습니다.");
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
