package com.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;

import com.project.entity.StickyEntity;
import com.project.entity.UserEntity;

@Component
public class UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void save(UserEntity user) {
		entityManager.persist(user);
	}

	public boolean isUserPresent(String email) {
		Query query = entityManager.createQuery("select count(u) from UserEntity u where  u.email = :ew");
		query.setParameter("ew", email);
		Long count = (Long) query.getSingleResult();
		if (count == 1)
			return true;
		return false;
	}

	public boolean isUserPresent1(String email, String password) {
		Query query = entityManager
				.createQuery("select count(c) from UserEntity c where c.email = :em and c.password = :pw");
		query.setParameter("em", email);
		query.setParameter("pw", password);
		Long count = (Long) query.getSingleResult();
		if (count == 1)
			return true;
		return false;
	}

	public UserEntity fetch(String email) {
		Query query = entityManager.createQuery("select c from UserEntity c where c.email = :em");
		query.setParameter("em", email);
		UserEntity user = (UserEntity) query.getSingleResult();
		return user;
	}

	public boolean isStickeyPresent() {
		Query query = entityManager.createQuery("select count(u) from StickyEntity u");
		Long count = (Long) query.getSingleResult();
		if (count >= 1)
			return true;
		return false;
	}

	public List<StickyEntity> fetchStickeys() {
		return entityManager
				.createQuery("select u from StickyEntity u", StickyEntity.class)
				.getResultList();
	}

}

