/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.customer.dao.impl;

import com.mkyong.customer.dao.CityDAO;
import com.mkyong.customer.model.City;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


/**
 *
 * @author IGOR
 */
public class CityDAOImpl extends SimpleJdbcDaoSupport implements CityDAO {

    public void insertCityDAO(City city) {
        String sql = "INSERT INTO CITY " +
			"(name) VALUES (?)";
			 
		getSimpleJdbcTemplate().update(sql, city.getName());
    }

    public City getCityDAOById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
