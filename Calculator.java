import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="Calculator",urlPatterns = "/MyCalculator")
public class Calculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=null;
        resp.setContentType("text/html");
        try {
           out= resp.getWriter();
        String num1=req.getParameter("num1");
        double n1=Integer.parseInt(num1);
        String num2=req.getParameter("num2");
        double n2=Integer.parseInt(num2);
        String num3=req.getParameter("num3");
        double n3=Integer.parseInt(num3);
        String num4=req.getParameter("num4");
        double n4=Integer.parseInt(num4);
        if(!num1.equals("") && !num2.equals("")) {
            double sum = n1 + n2;
            out.println("<p>"+n1+"+"+n2+"="+sum+"</p>");
        }
        if(!num3.equals("") && !num4.equals("")) {
                double mult = n3 + n4;
                out.println("<p>"+n3+"+"+n4+"="+mult+"</p>");
            }

        }catch (Exception e){
            out.println("Error:" +e.getMessage());
        }
        finally {
            out.println("<br/>goto home <a href=index.html >Click here</a>");
        }

    }


}
