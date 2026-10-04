package kz.aitu.sdp.bridge;

    public class RasterRenderer implements Renderer {

        @Override
        public void renderCircle(double radius) {
            System.out.println(
                    "Drawing circle with raster renderer. Radius: " + radius
            );
        }

        @Override
        public void renderSquare(double side) {
            System.out.println(
                    "Drawing square with raster renderer. Side: " + side
            );
        }
    }

