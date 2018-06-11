package tf56.batistest.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tf56.architecture.framework.dao.DaoInterface;

import tf56.batistest.domain.QueryTest;

public interface QueryTestDao extends DaoInterface {
	
	/**
     * 新增数据
     */
	public void insertQueryTest(QueryTest record);
	
	/**
     * 更新数据
     */
	public void updateQueryTest(QueryTest record);
	
	/**
     * 根据主键获取数据
     */
	public QueryTest getQueryTestByPrimaryKey(Long queryTestId);
	
	/**
     * 获取列表数据
     */
	public List<QueryTest> listQueryTest(QueryTest record);
	
	/**
     * 根据主键删除数据
     */
	public void deleteQueryTestByPrimaryKey(Long queryTestId);
	
	/**
     * 根据对象删除数据
     */
	public void deleteQueryTestByProperty(QueryTest record);
}