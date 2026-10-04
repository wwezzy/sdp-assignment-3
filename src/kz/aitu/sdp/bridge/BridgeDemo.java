package kz.aitu.sdp.bridge;

public class BridgeDemo {

    public static void main(String[] args) {

        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(10, vectorRenderer);
        Shape square = new Square(5, rasterRenderer);

        System.out.println("Initial rendering:");
        circle.draw();
        square.draw();

        System.out.println("\nSwitching renderers at runtime:");

        circle.setRenderer(rasterRenderer);
        square.setRenderer(vectorRenderer);

        circle.draw();
        square.draw();
    }
}