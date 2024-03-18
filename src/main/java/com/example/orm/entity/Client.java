package com.example.orm.entity;

import java.sql.Timestamp;

import org.springframework.core.type.filter.AbstractClassTestingTypeFilter;

import com.example.orm.base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


/**
 * The persistent class for the client database table.
 * 
 */
@Data
@Entity
@Table(name = "client")
public class Client extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="client_id")
	private Long clientId;

	@Column(name="client_info_id")
	private Long clientInfoId;

	@Column(name="customer_number")
	private String customerNumber;

	@Column(name="enable_two_factor")
	private Boolean enableTwoFactor;

	@Column(name="is_lock")
	private Boolean isLock;

	@Column(name="is_locked_time")
	private Timestamp isLockedTime;

	@Column(name="login_fail_count")
	private Integer loginFailCount;

	@Column(name="login_success_date")
	private Timestamp loginSuccessDate;
	
	@Column(name="email")
	private String email;

	@Column(name="password")
	private String password;

	@Column(name="register_review_id")
	private Long registerReviewId;

	@Column(name = "registration_verification_code")
	private String registrationVerificationCode;
	
	@Column(name = "registration_verification_code_expiry_time")
	private Timestamp registrationVerificationCodeExpiryTime;
	
	@Column(name="registration_progress_verification_code")
	private String registrationProgressVerificationCode;

	@Column(name="registration_progress_verification_code_expiry_time")
	private Timestamp registrationProgressVerificationCodeExpiryTime;

	@Column(name="reset_password_verification_code_email")
	private String resetPasswordVerificationCodeEmail;

	@Column(name="reset_password_verification_code_expiry_time")
	private Timestamp resetPasswordVerificationCodeExpiryTime;

	@Column(name="set_password_verification_code_email")
	private String setPasswordVerificationCodeEmail;

	@Column(name="set_password_verification_code_expiry_time")
	private Timestamp setPasswordVerificationCodeExpiryTime;

	private Integer status;

	@Column(name="two_factor_code")
	private String twoFactorCode;

	@Column(name="two_factor_code_expiry_time")
	private Timestamp twoFactorCodeExpiryTime;


}