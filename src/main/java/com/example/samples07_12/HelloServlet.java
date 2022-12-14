package com.example.samples07_12;

import java.io.*;
import java.util.Arrays;
import java.util.Map;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;

@WebServlet(name="HelloServlet", value = "/hello-servlet")
//@WebServlet вказує на endpoint, з якої буде асоційовано сервлет який створюємо
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }// init - ініціалізація сервлету на початку відпр. запитів

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        //doGet - для отримання данних з серверу
        //doPost - для відправлення даних
        //doPut - для відправлення даних для змінення
        //doDelete - для видалення
        //service() - містить логіку роботи нашого сервлету,викликається для обробки запиту
        // та передачі відповіді HTTP кліенту(наш браузер)


        // Hello
        PrintWriter out = response.getWriter();
        /*out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h2>Samples test</h2>");
        out.println("</body></html>");*/

        /*Map<String,String[]> requestParams = request.getParameterMap();
        for(Map.Entry<String,String[]> param : requestParams.entrySet()){
            out.println(param.getKey()+" => "+ Arrays.toString(param.getValue()));
        }*/

    }

    public void destroy() {//destroy() - після закін. роботи сервлету може закривати потоки або роботу
    }
}