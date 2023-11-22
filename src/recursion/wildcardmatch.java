package recursion;

import java.util.Scanner;

public class wildcardmatch {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String p=sc.next();
        isMatch(s,p);
*/
    }
    public boolean isMatch(String s, String p) {
        int[][] cachememo=new int[s.length()][p.length()];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<p.length();j++){
                cachememo[i][j]=-1;
            }
        }
        int output= isMatch(s,p,s.length()-1,p.length()-1,cachememo);

        return output>0;
    }

    private int isMatch(String s, String p,int sindex,int pindex,int[][] cachememo){
        //when everything matched
        if(sindex<0 && pindex<0){
            return 1;
        }

        //when pattern is finished but string is not
        if(sindex>=0 && pindex<0){
            return 0;
        }

        //when string is finished but pattern not
        if(sindex<0 && pindex>=0){
            for(int i=pindex;i>=0;i--){
                if(p.charAt(i)!='*'){
                    return 0;
                }
            }
            return 1;
        }

        if(cachememo[sindex][pindex]!=-1){
            return cachememo[sindex][pindex];
        }

        //?
        if(s.charAt(sindex)==p.charAt(pindex) || p.charAt(pindex)=='?'){
            cachememo[sindex][pindex]=isMatch(s,p,sindex-1,pindex-1,cachememo);
            return cachememo[sindex][pindex];
        }

        //*
        if(p.charAt(pindex)=='*'){
            if(isMatch(s,p,sindex-1,pindex,cachememo)==1 ||isMatch(s,p,sindex,pindex-1,cachememo)==1){
                cachememo[sindex][pindex]=1;
            }
            else{
                cachememo[sindex][pindex]=0;
            }

            return cachememo[sindex][pindex];
        }
        return 0;
    }
}
