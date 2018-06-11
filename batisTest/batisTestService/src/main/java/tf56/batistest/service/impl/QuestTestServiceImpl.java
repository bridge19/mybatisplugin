package tf56.batistest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import tf56.batistest.dao.QueryTestDao;
import tf56.batistest.domain.QueryTest;
import tf56.batistest.service.QuestTestService;

@Service
public class QuestTestServiceImpl implements QuestTestService {

	
	@Autowired private QueryTestDao queryTestDao;
	
	public void selectTest(){
		Integer pageNum=0;
		Integer pageSize=10;
		Page page = PageHelper.startPage(pageNum, pageSize, true);
		List<QueryTest> result = queryTestDao.listQueryTest(null);
		System.out.println(page.getTotal());
		System.out.println("end.");
	}
}
