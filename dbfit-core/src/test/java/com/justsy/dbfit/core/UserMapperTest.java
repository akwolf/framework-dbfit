package com.justsy.dbfit.core;

import org.jtester.annotations.DbFit;
import org.jtester.annotations.SpringApplicationContext;
import org.jtester.annotations.SpringBeanByName;
import org.jtester.testng.JTester;
import org.testng.annotations.Test;

import com.justsy.dbfit.dao.UserMapper;
import com.justsy.dbfit.pojo.User;

/**
 * @author zhangh
 * @createTime 2013-6-3 下午8:14:39
 */
@Test
@SpringApplicationContext({ "spring/biz-datasource.xml" })
public class UserMapperTest extends JTester {

	@SpringBeanByName
	UserMapper userMapper;

	@Test
	@DbFit(when="com/justsy/dbfit/User.insert.when.wiki")
	public void test() {
		User u = userMapper.searchById(1);
		want.object(u).notNull().propertyEq("userName", "admin") ;
	}
}
