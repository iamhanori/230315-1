package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 bean = ctx.getBean("bean", TestBean1.class);
        // 주소
        System.out.println(bean);
        // 메서드
        bean.init_method();
        bean.destroy_method();

        ctx.close();

    }
}