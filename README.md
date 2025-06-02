Url to access the swagger page with the endpoints -> http://localhost:8080/swagger-ui/index.html

* Remember to create the database with the name "JavaLevel1Exam" before running the project or change the name in application.xml page, but make sure to have the database created beforehand, the name in the application.xml has to match the one in the database.
* The username and password properties have to match your database username and password, don't forget to change it in the application.xml file.
* To maintain the data inserted in the database even when stopping the application, set the ddl-auto property in the application.xml to update.
* This application depends on postgreSql to work properly.

  // HERE'S SOME DATA TO INSERT USING THE CONTROLLER FOR FAST TESTING

  CATEGORY : [ 
    { "name": "Electronics" },
    { "name": "Books" },
    { "name": "Clothing" },
    { "name": "Home & Kitchen" },
    { "name": "Sports & Outdoors" },
    { "name": "Toys & Games" },
    { "name": "Beauty & Personal Care" },
    { "name": "Automotive" },
    { "name": "Health" },
    { "name": "Groceries" }
  ]

  
  PRODUCT : [
  { "categoryId": 1, "name": "Smartphone",        "price": 699.99, "quantity": 50 },
  { "categoryId": 1, "name": "Laptop",            "price": 1199.00, "quantity": 30 },
  { "categoryId": 2, "name": "Novel - Sci-Fi",    "price": 15.99,  "quantity": 120 },
  { "categoryId": 3, "name": "T-Shirt",           "price": 9.99,   "quantity": 200 },
  { "categoryId": 4, "name": "Blender",           "price": 49.90,  "quantity": 80 },
  { "categoryId": 5, "name": "Yoga Mat",          "price": 25.00,  "quantity": 100 },
  { "categoryId": 6, "name": "Board Game",        "price": 39.99,  "quantity": 60 },
  { "categoryId": 7, "name": "Shampoo",           "price": 7.49,   "quantity": 150 },
  { "categoryId": 8, "name": "Car Vacuum Cleaner","price": 29.99,  "quantity": 40 },
  { "categoryId": 10,"name": "Organic Coffee",    "price": 12.99,  "quantity": 90 }
]
  
  CLIENT : [
  { "name": "Alice Johnson", "email": "alice.johnson@example.com" },
  { "name": "Bob Smith", "email": "bob.smith@example.com" },
  { "name": "Charlie Evans", "email": "charlie.evans@example.com" },
  { "name": "Diana Moore", "email": "diana.moore@example.com" },
  { "name": "Ethan Brown", "email": "ethan.brown@example.com" },
  { "name": "Fiona Davis", "email": "fiona.davis@example.com" },
  { "name": "George White", "email": "george.white@example.com" },
  { "name": "Hannah Green", "email": "hannah.green@example.com" },
  { "name": "Ian Black", "email": "ian.black@example.com" },
  { "name": "Jenna Scott", "email": "jenna.scott@example.com" }
]
