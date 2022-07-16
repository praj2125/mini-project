package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.dao.StickyNoteDao;
import com.project.dao.UserDao;
import com.project.entity.StickyEntity;

@Component
public class StickyNoteService {

	@Autowired
	private StickyNoteDao stickyNoteDao;

	/* ----------------------------------Add------------------------------------*/
	public void addSticky(StickyEntity stickys) {
		stickyNoteDao.add(stickys);
	}

	/* ----------------------------------Update------------------------------------*/
	public void update(StickyEntity stickys) {
		stickyNoteDao.update(stickys);
	}

	/* ----------------------------------Find------------------------------------*/
	public StickyEntity findSticky(int ui) {
		StickyEntity s = stickyNoteDao.findStickyDao(ui);
		System.out.println(s);
		return s;
	}

	/* ----------------------------------Delete------------------------------------*/
	public void delete(int userId) {
		stickyNoteDao.delete(userId);
	}

	/* ----------------------------------Fetch All------------------------------------*/
	public List<StickyEntity> fetchAll(int userId) {
		return stickyNoteDao.fetch(userId);
	}

	/* ----------------------------------Fetch By Id------------------------------------*/
	public StickyEntity fetchStickyById(int uid) {
	   return stickyNoteDao.fetchStickyByID(uid);
	}
}
