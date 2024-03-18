package com.example.orm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.orm.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long>, JpaSpecificationExecutor<Client> {

	Optional<Client> findByEmail(String email);
	Optional<Client>  findByRegistrationProgressVerificationCode(String registrationProgressVerificationCode);


}







