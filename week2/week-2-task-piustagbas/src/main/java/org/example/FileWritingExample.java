package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWritingExample {
    public static void main(String[] args) {
        String fileName = "Student.csv";
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName,true))){
            String dataToWrite = "Evelyn,Torgenson,evelynt+student+academy@chalk.com,evelynt+guardian+academy@chalk.com,,,\n"+
            "Joseph,Sturdevant,1,josephs+student+academy@chalk.com,josephs+guardian+academy@chalk.com,,,\n"+
            "Scotty,Busch,1,scottyb+student+academy@chalk.com,scottyb+guardian+academy@chalk.com,nickyb+guardian+academy@chalk.com,,\n"
            +"Nicky,Busch,1,nickyb+student+academy@chalk.com,nickyb+guardian+academy@chalk.com,scottyb+guardian+academy@chalk.com,,\n"+
            "Hilma,Habbard,1,hilmah+student+academy@chalk.com,hilmah+guardian+academy@chalk.com,,,\n"+
            "Avis,Faulcon,2,avisf+student+academy@chalk.com,avisf+guardian+academy@chalk.com,,,\n"+
            "Marybeth,Bolduc,2,marybethb+student+academy@chalk.com,,,,\n"+
            "Scarlet,Alt,2,scarleta+student+academy@chalk.com,scarleta+guardian+academy@chalk.com,,,\n"+
            "Rheba,Loftin,2,rhebal+student+academy@chalk.com,,,,\n"+
            "Marvel,Alexander,2,marvela+student+academy@chalk.com,,,,\n"+
            "Terri,Robeson,2,terrir+student+academy@chalk.com,terrir+guardian+academy@chalk.com,,,\n"+
            "Titus,Seese,3,tituss+student+academy@chalk.com,tituss+guardian+academy@chalk.com,,,\n"+
            "Dionne,Heron,3,dionneh+student+academy@chalk.com,dionneh+guardian+academy@chalk.com,dionneh2+guardian+academy@chalk.com,,\n"+
            "Tanna,Weisberg,3,tannaw+student+academy@chalk.com,tannaw+guardian+academy@chalk.com,,,\n"+
            "Ethel,Kleckner,3,ethelk+student+academy@chalk.com,,,,\n"+
            "Lorenza,Waggener,3,lorenzaw+student+academy@chalk.com,lorenzaw+guardian+academy@chalk.com,,,\n"+
            "Nannie,Stupka,4,nannies+student+academy@chalk.com,nannies+guardian+academy@chalk.com,,,\n"+
            "Emile,Rincon,4,emiler+student+academy@chalk.com,,,,\n"
            "Zeneida,Hotard,4,zeneidah+student+academy@chalk.com,zeneidah+guardian+academy@chalk.com,,,\n"+
            +"Lenora,Speights,4,lenoras+student,academy@chalk.com,lenoras, guardian academy@chalk.com,,,\n";

            bufferedWriter.write(dataToWrite);

        }
        catch (Exception e){
            throw new RuntimeException(("COUD NOT WRITE THIS MESSAGE" + "" + fileName+ "because,"+ e.getMessage() ));
        }
    }

}

