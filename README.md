# BCrypt Auth Test App
A simple website that allows users to sign up and login.
User passwords are hashed using BCrypt.

## Routes
- `/` - Simple Homepage
- `/signup` - Sign up form that stores a username and salted password hashes.
- `/login` - Searches and compares the database for a username and matching password.
- `/posts` - WIP. This page will allow  a user to make and display their own text posts.