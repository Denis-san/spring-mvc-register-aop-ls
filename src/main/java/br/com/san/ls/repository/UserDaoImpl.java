package br.com.san.ls.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.san.ls.entity.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void saveUser(User user) {
		entityManager.persist(user);
	}

}
