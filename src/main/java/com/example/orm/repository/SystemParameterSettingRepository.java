package com.example.orm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.orm.entity.SystemParameterSetting;

public interface SystemParameterSettingRepository extends JpaRepository<SystemParameterSetting, Long>, JpaSpecificationExecutor<SystemParameterSetting> {
	
	Optional<SystemParameterSetting>  findBySystemGroupAndSystemKey(String group, String key);

	
}







