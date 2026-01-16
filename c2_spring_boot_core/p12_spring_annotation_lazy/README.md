# Project Description

In this project, @Lazy annotation is experimented.

When the server is initialized, BasketballCoach object will be created at the beggining.

We can see the constructor is called when the application is started. 

However FootballCoach object wont be created because the basketballCoach is qualifed thus the Coach interface is implemented by BasketballCoach. Since, the footballCoach is expressed as **@Lazy** it wont be initialized while not injected.

Even the CricketCoach is not used at all, the object will be initiliazed, since it is not declarared as @Lazy.



