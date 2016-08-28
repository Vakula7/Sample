import java.util.*;
import java.util.Scanner;
import java.io.*;
public class Sampl
{
public static void main(String args[])
{
String s1;
Scanner s=new Scanner(System.in);
s1=s.nextLine();
StringBuffer buf=new StringBuffer(s1);
System.out.println(buf.reverse());
}
}
