# Project Description

In this example, the data is retriving from the database by using JpaQL. We can enhance the queries since the entityManager is used touch with database.

# Preliminary

JpaQL is a form of SQL queries where the subject is entity rather than the table itself. It is more close to programming language. 

In JPQL there are some query methods:

    select, used for name the element in the table. 
    FROM, used for entity name
    WHERE, used for entity field
    LIKE, used for finding matching elements.
    :, used for namedParams. In such case the value is satisfied by the setParameter().
    order by, used for sorting the JPQL results. Default is asc who is stands for asceding (desc)

    select s FROM Student s WHERE s.firstName=:data
