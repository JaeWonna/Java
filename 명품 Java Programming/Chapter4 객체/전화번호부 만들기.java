package JavaHomework;
import java.util.Scanner;

class Phone{
	private String name;
	private String tel;
	
	Phone(){}
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}

public class PhoneBook {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("인원수>>");
		int num = sc.nextInt();
		Phone[] p = new Phone[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈칸없이 입력)>>");
			String name = sc.next();
			String tel = sc.next();
			p[i] = new Phone(name, tel);
		}
		
		System.out.println("저장되었습니다");
		
		while(true) {
			boolean flag = false;
			System.out.print("검색할 이름>>");
			String search = sc.next();
			
			if(search.equals("그만"))
				break;
			
			for(Phone phone : p) {
				if((phone.getName()).equals(search)) {
					System.out.println(phone.getName()+"의 번호는 " + phone.getTel() + " 입니다.");
					flag = true;
				}
			}
			
			if(flag == false)
				System.out.println(search+" 이 없습니다.");
		}
	}
}
