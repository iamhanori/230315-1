package kr.hs.study.beans;

public class TestBean1 {
    TestBean1 (){
        System.out.println("생성자 출력");
    }
    public void init_method(){
        System.out.println("TestBean1의 init_method");
    }

    public void destroy_method(){
        System.out.println("TestBean1의 destroy_method");
    }

}
