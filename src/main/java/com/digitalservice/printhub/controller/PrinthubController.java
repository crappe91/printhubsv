package com.digitalservice.printhub.controller;


import com.digitalservice.api.PresupuestoApiController;
import com.digitalservice.api.PresupuestoApiDelegate;
import com.digitalservice.model.Presupuesto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.OffsetDateTime;


public class PrinthubController extends PresupuestoApiController {


    public PrinthubController(PresupuestoApiDelegate delegate) {
        super(delegate);
    }


}
