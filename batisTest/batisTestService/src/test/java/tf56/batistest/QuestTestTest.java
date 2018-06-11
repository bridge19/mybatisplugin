package tf56.batistest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import tf56.batistest.service.QuestTestService;

public class QuestTestTest extends TestSupport{

	@Autowired
	private QuestTestService questTestService;
	
	@Test
	public void queryTest(){
		questTestService.selectTest();
	}
}
