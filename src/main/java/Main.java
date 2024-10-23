public class Main {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        for(int i =  10; i <=200; i++) {
            if(i%7==0 && i%5!=0) {
                if(result.length()  == 0) {
                    result.append(i);
                }
                else {
                    result.append(", ").append(i);
                }
            }
        }
        System.out.println(result.toString());
    }
}
