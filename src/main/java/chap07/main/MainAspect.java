package chap07.main;

import chap07.Calculator;
import chap07.RecCalculator;
import chap07.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAspect {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Calculator cal = ctx.getBean("calculator", Calculator.class);
//        RecCalculator cal = ctx.getBean("calculator", RecCalculator.class); // 상속을 받은 Calculator를 기반으로 proxy가 생성되기 때문에 에러
        long fiveFact = cal.factorial(5);
        System.out.println("cal.factorial(5) = " + fiveFact);
        System.out.println(cal.getClass().getName());

//        System.out.println("TRY");
        ctx.close();
    }
}
