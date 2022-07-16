package com.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.project.entity.StickyEntity;

@Component
public class StickyNoteDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void add(StickyEntity sticky) {
		entityManager.persist(sticky);
	}

	@Transactional
	public void update(StickyEntity sticky) {

		entityManager.merge(sticky);
	}

	
	  public StickyEntity fetchStickyByID(int id1) {
		  return entityManager
				  			.createQuery("select s from StickyEntity s where s.users like : id1",StickyEntity.class) 
				  			.setParameter("id1", id1)
				  			.getSingleResult(); 
		  }
	 

	@Transactional
	public void delete(int id) {
		StickyEntity s = entityManager.find(StickyEntity.class, id);
		entityManager.remove(s);
	}

	@Transactional
	public StickyEntity findStickyDao(int ui) {
		StickyEntity s = entityManager.find(StickyEntity.class, ui);
		System.out.println(s.getTitle());
		return s;
	}

	public List<StickyEntity> fetch(int userId) {

		return entityManager
				.createQuery("select s from StickyEntity s where s.users = :ui")
				.setParameter("ui", userId)
				.getResultList();
	}

}



















/*
 * public boolean delete(int userId) { Query query =
 * entityManager.createQuery("delete from StickyEntity s where s.users = :ui");
 * query.setParameter("ui", userId); Long count = (Long)
 * query.getSingleResult(); if (count == 1) return true; return false; }
 */

/*
 * @Transactional public void delete(int Id) { StickyEntity s =entityManager
 * .createQuery("select s from StickyEntity s where s.id like = :Id"
 * ,StickyEntity.class) .setParameter("Id", Id) .getSingleResult();
 * entityManager.remove(s); }
 */
