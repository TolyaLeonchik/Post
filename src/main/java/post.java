import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/save-request")
public class post extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String servletName = req.getParameter("name");
        String servletAge = req.getParameter("age");
        int servAge;
        String servletCity = req.getParameter("city");

        try {
            servAge = Integer.parseInt(servletAge);
        } catch (NumberFormatException e) {
            req.getRequestDispatcher("/failed-save-request.jsp").forward(req, resp);
            return;
        }

        req.setAttribute("name", servletName);
        req.setAttribute("age", servAge);
        req.setAttribute("city", servletCity);

        if (servletName == null || servletName.isEmpty() || servletAge.isEmpty()
                || servletCity == null || servletCity.isEmpty()) {
            req.getRequestDispatcher("/failed-save-request.jsp").forward(req, resp);
        } else req.getRequestDispatcher("/save-request.jsp").forward(req, resp);
    }
}
