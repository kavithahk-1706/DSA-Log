import java.util.Arrays;

/* Problem Statement:
 * Given an array of strings
 * Return the longest string which is the common prefix for every string in the array
 */

 /* Basic Algorithm
  * Iterate over the letters in the first word of the array
  * For each such character iterate over the rest of the words of the array 
  * And check if the ith character of the first word is equal to the ith character of every other word in the array
  * If yes then add that element to the String
  * If there's an inequality at any point/one of the string lengths runs out, return the String to stop adding letters to it
  */

class LongestStrPrefix {
    public static String longestCommonPrefix(String[] strs) {
        //take first word from array
        //store ith character over loop
        //compare with rest of strings

        //reduces tc over String
        StringBuilder prefix=new StringBuilder();

        if(strs.length==0){
            return "";
        }
        //loops through length of word 1
        for(int i=0;i<(strs[0]).length();i++){
            
            //each character in word 1
            char character=Character.toLowerCase(strs[0].charAt(i));

            //loops through the rest of the words
            for(int j=1; j<strs.length;j++){

                //if current index is greater than any other string's length
                //or the character doesn't match at a specific index, break
                if(i>=strs[j].length() || Character.toLowerCase(strs[j].charAt(i))!=character){
                    return prefix.toString();
                }   
            }

            //append every matching character to prefix
            prefix.append(character);
        }

        //return the String version of the StringBuilder object
        return prefix.toString();
    }

    //driver code
    public static void main(String[] args){
        String[] strs={"Stray Kids","Street Dancer", "Stratosphere","Straddler"};
        System.out.println("Original Array of Strings: "+Arrays.toString(strs));
        System.out.println("Longest Common Prefix: "+longestCommonPrefix(strs));

    }
}