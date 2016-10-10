import  java.io.*;
import java.util.Vector;


public class countWord {
    public static void main(String[] args) {

        String nameFile = "text.txt";
        Vector<String> strs = new  Vector<String>();

        try (BufferedReader br = new BufferedReader(new FileReader(nameFile)))
        {
            String c;
            while ((c=br.readLine()) !=null)
                {
                    strs.add(c);
                }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        String[] array= strs.toArray(new String[strs.size()]);
        int countWord=0;

        for (int i=0; i< array.length; i++)
        {

            String[] tmp= array[i].split(" ");
            for (int j = 0 ; j < tmp.length;j++){
                if ((tmp[j] != " " )&& !(tmp[j].equals(""))) {
                    System.out.println(tmp[j]);
                    countWord++;
                }
            }
        }
        System.out.println("count world : " + countWord);
    }
}
