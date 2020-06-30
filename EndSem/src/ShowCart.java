import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewParticipants")
ppublic class ShowCart extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<html><head>");
        out.print("<link rel='stylesheet' href='style.css'>");
        out.print("<link rel='icon' href='images/logo.png'>");        
        out.print("</head><body>");
        out.print("<center><img src='images/logo.png' width='75'>");
        List<Participant> list = Dao.getAllParticipants();
        int i=1;
        out.print("<table border='1' width='80%' id='cus_table2'>");
        out.print("<caption><h1>Registered Participants List</h1></caption>");
        out.print("<tr><th>SL</th><th>Name</th><th>Mobile</th><th>EMail</th><th>Occupation</th><th>Affiliation</th><th>Edit</th><th>Delete</th></tr>");
        for (Participant p : list) {
            out.print("<tr><td>" + i + "</td><td>" + p.getName() + "</td><td>" + p.getMobile() + "</td><td>"
                    + p.getEmail() + "</td><td>" + p.getOccupation() + "</td><td>" + p.getAffiliation() + "</td><td><a href='Edit?id="+ p.getId()+"'>Edit</a>"+"</td><td><a href='Delete?id="+p.getId()+"'>Delete</a> "+"</td></tr>");
                    i++;
        }
        out.print("<tr><td colspan=8 align='center'> <a href='registration.html'>Add New Participants</a></td>");
        out.print("</table></center></body>");         
        out.close();
    }
}    
