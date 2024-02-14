package com.digitalservice.printhub.controller;

import com.digitalservice.api.PresupuestoApi;
import com.digitalservice.model.Presupuesto;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class PresupuestoController implements PresupuestoApi {

    @Override
    public ResponseEntity<Presupuesto>  obtenerPresupuestoPorID(Long id){
        Presupuesto presupuesto = new Presupuesto();
        presupuesto.setId(1L);
        presupuesto.addMaquinaItem(Presupuesto.MaquinaEnum.MANIPULADO);
        return new ResponseEntity<Presupuesto>(presupuesto,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Presupuesto> crearPresupuesto(Presupuesto presupuesto){
        return new ResponseEntity<Presupuesto>(presupuesto,HttpStatus.OK);
    }

}
