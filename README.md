# practicecontrollers

This is a simple file that uses request mapping amd path variables to access information.


	1. Controller 1: 'PracticeController'. First 3 routes use @RequestMapping.
	2. http GET request to 'http://localhost:8080/coding' displays text: "Hello User".
	3. http GET request to 'http://localhost:8080/coding/python' displays text: "Python is awesome!".
	4. http GET request to 'http://localhost:8080/coding/java' displays text: "Java is better!".
	5. Controller 2: 'WashController'. These routes use @PathVariable.
	6. http GET request to 'http://localhost:8080/wash' displays text: 'Washington is beautiful!'.
	7. http GET request to 'http://localhost:8080/seattle-wash/' displays text: 'Seattle is located in western Washington'.
  8. http GET request to 'http://localhost:8080/redmond-ridge/' displays text: 'Redmond Ridge is a rural part of Redmond'.

