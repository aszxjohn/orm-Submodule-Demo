package com.example.orm.entity;

import com.example.orm.base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * The persistent class for the email_template database table.
 * 
 */
@Data
@Entity
@Table(name="email_template")
public class EmailTemplate extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="email_template_id")
	private long id;

	@Column(name="content")
	private String content;

	@Column(name="subject")
	private String subject;
	
	@Column(name = "associated_api")
	private String associatedApi;
	
}