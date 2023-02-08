package Arrays;

public class string_arr {
    // check whether two string arrays are equal or not
    Boolean equalOrNot(String[] s1, String[] s2)
    {
        String str1="";
        for(int i=0;i<s1.length;i++){
            str1+=s1[i];
        }

        String str2="";
        for(int i=0;i<s2.length;i++){
            str2+=s2[i];
        }
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        string_arr obj=new string_arr();
        String[] s1={"a", "bc"};
        String[] s2={"ab", "c"};
        System.out.println(obj.equalOrNot(s1, s2));
    }
}
