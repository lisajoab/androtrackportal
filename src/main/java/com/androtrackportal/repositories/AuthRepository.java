package com.androtrackportal.repositories;

import com.androtrackportal.domains.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by FMarube on 1/12/2016.
 */
public interface AuthRepository extends JpaRepository<Auth, Long> {
}
