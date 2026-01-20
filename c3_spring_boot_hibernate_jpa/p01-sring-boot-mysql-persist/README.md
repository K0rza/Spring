# Project Description

In this project, there is a Student database and we want to add a new student to the database.

The StudentDAO is a repository who is responsible to save the student object by using entityManager.

The student entity is created in the relevant class and the main responsible of the class is mapping database table to java object (ORM - object to region mapping)

In the application layer, CommandLineRunner is used to be ensure the all Beans are created by the spring-framework.

At the end of the project, the given student will be stored in the described mysql database.

# Preliminary
To configure the database:
'''
spring.datasource.url
spring.datasource.username
spring.datasource.password
'''

To turn off the Spring boot banner: 
'''spring.main.banner-mode=off'''

To Change log level to warning:
'''logging.level.root=warn'''

CRUD stands for
    Crate a new data
    Read a data
    Update a data
    Delete a data

@Entity is used to generate a class who is mapping a database.
