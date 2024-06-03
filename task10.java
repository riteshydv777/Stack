// Balanced Brackets

import java.util.*;
public class task10 {
    public static boolean balanced(String str){
        // declare stack
        Stack<Character> st = new Stack<>();
        // traverse character
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            if(ch == '('){       // ch == '('
                st.push(ch);
            }else{               // ch == ')'
                if(st.size() == 0) return false ;
                if(st.peek() == '(') st.pop();
            }
        }
        if(st.size() > 0) return false ;
        else return true ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character : ");
        String str = sc.nextLine();
        System.out.println("your character is : "+str);
 
        System.out.println(balanced(str));
        
    }
}
