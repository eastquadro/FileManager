import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by eastquadro on 15.07.2017.
 */
@WebServlet(name = "Backpage", urlPatterns = "/back")
public class Backpage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String s = request.getParameter("name");
            if(AllFiles.adressStack.size()==1)
            {
                response.sendRedirect("/index");
            }
            else {
                AllFiles.adressStack.remove(0);
                AllFiles.setAdress(AllFiles.adressStack.get(0));
            }



        response.sendRedirect("/fileman");
    }
}
