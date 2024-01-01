package chap2;

public class _13_예제2_9 {

	public static void main(String[] args) {
		String ur1 = "www.codechobo.com";
		float f1 = .10f;       // 0.10, 1.0e-1
		float f2 = 1e1f;     // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n",  f3, f3, f3);
		
		System.out.printf("d=%f%n",  d);             // 마지막 자리 반올림됨
		System.out.printf("d=%14.10f%n",  d);     // 전체 14자리 중 소수점 10자리
		
		System.out.printf("[12345678901234567890]%n");
		
		System.out.printf("[%s]%n",  ur1);
		System.out.printf("[%20s]%n",  ur1);       // 오른쪽 정렬
		System.out.printf("[%-20s]%n", ur1);       // 왼쪽 정렬
		System.out.printf("[%.8s]%n",  ur1);         // 왼쪽에서 8글자만 출력
	}

}
