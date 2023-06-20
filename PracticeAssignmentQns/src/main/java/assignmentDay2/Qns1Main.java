package assignmentDay2;

class CheckPassFail{
    public static void checkNum(int n){
        if(n>=50)
            System.out.println ("Pass" );
        else
            System.out.println ("Fail" );
    }
}
public class Qns1Main {
    public static void main(String[] args) {
        CheckPassFail.checkNum (60);
    }

}
