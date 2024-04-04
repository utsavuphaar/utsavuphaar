class P2{
    public static void main(String[] args) {
        System.out.println("new file");
        String s = "i am java programming";
        String str[] = s.split(" ");
        for(int i=0; i<str.length; i++){
            String s1 = str[i];
            s1.charAt(0);
            System.out.println(s1);
        }
    }
}