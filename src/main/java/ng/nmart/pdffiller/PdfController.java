package ng.nmart.pdffiller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class PdfController {
    @Autowired PDFService pdfService;

    @PutMapping("/pdf")
    @ResponseBody
    public void createPDF(@RequestBody PDFModel pdfModel, HttpServletResponse response) {
        response.setContentType("application/pdf");

        try {
            pdfService.manipulatePDF(pdfModel, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
