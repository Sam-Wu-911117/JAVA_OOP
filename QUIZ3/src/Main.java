import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str;
        boolean isPWFormatted;
        boolean isDigit;
        boolean isUpperCase;
        boolean isLowerCase;
        boolean isBlank;
        boolean isNumberBeginning;

        do{
             isPWFormatted=false;
             isDigit=false;
             isUpperCase =false;
             isLowerCase =false;
             isBlank=false;
             isNumberBeginning=false;

             System.out.print("請輸入密碼: ");
             str=sc.nextLine();
              //程式
             for (int i=0 ;i<str.length();i++){
                 char a =str.charAt(i);
                 if(!isNumberBeginning && i==0 && (a>='0' && a<='9')){
                     isNumberBeginning =true;
                 }
                 if(!isDigit && (a>='0' && a<='9')){
                     isDigit=true;
                 }
                 if(!isLowerCase && (a>='a' && a<='z')){
                     isLowerCase=true;
                 }
                 if(!isUpperCase && (a>='A' && a<='Z')){
                     isUpperCase=true;
                 }
                 if(!isBlank && a==' ')
                     isBlank=true;
             }
             isPWFormatted=isDigit && isLowerCase && isUpperCase &&(!isNumberBeginning) &&(!isBlank);

             if(isNumberBeginning)System.out.println("密碼不能數字開頭");
             if(isBlank)System.out.println("密碼不能含空白");
             if(!isDigit)System.out.println("密碼應該包含數字");
             if(!isLowerCase)System.out.println("密碼應該包含小寫");
             if(!isUpperCase)System.out.println("密碼應該包含大寫");

        }while(!isPWFormatted);
    }
}