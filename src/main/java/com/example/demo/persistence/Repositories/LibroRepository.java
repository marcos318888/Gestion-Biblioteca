package com.example.demo.persistence.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.persistence.Entytis.LibroEntity;

@Repository
public interface LibroRepository  extends JpaRepository<LibroEntity, Long> {

}
