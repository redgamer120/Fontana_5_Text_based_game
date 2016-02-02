/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

/**
 *
 * @author Redgamer120
 */
public class Orb {
    private int x, y;
    private int size;
    private boolean isVisible;
    Image orbpic;
    Shape hitbox;
    public Orb(int x, int y) throws SlickException{
        this.isVisible = false;
        this.x = x;
        this.y = y;
        this.orbpic = new Image ("res/orbs/Ninja_12.png");
        this.hitbox = new Rectangle (x, y, 32, 32);
    }

    public Image getOrbpic() {
        return orbpic;
    }

    public void setOrbpic(Image orbpic) {
        this.orbpic = orbpic;
    }

    public Shape getHitbox() {
        return hitbox;
    }

    public void setHitbox(Shape hitbox) {
        this.hitbox = hitbox;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isIsVisible() {
        return isVisible;
    }

    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }
//    public void set location(int x, int b) {
//        magic8ball.setX(player.x);
//            magic8ball.setY(player.y);
//            magic8ball.setHitbox(player.x + 5);
//            magic8ball.setHitbox(player.y - 10);
//    }
    /**
     * Getters and setters are a common concept in Java.
     * A design guildline in Java, object oriented
     * programming in genral, is to encapsulate/isolate
     * values as much as possible.
     * Getters - are methods used to query the calue of 
     * instance variables.
     * this.getLocationX();
     * Setters -methods that set the calues for instance 
     * varibles.
     * orb1.steLocation(Player.x, Player.y);
     */
    
}
