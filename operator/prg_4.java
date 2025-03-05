package operator;

public class prg_4 {
    public static void main(String[] args) {
        int num = 4325;
        
        while(num > 0) {
        	
            System.out.println(num % 10); 
            num = num / 10; 
        }
    }
}
