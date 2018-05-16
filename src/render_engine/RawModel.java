package render_engine;

public class RawModel {

    private int vaoID;
    private int vertexCount;

    public RawModel(int vaoID, int vertexCount) {
        this.vaoID = vaoID;
        this.vertexCount = vertexCount;
    }

    /**
     * @return The ID of the VAO which contains the data about all the geometry
     *         of this model.
     */
    public int getVaoID() {
        return vaoID;
    }

    /**
     * @return The number of vertices in the model.
     */
    public int getVertexCount() {
        return vertexCount;
    }
}
