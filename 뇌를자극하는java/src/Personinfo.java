
public class Personinfo {

	public static void main(String[] args) {
		
		//클래스 변수
		Person obj;
		
		//매개변수 없는 디폴트 생성자 호출하여 객체생성
        
//		person= new Person();
	
		
		//String 매개변수 1개 있는 생성자 호출하여 객체생성
		//person = new Person();
		
		//String 매개변수 1개있는 생성자
         //person.new Person("홍길동");
         
         //int 매개변수 있고 String  있는 생성자 호출하여 객체생성
         obj = new Person(20, "홍길동");
         
         
         //메소드 호출
         obj.showPerson(obj);
         obj.showPerson();
         
         //System.out.println(person);
	}

}
