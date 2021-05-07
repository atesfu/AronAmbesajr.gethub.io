import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name="Calculator",urlPatterns = "/MyCalculator2")
public class Calculator2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=null;
        resp.setContentType("text/html");
        try {
            out= resp.getWriter();
            String num1=req.getParameter("num5");
            double n1=Integer.parseInt(num1);
            String num2=req.getParameter("num6");
            double n2=Integer.parseInt(num2);
            String num3=req.getParameter("num7");
            double n3=Integer.parseInt(num3);
            String num4=req.getParameter("num8");
            double n4=Integer.parseInt(num4);
            out.println("<form action='calculator2'>");
            if(!num1.equals("") && !num2.equals("")) {
                double sum = n1 + n2;
                out.println("<input name=\"a1\" value="+n1+">+<input name=\"a2\" value="+n2+">=<input name=\"sum1\" value="+sum+" readonly>");
            }

            out.println("<p></p>");
            if(!num3.equals("") && !num4.equals("")) {
                double mult = n3 + n4;
                out.println("<input name=\"m1\" value="+n3+">*<input name=\"m2\" value="+n4+">=<input name=\"prod1\" value="+mult+" readonly>");
            }
            out.print("<br/>");
            out.print(" <input type=\"submit\" value=\"Submit\" >");
            out.print("</form>");

        }catch (Exception e){
            out.println("Error:" +e.getMessage());
        }
        finally {
            out.println("<br/>goto home <a href=calc.html >Click here</a>");
        }

    }


}

