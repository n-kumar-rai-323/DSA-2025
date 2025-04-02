import java.util.Scanner;

public class creating {


    public static void update(int studentMark[]){
        for(int i =0 ; i<studentMark.length; i++){
            studentMark[i] =studentMark[i] + 1;
        }
    }
    public static void main(Stringpr[] args) {
     
       int studentMark[]={97,98,99};
       update(studentMark);
       // print our marks
       for(int i =0; i<studentMark.length; i++){
        System.out.println(studentMark[i] + "");
       }    
    }
}
