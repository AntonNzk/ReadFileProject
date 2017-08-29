import java.io.*;

public class ReadFileApp {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("D:\\images\\testfile.txt")){

        int a;
    while((a=reader.read())!=-1){
        System.out.println((char)a);
    }

}
catch(IOException ex){
    System.out.println(ex.getMessage());
        }
    }
}