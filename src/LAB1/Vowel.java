package LAB1;

import java.util.Scanner;

class Vowel
{
    public static void main(String args[])
    {
        char ch;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter any character : ");
        //next.charAt used to get character value from keyboard
        ch = s.next().charAt(0);
        //switch case tests if given alphabet is vowel
        switch(ch)
        {
            case 'a' : System.out.println("It's a Vowel.");
                break;
            case 'e' : System.out.println("It's a Vowel.");
                break;
            case 'i' : System.out.println("It's a Vowel.");
                break;
            case 'o' : System.out.println("It's a Vowel.");
                break;
            case 'u' : System.out.println("It's a Vowel.");
                break;
            case 'A' : System.out.println("It's a Vowel.");
                break;
            case 'E' : System.out.println("It's a Vowel.");
                break;
            case 'I' : System.out.println("It's a Vowel.");
                break;
            case 'O' : System.out.println("It's a Vowel.");
                break;
            case 'U' : System.out.println("It's a Vowel.");
                break;
            default : System.out.println("It's a Consonants.");
        }
    }
}