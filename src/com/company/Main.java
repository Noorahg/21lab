package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	/**Англиcче алфавитти жана сандарды файлга жазыныз
     // Кайра эле ошол файлдан анын ичиндеги маалыматты окуп консольго чыгарышыныз керек**/
        BufferedReader br=null;
    try{
    File file=new File("alphabet.txt");
    if(!file.exists())
        file.createNewFile();

        FileWriter writer=new FileWriter(file);
        writer.write("Aa\nBb\nCc\nDd\nEe\nFf\nGg\nHh\nIi\nJj\nKk\nLl\nMm\nNn\nOo\nPp\nQq\nRr\nSs\nSs\nTt\nUu\nVv\nWw\nXx\nYy\nZz");
        writer.write("\n0");
        writer.write("\n1");
        writer.write("\n2");
        writer.write("\n3");
        writer.write("\n4");
        writer.write("\n5");
        writer.write("\n6");
        writer.write("\n7");
        writer.write("\n8");
        writer.write("\n9");


        writer.close();

       br=new BufferedReader(new FileReader("alphabet.txt"));
       String line;
       while ((line=br.readLine())!=null){
           System.out.println(line);
       }
    }catch(MyException e){
            System.out.println("Error:"+e);
    }finally {
        try{
        br.close();
    }catch (MyException e){
            System.out.println("Error:"+e);
        }
    }
}
}
