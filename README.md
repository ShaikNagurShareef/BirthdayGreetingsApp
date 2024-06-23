# BirthdayGreetingsApp

**Project Description**
BirthdayGreetingsApp is an innovative web application designed to add a touch of joy and surprise to birthdays. This dynamic app enables users to send personalized greeting cards directly to their friends' inboxes, ensuring each celebration is unique and memorable.

Project Structure
The project is organized into the following directories:

Greetings: Contains the primary code files for the application.
SQLScripts: Includes SQL scripts for database setup and management.
log: Stores log files for monitoring and debugging purposes.
src: Contains the source code for the Spring Boot application.
target: Compiled bytecode and packaged files generated during the build process.
HELP.md: Additional help documentation for the project.
README.md: This file, providing an overview of the project.
mvnw: Maven wrapper script for Unix-based systems.
mvnw.cmd: Maven wrapper script for Windows systems.
pom.xml: Maven Project Object Model file containing project configuration and dependencies.

## Getting Started
**Prerequisites**
  Java 11 or higher
  Maven 3.6.3 or higher
  MySQL or any other preferred database
  Installation
  
**Clone the repository:**
  git clone https://github.com/yourusername/BirthdayGreetingsApp.git
  cd BirthdayGreetingsApp

**Set up the database:**
Use the SQL scripts in the SQLScripts directory to create and initialize your database.
Update the database configuration in src/main/resources/application.properties with your database credentials.

**Build the project:**
  ./mvnw clean install
  
**Run the application:**
  ./mvnw spring-boot:run
  
**Usage**
  Once the application is up and running, navigate to http://localhost:8080 in your web browser. From there, you can create and send personalized birthday greeting cards to your friends.

**Logging**
  Log files are stored in the log directory. These files are useful for monitoring application activity and debugging purposes.

**License**
  This project is licensed under the MIT License - see the LICENSE file for details.

Acknowledgements: 
Special thanks to 'Vattikuti Nagendra Satya Chowdary' for his contributions to this Project and 'Dr. Chirra Venkata Rami Reddy' for his guidance.
