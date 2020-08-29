In this exercise the goal is to get a spring boot application with gradle to run smoothly.
The project in this folder is a solution, if you have issues read up inside the application to find potential errors.

Short description of the exercise:
1. Go to start.spring.io (or search for spring initilzr)
2. Follow these instructions:
   - Choose gradle project
   - Language is Java
   - Version of Spring Boot is 2.2.5
   - provide group (package names)
   - provide an artifact (project name)
   - open options and choose jar as packaging and choose your java version, recommended is java 11
   - Add following dependencies:
	- Spring Web
	- Spring Security
	- Spring Data JPA
	- PostgreSQL Driver
3. Create DB, name it as you wish
4. Configure your "application.properties" and fill in the necessary data, example of this file can be found in the provided project under resources