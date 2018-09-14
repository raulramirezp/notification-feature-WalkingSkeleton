package com.endava.hrapp.notifications.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Accessors(chain = true)
@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String body;

    @NotNull
    @Column( name = "notification_date")
    private String notificationDate;

    @NotNull
    @Column( name = "is_read")
    private Boolean isRead;

    @NotNull
    @Column( name = "recruiter_username")
    private String recruiterUsername;

    @NotNull
//    @ForeignKey( Table = "processes")
    @Column( name = "process_id")
    private long processId;

}
