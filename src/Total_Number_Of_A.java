//WAP to enter any String and count total number of 'a' in that String.

//Class NAme
public class Total_Number_Of_A {

    //Main Method
    public static void main(String[] args) {

        String inputString = "Array and Do While Loop HomeWork";
        int count = 0;

        // Iterate through the string and count occurrences of 'a'
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("Total number of 'a' characters in the string: " + count);

    }
}
