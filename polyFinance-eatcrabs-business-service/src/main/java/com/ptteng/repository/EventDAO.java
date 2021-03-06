package com.ptteng.repository;

import com.ptteng.domain.business.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface EventDAO extends JpaRepository<Event,Long>, JpaSpecificationExecutor<Event> {
}
