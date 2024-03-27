package com.example.orm.entity;

import com.example.orm.base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Builder;
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
public class ClientInfo extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="client_info_id")
	private Long clientInfoId;

	@Column(name="client_address")
	private String clientAddress;

	@Column(name="identification_number")
	private String identificationNumber;

	@Column(name="phone_numbe")
	private String phoneNumbe;

	//bi-directional many-to-one association to Client
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="client_id", referencedColumnName = "client_id")
	private Client client;

}