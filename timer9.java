import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class timer9 extends Actor
{
    int counter = 0;
    int size = 456;
    /**
     * Act - do whatever the timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        counter++;
        if(counter <=300)
        {
            Actor purple2 = getOneIntersectingObject(purple2.class);
            if (purple2 == null){MyWorld.Score.add(10);getWorld().removeObject(this);}
            getImage().scale(size, size);
            size = size - 1;
        }
        if(counter == 120)
        {
            MyWorld.Combo.setValue(0);
            Actor border1 = getOneIntersectingObject(purple2.class);
            getWorld().removeObject(border1);
            getWorld().removeObject(this);
        }
        
    }
}
