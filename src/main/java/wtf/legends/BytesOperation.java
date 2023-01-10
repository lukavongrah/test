package wtf.legends;

import java.util.BitSet;

public class BytesOperation {
    public static int byteArrayToUInt16(byte[] data, int offset) {
        if (data == null || data.length < offset + 2) {
            return 0;
        }
        int result = ((data[offset+1] & 0xFF) << 8)
                + (data[offset] & 0xFF);

        return result;
    }
    public static byte[] subArray(byte[] b, int offset, int length) {
        byte[] sub = new byte[length];
        for (int i = offset; i < offset + length; i++) {
            try {
                sub[i - offset] = b[i];
            } catch (Exception e) {

            }
        }
        return sub;
    }
    public static long byteArrayToUInt32(byte[] data, int offset) {
        if (data == null || data.length < offset + 4) {
            return 0;
        }
        long result = ((data[offset +3 ] & 0xFF) << 24)
                + ((data[offset + 2] & 0xFF) << 16)
                + ((data[offset + 1] & 0xFF) << 8)
                + (data[offset] & 0xFF);

        return result;
    }
    public static int toInt(BitSet bitSet) {
        int intValue = 0;
        for (int bit = 0; bit < bitSet.length(); bit++) {
            if (bitSet.get(bit)) {
                intValue |= (1 << bit);
            }
        }
        intValue &= Integer.MAX_VALUE;
        return intValue;
    }
}
