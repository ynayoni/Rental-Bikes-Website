Features

    User Authentication: Secure login and registration for users.

    Bike Management: Admins can add, update, or remove bikes from the inventory.

    Rental Management: Users can rent and return bikes; admins can monitor and manage rentals.

    Role-Based Access: Differentiated access levels for users and admins.

    Data Validation: Ensures data integrity and consistency.

Technology Stack

    Backend: Node.js with Express.js

    Database: MongoDB

    Authentication: JSON Web Tokens (JWT)

    Data Validation: Zod

    Code Formatting: Prettier

    Linting: ESLint

Setup Instructions
Prerequisites

    Node.js (v14 or later)

    MongoDB (local or remote instance)

Installation

    Clone the repository:

git clone https://github.com/ynayoni/Rental-Bikes-Website.git
cd rentalbikesbackend

Install dependencies:

npm install

Set up environment variables:

Create a .env file in the root directory and add the following variables:

NODE_ENV=development
PORT=5000
DATABASE_URL=your_mongodb_connection_string
JWT_SECRET=your_jwt_secret_key

Replace your_mongodb_connection_string with your actual MongoDB connection string and your_jwt_secret_key with a secure secret key for JWT.

Run the application:

    npm run start:dev

    The server should be running on http://localhost:5000.

API Endpoints
Authentication

    POST /api/auth/signup: Register a new user.

    POST /api/auth/login: Authenticate and obtain a JWT.

Users

    GET /api/users/me: Retrieve the authenticated user's profile.

    PUT /api/users/me: Update the authenticated user's profile.

Bikes (Admin Only)

    POST /api/bikes: Add a new bike to the inventory.

    GET /api/bikes: Retrieve all bikes.

    GET /api/bikes/:id: Retrieve a specific bike by ID.

    PUT /api/bikes/:id: Update a bike's details.

    DELETE /api/bikes/:id: Remove a bike from the inventory.

Rentals

    POST /api/rentals: Rent a bike.

    PUT /api/rentals/:id/return: Return a rented bike.
