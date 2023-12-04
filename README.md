# Spring Boot Elasticsearch Repository for Book Management

This Spring Boot application demonstrates the integration of Elasticsearch for managing books. It provides functionality to insert books into Elasticsearch and fetch books from the Elasticsearch repository using Spring Data Elasticsearch.

# Table of Contents

1.Prerequisites
2. Setup
3. Configuration
4. Running the Application
5. API Endpoints
6. Sample Requests and Responses
7. Contributing
8. License

# Prerequisites
Java 8 or higher installed on your machine.
Maven installed on your machine.
Elasticsearch server running locally or on a remote server.

# Setup
Clone the repository:

git clone https://github.com/yourusername/spring-boot-elasticsearch-repository.git
Navigate to the project directory:

cd spring-boot-elasticsearch-repository
# Configuration
Configure Elasticsearch connection properties in the application.properties file:

# properties
spring.data.elasticsearch.cluster-nodes=localhost:9200
Running the Application
Build the application using Maven:

mvn clean install
Run the application:

java -jar target/spring-boot-elasticsearch-repository-1.0.jar
The application will start on http://localhost:8080.

# API Endpoints

# Insert a Book:

# Endpoint: POST /api/books

Request Body:
{
  "title": "The Art of Programming",
  "author": "Donald Knuth"
}

# Fetch All Books:

Endpoint: GET /api/books
Sample Requests and Responses
Insert a Book
Request:

curl -X POST \
  http://localhost:8080/api/books \
  -H 'Content-Type: application/json' \
  -d '{
    "title": "The Art of Programming",
    "author": "Donald Knuth"
  }'
  
Response:
{
  "id": "1",
  "title": "The Art of Programming",
  "author": "Donald Knuth",
  "publicationYear": 1968
}
Fetch All Books
Request:

bash
Copy code
curl -X GET http://localhost:8080/api/books
Response:

[
  {
    "id": "1",
    "title": "The Art of Programming",
    "author": "Donald Knuth"
  }
]

# Contributing
Feel free to contribute to the development of this project. If you find any issues or have suggestions, please create an issue or submit a pull request.

