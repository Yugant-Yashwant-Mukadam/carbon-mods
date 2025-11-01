package com.javapro.pro.repository;

import com.javapro.pro.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerrepo extends JpaRepository<Customer, Long> {
}