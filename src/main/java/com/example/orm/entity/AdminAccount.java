package com.example.orm.entity;

import com.example.orm.base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


/**
 * The persistent class for the admin_account database table.
 * 
 */
@Data
@Entity
@Table(name = "admin_account")
public class AdminAccount extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="admin_account_id")
	private Long adminAccountId;

	private String account;

	private String password;

	private String role;

}