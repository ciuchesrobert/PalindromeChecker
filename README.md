# PalindromeChecker
The algorithm is to check if a String is a palindrome.

##The first method
We crate a boolean to save the state of the result.

![boolean](https://user-images.githubusercontent.com/58257066/203944183-75021309-47ef-4994-9100-b7cd2479b0b4.JPG)

First thing to do is to check if the String provided is not null or empty (result is false), and also to check if it only has one character(result is true).

![null empty check](https://user-images.githubusercontent.com/58257066/203944219-27cb5ca0-643b-4923-a493-cd32b5691b1d.JPG)

After that we check for special characters and white spaces and we remove them using regex. We also use the method toLowerCase.

![remove symbols and empty spaces](https://user-images.githubusercontent.com/58257066/203944247-faf33e04-9b0c-4abe-bd61-91e889ac3522.JPG)


Then we iterate through the String and check the first and the last character to see if they match.
If that's true we save the value in the boolean and return it.

![iterate string to check condition](https://user-images.githubusercontent.com/58257066/203944297-67a9ff81-c7b0-4f32-ad5e-3e4caf676acc.JPG)

##The second method

The check for null, empty, special characters, white spaces and capital letters are the same.

We use substring method to check if the current String is palindrome and using recursion we remove the first and last characters of the string and check again until all the characters are checked or until first and last don't match

[recursion check](https://user-images.githubusercontent.com/58257066/203945440-20db818f-5a09-4700-b320-dd015feafdcf.JPG)
