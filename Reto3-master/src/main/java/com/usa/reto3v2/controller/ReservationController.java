package com.usa.reto3v2.controller;

import com.usa.reto3v2.entities.Reservation;
import com.usa.reto3v2.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;
    @GetMapping("/all")
    public List<Reservation> getAll(){
        return reservationService.getAll();
    }
    @PostMapping("/save")
    public Reservation save(@RequestBody Reservation p){
        return reservationService.save(p);
    }
}