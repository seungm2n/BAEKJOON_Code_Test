package kr.co.codeTest;
/*	다음의 상속과 관련된 예제가 실행되었을 때 결과를 기술하시오.
 * (예외가 발생할 것으로 예상되면 발생지점, 원인을 쓰고 
 * 이상이 없을 것으로 예상되면 실행 결과에 정상 실행으로 기재하시요.)
*/
public class Test1 {

	public static void main(String[] args)
	{

		Parent fa = new Parent();
		//Child so = (Child) new Parent();			// 컴파일 오류가 남. 다운캐스팅 불가. 좀더 구체적으로 속성과 성질이 정해져 있지 않은 참조형 데이터는 JVM이 알 수 없음.
		Child so = new Child();						// 결과값 Start!! 가 출력.
		
		so.method1();
		so.exec();									// 결과값 extend 가 출력.
	}

	}

class Parent {
	void method1()
	{
		System.out.println("Start!!");
	}
}

class Child extends Parent {

	Child()
	{
		super();
	}

	void exec()
	{
		System.out.println("extentds");
	}
}
