package com.project.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {

		@Id
		@GeneratedValue
		private int userId;
		
		private String first_name;
		private String last_name;
		private String email;
		private String password;

		
		  @OneToMany(mappedBy = "users",fetch = FetchType.EAGER,cascade=CascadeType.REMOVE) 
		  private List<StickyEntity> stickys;
		 

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		
		 public List<StickyEntity> getStickys() { return stickys; }
		 
		 public void setStickys(List<StickyEntity> stickys) { this.stickys = stickys;
		  }
		

	}

