import org.apache.commons.codec.binary.Base64;
import org.apache.commons.compress.compressors.xz.XZCompressorInputStream;
import org.apache.commons.compress.compressors.xz.XZCompressorOutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


@WebServlet("/decoder")
public class Decoder extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("decoder.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String textForEncode= req.getParameter("textForEncode");

        byte[] buf = new byte[100];

        ByteArrayInputStream bin = new ByteArrayInputStream(Base64.decodeBase64(textForEncode));
        XZCompressorInputStream xzIn = new XZCompressorInputStream(bin);
        xzIn.read(buf);
        xzIn.close();

        String result = new String(buf);

        req.setAttribute("result", result);

        req.getRequestDispatcher("decoder.jsp").forward(req, resp);
    }

}

