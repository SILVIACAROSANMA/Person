
package com.mycompany.filescsv;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFiles1 {


public class ReadFiles {
    private File file;
    private FileReader fileReader;
    private BufferedReader bufferedReader;

    public ReadFiles(File file)throws IOException {
          
      }

    public ReadFiles(File file) {
        this.file = file;
        this.fileReader = fileReader;
        this.bufferedReader = bufferedReader;
    


    }
   public List<String>loadData() throws IOException{
        String line;
        List<String> data = new ArrayList<>();
        
        try{ 
         while((line = bufferedReader.readLine())!=null){
        data.add(line);
        
        }    
    }catch (IOException e){
       
        
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
}