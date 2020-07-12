package learnOOAD;

class Gear{

    private int chainring;
    private int cog;
    private int rim;
    private double tire;

    Gear(int chainring, int cog){
        this.chainring=chainring;
        this.cog=cog;

    }
    Gear(int chainring, int cog, int rim, double tire){
        this.chainring=chainring;
        this.cog=cog;
        this.rim=rim;
        this.tire=tire;
    }

    int getChainring(){
        return chainring;
    }
    int getCog(){
        return cog;
    }
    int getRim(){
        return rim;
    }
    double getTire(){
        return tire;
    }


    double ratio(){
        return getChainring()/(double)getCog();
    }

    double diameter(){
        return ((double)getRim()+getTire()*((double)2));
    }
    double gear_inches(){
        return ratio()*diameter();
    }



}

public class MyProject {

    public static void WorkingWithGearClass() {
        Gear mygear=new Gear(52,11,26,1.5);
        System.out.println(mygear.gear_inches());

        Gear mygear2=new Gear(52,11,24,1.25);
        System.out.println(mygear2.gear_inches());

    }

    
    public static void main(String[] args) {
        
        System.out.println("Testing the application class: Gear");
        WorkingWithGearClass();


    }
}