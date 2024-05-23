
package com.mycompany.filescsv;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileRead {
    private  File file;
    private FileReader filereader;
    private BufferedReader bufferedreader;

    public FileRead(File file, FileReader filereader, BufferedReader bufferedreader) {
        this.file = file;
        this.filereader = filereader;
        this.bufferedreader = bufferedreader;
    }
      public FileRead(File file)throws IOException {
          
      }

    public List<String> loadData(Object fileReader){
        String line;
        List<String> data = new ArrayList<>();
            
 try{ 
         while((line = bufferedReader.readLine())!=null){
        data.add(line);
        
        }    
    }catch (IOException e1){
       
        
       try{ 
       while((line = bufferedReader.readLine())!=null){
           data.add(line);
           }
      if(fileReader !=null){
      fileReader.close();
      }
    }catch(IOException e2){
    }
  }
return data;

}
    }   

  


        
       




    
    
 
    
        
      


    
        
        

