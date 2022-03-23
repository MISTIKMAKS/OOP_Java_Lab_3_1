package Lab3_1;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.Spring;

public class Dispatcher {
	static int CountB(String str)
    {
		char[] tempString = new char[str.length()];
    	for (int i = 0; i < str.length(); i++) {
    		tempString[i] = str.charAt(i);
        }
        if (str.length() < 1)
        {
            return 0;
        }
        int b = 0;
        for (int i = 0; i < tempString.length; i++)
        {
            if (tempString[i] == 'B')
            {
                b++;
            }
        }
        return b;
    }
    static int CountA(String str)
    {
    	char[] tempString = new char[str.length()];
    	for (int i = 0; i < str.length(); i++) {
    		tempString[i] = str.charAt(i);
        }
        if (str.length() < 1)
        {
            return 0;
        }
        int a = 0;
        for (int i = 0; i < tempString.length; i++)
        {
            if (tempString[i] == 'A')
            {
                a++;
            }
        }
        return a;
    }
    static int CountS(String str)
    {
    	char[] tempString = new char[str.length()];
    	for (int i = 0; i < str.length(); i++) {
    		tempString[i] = str.charAt(i);
        }
        if (str.length() < 1)
        {
            return 0;
        }
        int s = 0;
        for (int i = 0; i < tempString.length; i++)
        {
            if (tempString[i] == 'S')
            {
                s++;
            }
        }
        return s;
    }
    static int CountI(String str)
    {
    	char[] tempString = new char[str.length()];
    	for (int i = 0; i < str.length(); i++) {
    		tempString[i] = str.charAt(i);
        }
        if (str.length() < 1)
        {
            return 0;
        }
        int ia = 0;
        for (int i = 0; i < tempString.length; i++)
        {
            if (tempString[i] == 'I')
            {
                ia++;
            }
        }
        return ia;
    }
    static int CountC(String str)
    {
    	char[] tempString = new char[str.length()];
    	for (int i = 0; i < str.length(); i++) {
    		tempString[i] = str.charAt(i);
        }
        if (str.length() < 1)
        {
            return 0;
        }
        int c = 0;
        for (int i = 0; i < tempString.length; i++)
        {
            if (tempString[i] == 'C')
            {
                c++;
            }
        }
        return c;
    }
    static String Change(String str)
    {
        String stringer;
        String string = str;
        if (str.length() < 1)
        {
            return str;
        } else
        {
            stringer = (str.replaceAll("BASIC", "Delphi"));
        }
        return stringer;
    }

    static String AStart(String str)
    {
        String[] words = str.split(" ");
        String result = "";
        String word = "";
        System.out.println("Result Of Separation: ");
        for(int i = 0; i < words.length; i++)
        {
        	word = words[i];
            if (word.charAt(0) == 'a'){
                result = word;
            }
            System.out.println(word);
        }
        return result;
    }
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String str;
	    System.out.print("Enter string: ");
	    str = scan.nextLine();
	    System.out.println("String contained " + CountB(str) + " B " + CountA(str) + " A " + CountS(str) + " S " + CountI(str) + " I " + CountC(str) + " C ");
	    String dest;
	    dest = Change(str);
	    System.out.println("Modified string (param) : " + str);
	    System.out.println("Modified string (result): " + dest);
	}
}
