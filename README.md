# User Stock Management System

This project consists of a Maven multi-module application designed to manage user stock portfolios with real-time price updates using gRPC. It includes the following components:

## Modules

### 1. **User Service**
- Maintains user information and their stock purchases.
- Users start with an initial balance ($X) when the application initializes.
- Allows users to buy and sell stocks as they prefer.
- Built with **Spring Boot** and **gRPC server**, and uses **H2 Database** for data storage.

### 2. **Stock Service**
- External service consumed by other modules.
- Provides real-time stock price updates through a **Server Streaming API**.
- Provides stock price information for specific stocks using a **Unary API**.

### 3. **Aggregator Service**
- Acts as an API Gateway for the frontend.
- Fetches real-time price updates from the **Stock Service**.
- Retrieves user portfolio and account balance from the **User Service**.
- Built with **Spring Boot** and **gRPC client**.

## Features

- **Real-Time Price Updates**:
  - Subscribes to stock price updates from the Stock Service on application startup.
  - Provides these updates to the frontend via Server Streaming.

- **User Portfolio Management**:
  - Fetches user information and portfolio details.
  - Updates the user portfolio when stocks are bought or sold.

- **Integration Tests**:
  - Comprehensive integration tests ensure seamless communication between services.

## Technical Stack
- **Java** with **Spring Boot**
- **gRPC** for inter-service communication
- **Maven** for project management
- **H2 Database** for lightweight storage

## Setup

1. Clone the repository.
2. Build the project using Maven:
   ```bash
   mvn clean install
   ```
3. Start the services in the following order:
   - Stock Service
   - User Service
   - Aggregator Service
4. Access the application via the Aggregator Service's exposed endpoints.

## Future Enhancements
- Expand database support to include PostgreSQL.
- Add user authentication and authorization.
- Introduce additional analytics and reporting capabilities.

---
