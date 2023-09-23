/**************************************************************************
 * Copyright (C) IBS Software 2021
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 **************************************************************************/
package com.tdd.cars.CarsManagementTDDApplication;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CarsController {

    @GetMapping("/getallcars")
    public ResponseEntity<Cars> getAllCars() {
        List<Cars> allCars = new ArrayList<>();
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
