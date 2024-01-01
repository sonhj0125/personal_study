package chap2;

public class _09_예제2_8 {

	public static void main(String[] args) {
		int x = 10, y = 5;      // int x = 10; int y = 5;를 한 줄로
		System.out.println("x = " + x);     // 문자열 결합 때문에 + 사용
		System.out.println("y = " + y);
		
		int tmp = x;         // x의 값을 tmp에 저장
		x = y;                  // y의 값을 x에 저장
		y = tmp;              // tmp의 값을 y에 저장
		System.out.println("x = " + x);
		System.out.println("y =  "+ y);		
	}

}
