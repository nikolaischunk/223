In this exercise the goal is to create the service layer for every business object.
The focus of this exercise is to understand services and outsource the logic in the controllers out into the service layer. 
As usual, in this project there are three examples with already built services: Role, authority and user.
The naming convention might be misleading right now, but it is called find instead of retrieve for a reason which gains relevance in the next exercise.

Short description of the exercise:
1. Create the Service and ServiceImpl files for all of your business objects
2. Define all required method signatures in the service
3. Outsource all logic from the controller into the serviceImpl files
4. Autowire the service in the controller