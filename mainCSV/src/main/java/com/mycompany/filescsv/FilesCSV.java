package com.mycompany.filescsv;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FilesCSV {

    public static void main(String[] args) throws IOException {
        String path= "./data.csv";
  
   
     FileReader fileReader = null;
     try{
         fileReader = new FileReader(path);
         int value = fileReader.read();
         while (value !=-1){
             System.out.println((char) value);
             value = fileReader.read(); 
            }
        }catch(IOException e){
            System.out.println("Ha ocurrido un error");
        }finally{
         if(fileReader !=null){
           fileReader.close();
             
             
         }
     }
        
    }
}

        
     
        
     
            
  

   
     