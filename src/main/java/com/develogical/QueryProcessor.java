package com.develogical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

  public static void main(String[] args) {
    QueryProcessor processor = new QueryProcessor();
    System.out.println(processor.process("Which of the following numbers is the largest: 60, 57, 77?"));
  }
  public String process(String query) {

    System.out.println("Received query:" + query);
    // Which of the following numbers is the largest: 60, 57, 77?
    //String pattern = "Which of the following numbers is the largest: (\\d+), (\\d+), (\\d+)\\?";
    //Matcher matcher = Pattern.compile(pattern).matcher(query);
    //if(matcher.find()) {
    //  int num1 = Integer.valueOf(matcher.group(1));
    //  int num2 = Integer.valueOf(matcher.group(2));
    //  int num3 = Integer.valueOf(matcher.group(3));
    //  return "" + num1 + num2 + num3;
    //}
    String pattern2 = "What is (\\d+) plus (\\d+)\\?";
    Matcher matcher2 = Pattern.compile(pattern2).matcher(query);
    if(matcher2.find()){
      int num1 = Integer.valueOf(matcher2.group(1));
      int num2 = Integer.valueOf(matcher2.group(2));
      return "" + num1 + num2;
    }
    String pattern3 = "What is (\\d+) multiplied by (\\d+)\\?";
    Matcher matcher3 = Pattern.compile(pattern3).matcher(query);
    if(matcher3.find()){
      int num1 = Integer.valueOf(matcher3.group(1));
      int num2 = Integer.valueOf(matcher3.group(2));
      return "" + num1 * num2;
    }
    String pattern4 = "Which of the following numbers is the largest: (\\d+), (\\d+), (\\d+)\\?";
    Matcher matcher4 = Pattern.compile(pattern4).matcher(query);
    System.out.println(matcher4.find());
    if(matcher4.find()){
      int num1 = Integer.valueOf(matcher4.group(1));
      int num2 = Integer.valueOf(matcher4.group(2));
      int num3 = Integer.valueOf(matcher4.group(3));
      return ""+Math.max(num1, Math.max(num2, num3));

    }
    // What is 49 plus 42?
    if(query.toLowerCase().contains("your name?")){
      return "Jon2";
    }

    if (query.toLowerCase().contains("shakespeare")) {
      return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
          + "English poet, playwright, and actor, widely regarded as the greatest "
          + "writer in the English language and the world's pre-eminent dramatist.";
    }

    return "";
  }
}
