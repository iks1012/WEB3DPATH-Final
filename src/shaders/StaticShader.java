package shaders;

public class StaticShader extends ShaderProgram{
	
	private static final String VERTEX_FILE = "src/shaders/vertex_shader.txt";
	private static final String FRAGMENT_FILE = "src/shaders/fragment_shader.txt";

	public StaticShader() {
		super(VERTEX_FILE, FRAGMENT_FILE);
	}

	@Override
	protected void bindAttributes() {
		super.bindAttribute(0, "position");
	}
	
	

}
