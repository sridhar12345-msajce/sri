public class eight {
    public static void main(String[] args) {
        char n='$';
        if((n>='a'&& n<='z')||(n>='A'&& n<='Z')){
            System.out.println("alphabet");


        }
        else if(n>='0'&&n<='9'){
            System.out.println("digit");

        }
        else{
            System.out.println("special character");
        }

    }
}
