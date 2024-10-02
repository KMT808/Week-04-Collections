package Week04;
public class codingAssingment {
  public static void main(String[] args) {
   
    // 1. Create an Array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.  
    int [] ages = {3, 9, 64, 2, 8, 28, 93};
      
     // 1a Created a new variable for the value of the last element - first element in ages
     int subtractFirstFromLast = ages[ages.length-1] - ages[0];
      
     // 1a. Print the subtracted value for ages to the console 
     System.out.println("1a. Last element of ages array - first element: " + subtractFirstFromLast);
      
     // 1b. int array named ages2 with 9 elements
     int [] ages2 = {12, 48, 100, 65, 47, 5, 10, 13, 21};
      
     // 1bi. Display the length of the ages2 array to verify there are 9
     System.out.println("1bi. Number of elements in ages2: " + ages2.length);

     // 1bii and iii Created a new variable for the value of the last element - first element in ages2
     int subtractFirstFromLast2 = ages2[ages2.length-1] - ages2[0];
     
     // Print the subtracted value for ages2 to the console
     System.out.println("1bii. Last element of ages2 array - first element: " + subtractFirstFromLast2);
     
     // 1bc. Loop to iterate through the ages2 array and calculate average age
     int sumAge = 0;
     int averageAge = 0;
     
     for (int i = 0; i < ages2.length; i++) {
       sumAge = sumAge + ages2[i];
     }
     averageAge = sumAge / (ages2.length);
     
     // 1bc. Display averageAge
     System.out.println("1bc. Average age of ages2: " + averageAge); 
     
     
     // 2. Create an array of String called names
     String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
     
     // 2a. Loop to iterate through the array and calculate the average number of letters per name and print
     
     // Create variables
     int sumLength = 0;
     int averageLength = 0;
     
     // For loop to calculate each element length in names, add all of the lengths together, and divide the sum by the number of elements to get average
     for (int i = 0; i < (names.length); i ++) {
      
       sumLength = sumLength + names[i].length();
     }
     
     averageLength = sumLength / names.length;
     
     // Display the average length of the elements in the names array
     System.out.println("2a. Average length of the names in the names array: " + averageLength);
     
     // 2b. Loop to concatenate all of the names together separated with spaces and display
     
     // Create variable to hold the concatenated elements
     String concatenateNames = "";
     
     // Loop to concatenate the elements in the names array
     for (int i = 0; i < names.length; i ++ ) {
       concatenateNames = concatenateNames + " " + names[i];
     }
     
     // Display all elements of the names array with a space between them
     System.out.println("2b. Elements of the names array: " + concatenateNames);
     
     
     // 3. Access the last element of an array
     // Used names array from question 2 above
     // Called the names array at the index of length - 1 to get the last element. Since arrays start at 0 the last element is the length minus 1
     // Length of names is 9, so the last element is names[8]
     
     System.out.println("3. Last element of the names array: " + names[names.length-1]);
     
     // 4. Access the first element of any array
     // Arrays start at zero so index 0 will access the first element
     
     System.out.println("4. First element of the names array: " + names[0]);
     
     // 5. Array of int called nameLengths created with the same number of elements from the names array
     int [] nameLengths = new int[names.length];
  
     // For loop to add the length of the names elements to the namesLengths array
     for (int i = 0; i < nameLengths.length; i ++) {
       nameLengths[i] =  names[i].length();
       }
       
     // 6.Loop to calculate the sum of all of the nameLengths array
     
     // Created variable to store the sum
     int sumNameLengths = 0;
     
     // For loop
     for (int i = 0; i < nameLengths.length; i ++) {
       sumNameLengths = sumNameLengths + nameLengths[i];
     }
     
     // Display the sum value
     System.out.println("6. Sum of the elements in the nameLengths array: " + sumNameLengths);
     
     
     // 7. Calling the method wordNTimes
     
     String result = wordNTimes("Hello", 3);
     System.out.println("7. Hello concatenated 3 times: " + result);
 
 
     // 8. Calling the method createFullName
     
     String firstName = "Keri";
     String lastName = "Trinkle";
    
     String fullName = createFullName(firstName, lastName);
     System.out.println("8. Full name: " + fullName);
  
     // 9. Calling the method sumGreaterThan100
    
     // Create an array of int called numbers
     int [] numbers = {8, 12, 50, 35};
    
     boolean resultTF = sumGreaterThan100(numbers);
     System.out.println("9. Sum of the elements in the numbers array greater than 100: " + resultTF);
    
     
     // 10. Calling the method doubleAverage to calculate the average of the elements in the doubleNumbers array
     
     double [] doubleNumbers = {12.29, 35.47, 89.44};
     double doubleAverageResult = doubleAverage(doubleNumbers);
     
     System.out.println("10. Average of elements in the doubleNumber array: " + doubleAverageResult);
     
     // 11. Calling the method arrayOneGreaterThanArrayTwo and returning true or false
     double[] arrayOne = {22.0, 45.67, 212.12};
     double[] arrayTwo = {4.78, 32.99, 12.32};
     
     boolean arrayOneGreaterThanArrayTwoResult = arrayOneGreaterThanArrayTwo(arrayOne, arrayTwo); 
     System.out.println("11. Is the sum of arrayOne greater than the sum of arrayTwo? " + arrayOneGreaterThanArrayTwoResult);
     
     
     //12. Calling willBuyDrink method will return true if is hot outside and there is more then 10.50 in pocket
     boolean isHotOutside = true;
     double moneyInPocket = 25.75;
     
     boolean willBuyDrinkResult = willBuyDrink(isHotOutside, moneyInPocket);
     
     System.out.println("12. Are you able to buy a drink? " + willBuyDrinkResult);
     
     
     // 13. Calling the takeOutBin method to determine if I should take the trash out today or wait.
     // Variables for the day of the week and if the trash is full or not
     String dayOfWeek = "Tuesday";
     boolean isTrashFull = false;
     
     // Calling the takeOutBin method which returns a string what I should do
     String takeOutBinResult = takeOutBin(dayOfWeek, isTrashFull);
     System.out.println("13. Should I take out the trash today? " + takeOutBinResult); 
     
     
 }   // End of main
  
  
// Start of methods that are called in Main
  
// 7. Method that takes a String, word and an int, n as arguments and returns the word concatenated to itself n number of times
    
  //Created method wordNTimes to take the word (Hello) and concatenate it n (3) times
  public static String wordNTimes (String word, int n) {
    
    // Created variable to hold the concatenated word
    String words = "";
    
    // For loop to add the word to itself n number of times
    for (int i = 0; i < n; i++) {
      words = words + word;
      //System.out.println(words);
    }
    // returning the result of the method
    return words;
  }
 
 // 8. Created method that takes 2 strings, firstName and lastName and returns full name
  public static String createFullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  
  // 9. Created method that takes an array of int and returns true if the sum of all the elements in the array is greater than 100
  public static boolean sumGreaterThan100 (int[] numbers) {
    int arraySum = 0;
    boolean greaterThan100;
    
    for (int i = 0; i < numbers.length; i++ ) {
      arraySum = arraySum + numbers[i];
    }
    
    if (arraySum > 100) {
        greaterThan100 = true;
    } else {
        greaterThan100 = false;
    }
    
    return greaterThan100;
    }
  
  // 10. Created a method that takes an array of double and returns the average of all elements
  public static double doubleAverage (double [] doubleNumbers) {
    
    // Create arraySum variable to hold the sum of the elements in the doubleNumbers array
    double arraySum = 0.0;
    
    // Created for loop to loop through the doubleNumbers array and add each element to the sum
    for (int i = 0; i < doubleNumbers.length; i++) {
      arraySum = arraySum + doubleNumbers[i];
      
    }
    // Divided the array Sum by the length of the array to get the average
      double average = arraySum / doubleNumbers.length; 
      
    // returning the value of the average of the doubleNumbers array  
    return average;
  }
  
  // 11. Method that takes 2 arrays of double and returns true 
  // if the average of the elements in the first array is greater than the average of the elements in the 2nd array
  public static boolean arrayOneGreaterThanArrayTwo (double[] arrayOne, double[] arrayTwo) {
    
   // Created variables to hold the sum of arrayOne and arrayTwo and the boolean result
   double arraySum1 = 0.0;
   double arraySum2 = 0.0;
   boolean tF1;
   
   // For loop to find the sum of the elements in arrayOne
   for (int i = 0; i < arrayOne.length; i++) {
     arraySum1 = arraySum1 + arrayOne[i];
   }
   
   // For loop to find the sum of the elements in arrayTwo
   for (int i = 0; i < arrayTwo.length; i++) {
     arraySum2 = arraySum2 + arrayTwo[i];
   }
   
   // If conditional to determine if the sum of arrayOne is greater than sum of arrayTwo and return true or false
   if (arraySum1 > arraySum2) {
     tF1 = true;
   } else {
     tF1 = false;
   }
   
   return tF1;
  }

  //12. Created a method called willBuyDdrink that takes boolean isHotOutside, and a double moneyInPocket, and returns true
  // if it is hot outside and if moneyInPocket is greater than 10.50
  public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
    
    // Conditional if to determine if willBuyDrinnk is true or false
    if ((isHotOutside == true) && (moneyInPocket > 10.50)) {
      return true; 
    } else {
      return false;
    }
  }
  
  // 13. Created method to tell me to put out the trash or wait
  /* My apartment has valet trash where they pick up trash outside of your door as long as it's in the trash bin they give you
   * Pickup happens Sunday - Thursday
   * I only want to put out the trash bin if it is full
   * And I only want to put the bin out if it is full
   */
    public static String takeOutBin(String dayOfWeek, boolean isTrashFull) {
       
   // If condition to determine if it is a pick up day  
    if (dayOfWeek == "Friday" || dayOfWeek == "Saturday") {
      return "Do not put out the trash as it is not a trash day."; 
    } else if ((dayOfWeek != "Friday" || dayOfWeek != "Saturday") && isTrashFull == true) {
         return "Put out the trash.";  
      } else if ((dayOfWeek != "Friday" || dayOfWeek != "Saturday") && isTrashFull == false) {
         return "Do not put trash out. The trash bin is not full. Check again when the bin is full.";
          
      } else {
        return "Enter a valid day";  
      }
    }

}




     
     
     
     
     
      
      
      
      
   
    
    
    
    
    
