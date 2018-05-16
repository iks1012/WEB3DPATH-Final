package render_engine;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.*;

public class DisplayManager {

    public static final int width = 640;
    public static final int height = 480;
    public static final int fps_cap = 60;

    public static void createDisplay(){

        ContextAttribs attribs = new ContextAttribs(3,2);

        attribs.withForwardCompatible(true);


        attribs.withProfileCore(true);

        try {
            Display.setDisplayMode(new DisplayMode(width, height));
            Display.create(new PixelFormat(), attribs);
            Display.setTitle("WEB3DPATH");
        } catch (LWJGLException e) {
            e.printStackTrace();
        }

        //Tells Open GL to use the whole display
        GL11.glViewport(0, 0, width, height);
    }

    public static void updateDisplay(){

        //Sync actually pipes the everything in the display to work
        //in a multi threaded fashion
        Display.sync(fps_cap);
        Display.update();

    }

    public static void closeDisplay(){}

}
