import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Data {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        DataList list = new DataList();
        String target;
        
        try{
            generateListFromFile(list);
            System.out.println("Enter an element that you would like to search for.");
            target = scnr.nextLine();
            if(list.find(target)){
                System.out.println("This element exists in the list!");
            }
            else{
                System.out.println("This element does not exist in this list!");
            }
        }catch(IOException e){
            System.out.println(e);
        }

        scnr.close();
    }
    //Reads the file elements.txt and generates a linked list from the contents.
    public static void generateListFromFile(DataList list)throws IOException{
         Scanner fileRead = new Scanner(new File("elements.txt"));
        while(fileRead.hasNext()){
            list.add(fileRead.nextLine());
        }
        fileRead.close();
    }
}
