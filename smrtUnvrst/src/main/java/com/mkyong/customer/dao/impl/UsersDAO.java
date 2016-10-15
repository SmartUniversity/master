/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.customer.dao.impl;

import com.mkyong.customer.dao.UserDAO;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author Antony
 */
public class UsersDAO extends JdbcDaoSupport implements UserDAO {
    
    public int findTotalCustomer(){
		
		String sql = "SELECT COUNT(*) FROM USERS";
		 
		int total = getJdbcTemplate().queryForInt(sql);
				
		return total;
	}
    
}
