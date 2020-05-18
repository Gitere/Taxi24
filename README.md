Follow the steps below to run the taxi24 microservice

1. Download the project from Git hub link https://github.com/Gitere/Taxi24
2. Ensure that MySQL is installed in your computer
3. Open MySQL database Execute the dbschema.sql in the project files
4. Navigate to where you saved the project downloaded 
5. Run the mvnw spring-boot:run on terminal or command prompt to start the microservice
6. Use your preferred restful web services tool to test the web services below;

a. http://localhost:8080/taxi24/alldrivers - get a list of all drivers
b. http://localhost:8080/taxi24/availabledrivers - get a list of available drivers
c. http://localhost:8080/taxi24/driversbylocation?location=abcd - get a list of drivers within 3km in the specified location
d. http://localhost:8080/taxi24/driverbyid?id=21 - get driver by id
e. http://localhost:8080/taxi24/riderbyid?id=21 - get rider by id
f. http://localhost:8080/taxi24/allriders - get a list of all riders
g. http://localhost:8080/taxi24/closestdrivers - get a list of 3 closest drivers
h. http://localhost:8080/taxi24/createtrip?driverid=32&riderid=74 - create a trip
i. http://localhost:8080/taxi24/completetrip?id=32&distance=93 - complete a trip
j. http://localhost:8080/taxi24/activetrips - get a list if all active trips, this also creates an invoice

