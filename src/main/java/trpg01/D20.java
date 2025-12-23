package trpg01;

public class D20 {
    public int Roll(){
        int dice = (int)(Math.random()*20+1);
        return dice;
    }

    public boolean check(int state, int dice){
        boolean result=true;

        if(dice<=state){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
