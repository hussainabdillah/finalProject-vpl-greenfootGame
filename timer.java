import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class timer extends Actor
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
            Actor red1 = getOneIntersectingObject(red1.class);
            //Menghilangkan timer ketika circle menghilang
            if (red1 == null){
                MyWorld.Score.add(10);
                getWorld().removeObject(this);
            }
            getImage().scale(size, size);
            size = size - 1;
        }
        //Ketika tidak diklik, mereset combo, dan menghilangkan object circle
        if(counter == 120)
        {
            MyWorld.Combo.setValue(0);
            Actor red1 = getOneIntersectingObject(red1.class);
            getWorld().removeObject(red1);
            getWorld().removeObject(this);
        }
    }
}
