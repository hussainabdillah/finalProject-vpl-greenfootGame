import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class border1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class border1 extends Actor
{
    /**
     * Act - do whatever the border1 wants to do. This method is called whenever
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
        if(count == 10)
        {
            getImage().setTransparency(85);
        }
        if(count == 20)
        {
            getImage().setTransparency(170);
        }
        if(count == 30)
        {
            getImage().setTransparency(255);
        }
        //waktu yang ada sebelum menghilang jika tidak diklik
        
        //clicked detection
        if(Greenfoot.mouseClicked(this))
        {
            // MyWorld.Score.add(10);
            // MyWorld.Combo.add(1);
            ngilang();
        }
    }
    //ketika diklik menghilang
    void ngilang()
    {
        Greenfoot.playSound("hitsound.wav");
        Actor border1 = getOneIntersectingObject(timer.class);
        getWorld().removeObject(border1);
        getWorld().removeObject(this);
    }
}
