/**************************************************************************
 * Copyright (C) IBS Software 2021
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 **************************************************************************/
package com.tdd.cars.CarsManagementTDDApplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CarsControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

//    @Test
//    public void getCarsEndPoint_ShouldReturnProductsList(){
//        String baseUrl =  "http:localhost:"+port+"/getallcars";
//
//        ResponseEntity<Cars> response = restTemplate.getForEntity(baseUrl,Cars.class);
//        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
//    }
}
