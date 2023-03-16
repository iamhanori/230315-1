package kr.hs.study.beans;

public class TestBean1 {
    TestBean1 (){
        System.out.println("생성자 출력");
    }
    // 생성자 실행 후에 자동으로 호출되어 실행
    public void init_method(){
        System.out.println("TestBean1의 init_method");
    }

    // 객체 소멸일 때 자동으로 호출 (ctx.close();)
    public void destroy_method(){
        System.out.println("TestBean1의 destroy_method");
    }

}
