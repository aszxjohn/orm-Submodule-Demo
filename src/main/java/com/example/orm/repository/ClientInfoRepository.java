package com.example.orm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.orm.entity.ClientInfo;

public interface ClientInfoRepository extends JpaRepository<ClientInfo, Long>, JpaSpecificationExecutor<ClientInfo> {

	Optional<ClientInfo> findByClient_ClientId(Long clientId);


}







