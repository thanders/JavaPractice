package cipherTech;


import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;


public class crypt {

    public static String toHex(String arg) {
        return String.format("%010x", new BigInteger(1, arg.getBytes(/*YOUR_CHARSET?*/)));
    }

    public static String hexToBin(String s) {
        return new BigInteger(s, 16).toString(2);
    }

    public static byte[] crypt(byte[] data, long initialValue) {

        int size = data.length;
        System.out.println("input array size: " + size);

        // array of Strings
        ArrayList bits = new ArrayList();

        for (int i = 0; i < data.length; i++) {
            System.out.println("BTEST" + data[i]);

            System.out.println("HELLLOOO" + String.format("%8s", Integer.toBinaryString(data[i])));
        }




        // loop through byte array and convert ascii to binary
        StringBuilder sb = new StringBuilder();

        int dingle = 0X285;
        Short ts = 0X41;

        String tss = String.valueOf(ts);

        long binary;

        try {

            binary = Long.parseLong(tss, 2);
            System.out.println("hex to bin test:  " + binary);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }


        System.out.println("Str Before: ");

        System.out.println();

        BitSet bs = BitSet.valueOf(new long[]{ts});

        //BitSet bitSet = BitSet.valueOf(LongBuffer.allocate(ts));

        System.out.println("BS Length: " + bs.length());
        System.out.println("BS empty?: " + bs.isEmpty());

        int bsSize = bs.length();

        System.out.println("PRINT: " + bs);

        System.out.println("BS Before: ");
        for (int i = 0; i < bs.length(); i++) {

            System.out.print(bs.get(i) + " ");
        }

        // Calculate XOR variable
        boolean XOR = bs.get(bs.length() - 1) ^ bs.get(bs.length() - 3);
        System.out.println("XOR equals: " + XOR);

        //bs.set(bsSize-1, true);

        System.out.println("BS After: ");
        for (int i = 0; i < bs.length(); i++) {
            System.out.print(bs.get(i) + " ");
        }
        // print out the underlying long array

        long[] aLong = bs.toLongArray();

        System.out.println(" ");
        System.out.println("dingle Before: ");

        // Decimal 645
        Arrays.stream(aLong).forEach(System.out::println);

        // bitset before shift
        for (int i = 0; i < bs.length(); i++) {
            System.out.print(bs.get(i) + " ");
        }

        // loop through along[], shift bits
        for (int i = 0; i < aLong.length; ++i) {

            aLong[i] <<= 1;

        }

        long changed = aLong[0];
        System.out.println("Changed: " + changed);
        BitSet shifted = BitSet.valueOf(new long[]{changed});


        System.out.println("Shifted? size: " + aLong.length);
        System.out.println("After shift:");

        Arrays.stream(aLong).forEach(System.out::println);


        for (int i = 0; i < shifted.length(); i++) {
            System.out.print(shifted.get(i) + " ");
        }
// clear
        shifted.clear(shifted.length() - 1);
        System.out.println("/n");
        System.out.println("Cleared:");
        for (int i = 0; i < shifted.length(); i++) {
            System.out.print(shifted.get(i) + " ");
        }

        System.out.println("After XOR:");

        shifted.set(0, XOR);

        for (int i = 0; i < shifted.length(); i++) {
            System.out.print(shifted.get(i) + " ");
        }

        byte[] input = ByteBuffer.allocate(2).putShort(ts).array();


        for (byte b : input) {

            if (b != 0) {

                String bin = Integer.toBinaryString(b & 255 | 256).substring(1);
                sb.append(bin);

                System.out.println(bin);
                System.out.println(bin.charAt(0) + " " + bin.charAt(2) + " xor: " + (bin.charAt(0) ^ bin.charAt(2)));
            }
        }

        System.out.println("Check: " + sb.toString());

        String test = sb.toString();

        long a = Long.parseLong(String.valueOf(test), 2);

        // byte array with ascii values
        byte[] result = ByteBuffer.allocate(8).putLong(a).array();

        System.out.println(new String(result, Charset.defaultCharset()));

        System.out.println("LFSR");
        String x = "FFFFFFFF";

        System.out.println("initial: " + x);

        String bin = hexToBin(x);
        System.out.println("Binary: " + bin);
        //int y = Integer.parseInt(bin.trim());

        //System.out.println(String.format("%08x", y<<1));


        return result;

    }


        public static void main(String[] args) {

        // inputs
        String strData = "Apple";

        int strLength = strData.length();

        // Convert to hex
        String hex = toHex(strData);
        System.out.println("Hex: "+ hex);

        // Hex to Binary
        String bin = hexToBin(hex);
        System.out.println("Binary: " + bin);

        // https://stackoverflow.com/questions/17727310/convert-binary-string-to-byte-array
        long binary = Long.parseLong(bin, 2);

        // byte array with ascii values
        byte [] data = ByteBuffer.allocate(8).putLong(binary).array();

        System.out.println(new String(data, Charset.defaultCharset()));

        //
        long initialValue = 0x12345678;

        // Call the Crypt method with parameters
        byte [] tom = crypt(data, initialValue);

    }
}
