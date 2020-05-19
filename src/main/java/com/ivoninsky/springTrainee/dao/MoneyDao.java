package com.ivoninsky.springTrainee.dao;

import com.ivoninsky.springTrainee.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoneyDao extends JpaRepository<Bank, String> {
}
