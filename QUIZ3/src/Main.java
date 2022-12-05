import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str;
        boolean isPWFormatted;
        boolean isDigit;
        //boolean isAalphabet;
        boolean isUpperCase;
        boolean isLoweerCase;
        boolean isBlank;
        boolean isNumberBeginning;

        do{
             isPWFormatted=false;
             isDigit=false;
             //isAalphabet=false;
             isUpperCase =false;
             isLoweerCase =false;
             isBlank=false;
             isNumberBeginning=false;

             System.out.println("請輸入密碼: ");
             str=sc.nextLine();

             if(!isPWFormatted) System.out.println("請再輸入一次");
             else System.out.println("密碼格式正確");
        }while(!isPWFormatted);
    }
}