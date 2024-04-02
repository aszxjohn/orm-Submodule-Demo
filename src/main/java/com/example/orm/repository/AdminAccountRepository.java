package com.example.orm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.orm.entity.AdminAccount;

public interface AdminAccountRepository extends JpaRepository<AdminAccount, Long>, JpaSpecificationExecutor<AdminAccount> {


}







