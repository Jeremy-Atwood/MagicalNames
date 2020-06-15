# Magical Name Generator
-Java Coding Challenge for WGU
# Basis:

  - Take an input from the user and have them choose their favorite color from a list of colors provided
  - Have a successfull HTTP Status of 200 with the inputed name and their Wizard/ Witch name


Currently working:
  - Set up to POST name and color as a String
  - Set up to GET the inputed name and color String
  - Creating the Magical Wizard or Witch name with the name and color that was input.
  
### Instructions
  - After the code has loaded and ran load http://localhost:8080.
  - To add an entery to the Response body or JSON click on the orange ! in the colorAndNames row.
  - Enter in your favorite color and your name and then click Make Request to add your information and view your Magical Name.
  
  - To update or delete enteries into the Response Body go to http://localhost:8080/colorAndNames in the explorer and click go.
  - For deleting entries click on the orange ! in the self row. Type in DELETE (All caps) into the actions section and then add the digit to the end of the URL for the entery that you would like to delete.
  - For Updating click on the orange ! in the self row. Enter in the new color and name (Must enter in both fields). Then in the action section enter in PATCH and the URL enter the number for the entery that you would like to edit.
  - Example of URL for updating and deleting entries: http://localhost:8080/colorAndNames/2

### Images

Example screenshots of successfull POST and GET:

### Working Magic Name Generator
![Working magName.png](https://www.dropbox.com/s/hascf9bgqwwixcb/Working%20magName.png?dl=0&raw=1)

### Successful POST
![mikepost.png](https://www.dropbox.com/s/ufa0tfyxn8usx0w/mikepost.png?dl=0&raw=1) 

### Successful GET
![mikeget.png](https://www.dropbox.com/s/zjub4a9an2etf7f/mikeget.png?dl=0&raw=1)

### Status
![200 status.png](https://www.dropbox.com/s/o1pwd4qa1n9ymmp/200%20status.png?dl=0&raw=1)

### Todos
 - Make it so you choose the color from an array
 - Create a better front-end so it is not the localhost:8080 & localhost:8080/colorAndNames
 - Successfully connect the seeded data in the data.sql file to auto-generate initial DB
 - Successfully connect the routes to the MySQL database that I have created in MySQL Workbench

