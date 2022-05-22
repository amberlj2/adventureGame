import java.util.Scanner;

            public class test{ 
                public static void main(String[] args){
                    Scanner scnr = new Scanner(System.in);
                    
                    int x = scnr.nextInt();
                    int y = 0;
                    int z = 0;
                    String userWord = "something";
                    
                    if (x < 10){
                        y = 2 * x - 3;
                    }
                    z = x + y;
                    
                    if (z > 10){
                        userWord = userWord.concat(" and other");
                    }
                    else{
                        userWord = userWord.toUpperCase();
                    }
                    System.out.print(userWord);
                }
            }