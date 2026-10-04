## How It Works

`Shape` stores a reference to a `Renderer`:

```java
protected Renderer renderer;
```

This reference forms the bridge between the abstraction hierarchy and the implementation hierarchy.

Example:

```java
Shape circle = new Circle(10, new VectorRenderer());
circle.draw();
```

The renderer can also be changed at runtime:

```java
circle.setRenderer(new RasterRenderer());
circle.draw();
```

This allows Shapes and Renderers to vary independently.

## Output

```text
Initial rendering:
Drawing circle with vector renderer. Radius: 10.0
Drawing square with raster renderer. Side: 5.0

Switching renderers at runtime:
Drawing circle with raster renderer. Radius: 10.0
Drawing square with vector renderer. Side: 5.0
```

## How to Run

1. Open the project in IntelliJ IDEA.
2. Use JDK 17.
3. Run `BridgeDemo`.

## Technologies

- Java 17
- IntelliJ IDEA
- Git
- GitHub