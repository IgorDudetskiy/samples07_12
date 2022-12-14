package com.example.samples07_12;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String st = request.getParameter("student");
        String[] courses = request.getParameterValues("courses");

        try {
            printWriter.println("<h2> First Name: " + firstName + "</h2>");
            printWriter.println("<h2> Last Name: " + lastName + "</h2>");
            printWriter.println("<h2> Student type: " + st + "</h2>");
            for (String course : courses) {
                printWriter.println("<l1>" + course + "</li>");
            }
        } finally {
            printWriter.close();
        }
    }
}
