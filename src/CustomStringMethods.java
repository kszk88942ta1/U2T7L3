public class CustomStringMethods {

    /* this class has no instance variables */

    /* Constructor with no parameters, and since there are no instance variables to initialize,
              the constructor body is "empty" */

// WRITE AND TEST THE METHODS BELOW

    /* Client provides myString and maxLength and method returns true if the length of myString
              exceeds maxLength, and returns false otherwise.

               Example:  If myString is apples and maxLength is 5, this method returns true.
               Example:  If myString is apples and maxLength is 6, this method returns false.
        */
    public boolean longerThan(String myString, int maxLength) {
        int stringLength = myString.length();
        return stringLength > maxLength;


    /* Client provides str and idx and method returns a new String created by appending
              the character located at index idx of str to the beginning of str and the end of str

               Example:  If str is apples and idx is 4, this method returns the string eapplese
               Example:  If str is apples and idx is 0, this method returns the string aapplesa
     */

        public String funnyString(String str, int idx) {
        String indexLetter = String.valueOf(funnyString.indexOf(idx));
        String newString = indexLetter + str + indexLetter;
        System.out.println(newString);
         }

        /**Client provides myString and the method returns a String that represents mystring
         with its halves reversed; strings of odd length should have the extra character be a part
         of the second half when initially halved (and appear in the first half in the returned String).

         Example:  If myString is computers, this method should return the string uterscomp
         Example:  If myString is "reverse me!", this method should return "e me!revers";
         */
         String halvesReversed(String myString) {
         int stringLength2 = myString.length();
         int halfLength = stringLength2/2;
         if (stringLength2 % 2 == 0) {
             halfLength += 0;
         } else {
             halfLength += 1;
         }
         String firstHalf = myString.indexOf(0, int halfLength);
         String secondHalf = myString.indexOf(halfLength, stringLength2+1);

         }

    }
}

