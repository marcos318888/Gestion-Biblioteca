package com.example.demo.persistence.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.persistence.Entytis.AutorEntity;

@Repository
public interface AutorRepository  extends JpaRepository<AutorEntity, Long> {
	


}
