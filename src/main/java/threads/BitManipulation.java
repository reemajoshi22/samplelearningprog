package threads;

import java.util.BitSet;

public class BitManipulation {
	 public static int NUMBER_BITS = 16;
	public static void main(String[] args) {
		BitSet bits2 = BitSet.valueOf(new long[] {0b110011});
		System.out.println(bits2);
		 BitSet b1 = new BitSet(NUMBER_BITS);
		 /*for (int i = 0; i < NUMBER_BITS; i++) {
			 b1.set(i, false);
	      }*/
		 for (int i = 0; i < NUMBER_BITS; i++) {
			 System.out.print(b1.get(i)?"1":"0");
			// System.out.print(b1.get(i) ? "1" : "0");
	      }
		 long val= convert(bits2);
			System.out.println("value"+val);
	}
	 public static long convert(BitSet bits) {
		    long value = 0L;
		    for (int i = 0; i < bits.length(); ++i) {
		      value += bits.get(i) ? (1L << i) : 0L;
		    }
		    return value;
		  }
}
