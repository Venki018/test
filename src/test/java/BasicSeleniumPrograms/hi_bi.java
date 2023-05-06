package BasicSeleniumPrograms;

import java.util.Scanner;

public class hi_bi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide number");
        int n = sc.nextInt();
for(int i=0;i<=n;i++)
{
    if (i%3==0 &&i%5 ==0 ){
        System.out.println("Hi-Bi");
    }
    else if(i%3 ==0) {
        System.out.println("Hi");
    }
    else if(i%5 ==0) {
        System.out.println("Bi");
    }
    else  {
    System.out.println(i);
}
}
    }
}
