package com.excellacom.internapplication.repo;

import com.excellacom.internapplication.entity.Interns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface InternsRepo extends JpaRepository<Interns, Integer> {


}
