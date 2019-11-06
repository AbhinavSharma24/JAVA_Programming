package LAB10;

import java.io.*;
// We need to provide file path as the parameter:
// double backquote is to avoid compiler interpret words
// like \test as \t (i.e. as a escape sequence)
public class readFile
{
    public static void main(String[] args) throws Exception {
        File file=new File("C:\\Users\\abhin\\Desktop\\abhinav.txt");
        BufferedReader br=new BufferedReader(new FileReader(file));
        String st;
        while((st=br.readLine())!=null){
            System.out.println(st);
        }
        String s="hello world";
        File f=new File("C:\\Users\\abhin\\Desktop\\newFile.txt");
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter(f));
            bw.write(s);
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

