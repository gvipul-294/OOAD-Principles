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

class Parts{

    private String chain;
    private int tire_size;

    Parts(String chain, int tire_size){
        this.chain=chain;
        this.tire_size=tire_size;
    }

    public String getChain(){
        return this.chain;
    }

    public int getTire_size(){
        return this.tire_size;
    }

     

    public String toString() {
        StringBuilder result=new StringBuilder();
        result.append("\nSpare Parts: ");
        result.append("\nchain: "+getChain());
        result.append("\ntire_size: "+getTire_size());
        return result.toString();
    }
  
}

class RoadBikersParts extends Parts{

    private String tape_color;
    
    RoadBikersParts(String chain, int tire_size, String tape_color){
        super(chain,tire_size);
        tape_color=this.tape_color;
    }

    RoadBikersParts(String chain, String tape_color){
        super(chain,23);
        tape_color=this.tape_color;
    }

    public String getTape_color(){
        return this.tape_color;
    }

    public String toString() {
        StringBuilder result=new StringBuilder();
        result.append("\nSpare Parts: ");
        result.append("\nchain: "+getChain());
        result.append("\ntire_size: "+getTire_size());
        result.append("\ntape_color: "+getTape_color());
        return result.toString();
    }

}

class MountainBikersParts extends Parts{

    private String front_shock;
    private String back_shock;
    
    MountainBikersParts(String chain, int tire_size, String front_shock, String back_shock){
        super(chain,tire_size);
        this.front_shock=front_shock;
        this.back_shock=back_shock;
    }

    MountainBikersParts(String chain, String front_shock, String back_shock){
        super(chain,21);
        this.front_shock=front_shock;
        this.back_shock=back_shock;
    }

    public String getFront_Shock(){
        return this.front_shock;
    }
    public String getBack_Shock(){
        return this.back_shock;
    }


    public String toString() {
        StringBuilder result=new StringBuilder();
        result.append("\nSpare Parts: ");
        result.append("\nchain: "+getChain());
        result.append("\ntire_size: "+getTire_size());
        result.append("\nfront shock: "+getFront_Shock());
        result.append("\nback shock: "+getBack_Shock());
        return result.toString();
    }

}

class bicycle{

    private int size;
    
    private Parts myParts;

    bicycle(int size, String chain, int tire_size, String tape_color){
        this.size=size;
        myParts=new RoadBikersParts(chain, tire_size, tape_color);
    }

    bicycle(int size, String chain, int tire_size, String front_shock, String back_shock){
        this.size=size;
        myParts=new MountainBikersParts(chain, tire_size, front_shock, back_shock);
    }

    public int getSize(){
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder result=new StringBuilder();
        result.append("Size: "+ size);
        result.append(myParts.toString());
        return result.toString();
        
    }



}

public class MyProject {

    public static void WorkingWithGearClass() {
        operations mygear=new bicycleGear(52,11,26,1.5);
        System.out.println(mygear.gear_inches());

        operations mygear2=new superCycleGear(52,11,24,1.25);
        System.out.println(mygear2.gear_inches());

        bicycle obj=new bicycle(4, "chain", 4, "fox", "back_shock");

        System.out.println(obj);
    }

    
    public static void main(String[] args) {
        
        System.out.println("Testing the application class: Gear");
        WorkingWithGearClass();


    }
}