
package com.mycompany.part9_2_packable;

/**
 *
 * @author delam
 */
public class Book implements Packable {
private String author;
private String name;
private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    public Book() {
    }

     @Override
    public double weight() {
        
        return this.weight;
        
   }
   

    @Override
    public String toString() {
        return "Book{" + "author=" + author + ", name=" + name + ", weight=" + weight + '}';
    }

}
