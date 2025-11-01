package com.javapro.pro.repository;

import com.javapro.pro.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface servicerepo extends JpaRepository<Service, Long> {
}
