import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class purple5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class purple5 extends Actor
{
    /**
     * Act - do whatever the purple5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    public void act()
    {
        // Add your action code here.
        count++;
        //fade in animation
        if(count == 0)
        {
            getImage().setTransparency(0);
        }
        if(count == 5)
        {
            getImage().setTransparency(85);
        }
        if(count == 10)
        {
            getImage().setTransparency(170);
        }
        if(count == 15)
        {
            getImage().setTransparency(255);
        }
        //waktu yang ada sebelum menghilang jika tidak diklik
        
        //clicked detection
        if (getWorld().getObjects(purple3.class).isEmpty()){
            if (getWorld().getObjects(purple4.class).isEmpty()){
                if(Greenfoot.mouseClicked(this)){
                MyWorld.Combo.add(1);
                ngilang();
            }
        }
        }
    }
    void ngilang()
    {
        Greenfoot.playSound("hitsound.wav");
        getWorld().removeObject(this);
    }
}
