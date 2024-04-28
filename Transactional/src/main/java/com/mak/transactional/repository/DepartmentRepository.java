package com.mak.transactional.repository;

import com.mak.transactional.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing <code>Department</code> entities.
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
