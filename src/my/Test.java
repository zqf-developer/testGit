package my;

public class Test {

    /**
     求两个数的乘积
     * **/
    public int getAccumulate(int x, int y){
        int z;
        z=x*y;
        return z;
    }

    /**
     *给定一个数a, 如果为奇数则输出“为奇数"  。如果是偶数则输出“为偶数”
     * **/
    public String getEven(int a){
        String result="";
        if(a%2==0){
            result="为偶數";
        }else {
            result="为奇数";
        }
        return result;
    }

    public String getDivisible(int b){
        String c="";
        if(b%3==0&&b%7==0){
            c="能被整除";
        }else{
            c="不能被整除";
        }
        return c;
    }
}
