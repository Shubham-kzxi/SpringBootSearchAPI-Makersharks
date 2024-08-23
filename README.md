# Makersharks Supplier Search API

## Overview
This project is a proof of concept (POC) for the Makersharks Supplier Search API. 
It allows buyers to search for manufacturers based on their customized requirements such as location, nature of business, and manufacturing processes. 
The API is built using Spring Boot and integrates with a MySQL database.

## Features
- Retrieve a list of manufacturers based on specific criteria (location, nature of business, manufacturing processes).
- Support for pagination to manage large sets of data.

- ## Technologies Used
- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **MySQL**
- **Hibernate**
- **Maven**
- **Postman** (for API testing)

- ### Installation
1. **Clone the repository:**

   git clone https://github.com/Shubham-kzxi//SpringBootSearchAPI-Makersharks.git
   cd SpringBootSearchAPI-Makersharks

2. **Set up the MySQL database:**

Create a new MySQL database:
CREATE DATABASE MakerSharks;
Update the database configuration in src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/MakerSharks
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update

### Build and run the project:
mvn clean install
mvn spring-boot:run

## API Endpoints
-- For adding new Supplier
URL > http://localhost:8080/api/supplier/add
Method > Post
Request Body>>
<<Consider following entry and add multiple entries with same location and same naturaOfBusiness and same manufacturingProcesses to test>>
{
    "companyName":"canadiancompany",
    "website":"canada5.com",
    "location": "Canada",
    "natureOfBusiness": "medium_scale",
    "manufacturingProcesses": "coating"

}

--For Retriving data based on location,natureofbusiness and manufacturingprocess
url> http://localhost:8080/api/supplier/query
method> Post
request body> {
    "location": "USA",
    "natureOfBusiness": "small_scale",
    "manufacturingProcesses": "3d_printing"
}

reponse>>> this will retrieve all the suppliers matching with abover category
## Pagination 
page - the page number (default is 0).
size - the number of records per page (default is 10).
to use pagination just change the url>> http://localhost:8080/api/supplier/query?page=0&size=2


## TODO
--Proper exception handling
--role based access to secure sensitive data


   
