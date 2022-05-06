# individual-project-ayadav1995
individual-project-ayadav1995 created by GitHub Classroom

Individual Project- CMPE 202

Abhishek Yadav
015787018

1.	Detailed instructions of building the project and steps to execute the same. 
Ans:
To run the project follow the below steps:
1.	Clone the project into a folder on your local machine
2.	Once the project is cloned and the maven dependencies are resolved, navigate to the terminal and run the commands

mvn compile

mvn clean install

mvn exec:java -"Dexec.mainClass"="test.RunClient" -"Dexec.args"="src\test\inputFiles\BookingRequests.csv src\test\inputFiles\FlightDetails.csv src\test\inputFiles\BookedFlights.csv src\test\inputFiles\Output.txt" 
(here the path of each file should be according to the path on your local machine)

After these steps have been executed, we will have the successful bookings made recorded in the BookedFlights.csv and the incorrect booking entries in the output.txt .








2.   Answers to the following questions:

1.	Describe what is the primary problem you try to solve
We are trying to build a flight booking application which maintains an internal, static database that contains all the details of flights. We are trying to achieve this using only the inbuilt data structures available in java. The aim is that all and any changes to the database will not persist between application launches. 
2.	Describe what are the secondary problems you try to solve
Each time on application startup we will read the required input data and will store the output in the csv files provided as arguments to the execution command. 
We can have multiple flights in the input csv for the flight details and we can have multiple entries for the same flight as well. We need to create a database where we can map all entries of a flight into 1 object.
For booking entries we can have valid and invalid bookings. A valid booking is defined as the right combination of flight number (must be a valid flight), seat category (must be a category present for that flight in the flight details file), card number (must be a valid card type and number) and number of seats (given the correct flight number, card number and category the flight must have enough seats left to accommodate the requested number of guests).
There can be different types of Cards. For each entry in the requested bookings. We need to check if the card number for that booking is valid. We check if it is an American express card, master card, discover card of Visa. If it does not belong to any of these categories we can decline the booking due to invalid/incorrect card number.
Finally, our goal is to provide the valid bookings and the invalid bookings in two separate files as outputs. One will contain the successfully validated bookings with the total cost of the booking and the other will contain the incorrect bookings along with the reason for the validation failure.
3	Describe what design pattern(s) you use how (use plain text and diagrams)
Singleton :
Singleton design pattern is a creational design pattern that is used to ensure only a single instance of a particular class is created. In solving our problem, we have applied the singleton design pattern to our controller class where we are creating the flight database. We want the same data repository to be used during a single execution instance. Every time a call to the object of the controller is made, the same flight database is used in the same application execution instance.

Chain of Responsibility:
Chain of responsibility design pattern is a behavioral design pattern in which we are able to pass a request along a line of request handlers. Each handlers decides weather it is able to process the request or not. In our case we are passing along the request to validate the card along a list of card handlers. At the beginning of the chain we set the next handler for each of the handlers. So , id a handler determines that it cannot validate the card It will pass on the details to the next handler and so on until the end of the chain. 

Builder: 
Builder design pattern is a creational design pattern which is useful when we have to create different representations of an object step by step. In our case we are using the builder pattern to create our  flight objects which we will be using later to create our internal static database.
	
4	Describe the consequences of using this/these pattern(s).
By using these patterns we are intending to provide a structure to our project. We are also aiming to avoid code smell  by employing these patterns . By using the singleton pattern we are making sure that our data persists and we can choose how the class and its components are accessed. We can make sure that no data is overwritten when we are adding flights to our internal database. This provides control over our program. With chain of responsibility 2 objects can exist independently without knowing which of the objects will handle the request after the first. We have the flexibility to add or remove any functions to our chain in the future. With the builder design pattern we get the availability to create different kinds of objects for the same class using the builder. It gives us the flexibility and the scaling potential if there are going to be additions or deletions from the flightDetails class in the future.
5	Class diagram.
 

![image](https://user-images.githubusercontent.com/89236413/167078986-52c885a9-25da-430f-b9e8-e0c734a0e04a.png)


3 :
Screenshot of test execution :
 ![image](https://user-images.githubusercontent.com/89236413/167078994-14e8eaf5-3e72-44d7-a032-53357cad976f.png)



 
![image](https://user-images.githubusercontent.com/89236413/167079005-d85de6d5-d3c1-4e22-97f1-cd6b5c14150c.png)






