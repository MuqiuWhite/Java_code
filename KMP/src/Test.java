import com.sun.deploy.security.SelectableSecurityManager;

public class Test {
    /**
     *
     * @param str 主串
     * @param sub 子串
     * @param pos 从子串的pos开始匹配
     * 返回下标
     */
    public static void getNext(String sub,int []next) {
        next[0]=-1;
        next[1]=0;
        int i=2;//提前走了一步
        int k=0;//表示
        //遍历子串
        for(;i<sub.length();i++)
        {
            //p[i-1]==p[k]
            if(k==-1||sub.charAt(i-1)==sub.charAt(k))
            {
                next[i] = k + 1;
                k++;
                i++;
            }
            else//p[i-1]!=p[k]
            {
                k=next[k];
            }
        }

    }



    public static int KMP(String str,String sub,int pos) {
        if(str==null||sub==null)
            return -1;
        int lenstr=str.length();
        int lensub=sub.length();
        if(lenstr==0||lensub==0)
            return -1;
        if(pos<0||pos>=lenstr)
            return -1;

        int []next=new int[lensub];
        getNext(sub,next);

        int i=pos;//遍历主串
        int j=0;//遍历子串
        while(i<lenstr&&j<lensub)
        {
            if(j==-1||str.charAt(i)==sub.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                j=next[j];//j有可能=-1,一开始就匹配失败
            }
        }

        if(j>=lensub)
        {
            return i-j;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(KMP("abcabcdcabd","abcd",0));

    }
}
