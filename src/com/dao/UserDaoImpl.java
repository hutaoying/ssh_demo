package com.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.entity.User;

public class UserDaoImpl implements UserDao{
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void add() {
//		HibernateTemplate hibernateTemplate=new HibernateTemplate(sessionFactory);
			/*User u=new User();
			u.setUsername("xiaohu");
			u.setAddress("jiangxi");
			hibernateTemplate.save(u);*/
		//get方法
		/*User user=hibernateTemplate.get(User.class, 1);
		System.out.println(user.getUsername()+""+user.getAddress());*/
		//find方法查询所有记录
		/*List<User> list=(List<User>) hibernateTemplate.find("from User");*/
		
			
	}


}
