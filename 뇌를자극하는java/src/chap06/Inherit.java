package chap06;


//슈퍼클래스 , 부모클래스
class Person{
	int money;
	
	public Person() {
		//기본 생성자 
		System.out.println("부모 클래스에 기본생성자 Person()  호출");
	}
	
	public Person(int money) {
		this.money = money;
		System.out.println("부모 클래스에 생성자 Person(int money)  호출");
	}
	
	public int displayMoney() {
	//	System.out.println("재산:" + money);
		return money;
	}
	}

//서브 클래스 , 자식 클래스 
class Child extends Person {
	
}







public class Inherit {

	public static void main(String[] args) {
	
		Child child = new Child();
		

	}

}
