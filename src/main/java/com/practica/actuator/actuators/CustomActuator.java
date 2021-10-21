package com.practica.actuator.actuators;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.stereotype.Component;

@Component
@RestControllerEndpoint(id = "customEndpoint")
public class CustomActuator {

}
