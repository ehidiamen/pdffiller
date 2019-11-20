package ng.nmart.pdffiller;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class PDFService {
    protected void manipulatePDF(PDFModel pdfModel, HttpServletResponse response) throws Exception {
        String filen = "ESDC-EMP5624.pdf";
        ClassPathResource pdfFile = new ClassPathResource(filen);
        System.out.println(pdfFile.getFilename() + " exists: " + pdfFile.exists());
        PdfReader reader = new PdfReader(pdfFile.getFilename());
        reader.setUnethicalReading(true);
        PdfDocument pdfDoc = new PdfDocument(reader, new PdfWriter(response.getOutputStream()));

        PdfAcroForm form = PdfAcroForm.getAcroForm(pdfDoc, true);
        form.setGenerateAppearance(true);

        PdfFont font = PdfFontFactory.createFont();

        if(pdfModel.getPage1_No_business() != null && !pdfModel.getPage1_No_business().equals("")){
            form.getField("EMP5624_E[0].Page1[0].No_business[0]").setValue("1", true);
        }
        if(pdfModel.getPage1_No_inn() != null && !pdfModel.getPage1_No_inn().equals("")){
            form.getField("EMP5624_E[0].Page1[0].No_inn[0]").setValue("1", true);
        }
        if(pdfModel.getPage1_rb_language_oral2_1() != null && !pdfModel.getPage1_rb_language_oral2_1().equals("")){
            form.getField("EMP5624_E[0].Page1[0].rb_language_oral2[0].1").setValue("1", true);
        }
        if(pdfModel.getPage1_rb_language_oral2_2() != null && !pdfModel.getPage1_rb_language_oral2_2().equals("")){
            form.getField("EMP5624_E[0].Page1[0].rb_language_oral2[0].2").setValue("1", true);
        }
        if(pdfModel.getPage1_rb_language_oral_1() != null && !pdfModel.getPage1_rb_language_oral_1().equals("")){
            form.getField("EMP5624_E[0].Page1[0].rb_language_oral[0].1").setValue("1", true);
        }
        if(pdfModel.getPage1_rb_language_oral_2() != null && !pdfModel.getPage1_rb_language_oral_2().equals("")){
            form.getField("EMP5624_E[0].Page1[0].rb_language_oral[0].2").setValue("1", true);
        }
        if(pdfModel.getPage1_rb_language_written2_1() != null && !pdfModel.getPage1_rb_language_written2_1().equals("")){
            form.getField("EMP5624_E[0].Page1[0].rb_language_written2[0].1").setValue("1", true);
        }
        if(pdfModel.getPage1_rb_language_written2_2() != null && !pdfModel.getPage1_rb_language_written2_2().equals("")){
            form.getField("EMP5624_E[0].Page1[0].rb_language_written2[0].2").setValue("1", true);
        }
        if(pdfModel.getPage1_rb_language_written_1() != null && !pdfModel.getPage1_rb_language_written_1().equals("")){
            form.getField("EMP5624_E[0].Page1[0].rb_language_written[0].1").setValue("1", true);
        }
        if(pdfModel.getPage1_rb_language_written_2() != null && !pdfModel.getPage1_rb_language_written_2().equals("")){
            form.getField("EMP5624_E[0].Page1[0].rb_language_written[0].2").setValue("1", true);
        }
        if(pdfModel.getPage1_txtF_alternate_phone() != null && !pdfModel.getPage1_txtF_alternate_phone().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_alternate_phone[0]").setValue(pdfModel.getPage1_txtF_alternate_phone(), font, 12f);
        }
        if(pdfModel.getPage1_txtF_alternate_phone2() != null && !pdfModel.getPage1_txtF_alternate_phone2().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_alternate_phone2[0]").setValue(pdfModel.getPage1_txtF_alternate_phone2(), font, 12f);
        }
        if(pdfModel.getPage1_txtF_des_part() != null && !pdfModel.getPage1_txtF_des_part().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_des_part[0]").setValue(pdfModel.getPage1_txtF_des_part(), font, 12f);
        }
        if(pdfModel.getPage1_txtF_Email() != null && !pdfModel.getPage1_txtF_Email().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_Email[0]").setValue(pdfModel.getPage1_txtF_Email(), font, 12f);
        }
        if(pdfModel.getPage1_txtF_Email2() != null && !pdfModel.getPage1_txtF_Email2().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_Email2[0]").setValue(pdfModel.getPage1_txtF_Email2(), font, 12f);
        }
        if(pdfModel.getPage1_txtF_fax_number() != null && !pdfModel.getPage1_txtF_fax_number().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_fax_number[0]").setValue(pdfModel.getPage1_txtF_fax_number(), font, 12f);
        }
        if(pdfModel.getPage1_txtF_fax_number2() != null && !pdfModel.getPage1_txtF_fax_number2().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_fax_number2[0]").setValue(pdfModel.getPage1_txtF_fax_number2(), font, 12f);
        }
        if(pdfModel.getPage1_txtF_first_name() != null && !pdfModel.getPage1_txtF_first_name().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_first_name[0]").setValue(pdfModel.getPage1_txtF_first_name(), font, 12f);
        }
        if(pdfModel.getPage1_txtF_first_name2() != null && !pdfModel.getPage1_txtF_first_name2().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_first_name2[0]").setValue(pdfModel.getPage1_txtF_first_name2(), font, 12f);
        }
        if(pdfModel.getPage1_txtF_last_name() != null && !pdfModel.getPage1_txtF_last_name().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_last_name[0]").setValue(pdfModel.getPage1_txtF_last_name(), font, 12f);
        }
        if(pdfModel.getPage1_txtF_last_name2() != null && !pdfModel.getPage1_txtF_last_name2().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_last_name2[0]").setValue(pdfModel.getPage1_txtF_last_name2(), font, 12f);
        }
        if(pdfModel.getPage1_txtF_mid_name() != null && !pdfModel.getPage1_txtF_mid_name().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_mid_name[0]").setValue(pdfModel.getPage1_txtF_mid_name(), font, 12f);
        }
        if(pdfModel.getPage1_txtF_mid_name2() != null && !pdfModel.getPage1_txtF_mid_name2().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_mid_name2[0]").setValue(pdfModel.getPage1_txtF_mid_name2(), font, 12f);
        }
        if(pdfModel.getPage1_txtF_phone_number() != null && !pdfModel.getPage1_txtF_phone_number().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_phone_number[0]").setValue(pdfModel.getPage1_txtF_phone_number(), font, 12f);
        }
        if(pdfModel.getPage1_txtF_phone_number2() != null && !pdfModel.getPage1_txtF_phone_number2().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_phone_number2[0]").setValue(pdfModel.getPage1_txtF_phone_number2(), font, 12f);
        }
        if(pdfModel.getPage1_Yes_business() != null && !pdfModel.getPage1_Yes_business().equals("")){
            form.getField("EMP5624_E[0].Page1[0].Yes_business[0]").setValue("1", true);
        }
        if(pdfModel.getPage1_Yes_inn() != null && !pdfModel.getPage1_Yes_inn().equals("")){
            form.getField("EMP5624_E[0].Page1[0].Yes_inn[0]").setValue("1", true);
        }
        if(pdfModel.getPage2_cb_individual() != null && !pdfModel.getPage2_cb_individual().equals("")){
            form.getField("EMP5624_E[0].Page2[0].cb_individual[0]").setValue("1", true);
        }
        if(pdfModel.getPage2_cb_not_profit() != null && !pdfModel.getPage2_cb_not_profit().equals("")){
            form.getField("EMP5624_E[0].Page2[0].cb_not_profit[0]").setValue("1", true);
        }
        if(pdfModel.getPage2_cb_partnership() != null && !pdfModel.getPage2_cb_partnership().equals("")){
            form.getField("EMP5624_E[0].Page2[0].cb_partnership[0]").setValue("1", true);
        }
        if(pdfModel.getPage2_cb_registred() != null && !pdfModel.getPage2_cb_registred().equals("")){
            form.getField("EMP5624_E[0].Page2[0].cb_registred[0]").setValue("1", true);
        }
        if(pdfModel.getPage2_cb_society() != null && !pdfModel.getPage2_cb_society().equals("")){
            form.getField("EMP5624_E[0].Page2[0].cb_society[0]").setValue("1", true);
        }
        if(pdfModel.getPage2_cb_sole_propietor() != null && !pdfModel.getPage2_cb_sole_propietor().equals("")){
            form.getField("EMP5624_E[0].Page2[0].cb_sole_propietor[0]").setValue("1", true);
        }
        if(pdfModel.getPage2_num_Company_Code() != null && !pdfModel.getPage2_num_Company_Code().equals("")){
            form.getField("EMP5624_E[0].Page2[0].num_Company_Code[0]").setValue("1", true);
        }
        if(pdfModel.getPage2_num_Company_Code_1() != null && !pdfModel.getPage2_num_Company_Code_1().equals("")){
            form.getField("EMP5624_E[0].Page2[0].num_Company_Code[1]").setValue("1", true);
        }
        if(pdfModel.getPage2_rb_language_oral2_1() != null && !pdfModel.getPage2_rb_language_oral2_1().equals("")){
            form.getField("EMP5624_E[0].Page2[0].rb_other_language_oral2[0].1").setValue("1", true);
        }
        if(pdfModel.getPage2_rb_language_oral2_2() != null && !pdfModel.getPage2_rb_language_oral2_2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].rb_other_language_oral2[0].2").setValue("1", true);
        }
        if(pdfModel.getPage2_rb_language_written2_1() != null && !pdfModel.getPage2_rb_language_written2_1().equals("")){
            form.getField("EMP5624_E[0].Page2[0].rb_other_anguage_written2[0].1").setValue("1", true);
        }
        if(pdfModel.getPage2_rb_language_written2_2() != null && !pdfModel.getPage2_rb_language_written2_2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].rb_other_anguage_written2[0].2").setValue("1", true);
        }
        if(pdfModel.getPage2_rb_other_anguage_written2_1() != null && !pdfModel.getPage2_rb_other_anguage_written2_1().equals("")){
            form.getField("EMP5624_E[0].Page2[0].rb_other_anguage_written2[0].1").setValue("1", true);
        }
        if(pdfModel.getPage2_rb_other_anguage_written2_2() != null && !pdfModel.getPage2_rb_other_anguage_written2_2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].rb_other_anguage_written2[0].2").setValue("1", true);
        }
        if(pdfModel.getPage2_rb_other_language_oral2_1() != null && !pdfModel.getPage2_rb_other_language_oral2_1().equals("")){
            form.getField("EMP5624_E[0].Page2[0].rb_language_oral2[0].1").setValue("1", true);
        }
        if(pdfModel.getPage2_rb_other_language_oral2_2() != null && !pdfModel.getPage2_rb_other_language_oral2_2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].rb_language_oral2[0].2").setValue("1", true);
        }
        if(pdfModel.getPage2_rb_receive_prog_1() != null && !pdfModel.getPage2_rb_receive_prog_1().equals("")){
            form.getField("EMP5624_E[0].Page2[0].rb_receive_prog[0].1").setValue("1", true);
        }
        if(pdfModel.getPage2_rb_receive_prog_2() != null && !pdfModel.getPage2_rb_receive_prog_2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].rb_receive_prog[0].2").setValue("1", true);
        }
        if(pdfModel.getPage2_rb_tiers_1() != null && !pdfModel.getPage2_rb_tiers_1().equals("")){
            form.getField("EMP5624_E[0].Page2[0].rb_tiers[0].1").setValue("1", true);
        }
        if(pdfModel.getPage2_rb_tiers_2() != null && !pdfModel.getPage2_rb_tiers_2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].rb_tiers[0].2").setValue("1", true);
        }
        if(pdfModel.getPage2_txtF_alternate_phone2() != null && !pdfModel.getPage2_txtF_alternate_phone2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_alternate_phone2[0]").setValue(pdfModel.getPage2_txtF_alternate_phone2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_amout_employees() != null && !pdfModel.getPage2_txtF_amout_employees().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_amout_employees[0]").setValue(pdfModel.getPage2_txtF_amout_employees(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_business_revenu() != null && !pdfModel.getPage2_txtF_business_revenu().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_business_revenu[0]").setValue(pdfModel.getPage2_txtF_business_revenu(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_City() != null && !pdfModel.getPage2_txtF_City().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_City[0]").setValue(pdfModel.getPage2_txtF_City(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_City2() != null && !pdfModel.getPage2_txtF_City2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_City2[0]").setValue(pdfModel.getPage2_txtF_City2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_Country() != null && !pdfModel.getPage2_txtF_Country().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_Country[0]").setValue(pdfModel.getPage2_txtF_Country(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_Country2() != null && !pdfModel.getPage2_txtF_Country2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_Country2[0]").setValue(pdfModel.getPage2_txtF_Country2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_Email2() != null && !pdfModel.getPage2_txtF_Email2().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_Email2[0]").setValue(pdfModel.getPage2_txtF_Email2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_Emp_Legal() != null && !pdfModel.getPage2_txtF_Emp_Legal().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_Emp_Legal[0]").setValue(pdfModel.getPage2_txtF_Emp_Legal(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_Employer_Date_Business() != null && !pdfModel.getPage2_txtF_Employer_Date_Business().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_Employer_Date_Business[0]").setValue(pdfModel.getPage2_txtF_Employer_Date_Business(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_Employer_Web_Address() != null && !pdfModel.getPage2_txtF_Employer_Web_Address().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_Employer_Web_Address[0]").setValue(pdfModel.getPage2_txtF_Employer_Web_Address(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_fax_number2() != null && !pdfModel.getPage2_txtF_fax_number2().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_fax_number2[0]").setValue(pdfModel.getPage2_txtF_fax_number2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_first_name2() != null && !pdfModel.getPage2_txtF_first_name2().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_first_name2[0]").setValue(pdfModel.getPage2_txtF_first_name2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_If_Yes2() != null && !pdfModel.getPage2_txtF_If_Yes2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_If_Yes2[0]").setValue(pdfModel.getPage2_txtF_If_Yes2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_last_name2() != null && !pdfModel.getPage2_txtF_last_name2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_last_name2[0]").setValue(pdfModel.getPage2_txtF_last_name2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_Mail_Adress1() != null && !pdfModel.getPage2_txtF_Mail_Adress1().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_Mail_Adress1[0]").setValue(pdfModel.getPage2_txtF_Mail_Adress1(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_Mail_Adress2() != null && !pdfModel.getPage2_txtF_Mail_Adress2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_Mail_Adress2[0]").setValue(pdfModel.getPage2_txtF_Mail_Adress2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_Mail_Adress2_1() != null && !pdfModel.getPage2_txtF_Mail_Adress2_1().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_Mail_Adress2-1[0]").setValue(pdfModel.getPage2_txtF_Mail_Adress2_1(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_Mail_Adress2_2() != null && !pdfModel.getPage2_txtF_Mail_Adress2_2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_Mail_Adress2-2[0]").setValue(pdfModel.getPage2_txtF_Mail_Adress2_2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_mid_name2() != null && !pdfModel.getPage2_txtF_mid_name2().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_mid_name2[0]").setValue(pdfModel.getPage2_txtF_mid_name2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_other_alternate_phone2() != null && !pdfModel.getPage2_txtF_other_alternate_phone2().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_alternate_phone2[0]").setValue(pdfModel.getPage2_txtF_other_alternate_phone2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_other_Email2() != null && !pdfModel.getPage2_txtF_other_Email2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_other_Email2[0]").setValue(pdfModel.getPage2_txtF_other_Email2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_other_fax_number2() != null && !pdfModel.getPage2_txtF_other_fax_number2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_other_fax_number2[0]").setValue(pdfModel.getPage2_txtF_other_fax_number2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_other_first_name2() != null && !pdfModel.getPage2_txtF_other_first_name2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_other_first_name2[0]").setValue(pdfModel.getPage2_txtF_other_first_name2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_other_last_name2() != null && !pdfModel.getPage2_txtF_other_last_name2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_other_last_name2[0]").setValue(pdfModel.getPage2_txtF_other_last_name2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_other_mid_name2() != null && !pdfModel.getPage2_txtF_other_mid_name2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_other_mid_name2[0]").setValue(pdfModel.getPage2_txtF_other_mid_name2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_other_phone_number2() != null && !pdfModel.getPage2_txtF_other_phone_number2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_other_phone_number2[0]").setValue(pdfModel.getPage2_txtF_other_phone_number2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_other_position_title() != null && !pdfModel.getPage2_txtF_other_position_title().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_other_position_title[0]").setValue(pdfModel.getPage2_txtF_other_position_title(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_phone_number2() != null && !pdfModel.getPage2_txtF_phone_number2().equals("")){
            form.getField("EMP5624_E[0].Page1[0].txtF_phone_number2[0]").setValue(pdfModel.getPage2_txtF_phone_number2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_position_title() != null && !pdfModel.getPage2_txtF_position_title().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_position_title[0]").setValue(pdfModel.getPage2_txtF_position_title(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_Postal_Code() != null && !pdfModel.getPage2_txtF_Postal_Code().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_Postal_Code[0]").setValue(pdfModel.getPage2_txtF_Postal_Code(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_Postal_Code2() != null && !pdfModel.getPage2_txtF_Postal_Code2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_Postal_Code2[0]").setValue(pdfModel.getPage2_txtF_Postal_Code2(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_Province() != null && !pdfModel.getPage2_txtF_Province().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_Province[0]").setValue(pdfModel.getPage2_txtF_Province(), font, 12f);
        }
        if(pdfModel.getPage2_txtF_Province2() != null && !pdfModel.getPage2_txtF_Province2().equals("")){
            form.getField("EMP5624_E[0].Page2[0].txtF_Province2[0]").setValue(pdfModel.getPage2_txtF_Province2(), font, 12f);
        }

        PdfAcroForm.getAcroForm(pdfDoc, true).flattenFields();
        pdfDoc.close();
    }

}
