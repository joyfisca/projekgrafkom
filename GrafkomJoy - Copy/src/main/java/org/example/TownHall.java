package org.example;

import Engine.Object;
import Engine.*;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL30.*;

public class TownHall {
    private Window window =
            new Window
                    (800, 800, "TOWN HALL");
    private ArrayList<Object> objects
            = new ArrayList<>();

    private ArrayList<Object> curveBezierJoy
            = new ArrayList<>();

    private ArrayList<Object> curveBezierJoy2
            = new ArrayList<>();

    private ArrayList<Object> curveBezierJoy3
            = new ArrayList<>();

    private ArrayList<Object> curveBezierJoy4
            = new ArrayList<>();

    private MouseInput mouseInput;
    int countDegree = 0;
    Projection projection = new Projection(window.getWidth(), window.getHeight());
    Camera camera = new Camera();

    boolean panggilPeluru = true;

    public void init() {
        window.init();
        GL.createCapabilities();
        mouseInput = window.getMouseInput();
        camera.setPosition(0f, 0f, 0.5f);
        camera.setRotation((float) Math.toRadians(0.0f), (float) Math.toRadians(0.0f));

        {
            //Parent
            objects.add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0f, 0f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0f,
                    0f,
                    0f,
                    36,
                    18
                    , 1));
            objects.get(0).scaleObject(1f, 1f, 1f);

            //      Rumput
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0f, 1f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    10f,
                    0.1f,
                    10f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(0).translateObject(0f, 0f, 0f);

            //      Fondasi TownHall
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(173 / 255f, 116 / 255f, 64 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    2.5f,
                    1f,
                    2.5f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(1).translateObject(0f, 0.55f, 0f);

            //      Lapisan bawah kanan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(176 / 255f, 167 / 255f, 163 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.06f,
                    0.20f,
                    2.6f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(2).translateObject(1.28f, 0.15f, 0f);

            //      Lapisan bawah kiri
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(176 / 255f, 167 / 255f, 163 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.06f,
                    0.20f,
                    2.6f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(3).translateObject(-1.28f, 0.15f, 0f);

//      Lapisan bawah belakang
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(176 / 255f, 167 / 255f, 163 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    2.6f,
                    0.20f,
                    0.06f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(4).translateObject(0f, 0.15f, -1.28f);

            //      Lapisan bawah depan kiri
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(176 / 255f, 167 / 255f, 163 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.98f,
                    0.20f,
                    0.10f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(5).translateObject(-0.82f, 0.15f, 1.28f);

//      Lapisan bawah depan kanan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(176 / 255f, 167 / 255f, 163 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.98f,
                    0.20f,
                    0.06f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(6).translateObject(0.82f, 0.15f, 1.28f);

//      Lapisan atas kiri
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(220 / 255f, 149 / 255f, 60 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.10f,
                    0.20f,
                    2.6f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(7).translateObject(-1.3f, 0.975f, 0f);

//      Lapisan atas kanan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(220 / 255f, 149 / 255f, 60 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.10f,
                    0.20f,
                    2.6f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(8).translateObject(1.3f, 0.975f, 0f);

            //      Atap 1
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(220 / 255f, 149 / 255f, 60 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    2.7f,
                    2.7f,
                    0.8f,
                    36,
                    18
                    , 19));

            objects.get(0).getChildObject().get(9).rotateObject(300f, 1f, 0f, 0f);
            objects.get(0).getChildObject().get(9).translateObject(-1.35f, 1.09f, 1.3f);

            //      Kayu kiri 2
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.10f,
                    0.82f,
                    0.3f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(10).translateObject(1.3f, 0.46f, 0f);

            //      Kayu kiri 1
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.10f,
                    0.82f,
                    0.3f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(11).translateObject(1.3f, 0.46f, 0.85f);

            //      Kayu kiri 3
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.10f,
                    0.82f,
                    0.3f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(12).translateObject(1.3f, 0.46f, -0.85f);

            //      Jendela kiri 1
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 90 / 255f, 37 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.05f,
                    0.3f,
                    0.3f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(13).translateObject(1.15f, 0.55f, 0.425f);

            //      Jendela kiri 2
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 90 / 255f, 37 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.05f,
                    0.3f,
                    0.3f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(14).translateObject(1.15f, 0.55f, -0.425f);

            //      Kayu kanan 2
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.10f,
                    0.82f,
                    0.3f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(15).translateObject(-1.3f, 0.46f, 0f);

            //      Kayu kanan 1
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.10f,
                    0.82f,
                    0.3f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(16).translateObject(-1.3f, 0.46f, 0.85f);

            //      Kayu kanan 3
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.10f,
                    0.82f,
                    0.3f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(17).translateObject(-1.3f, 0.46f, -0.85f);

            //      Jendela kanan 1
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 90 / 255f, 37 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.03f,
                    0.3f,
                    0.3f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(18).translateObject(-1.28f, 0.55f, 0.425f);

            //      Jendela kanan 2
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 90 / 255f, 37 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.03f,
                    0.3f,
                    0.3f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(19).translateObject(-1.28f, 0.55f, -0.425f);


            //      Kayu belakang 2
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.82f,
                    0.10f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(20).translateObject(0f, 0.46f, -1.3f);

            //      Kayu belakang 1
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.82f,
                    0.10f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(21).translateObject(0.85f, 0.46f, -1.3f);

            //      Kayu belakang 3
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.82f,
                    0.10f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(22).translateObject(-0.85f, 0.46f, -1.3f);

            //      Jendela belakang 1
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 90 / 255f, 37 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.3f,
                    0.05f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(23).translateObject(-0.425f, 0.55f, -1.25f);

            //      Jendela belakang 2
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 90 / 255f, 37 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.3f,
                    0.05f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(24).translateObject(0.425f, 0.55f, -1.25f);

            //      Lapisan atas belakang
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(220 / 255f, 149 / 255f, 60 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    2.68f,
                    0.20f,
                    0.10f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(25).translateObject(0f, 0.975f, -1.3f);

            //      Kayu depan 1
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.82f,
                    0.10f,
                    36,
                    18
                    , 1));

//        objects.get(0).getChildObject().get(26).translateObject(0.85f, 0.46f, -1.3f);
            objects.get(0).getChildObject().get(26).translateObject(0.85f, 0.46f, 1.3f);

            //      Kayu depan 2
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.82f,
                    0.10f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(27).translateObject(-0.85f, 0.46f, 1.3f);

            //      Kayu depan atas
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    2.5f,
                    0.2f,
                    0.10f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(28).translateObject(0f, 0.95f, 1.3f);

//      Pintu Kayu Kanan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.15f,
                    0.7f,
                    0.10f,
                    36,
                    18
                    , 1));

//        objects.get(0).getChildObject().get(26).translateObject(0.85f, 0.46f, -1.3f);
            objects.get(0).getChildObject().get(29).translateObject(0.35f, 0.4f, 1.325f);

//      Pintu Kayu Kiri
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.15f,
                    0.7f,
                    0.10f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(30).translateObject(-0.35f, 0.40f, 1.325f);

            //      Pintu Kayu Atas
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.8f,
                    0.15f,
                    0.10f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(31).translateObject(0f, 0.675f, 1.325f);

            //      Atap 2
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(223 / 255f, 216 / 255f, 211 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    1.8f,
                    0.7f,
                    2f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(32).translateObject(0f, 1.25f, 0f);

            //Balok abu abu tengah
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 123 / 255f, 124 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.2f,
                    0.15f,
                    1.6f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(33).translateObject(0f, 1.675f, 0f);

            //Balok abu abu kanan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 123 / 255f, 124 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.2f,
                    0.15f,
                    1.6f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(34).translateObject(0.37f, 1.675f, 0f);

            //Balok abu abu kiri
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 123 / 255f, 124 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.2f,
                    0.15f,
                    1.6f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(35).translateObject(-0.37f, 1.675f, 0f);

            //Balok abu abu horizontal 2
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 123 / 255f, 124 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    1.6f,
                    0.15f,
                    0.2f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(36).translateObject(0f, 1.675f, 0.15f);

            //Balok abu abu horizontal 3
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 123 / 255f, 124 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    1.6f,
                    0.15f,
                    0.2f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(37).translateObject(0f, 1.675f, -0.15f);

            //Balok abu abu horizontal 4
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 123 / 255f, 124 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    1.6f,
                    0.15f,
                    0.2f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(38).translateObject(0f, 1.675f, 0.45f);

            //Balok abu abu horizontal 1
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 123 / 255f, 124 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    1.6f,
                    0.15f,
                    0.2f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(39).translateObject(0f, 1.675f, -0.45f);

//Balok abu abu belakang kanan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 123 / 255f, 124 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.15f,
                    0.15f,
                    0.15f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(40).translateObject(0.725f, 1.675f, -0.725f);

//Balok abu abu depan kanan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 123 / 255f, 124 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.15f,
                    0.15f,
                    0.15f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(41).translateObject(0.725f, 1.675f, 0.725f);

//Balok abu abu belakang kiri
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 123 / 255f, 124 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.15f,
                    0.15f,
                    0.15f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(42).translateObject(-0.725f, 1.675f, -0.725f);

//Balok abu abu depan kiri
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 123 / 255f, 124 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.15f,
                    0.15f,
                    0.15f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(43).translateObject(-0.725f, 1.675f, 0.725f);


            //      Atap 3
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(220 / 255f, 149 / 255f, 60 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    1.6f,
                    0.05f,
                    1.6f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(44).translateObject(0f, 1.78f, 0f);

            //Balok coklat tengah
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.15f,
                    0.10f,
                    1.4f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(45).translateObject(0f, 1.865f, 0f);

            //Balok abu abu kanan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.15f,
                    0.10f,
                    1.4f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(46).translateObject(0.310f, 1.865f, 0f);

            //Balok abu abu kiri
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.15f,
                    0.10f,
                    1.4f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(47).translateObject(-0.310f, 1.865f, 0f);

            //Balok abu abu horizontal 2
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    1.4f,
                    0.10f,
                    0.15f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(48).translateObject(0f, 1.865f, 0.125f);

            //Balok abu abu horizontal 3
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    1.4f,
                    0.10f,
                    0.15f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(49).translateObject(0f, 1.865f, -0.125f);

            //Balok abu abu horizontal 4
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    1.4f,
                    0.10f,
                    0.15f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(50).translateObject(0f, 1.865f, 0.385f);

            //Balok abu abu horizontal 1
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    1.4f,
                    0.10f,
                    0.15f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(51).translateObject(0f, 1.865f, -0.385f);

//Balok abu abu belakang kanan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.165f,
                    0.10f,
                    0.125f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(52).translateObject(0.62f, 1.865f, -0.635f);

//Balok abu abu depan kanan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.165f,
                    0.10f,
                    0.125f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(53).translateObject(0.62f, 1.865f, 0.635f);

//Balok abu abu belakang kiri
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.165f,
                    0.10f,
                    0.125f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(54).translateObject(-0.62f, 1.865f, -0.635f);

//Balok abu abu depan kiri
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(78 / 255f, 63 / 255f, 48 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.165f,
                    0.10f,
                    0.125f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(55).translateObject(-0.62f, 1.865f, 0.635f);

            //      Atap 4
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(220 / 255f, 149 / 255f, 60 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    1.5f,
                    0.10f,
                    1.5f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(56).translateObject(0f, 1.97f, 0f);

            //      Cerobong asap
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0f, 0f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.4f,
                    0.001f,
                    0.4f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(57).translateObject(0.3f, 2.035f, 0.35f);


            //      Cerobong asap
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(173 / 255f, 148 / 255f, 136 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.4f,
                    0.3f,
                    0.1f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(58).translateObject(0.3f, 2.175f, 0.5f);

            //      Cerobong asap
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(173 / 255f, 148 / 255f, 136 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.4f,
                    0.3f,
                    0.1f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(59).translateObject(0.3f, 2.175f, 0.2f);

            //      Cerobong asap
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(173 / 255f, 148 / 255f, 136 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.1f,
                    0.3f,
                    0.4f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(60).translateObject(0.15f, 2.175f, 0.35f);

            //      Cerobong asap
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(173 / 255f, 148 / 255f, 136 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.1f,
                    0.3f,
                    0.4f,
                    36,
                    18
                    , 1));

            objects.get(0).getChildObject().get(61).translateObject(0.45f, 2.175f, 0.35f);


        }
    }
    public void input() {

        {
            //Tembak Cannon
//            if (window.isKeyPressed(GLFW_KEY_V)) {
//
//
//                if (panggilPeluru) {
//                    objects.get(0).getChildObject().get(51).translateObject(0f, 0f, -0.25f);
//
//                    objects.get(0).getChildObject().get(51).scaleObject(40f, 40f, 40f);
//                    panggilPeluru = false;
//                }
//            }


            if (window.isKeyPressed(GLFW_KEY_Q)) {
                for (Object i : objects) {
                    i.rotateObjectOnPoint(0.010f, 0f, 0f, 1f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
                }
            }

            if (window.isKeyPressed(GLFW_KEY_E)) {
                for (Object i : objects) {
                    i.rotateObjectOnPoint(-0.010f, 0f, 0f, 1f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
                }
            }

            if (window.isKeyPressed(GLFW_KEY_W)) {
                for (Object i : objects) {
                    i.rotateObjectOnPoint(0.010f, 1f, 0f, 0f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
                }
            }

            if (window.isKeyPressed(GLFW_KEY_S)) {
                for (Object i : objects) {
                    i.rotateObjectOnPoint(-0.010f, 1f, 0f, 0f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
                }
            }

            if (window.isKeyPressed(GLFW_KEY_A)) {
                for (Object i : objects) {
                    i.rotateObjectOnPoint(0.010f, 0f, 1f, 0f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
                }
            }

            if (window.isKeyPressed(GLFW_KEY_D)) {
                for (Object i : objects) {
                    i.rotateObjectOnPoint(-0.010f, 0f, 1f, 0f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
                }
            }

            if (window.isKeyPressed(GLFW_KEY_SPACE)) {
                objects.get(0).getChildObject().get(0).rotateObjectOnPoint(0.005f, 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(1).rotateObjectOnPoint(0.005f, 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(2).rotateObjectOnPoint(0.005f, 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(3).rotateObjectOnPoint(0.005f, 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(4).rotateObjectOnPoint(0.005f, 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(7).rotateObjectOnPoint(0.005f, 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(8).rotateObjectOnPoint(0.005f, 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(9).rotateObjectOnPoint(0.005f, 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(10).rotateObjectOnPoint(0.005f, 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(45).rotateObjectOnPoint(0.005f, 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(46).rotateObjectOnPoint(0.005f, 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(47).rotateObjectOnPoint(0.005f, 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(48).rotateObjectOnPoint(0.005f, 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(49).rotateObjectOnPoint(0.005f, 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));

            }

            if (window.isKeyPressed(GLFW_KEY_N)) {
                objects.get(0).getChildObject().get(0).rotateObjectOnPoint(0.005f, 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(1).rotateObjectOnPoint(0.005f, 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(2).rotateObjectOnPoint(0.005f, 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(3).rotateObjectOnPoint(0.005f, 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(4).rotateObjectOnPoint(0.005f, 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(7).rotateObjectOnPoint(0.005f, 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(8).rotateObjectOnPoint(0.005f, 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(9).rotateObjectOnPoint(0.005f, 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(10).rotateObjectOnPoint(0.005f, 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(45).rotateObjectOnPoint(0.005f, 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(46).rotateObjectOnPoint(0.005f, 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(47).rotateObjectOnPoint(0.005f, 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(48).rotateObjectOnPoint(0.005f, 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(49).rotateObjectOnPoint(0.005f, 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));

            }
        }

        //================================================================================

        {
            if (window.isKeyPressed(GLFW_KEY_U)) {
                for (Object i : objects) {
                    i.translateObject(0f, 0f, 0.001f);
                }
            }

            if (window.isKeyPressed(GLFW_KEY_O)) {
                for (Object i : objects) {
                    i.translateObject(0f, 0f, -0.001f);
                }
            }

            if (window.isKeyPressed(GLFW_KEY_I)) {
                for (Object i : objects) {
                    i.translateObject(0f, 0.01f, 0f);
                }
            }

            if (window.isKeyPressed(GLFW_KEY_K)) {
                for (Object i : objects) {
                    i.translateObject(0f, -0.01f, 0f);
                }
            }

            if (window.isKeyPressed(GLFW_KEY_J)) {
                for (Object i : objects) {
                    i.translateObject(-0.01f, 0f, 0f);
                }
            }

            if (window.isKeyPressed(GLFW_KEY_L)) {
                for (Object i : objects) {
                    i.translateObject(0.01f, 0f, 0f);
                }
            }
        }

        if (window.isKeyPressed(GLFW_KEY_LEFT_SHIFT)) {
            camera.moveForward(0.010f);
        }

        if (window.isKeyPressed(GLFW_KEY_LEFT_CONTROL)) {
            camera.moveBackwards(0.010f);
        }
    }

    public void loop() {
        while (window.isOpen()) {
            window.update();
            glClearColor(11 / 255f, 174 / 255f, 246 / 255f, 0.0f);
            GL.createCapabilities();
            input();

            //code
            for (Object object : objects) {
                object.draw(camera, projection);
            }

            for (Object objectCurve : curveBezierJoy) {
                objectCurve.drawCurve(camera, projection);
            }

            for (Object objectCurve : curveBezierJoy2) {
                objectCurve.drawCurve(camera, projection);
            }

            for (Object objectCurve : curveBezierJoy3) {
                objectCurve.drawCurve(camera, projection);
            }

            for (Object objectCurve : curveBezierJoy4) {
                objectCurve.drawCurve(camera, projection);
            }

            // Restore state
            glDisableVertexAttribArray(0);

            // Poll for window events.
            // The key callback above will only be
            // invoked during this call.
            glfwPollEvents();
        }
    }

    public void run() {

        init();
        loop();

        // Terminate GLFW and
        // free the error callback
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }

    public static void main(String[] args) {
        new TownHall().run();
    }
}