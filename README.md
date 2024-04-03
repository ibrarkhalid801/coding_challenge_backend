# Coding Challenge Backend

This repository contains the backend solution for a coding challenge involving a retailer's rewards program. The backend is implemented using Spring Boot and provides a RESTful API endpoint to calculate reward points earned by customers based on their purchase history.

## Task Description

The task involves implementing a rewards program for a retailer's customers. Points are awarded based on each recorded purchase, with customers receiving 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent between $50 and $100 in each transaction.

## Solution Overview

- **Technology Stack**: Spring Boot, Java
- **RESTful Endpoint**: `/transactions/calculate-rewards`
- **Input**: Transaction object containing the amount of purchase
- **Output**: Total reward points earned for each customer per month and overall

## Getting Started

To run the backend solution locally, follow these steps:

1. Clone the repository: git clone https://github.com/ibrarkhalid801/coding_challenge_backend.git

2. Navigate to the project directory: cd coding_challenge_backend

3. Build the project using Gradle: ./gradlew build

4. Run the application: ./gradlew bootRun

5. The backend server should now be running locally on port 8080.

## API Usage

You can access the rewards calculation endpoint using the following URL: http://localhost:8080/transactions/calculate-rewards


Example request body:

```json
{
    "id": "12345",
    "customerId": "345678",
    "amount": 120
}
Example response:
{
    "id": 12345,
    "customerId": 345678,
    "amount": 120.0,
    "rewardPoints": 90
}
```

## Repository Structure
- **src/main/java:** Contains the Java source code for the backend application.
- **src/test/java:** Contains unit tests for the backend application.
- **build.gradle:** Gradle build configuration file.
- **README.md:** This README file.


