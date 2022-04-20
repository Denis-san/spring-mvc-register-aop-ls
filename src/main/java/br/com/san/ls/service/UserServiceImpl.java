package br.com.san.ls.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.san.ls.entity.User;
import br.com.san.ls.repository.UserDAO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;

	@Override
	public User save(User user) {
		return userDao.saveUser(user);
	}

}
