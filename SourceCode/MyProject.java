package learnOOAD;

interface operations{
    
    double ratio();
    double diameter();
    double gear_inches();

}

class bicycleGear implements operations{

    static class wheel{

        private int rim;
        private double tire;

        wheel(int rim, double tire){
            this.rim=rim;
            this.tire=tire;
        }

        private int getRim(){
            return this.rim;
        }
        private double getTire(){
            return this.tire;
        }
    }

    static class data{
        private int chainring;
        private int cog;
        
        private wheel wheeldata;

        data(int chainring, int cog){
            this.chainring=chainring;
            this.cog=cog;
    
        }
        data(int chainring, int cog, int rim, double tire){
            this.chainring=chainring;
            this.cog=cog;
            wheeldata=new wheel(rim,tire);
        }

        private int getChainring(){
            return this.chainring;
        }
        private int getCog(){
            return this.cog;
        }
        private int getRim(){
            return wheeldata.getRim();
        }
        private double getTire(){
            return wheeldata.getTire();
        }

    }

    private data mydata;

    bicycleGear(int chainring, int cog){
        
        mydata=new data(chainring,cog);

    }
    bicycleGear(int chainring, int cog, int rim, double tire){
        
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

class superCycleGear implements operations{

    static class wheel{

        private int rim;
        private double tire;

        wheel(int rim, double tire){
            this.rim=rim;
            this.tire=tire;
        }

        private int getRim(){
            return this.rim;
        }
        private double getTire(){
            return this.tire;
        }
    }

    static class data{
        private int chainring;
        private int cog;
        
        private wheel wheeldata;

        data(int chainring, int cog){
            this.chainring=chainring;
            this.cog=cog;
    
        }
        data(int chainring, int cog, int rim, double tire){
            this.chainring=chainring;
            this.cog=cog;
            wheeldata=new wheel(rim,tire);
        }

        private int getChainring(){
            return this.chainring;
        }
        private int getCog(){
            return this.cog;
        }
        private int getRim(){
            return wheeldata.getRim();
        }
        private double getTire(){
            return wheeldata.getTire();
        }

    }

    private data mydata;

    superCycleGear(int chainring, int cog){
        
        mydata=new data(chainring,cog);

    }
    superCycleGear(int chainring, int cog, int rim, double tire){
        
        mydata=new data(chainring,cog,rim,tire);

    }

    public double ratio(){
        return (mydata.getChainring()*(double)2)/(double)mydata.getCog();
    }

    public double diameter(){
        return ((double)mydata.getRim()+mydata.getTire()*((double)3));
    }
    public double gear_inches(){
        return ratio()*diameter()*2;
    }



}


public class MyProject {

    public static void WorkingWithGearClass() {
        operations mygear=new bicycleGear(52,11,26,1.5);
        System.out.println(mygear.gear_inches());

        operations mygear2=new superCycleGear(52,11,24,1.25);
        System.out.println(mygear2.gear_inches());

        
    }

    
    public static void main(String[] args) {
        
        System.out.println("Testing the application class: Gear");
        WorkingWithGearClass();


    }
}