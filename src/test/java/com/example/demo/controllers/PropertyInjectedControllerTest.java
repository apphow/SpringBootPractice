package com.example.demo.controllers;

import com.example.demo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    // to text this we need the property controller

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        //we're mimicking what Spring is doing by
        //creating a new instance of PrpertyInjectedController
        controller = new PropertyInjectedController();

        controller.greetingService = new GreetingServiceImpl();

    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}