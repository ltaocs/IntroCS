package lt;

/**
 * CPUSize
 * Created by Lin Tao on 6/17/2017.
 */
public class CPUSize {
    public static void main(String[] args) {
        int LightSpeed = 299_792_458;//Google, m/s
        double OneInstructionTime = 1 / (2.8 * 1_000_000_000);//2.8Ghz=CPU can do 2.8 billion things in one second
        //double NOneInstructionTime = 1 / (2.8 * Math.pow(10, 9));
        double MOneInstructionTime = 1 / (2.8e9);
        double CPULength = LightSpeed * OneInstructionTime;//Distance = Spead*Time
        //double MCPULength = LightSpeed * MOneInstructionTime;//Distance = Spead*Time
        System.out.println("My computer's CPU cannot big than " + CPULength + "m");
        //System.out.println(MCPULength);
    }
}
