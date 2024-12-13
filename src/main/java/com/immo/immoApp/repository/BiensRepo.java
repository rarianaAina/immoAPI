package com.immo.immoApp.repository;

import com.immo.immoApp.model.Biens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiensRepo extends JpaRepository<Biens, String> {
}
