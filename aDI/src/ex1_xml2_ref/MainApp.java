package ex1_xml2_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {

		// [1] 스프링 설정 파일 연결
		ApplicationContext context = new ClassPathXmlApplicationContext("ex1_xml2_ref/applicationContext.xml");
		
		// [2] 빈 가져오기
		MemberBean bean = (MemberBean) context.getBean("member");
//		MemberBean bean = context.getBean("member", MemberBean.class);
		bean.output();
		MemberBean bean2 = (MemberBean) context.getBean("member2");
		bean2.output();
		
		MemberDAO dao1 = context.getBean("dao", MemberDAO.class);
		dao1.insert();
		MemberDAO dao2 = context.getBean("dao2", MemberDAO.class);
		dao2.insert();

	}

}
