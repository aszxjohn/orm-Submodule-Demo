package com.example.orm.entity;

import java.io.Serializable;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the client_info database table.
 * 
 */
@Getter
@Setter
@Entity
@Table(name="client_info")
public class ClientInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="client_info_id")
	private long clientInfoId;

	@Column(name="client_address")
	private String clientAddress;

	@Column(name="identification_number")
	private String identificationNumber;

	@Column(name="phone_numbe")
	private String phoneNumbe;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;

}