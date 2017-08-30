import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * Created by eastquadro on 16.07.2017.
 */
@WebServlet(name = "Create", urlPatterns = "/create")
public class Create extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String dirorfil =   request.getParameter("val");
      String name = request.getParameter("txt");
      if(dirorfil.equals("dir"))
      {
          new File(AllFiles.getAdress()+ name).mkdir();
      }
      else if(dirorfil.equals("file"))
      {
          AllFiles.createFile(name);
      }
      response.sendRedirect("/fileman");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
