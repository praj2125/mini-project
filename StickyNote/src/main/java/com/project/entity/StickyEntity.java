package com.project.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stickys")
public class StickyEntity {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String description;
        private String title;
		private String remark;
		private LocalDate target_date;
		private int users;
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getRemark() {
			return remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public LocalDate getTarget_date() {
			return target_date;
		}

		public void setTarget_date(LocalDate target_date) {
			this.target_date = target_date;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getUsers() {
			return users;
		}

		public void setUsers(int users) {
			this.users = users;
		}

	}

