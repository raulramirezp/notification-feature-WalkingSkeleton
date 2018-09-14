package com.endava.hrapp.notifications.controllers;

import com.endava.hrapp.notifications.domain.Notification;
import com.endava.hrapp.notifications.domain.NotificationDAO;
import com.endava.hrapp.notifications.domain.Process;
import com.endava.hrapp.notifications.domain.ProcessDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.BeanParam;
import javax.ws.rs.core.Response;

@RestController
@RequestMapping("/")
public class NotificationController {

    @Autowired
    private ProcessDAO processDAO;

    @Autowired
    private NotificationDAO notificationDAO;
    @GetMapping
    public Response sayHello(){
        return Response.ok().entity("Hello world!").build();
    }

    @GetMapping("/create")
    @ResponseBody
    public Process createProcess(){
        Process process = new Process();
        process.setCandidateName("Raul Ramirez");
        process.setProcessesPhase("Interview");
        process.setIsComment(true);
        process.setLastUpdate("2018-8-31 23:59:59");
        process.setDueDate("2018-9-1 23:59:59");
        process.setTicketId(1);
        process.setIsClosed(false);
        processDAO.save(process);

        Notification notification = new Notification();
        notification.setBody("Sus citas perro");
        notification.setNotificationDate("2018-8-31 23:59:59");
        notification.setIsRead(false);
        notification.setRecruiterUsername("German");
        notification.setProcessId(process.getId());

        notificationDAO.save(notification);
        return process;
    }

    @PutMapping("/update/{id}")
    public void delete(@PathVariable( "id") long id) {
        Process p = processDAO.findById(id).get();
        p.setIsClosed(true);
        processDAO.save(p);

    }

}
