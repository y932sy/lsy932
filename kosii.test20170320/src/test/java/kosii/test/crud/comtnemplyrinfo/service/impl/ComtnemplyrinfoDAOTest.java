package kosii.test.crud.comtnemplyrinfo.service.impl;

import javax.annotation.Resource;

import kosii.test.crud.comtnemplyrinfo.service.ComtnemplyrinfoVO;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:egovframework/spring/com/**/context-*.xml" })
public class ComtnemplyrinfoDAOTest {

	@Resource(name = "comtnemplyrinfoDAO")
	private ComtnemplyrinfoDAO comtnemplyrinfoDAO;

	@Test
	public void test() {
		// fail("Not yet implemented");

		ComtnemplyrinfoVO vo = new ComtnemplyrinfoVO();
		vo.setEmplyrId("lsy2");
		vo.setUserNm("이소엽");
		vo.setPassword("123");
		vo.setHouseAdres("Abc");
		vo.setPasswordHint("123");
		vo.setPasswordCnsr("A");
		vo.setHouseEndTelno("12");
		vo.setAreaNo("9");
		vo.setZip("A");
		vo.setHouseMiddleTelno("4");
		vo.setEmplyrSttusCode("a");
		vo.setEsntlId("A");

		try {
			comtnemplyrinfoDAO.insertComtnemplyrinfo(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		}

	}
}
