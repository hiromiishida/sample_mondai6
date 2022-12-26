public class Main {
    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(rev(0b01001011)));
    }

    private static int rev(int _byte){
        int rbyte = _byte;
        int r = 0b00000000;
        int i;

        for(i=1;i<=8;i++){
            r = (r << 1) | (rbyte & 0b00000001);
            rbyte = rbyte >> 1;
        }

        return r;
    }
}