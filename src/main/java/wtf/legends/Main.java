package wtf.legends;

import java.io.*;

import java.util.BitSet;
import java.util.Date;
import wtf.legends.BytesOperation;
import wtf.legends.Dive;
import wtf.legends.DiveDecoder;
public class Main {


        public static void main(String[] args)  throws IOException{
            System.out.println("Parsing file....");
            Dive _dive = new Dive();
            DiveDecoder _diveDecoder = new DiveDecoder();
           _dive =  _diveDecoder.Decode("d:/dev/00000037.DLF");
           System.out.println(_dive.getMaxDepth());

        }

    }
