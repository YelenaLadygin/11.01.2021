  // create a function that gets an array of int[] and prints the average
         int [] a =  { 2,2,2,2};
         avrArr(a);

// create a function that gets an array of String[] and prints it in one line
        String [] str= {"Hello", "user"};
        printStrarr(str);

 // create a function that gets 2 arrays and prints the array with the larger size
        int [] x = {2,4,6,8,9,};
        int [] y = {7,9,3,7,2,5};
        compare2arrays(x,y);
        
  /* 1. create a function called printBiggest with the following overloading:
   printBiggest() -- will print "I am the biggest of them all!"
   printBiggest(int a) -- will print "a +  is biggest"
   printBiggest(int a, int b) -- will print the biggest of a and b + " is biggest"
   printBiggest(int a, int b, int c) -- will print the biggest of a and b and c+ " is biggest" 
*/
       printBiggest();
       printBiggest(2,7);
       printBiggest(5,6,5);
 
 // 2. create a function that accepts Scanner as an argument and inputs a float from the user
    //    hint: inputFromUser(Scanner s)
       inputFromUser(s);
    
// 3. create a function that accepts Random as an argument and prints a random number and also gets the min max range as parameters 
//  hint: createRandom(Random r, int min, in max).
      createRandom(r,3,88);
    
 /* 4. create a function that accepts an array of double, and also min max range as parameters
        hint: printInRange(double[] arr, double min, double max)
        the function will print all the array elements which are in the range
        for example:
        arr = { 0.5, 0.7, 5, -2, 12.5 }
        min = -4
        max = 0.5
        will print: 0.5, -2     
*/    
       double [] arr = { -5, 56, 78,9,3,77,9,0};
       printInRange(arr,-4, 89);          
          
          
