package com.urise.webapp;

import java.io.*;

public class MainFile implements FileFilter {
    private String mask;

    public MainFile(String mask) {
        this.mask = mask;
    }

    public static void main(String[] args) {
        String filePath = ".//.gitignore";
        File file = new File(filePath);
        MainFile mf = new MainFile(".");
        File fileDir = new File("/Users/ivan_macintosh/basejava/src");
        try {
            mf.findFiles(fileDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("work was done");

    }

    //TODO make pretty output
    public void findFiles(File filePath) throws IOException{
        if(filePath.isDirectory()){
            System.out.println("Directory: "+ filePath.getCanonicalPath());
            File[] files = filePath.listFiles();
            for(int i = files.length; --i>=0;){
                findFiles(files[i]);
            }
        }else {
            if(accept(filePath)){
                System.out.println("File: "+filePath.getName());
            }
        }
    }


    @Override
    public boolean accept(File pathname) {
        return (pathname.getName().indexOf(mask)!=-1)?true:false;
    }
}
