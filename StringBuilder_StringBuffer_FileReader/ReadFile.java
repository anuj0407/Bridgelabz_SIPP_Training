package stringBuilderAndBuffer;

import java.io.*;


public class ReadFile{
    public static void main(String[] args) {
        String path="C:\\Users\\HP\\OneDrive\\Desktop\\Practice_Demo\\src\\stringBuilderAndBuffer\\Read.txt";

        try{
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
            fr.close();
        }
        catch(IOException e){
            System.out.println("Error");
        }
       
    }
}