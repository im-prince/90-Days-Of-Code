public class subSetOfString {
    public static void main(String[] args) {
        String s = "ab";
        printAllSubset(s,0," ");
    }
    static void printAllSubset(String s, int i,String curr){
        if (i==s.length()) {
            System.out.println(curr);
            return;
        }

        printAllSubset(s,i+1,curr+s.charAt(i));
        printAllSubset(s,i+1,curr);
    }
}
