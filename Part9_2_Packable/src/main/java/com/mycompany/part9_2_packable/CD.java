
package com.mycompany.part9_2_packable;

import java.util.Scanner;


class CD implements Packable{
//CD has a constructor which is given the artist (String), name of the CD (String), and the publication year (int). The weight of all CDs is 0.1 kg.
String artist;
String nameCD;
int pubYear;
double weight = 0.1;

    public CD() {
    }

    public CD(String artist, String nameCD, int pubYear) {
        this.artist = artist;
        this.nameCD = nameCD;
        this.pubYear = pubYear;
    }

    @Override
    public String toString() {
        return "CD{" + "artist=" + artist + ", nameCD=" + nameCD + ", pubYear=" + pubYear + ", weight=" + weight + '}';
    }
 @Override
    public double weight() {
        
        return this.weight;
        
   }
    
}
