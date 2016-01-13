package com.androtrackportal.repositories;

import com.androtrackportal.domains.Sms;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by FMarube on 1/13/2016.
 */
public interface SmsRepository extends JpaRepository<Sms, Long> {
}
