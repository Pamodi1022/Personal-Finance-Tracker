# Personal Finance Tracker
A web-based application built with Spring Boot and Thymeleaf for managing personal finances. This application enables users to track their income and expenses, view financial summaries, categorize transactions, and manage their data in a user-friendly interface.

## Features
- Dashboard: View a summary of financial data including total income, total expenses, and recent transactions. Optionally, graphical charts display income vs. expenses and monthly trends.
- Transaction Management: Add, update, and delete transactions with options to categorize and specify transaction type (INCOME or EXPENSE).
- Category Management: Manage categories for transactions to organize expenses and income effectively.
- User Management: Register new users, login, and secure access to personal finance data.
- Transaction History: Filter and view transaction history by date, type, and category.
- Validation: Server-side validation for all entries to ensure data accuracy (e.g., positive amounts, non-empty descriptions).

## Technologies Used
- Backend: Spring Boot with Spring Web, Spring Data JPA, Spring Validation.
- Frontend: Thymeleaf templates for dynamic server-side rendering.
- Database: MySQL for storing user, transaction, and category data.

## Project Structure
- Entity Layer: Defines Transaction, Category, and User entities with relationships.
- Controller Layer: Manages HTTP requests for transactions, categories, and dashboard functionalities.
- Service Layer: Contains business logic for financial summaries, statistics, and CRUD operations.
- Repository Layer: Uses Spring Data JPA to manage database interactions.
