package com.endava.hrapp.notifications.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Accessors(chain = true)
@Entity
@Table( name = "processes")
public class Process {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private long id;

    @NotNull
    @Column(name = "candidate_name")
    private String candidateName;

    @NotNull
    @Column(name = "processes_phase")
    private String processesPhase;

    @NotNull
    @Column(name = "is_comment")
    private Boolean isComment;

    @NotNull
    @Column(name = "last_update")
    private String lastUpdate;

    @NotNull
    @Column(name = "due_date")
    private String dueDate;

    @NotNull
    @Column(name = "ticket_id")
    private int ticketId;

    @NotNull
    @Column(name = "is_closed")
    private Boolean isClosed;

}
