/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19_abc;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {
    public void run(){
        System.out.println("---ABC---");
        String a = "abcdefghijklmnopqrstuvwxyz";
        char [] abc = a.toCharArray();
        char [] notabc = new char[26];
        boolean isAllletters = true;
        
         Scanner scanner =new Scanner(System.in);
        System.out.println("Введите строку из слов!");
        String str = scanner.nextLine();
        for (int i = 0; i < abc.length; i++) {
                int index = str.indexOf(abc[i]);
                if (index == -1) {notabc[i]=abc[i]; isAllletters = false; }
                
            }
            if (!isAllletters) {
                System.out.println("В строке не все буквы:" + new String(notabc));
            }else{
                System.out.println("В строке все буквы");
            }
        
    }
    
}
