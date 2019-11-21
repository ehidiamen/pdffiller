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

  
