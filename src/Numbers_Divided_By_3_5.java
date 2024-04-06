//WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately

//Class name
public class Numbers_Divided_By_3_5 {

    //Main Method
    public static void main(String[] args) {

        int number = 1;

        System.out.println("Numbers divisible by 3:");
        do {
            if (number % 3 == 0) {
                System.out.print(number + ", ");
            }
            number++;
        } while (number <= 100);

        System.out.println("\n\nNumbers divisible by 5:");

        //Reset the number for the next loop
        number = 1;
        do {
            if (number % 5 == 0) {
                System.out.print(number + ", ");
            }
            number++;
        } while (number <= 100);

    }
}
