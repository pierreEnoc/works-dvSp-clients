package com.pierredev.clients.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pierredev.clients.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
