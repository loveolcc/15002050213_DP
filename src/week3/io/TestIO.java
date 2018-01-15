package week3.io;

import java.io.*;

public class TestIO {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("temp.txt");
        //out.write(1000000);
        //out.close();

        DataOutputStream dout = new DataOutputStream(out);
        dout.writeInt(34567);
        dout.close();

       // BufferedOutputStream bout = new BufferedOutputStream(out);
        //bout.write(34567);
        //bout.close();

        //DataOutputStream dout = new DataOutputStream(bout);
        //DataOutputStream dout = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("temp.txt")));
        //dout.writeInt(34567);
        //dout.close();


        FileInputStream in = new FileInputStream("temp.txt");
        DataInputStream din = new DataInputStream(in);
        int x = din.readInt();
        System.out.println("x="+x);
        din.close();

        //PrintWriter pw = new PrintWriter("xxx.txt");
        //pw.print(34567);
        //pw.close();
    }


}
