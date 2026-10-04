# SDP Assignment 3 - Bridge Pattern

## Overview

This project demonstrates the Bridge structural design pattern in Java 17.

The implementation separates two independently varying hierarchies:

- Shapes: `Circle`, `Square`
- Renderers: `VectorRenderer`, `RasterRenderer`

The two hierarchies are connected through composition.

## Pattern Structure

- `Shape` - Abstraction
- `Circle` - Refined Abstraction
- `Square` - Refined Abstraction
- `Renderer` - Implementor
- `VectorRenderer` - Concrete Implementor
- `RasterRenderer` - Concrete Implementor
- `BridgeDemo` - Client / demonstration

## How It Works

`Shape` stores a reference to a `Renderer`:

```java
protected Renderer renderer;

This reference forms the bridge between the abstraction hierarchy and the implementation hierarchy.
Example:
Shape circle = new Circle(10, new VectorRenderer());
circle.draw();

The renderer can also be changed at runtime:
circle.setRenderer(new RasterRenderer());
circle.draw();

This allows Shapes and Renderers to vary independently.
Output
Initial rendering:
Drawing circle with vector renderer. Radius: 10.0
Drawing square with raster renderer. Side: 5.0

Switching renderers at runtime:
Drawing circle with raster renderer. Radius: 10.0
Drawing square with vector renderer. Side: 5.0

How to Run
1. Open the project in IntelliJ IDEA.
2. Use JDK 17.
3. Run BridgeDemo.
Technologies
- Java 17
- IntelliJ IDEA
- Git
- GitHub
