# Project Description

In this example, there will multiple classes those implements Coach interface while the rest-controller depends on the Coach interface. 
    
    *We will declare which implementation is used as the dependency via @Qualifier.

# Preliminary
In Spring-boot, the dependency injection is accomplished with **@Autowiring** annotatitons without the creating the objects.

The Spring-boot auto scans the beans (whose declared with **@Components** annotation).

    * For auto-wiring, The Spring-boot checks the type of dependency and searches for the match in the components.

If there will be multiple classes those implements the same dependency, then the Spring-Boot is failed.

To overcome this issue, We should have decleare which class is required in this dependency via **@Qualifier** annotations.