package com.parking.parkinglot.servlets;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet(name = "Cars", value = "/Cars")
public class Cars extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("numberOfFreeParkingSpots", 10);
        request.getRequestDispatcher("/WEB-INF/pages/cars.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}