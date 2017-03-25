import java.util.*;
import java.lang.*;
import java.io.*;

class ass21
{
    public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("How many rows you want in this pattern?");
	int size = sc.nextInt();
        int row, column;
        String x = "X";
	for(row=0; row<size; row++)
	{
        for(column=0; column<size; column++)
	{
        if ((row == column) || ((row + column) == (size - 1))) 
        {
	    System.out.print(x);
	}	
	else
	{
	    System.out.print(" ");
	}
    }
    System.out.println();   
	}	
    }
}