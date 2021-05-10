package com.ritvikrajpandey.onlinebanking.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ritvikrajpandey.onlinebanking.entity.Appointment;
import com.ritvikrajpandey.onlinebanking.repository.AppointmentDao;
import com.ritvikrajpandey.onlinebanking.service.AppointmentService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : online-banking
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/08/18
 * Time: 04.38
 * To change this template use File | Settings | File Templates.
 */
@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentDao appointmentDao;

    public Appointment createAppointment(Appointment appointment) {
        return appointmentDao.save(appointment);
    }

    public List<Appointment> findAll() {
        return appointmentDao.findAll();
    }

    public Appointment findAppointment(Long id) {
        return appointmentDao.findById(id).get();
    }

    public void confirmAppointment(Long id) {
        Appointment appointment = findAppointment(id);
        appointment.setConfirmed(true);
        appointmentDao.save(appointment);
    }
}