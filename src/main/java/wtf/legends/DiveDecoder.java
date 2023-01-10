package wtf.legends;

import wtf.legends.Dive;

import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.BitSet;

public class DiveDecoder {
    private String fileName;


    public Dive Decode(String fileName) throws IOException {
        Dive _dive = new Dive();
        File fileObject = new File(fileName);
        FileInputStream fis = null;
        fis = new FileInputStream(fileObject);

        try {

            byte[] bytes = new byte[(int) 32];
            fis.read(bytes);
            _dive.setLogNumber(BytesOperation.byteArrayToUInt16(bytes, 6));

            _dive.setStartTimeEpoch(BytesOperation.byteArrayToUInt32(bytes, 8) + 946684800);
            //    Date start_time = new Date( startTimeEpoch* 1000);

            BitSet bitSet = BitSet.valueOf(BytesOperation.subArray(bytes, 12, 4));
            _dive.setDiveDuration(BytesOperation.toInt(bitSet.get(0, 17)));

            _dive.setNoDeco(bitSet.get(24));
            _dive.setDiveMode(BytesOperation.toInt(bitSet.get(27, 30)));
            BitSet bitSet2 = BitSet.valueOf(BytesOperation.subArray(bytes, 16, 4));


            _dive.setDiveRecordCount(BytesOperation.toInt(bitSet2.get(0, 18)));
            _dive.setMinTemperature(BytesOperation.toInt(bitSet2.get(18, 28)) / 10);

            _dive.setDiveDayNumber(BytesOperation.toInt(bitSet2.get(28, 32)) + 1);
            _dive.setMaxDepth(BytesOperation.byteArrayToUInt16(bytes, 20) / 100);
            _dive.setOtu(BytesOperation.byteArrayToUInt16(bytes, 22));
            return _dive;


        } finally {
            if (fis != null) {
                fis.close();


            }
        }

    }
}