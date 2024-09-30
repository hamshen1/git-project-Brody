import java.io.*;

public class GitTester2 {
    public static void main (String [] args) throws IOException {
        File root = new File ("root");
        root.mkdir();

        File text = new File ("root/new.txt");
        text.createNewFile();
        BufferedWriter bw = new BufferedWriter(new FileWriter(text));
        bw.write("new file");
        bw.close();

        File test = new File ("root/test.txt");
        test.createNewFile();
        BufferedWriter bw2 = new BufferedWriter(new FileWriter(test));
        bw2.write("version 2");
        bw2.close();

        File bak = new File ("root/bak");
        bak.mkdir();

        File test2 = new File ("root/bak/test.txt");
        test2.createNewFile();
        BufferedWriter bw3 = new BufferedWriter(new FileWriter(test2));
        bw3.write("version 1");
        bw3.close();

        File index = new File ("git/index");
        BufferedWriter bw4 = new BufferedWriter(new FileWriter(index));
        bw4.write("");
        bw4.close();
        System.out.println(Git.addTree("root", root.getName()));
    }
}
