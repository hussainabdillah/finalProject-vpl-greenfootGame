import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static Counter Combo = new Counter("Combo:");
    static Counter Score = new Counter("Score: ");
    int count = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void started()
    {
        //The Music
        GreenfootSound bg= new GreenfootSound("music1.mp3");
        bg.play();
    }

    private void prepare()
    {
        //Chart editor
        addObject(Combo,1012,681);
        addObject(Score,54,680);
        Combo.setValue(0);
        Score.setValue(0);
        //
        
    }
    
    
    public void act()
    {
        //Setelah chart dibuat dipindah kesini dan disesuaikan waktunya
        count++;
        if(count == 90)
        {
            addObject(new timer8(),178, 226);
            addObject(new purple1(), 178,226 );
        }
        if(count == 183)
        {
            addObject(new timer9(),304, 350);
            addObject(new purple2(),304 ,350 );
        }
        if(count == 255)
        {
            addObject(new timer10(),454, 447);
            addObject(new purple3(),454 ,447 );
        }
        if(count == 400)
        {
            addObject(new timer11(),672, 452);
            addObject(new purple4(),672 ,452 );
        }
        if(count == 480)
        {
            addObject(new timer12(),804, 315);
            addObject(new purple5(),804 ,315 );
        }
        if(count == 540)
        {
            addObject(new timer(),694, 173);
            addObject(new red1(),694 ,173 );
        }
        if(count == 600)
        {
            addObject(new timer2(),526, 53);
            addObject(new red2(),526 ,53);
        }
        if(count == 662)
        {
            addObject(new timer3(),465, 225);
            addObject(new red3(),465 ,225 );
        }
        if(count == 780)
        {
            addObject(new timer8(),665, 331);
            addObject(new purple1(),665 ,331 );
        }
        if(count == 988)
        {
            addObject(new timer9(),425, 407);
            addObject(new purple2(),425 ,407 );
        }
        if(count == 1180)
        {
            addObject(new timer10(),806,510);
            addObject(new purple3(),806,510 );
        }
        if(count == 1374)
        {
            addObject(new timer11(),593,505);
            addObject(new purple4(),593,505);
        }
        if(count == 1590)
        {
            addObject(new timer12(),372,506);
            addObject(new purple5(),372,506);
        }
        if(count == 1775)
        {
            addObject(new timer(),591,502);
            addObject(new red1(),591,502);
        }
        if(count == 1965)
        {
            addObject(new timer2(),596,333);
            addObject(new red2(),596,333);
         }
        if(count == 2140)
        {
            addObject(new timer3(),590,153);
            addObject(new red3(),590,153);
        }
        if(count == 2324)
        {
            addObject(new timer4(),378,309);
            addObject(new red4(),378,309);
        }
        if(count == 2507)
        {
            addObject(new timer5(),821,334);
            addObject(new red5(),821,334 );
        }
        if(count == 2698)
        {
            addObject(new timer8(),720, 300);
            addObject(new purple1(),720 ,300 );
        }
        if(count == 2883)
        {
            addObject(new timer9(),497, 297);
            addObject(new purple2(),497, 297 );
        }
        if(count == 2950)
        {
            addObject(new timer10(),624, 446);
            addObject(new purple3(),624, 446 );
        }
        if(count == 3020)
        {
            addObject(new timer11(),876, 437 );
            addObject(new purple4(),876, 437 );
        }
        if(count == 3090)
        {
            addObject(new timer12(),640, 338);
            addObject(new purple5(),640, 338 );
        }
        if(count == 3160)
        {
            addObject(new timer(),572, 217);
            addObject(new red1(),572, 217 );
        }
        if(count == 3232)
        {
            addObject(new timer2(),411, 84);
            addObject(new red2(),411, 84 );
        }
        if(count == 3302)
        {
            addObject(new timer3(),261, 208);
            addObject(new red3(),261, 208 );
        }
        if(count == 3402)
        {
            addObject(new timer4(),168, 359);
            addObject(new red4(),168, 359 );
        }
        if(count == 3492)
        {
            addObject(new timer5(),420, 386);
            addObject(new red5(),420, 386 );
        }
        if(count == 3602)
        {
            addObject(new timer8(),200, 148);
            addObject(new purple1(),200, 148 );
        }
        if(count == 3690)
        {
            addObject(new timer9(),401, 312);
            addObject(new purple2(),401, 312 );
        }
        if(count == 3780)
        {
            addObject(new timer10(),654, 367);
            addObject(new purple3(),654, 367 );
        }
        if(count == 3873)
        {
            addObject(new timer11(),760, 105);
            addObject(new purple4(),760, 105 );
        }
        if(count == 4100)
        {
            addObject(new timer12(),492, 92);
            addObject(new purple5(),492, 92 );
        }
        if(count == 4250)
        {
            addObject(new timer(),543, 301);
            addObject(new red1(),543, 301);
        }
        if(count == 4500)
        {
            addObject(new timer2(),563, 511);
            addObject(new red2(),563, 511 );
        }
        if(count == 4650)
        {
            addObject(new timer3(),865, 503);
            addObject(new red3(),865, 503 );
        }
        if(count == 5000)
        {
            addObject(new timer4(),875, 268);
            addObject(new red4(),875, 268 );
        }
        if(count == 5100)
        {
            addObject(new timer5(),959, 84);
            addObject(new red5(),959, 84 );
        }
        if(count == 5200)
        {
            addObject(new timer8(),758,82);
            addObject(new purple1(),758,82 );
        }
        if(count == 5400)
        {
            addObject(new timer9(),584,180);
            addObject(new purple2(),584,180 );
        }
        if(count == 5500)
        {
            addObject(new timer10(),758,82);
            addObject(new purple3(),758,82 );
        }
        if(count == 5700)
        {
            addObject(new timer11(),776,308);
            addObject(new purple4(),776,308);
        }
        if(count == 5800)
        {
            addObject(new timer12(),546,303);
            addObject(new purple5(),546,303 );
        }
        if(count == 5900)
        {
            addObject(new timer(),748,452);
            addObject(new red1(),748,452);
        }
        if(count == 6100)
        {
            addObject(new timer2(),510,473);
            addObject(new red2(),510,473 );
        }
        if(count == 6300)
        {
            addObject(new timer3(),335,557);
            addObject(new red3(),335,557 );
        }
        if(count == 6500)
        {
            addObject(new timer4(),289,357);
            addObject(new red4(),289,357 );
        }
        if(count == 6730)
        {
            addObject(new timer5(),150,480);
            addObject(new red5(),150,480);
        }
        if(count == 6920)
        {
            addObject(new timer8(),344,227);
            addObject(new purple1(),344,227);
        }
        //
        if(count == 7000)
        {
            addObject(new timer9(),620,231);
            addObject(new purple2(),620,231);
        }
        if(count == 7125)
        {
            addObject(new timer10(),826, 356);
            addObject(new purple3(),826, 356);
        }
        //
        if(count == 7205)
        {
            addObject(new timer11(),668,497);
            addObject(new purple4(),668,497);
        }
        if(count == 7332)
        {
            addObject(new timer12(),407,482);
            addObject(new purple5(),407,482);
        }
        //
        if(count == 7412)
        {
            addObject(new timer(),528,344);
            addObject(new red1(),528,344);
        }
        if(count == 7523)
        {
            addObject(new timer2(),747,272);
            addObject(new red2(),747,272 );
        }
        if(count == 7725)
        {
            addObject(new timer3(),774,435);
            addObject(new red3(),774,435 );
        }
        if(count == 7903)
        {
            addObject(new timer4(),536,501);
            addObject(new red4(),536,501 );
        }
        if(count == 8203)
        {
            addObject(new timer5(),351,344);
            addObject(new red5(),351,344);
        }
        if(count == 8329)
        {
            addObject(new timer8(),277,343);
            addObject(new purple1(),277,343);
        }
        if(count == 8623)
        {
            addObject(new timer9(),284,152);
            addObject(new purple2(),284,152);
        }
        if(count == 8743)
        {
            addObject(new timer10(),277,340);
            addObject(new purple3(),277,340);
        }
        if(count == 8850)
        {
            addObject(new timer11(),292,545);
            addObject(new purple4(),292,545);
        }
        if(count == 8943)
        {
            addObject(new timer12(),475,344);
            addObject(new purple5(),475,344 );
        }
        if(count == 9080)
        {
            addObject(new timer(),485,156);
            addObject(new red1(),485,156 );
        }
        if(count == 9199)
        {
            addObject(new timer2(),471,340);
            addObject(new red2(),471,340 );
        }
        if(count == 9315)
        {
            addObject(new timer3(),485,537);
            addObject(new red3(),485,537);
        }
        if(count == 9420)
        {
            addObject(new timer4(),809,353);
            addObject(new red4(),809,353);
        }
        if(count == 9580)
        {
            addObject(new timer3(),485,537);
            addObject(new red3(),485,537);
        }
        if(count == 9420)
        {
            addObject(new timer4(),809,353);
            addObject(new red4(),809,353);
        }
        
    }
    
}
