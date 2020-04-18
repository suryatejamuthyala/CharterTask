# Points Calculator based on customer transaction
#The rest API to get customer rewards based on customer Id

- The package name is structured as com.retailer.rewards
- Exception is thrown if customer does not exists.
- H2 in-memory database to store the information.
- Please check doc file provided in the project
- Install H2 db locally and run it . change the db settings in application.properties file.
- Do run the scrip.sql on H2 in memory DB to prepare the test data.
- Please refer Calculator.docx

```
 http://localhost:8080/customers/{customerId}/rewards
```

By `https://www.linkedin.com/in/suryatejamuthyala/`
