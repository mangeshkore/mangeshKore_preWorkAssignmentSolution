import java.util.Scanner;


public class Main {


    Scanner sc = new Scanner(System.in);


    //function to checkPalindrome

    public boolean checkPalindrome(int input) {
        int r = 0;
        for (int i = input; i > 0; i /= 10) {
            r = r * 10 + i % 10;
        }
        return input == r;

    }


    //function to printPattern

    public void printPattern(int level) {
        while(level>0){
            for(int i=0;i<=level-1;i++) {
                System.out.print("*");
            }
            System.out.println();
            level--;
        }
    }


    //function to check no is prime or not

    public boolean checkPrimeNumber(int number) {
        for(int i=number-1;i>1;i--){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }


    // function to print Fibonacci Series

    public void printFibonacciSeries(int limit) {

        //initialize the first and second value as 0,1 respectively.

        int first = 0, second = 1,third;
        System.out.println("The Fibonacci series is: ");
        System.out.print(first+","+second);
        for(int i=2;i<limit;++i)
        {
            third=first+second;
            System.out.print(","+third);
            first=second;
            second=third;
        }
        System.out.println();


    }


//main method which contains switch and do while loop

    public static void main(String[] args) {

        Main obj = new Main();

        int choice;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            System.out.println();


            choice = sc.nextInt();

            switch (choice) {


                case 0:

                    choice = 0;

                    break;


                case 1: {
                    System.out.println("Enter number to be checked: ");
                    choice = sc.nextInt();
                    if (obj.checkPalindrome(choice)) {
                        System.out.println(choice + " is a palindrome");
                    } else {
                        System.out.println(choice + " is NOT a palindrome");
                    }
                }

                break;


                case 2: {
                    System.out.println("Enter number of levels: ");
                    choice = sc.nextInt();
                    obj.printPattern(choice);
                }
                break;


                case 3: {
                    System.out.println("Enter number to be checked: ");
                    choice = sc.nextInt();
                    if (obj.checkPrimeNumber(choice)) {
                        System.out.println(choice + " is a prime number");
                    } else {
                        System.out.println(choice + " is NOT a prime number");
                    }

                }

                break;


                case 4: {
                    System.out.println("Enter number : ");
                    choice = sc.nextInt();

                    obj.printFibonacciSeries(choice);

                }

                break;


                default:

                    System.out.println("Invalid choice. Enter a valid no.\n");

            }


        } while (choice != 0);

        System.out.println("Exited Successfully!!!");

        sc.close();

    }


}

