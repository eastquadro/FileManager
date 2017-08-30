import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by eastquadro on 14.07.2017.
 */
@WebServlet(name = "OpenFolder", urlPatterns = "/open")
public class OpenFolder extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String s = request.getParameter("name");
        AllFiles.setAdress(s);
        AllFiles.adressStack.add(0, AllFiles.getAdress());
        response.sendRedirect("/fileman");
    }
}
