package com.example.orm.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "system_parameter_setting")
public class SystemParameterSetting {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="setting_id")
	private Long settingId;

	@Column(name="system_group")
	private String systemGroup;

	@Column(name="system_key")
	private String systemKey;
	
	@Column(name="system_value")
	private String systemValue;
	
	@Column(name="system_text")
	private String systemText;

}
