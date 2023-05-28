package com.simba.dynamic.search.repository;

import com.simba.dynamic.search.model.OperatingSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatingSystemRepository extends
        JpaRepository<OperatingSystem, Integer>, JpaSpecificationExecutor<OperatingSystem> {
}
