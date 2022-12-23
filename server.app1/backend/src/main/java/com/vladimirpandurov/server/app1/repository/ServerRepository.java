package com.vladimirpandurov.server.app1.repository;

import com.vladimirpandurov.server.app1.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
    Server findByName(String name);
}
