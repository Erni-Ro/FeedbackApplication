package ro.erni.java.training.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import ro.erni.java.training.model.Employee;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;  
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public int saveEmployee(Employee e){  
	    String query="insert into employee values('"+e.getId()+"','"+e.getFirstName()+"','"+e.getLastName()+"')";  
	    return jdbcTemplate.update(query);  
	}  
	public int updateEmployee(Employee e){  
	    String query="update employee set name='"+e.getFirstName()+"',salary='"+e.getLastName()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteEmployee(Employee e){  
	    String query="delete from employee where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	
	public List<Map<String, Object>> getEmployee(String s) {
		String query = "select * from employee where username ='" + s + "' ";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(query);
		return list;
	}
	
	public boolean isEmployeeInDb(String username, String password) {
		String query = "select username from employee where username = '" + username + "' and password = '" + password +"'";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(query);
		return list.size() > 0;
	}
}
