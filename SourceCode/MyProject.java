package learnOOAD;

class Gear{

    class data{
        private int chainring;
        private int cog;
        private int rim;
        private double tire;

        data(int chainring, int cog){
            this.chainring=chainring;
            this.cog=cog;
    
        }
        data(int chainring, int cog, int rim, double tire){
            this.chainring=chainring;
            this.cog=cog;
            this.rim=rim;
            this.tire=tire;
        }

        private int getChainring(){
            return mydata.chainring;
        }
        private int getCog(){
            return mydata.cog;
        }
        private int getRim(){
            return mydata.rim;
        }
        private double getTire(){
            return mydata.tire;
        }

    }

    private data mydata;

    Gear(int chainring, int cog){
        
        mydata=new data(chainring,cog);

    }
    Gear(int chainring, int cog, int rim, double tire){
        
        mydata=new data(chainring,cog,rim,tire);

    }

    public double ratio(){
        return mydata.getChainring()/(double)mydata.getCog();
    }

    public double diameter(){
        return ((double)mydata.getRim()+mydata.getTire()*((double)2));
    }
    public double gear_inches(){
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