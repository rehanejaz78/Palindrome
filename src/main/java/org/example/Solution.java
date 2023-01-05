package org.example;

public class Solution {


        public boolean isPalindrome(String s) {
           String myString = "";
            for (char c:s.toCharArray()) {
                if (Character.isLetterOrDigit(c) ){
                    myString +=c;
                }
            }

            myString = myString.toLowerCase();
//            int right = myString.length()-1;
//            int left = 0;
//
//            while (left <= right){
//
//                if (myString.charAt(left) != myString.charAt(right) ){
//                    return false;
//                }
//                else
//                {
//                    left++;
//                    right--;
//                }
//            }
//            return true;


//            String reverse = "";
//
//            for (int i = myString.length()-1; i >= 0; i--) {
//
//                reverse += myString.charAt(i);
//            }
//            if (reverse.equals(myString))
//                return true;
//            else
//                return false;
            //added new commit

            StringBuilder sb = new StringBuilder(myString);
            return myString.equalsIgnoreCase((sb.reverse()).toString());
    }

}
