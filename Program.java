package program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("C:\\Arquivo2.txt");
        Scanner scan = null;
        try{
            scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Erro " + e.getMessage());
        }finally{
            if(scan != null){
                scan.close();
            }
        }


    }
}