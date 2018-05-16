package engine_tester;

import org.lwjgl.opengl.Display;
import render_engine.DisplayManager;

public class MainLoop {

    public static void main(String[] args){

        DisplayManager.createDisplay();

        while(!Display.isCloseRequested()){


            //App logic

            DisplayManager.updateDisplay();
        }
    }
}
