package engine_tester;

import org.lwjgl.opengl.Display;

import render_engine.DisplayManager;
import render_engine.Loader;
import render_engine.RawModel;
import render_engine.Renderer;

/**
 * This class contains the main method and is used to test the engine.
 *
 * @author Karl
 *
 */
public class MainLoop {


    /**
     * Loads up the position data for two triangles (which together make a quad)
     * into a VAO. This VAO is then rendered to the screen every frame.
     *
     * @param args
     */
    public static void main(String[] args) {

        DisplayManager.createDisplay();
        Loader loader = new Loader();
        Renderer renderer = new Renderer();

        float[] vertices = {
                // Left bottom triangle
                -0.5f, 0.5f, 0f,
                -0.5f, -0.5f, 0f,
                0.5f, -0.5f, 0f,
                // Right top triangle
                0.5f, -0.5f, 0f,
                0.5f, 0.5f, 0f,
                -0.5f, 0.5f, 0f
        };

        RawModel model = loader.loadToVAO(vertices);

        while (!Display.isCloseRequested()) {
            // game logic
            renderer.prepare();
            renderer.render(model);
            DisplayManager.updateDisplay();
        }

        loader.cleanUp();
        DisplayManager.closeDisplay();
    }

}