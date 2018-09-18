/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author ty tarraf
 */
public class Character {
    //Fields (Variables)
    private int x;
    private int y;
    private int dx;//speed
    private int dy;//speed
    private Color color;
    private int size;
    private String name;
    
    //Constructor
    public Character() { 
        x = 0;
        y = 0;
        dx = 0;
        dy = 0;
        color = Color.BLUE;
        size = 20;
        name = "enemy";
    }
    
    public Character(int x, int y, Color color, int size, String name) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.size = size;
        this.name = name;
        dx = 0;
        dy = 0;
    }
    
    //Getters
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public Color getColor() {
        return color;
    }
    
    public int getSize() {
        return size;
    }
    
    public String getName() {
        return name;
    }
    
    //Setters
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setDX(int dx) {
        this.dx = dx;
    }
    
    public void setDY(int dy) {
        this.dy = dy;
    }
    
    
    public void setColor(Color color) {
        this.color = color;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    //Public Methods
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, size, size);
    }
    
    public void kill() {
        grow();
    }
    

    /**
     * Makes the character "bounce" and reverse direction on X axis 
     */
    
    
    
    public void reverseX() {
        //TODO Implement this method
        x = -5;
        
        
    }
    
    /**
     * Makes the character "bounce" and reverse direction on Y axis 
     */
    
    
    
    
    public void reverseY() {
        //TODO Implement this method
        y = -5; 
        
        
    }
    
     
    public void move(int dx, int dy) {
        x += dx * 3;
        y += dy * 3;
    }
    
    public void update() {
        move(dx, dy);
        
    }
    
    
    
    //Private Methods
    private void grow() {
        //size = ((int) (Math.random()*10) - 4 );
        size *= 1.05;
    }

    
}