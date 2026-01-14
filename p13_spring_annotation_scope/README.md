# Project Descriction

In the example, /checkSingleton endpoint will ve print Singleton objects are the same. Also /CheckPrototype endpoint will print Prototype objects are not same. Since the *@Scope(prototype)* beans will be new instanced when every injection.

# Preliminary

In default Spring beans are created as singleton which means that, there will be only one instance at the SpringComponent. However we may override this feature by **@Scope** annotation.
