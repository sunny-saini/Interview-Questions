package com.core;

public class RemoveSpecialCharacterExample1
{  
public static void main(String args[])   
{  
String str= "A man, a plan, a canal: Panama";
str = str.replaceAll("[^a-zA-Z]", "");
System.out.println(str);  
}  
}  