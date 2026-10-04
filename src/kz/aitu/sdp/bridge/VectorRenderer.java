package kz.aitu.sdp.bridge;

    public class VectorRenderer implements Renderer {

        @Override
        public void renderCircle(double radius) {
            System.out.println(
                    "Drawing circle with vector renderer. Radius: " + radius
            );
        }

        @Override
        public void renderSquare(double side) {
            System.out.println(
                    "Drawing square with vector renderer. Side: " + side
            );
        }
    }

