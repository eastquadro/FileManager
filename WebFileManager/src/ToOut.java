import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by eastquadro on 13.07.2017.
 */
@WebServlet(name = "ToOut" , urlPatterns = "/fileman")
public class ToOut extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("fath",AllFiles.getAdress());

          //

        request.setAttribute("FileZ",AllFiles.getDir(AllFiles.getAdress()));
        request.setAttribute("FileZeta",AllFiles.getFiles(AllFiles.getAdress()));
        request.getRequestDispatcher("fileman.jsp").forward(request,response);
    }
}
