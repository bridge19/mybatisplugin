package tf56.batistest.domain;

import java.util.Date;
import java.io.Serializable;

/**
 * ClassName:QueryTest 测试表
 *
 * @author tool
 * @version 1.0
 * @since v1.0
 * Date Jun 6, 2018 11:09:09 AM
 */
public class QueryTest implements Serializable {

	private static final long serialVersionUID = 6887889946621766319L; 

	
	/** 
	 *  主键 
	 */
	private Long queryTestId;
	
	/** 
	 *  名字 
	 */
	private String queryName;
	
	/** 
	 *  值 
	 */
	private String queryValue;
	
	/** 
	 *  输入人 
	 */
	private Integer inputMan;
	
	/** 
	 *  输入时间 
	 */
	private Date inputDate;
	
	/** 
	 *  更新时间 
	 */
	private Date updateDate;

	public void setQueryTestId(Long queryTestId) {
		this.queryTestId = queryTestId;
	}
	
	public Long getQueryTestId() {
		return queryTestId;
	}
    	
	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}
	
	public String getQueryName() {
		return queryName;
	}
    	
	public void setQueryValue(String queryValue) {
		this.queryValue = queryValue;
	}
	
	public String getQueryValue() {
		return queryValue;
	}
    	
	public void setInputMan(Integer inputMan) {
		this.inputMan = inputMan;
	}
	
	public Integer getInputMan() {
		return inputMan;
	}
    	
	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}
	
	public Date getInputDate() {
		return inputDate;
	}
    	
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	public Date getUpdateDate() {
		return updateDate;
	}
    	
}