PDF Form Filler

This project was done to create a service that outputs a completed PDF application form, using the supplied JSON data.
The empty form to be filled is the Canada Global Talent Stream Application and can be found at the link below:
https://drive.google.com/open?id=13-CIgjeeM9S6MLh7KkrI5daoKjuund2C

The current implementation only fills Page 1 and 2 of the application form. Java was the language of choice and Spring framework was used to build the app.

A PUT request containing JSON data, conforming with the API for this app, is made to the server and a filled, flattened PDF form containing the data supplied is returned to the caller.

Demo

Use the sample json found in sample.json as the raw data to send. You can edit the parameter values as you wish, but in conformity with the API.

Request Method: PUT

URL: http://nmart.com.ng/pdffiller-0.0.1-SNAPSHOT/pdf

Response is a PDF file with the relevant fields filled.

Postman is a useful tool for making this request.

JSON API documentation

  FIELD NAME                        DATA TYPE           REQUIRED TEXT FOR FIELD TO BE EDITED
  page1_Yes_business                String               "1"
  page1_No_business                 String               "1"
  page1_Yes_inn                     String               "1"
  page1_No_inn                      String               "1"
  page1_txtF_des_part               String               ANY TEXT
  page1_txtF_first_name             String               ANY TEXT
  page1_txtF_mid_name               String               ANY TEXT
  page1_txtF_last_name              String               ANY TEXT
  page1_txtF_phone_number           String               ANY TEXT
  page1_txtF_alternate_phone        String               ANY TEXT
  page1_txtF_fax_number             String               ANY TEXT
  page1_txtF_Email                  String               ANY TEXT
  page1_rb_language_oral            String               "1"
  page1_rb_language_oral_1          String               "1"
  page1_rb_language_oral_2          String               "1"
  page1_rb_language_written         String               "1"
  page1_rb_language_written_1       String               "1"
  page1_rb_language_written_2       String               "1"
  page1_txtF_first_name2            String               ANY TEXT
  page1_txtF_mid_name2              String               ANY TEXT
  page1_txtF_last_name2             String               ANY TEXT
  page1_txtF_phone_number2          String               ANY TEXT
  page1_txtF_alternate_phone2       String               ANY TEXT
  page1_txtF_fax_number2            String               ANY TEXT
  page1_txtF_Email2                 String               ANY TEXT
  page1_rb_language_oral2           String               "1"
  page1_rb_language_oral2_1         String               "1"
  page1_rb_language_oral2_2         String               "1"
  page1_rb_language_written2        String               "1"
  page1_rb_language_written2_1      String               "1"
  page1_rb_language_written2_2      String               "1"
  page2_txtF_Emp_Legal              String               ANY TEXT
  page2_txtF_Mail_Adress1           String               ANY TEXT
  page2_txtF_Mail_Adress2           String               ANY TEXT
  page2_txtF_City                   String               ANY TEXT
  page2_txtF_Province               String               ANY TEXT
  page2_txtF_Country                String               ANY TEXT
  page2_txtF_Postal_Code            String               ANY TEXT
  page2_txtF_Mail_Adress2_1         String               ANY TEXT
  page2_txtF_Mail_Adress2_2         String               ANY TEXT
  page2_txtF_City2                  String               ANY TEXT
  page2_txtF_Province2              String               ANY TEXT
  page2_txtF_Country2               String               ANY TEXT
  page2_txtF_Postal_Code2           String               ANY TEXT
  page2_txtF_Employer_Web_Address   String               ANY TEXT
  page2_txtF_Employer_Date_Business String               ANY TEXT
  page2_cb_individual               String               "1"
  page2_cb_partnership              String               "1"
  page2_cb_society                  String               "1"
  page2_cb_sole_propietor           String               "1"
  page2_cb_not_profit               String               "1"
  page2_cb_registred                String               "1"
  page2_txtF_amout_employees        String               ANY TEXT
  page2_txtF_business_revenu        String               ANY TEXT
  page2_rb_receive_prog             String               "1"
  page2_rb_receive_prog_1           String               "1"
  page2_rb_receive_prog_2           String               "1"
  page2_txtF_If_Yes2                String               ANY TEXT
  page2_txtF_position_title         String               ANY TEXT
  page2_txtF_first_name2            String               ANY TEXT
  page2_txtF_mid_name2              String               ANY TEXT
  page2_txtF_last_name2             String               ANY TEXT
  page2_txtF_phone_number2          String               ANY TEXT
  page2_txtF_alternate_phone2       String               ANY TEXT
  page2_txtF_fax_number2            String               ANY TEXT
  page2_txtF_Email2                 String               ANY TEXT
  page2_rb_language_oral2           String               "1"
  page2_rb_language_oral2_1         String               "1"
  page2_rb_language_oral2_2         String               "1"
  page2_rb_language_written2        String               "1"
  page2_rb_language_written2_1      String               "1"
  page2_rb_language_written2_2      String               "1"
  page2_txtF_other_position_title   String               ANY TEXT
  page2_txtF_other_first_name2      String               ANY TEXT
  page2_txtF_other_mid_name2        String               ANY TEXT
  page2_txtF_other_last_name2       String               ANY TEXT
  page2_txtF_other_phone_number2    String               ANY TEXT
  page2_txtF_other_alternate_phone2 String               ANY TEXT
  page2_txtF_other_fax_number2      String               ANY TEXT
  page2_txtF_other_Email2           String               ANY TEXT
  page2_rb_other_language_oral2     String               "1"
  page2_rb_other_language_oral2_1   String               "1"
  page2_rb_other_language_oral2_2   String               "1"
  page2_rb_other_anguage_written2   String               "1"
  page2_rb_other_anguage_written2_1 String               "1"
  page2_rb_other_anguage_written2_2 String               "1"
  page2_rb_tiers                    String               "1"
  page2_rb_tiers_1                  String               "1"
  page2_rb_tiers_2                  String               "1"
  page2_num_Company_Code            String               "1"
  page2_num_Company_Code_1          String               "1"
