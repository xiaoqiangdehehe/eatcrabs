package com.ptteng.repository;

import com.ptteng.domain.business.Mail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MailDAO extends JpaRepository<Mail,Long>, JpaSpecificationExecutor<Mail> {
}
