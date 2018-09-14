package com.endava.hrapp.notifications.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationDAO extends CrudRepository<Notification, Long> {
}
