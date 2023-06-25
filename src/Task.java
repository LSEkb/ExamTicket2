public class Task {
    // Задача:
    //    Напишите программу, которая проверяет, является ли строка палиндромом.
    public static void main(String[] args) {

        String str1 = "шалаш";
        String str2 = "шиповник";
        String str3 = "А роза упала на лапу Азора";
        String str4 = "Я несу чушь! Шучу, Сеня!";
        String str5 = "Мама мыла раму";
        String str6 = "Я сличил то и то - вот и отличился";

        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
        System.out.println(isPalindrome(str4));
        System.out.println(isPalindrome(str5));
        System.out.println(isPalindrome(str6));
    }

    public static boolean isPalindrome(String str){
        str=str.toLowerCase();
        str=str.replaceAll("([ ,.!?:;-])","");
        int length = str.length();
        for (int i=0;i<length/2;i++){
            if (str.charAt(i)!=str.charAt(length-1-i)){
                return false;            }
        }
        return true;
    }
}
