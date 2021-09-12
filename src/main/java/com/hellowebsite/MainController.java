package com.hellowebsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class MainController {
@GetMapping("/hello")
public void hello(HttpServletRequest request, HttpServletResponse response) throws IOException {

    response.setContentType("text/html; charset=UTF-8");

    PrintWriter printWriter = response.getWriter();

    String msg = "<html>" +
            "<head>" +
            "<meta charset = 'UTF-8'>" +
            "</head>" +
            "<body>" +
            "<p>Hello</p>" +
            "</body>" +
            "</html>";

    printWriter.write(msg);
    printWriter.close();
}

}
