# DAT250 - Software Technology Experiment 2

## Report

### Difficulties with Experiment 1

I had quite a few difficulties getting started with this assignment and acctually knowing what i needed to do. There was some confusion because of the tutorial telling us to create a new project when whe had been given some code in addition to talks of libs, classpaths and JARs. 
The code ran perfectly fine at the first step, but when i created the classes and the JUnit test form step 6 in the tutorial it would not run. I kept getting an error message that lead me to believe i had to do something with classpath and JARs mentioned in the tutorial. I spent an unnesassery high amount of time trying to figure out this before i found out that i just needed to change the line "\<persistence-unit name="todos" transaction-type="RESOURCE_LOCAL">" to "\<persistence-unit name="people" transaction-type="RESOURCE_LOCAL">" in the persistance.xml.

![image](https://user-images.githubusercontent.com/46966246/133003867-17899841-a591-4823-98fb-9648c8c09cdf.png)

When the JUint successfully completed these tables were created. I changed the Person class to Person2 because i also had a Person class in the next experiment of the assignment.

### Experiment 2

Because this is all new to me it took quite some time figuring out the correct mapping notations and placement of them. But after consulting the book and the videos from Lecture 4 on canvas and of course also the internet i think i have come up with viable solution. When my code is executed these are tables get created.
 
 ![Database-DAT250](https://user-images.githubusercontent.com/46966246/133004113-af2b34a6-3a42-4eb2-8704-d0c8d05b221e.png)

Before starting this assignment i did not know about Intellijs Database tools, so at first i just wrote some code in the main class that printed out fields to the console to see if things were working. Thankfully i learned that you could inspect tables and see a visualization of their relationships in the Intellij, so that is what i did to check that the object links were saved correctly in the databas.
 
I had some issues durring the assignment but anyhting that was not resolved in the end.

I have uploded a zip file containing my code to this repository.
