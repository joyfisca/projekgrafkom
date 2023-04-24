package org.example;

import Engine.Object;
import Engine.*;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL30.*;

public class MainJoy {
    private Window window =
            new Window
                    (800, 800, "Cannon COC");
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
    boolean tembakPeluru = false;
    Matrix4f recallPeluru = new Matrix4f();


    public void init() {
        window.init();
        GL.createCapabilities();
        mouseInput = window.getMouseInput();
        camera.setPosition(0f, 0f, 0.5f);
        camera.setRotation((float) Math.toRadians(0.0f), (float) Math.toRadians(0.0f));

        {
            //Fondasi Cannon 0
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

            //      Moncong Tabung Cannon Besar
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(36 / 255f, 28 / 255f, 25 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.10f,
                    0.10f,
                    0.10f,
                    36,
                    18
                    , 9));
            objects.get(0).getChildObject().get(0).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(0).translateObject(0f, 0.18f, 0f);

            //      Pantat Tabung Cannon
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(36 / 255f, 28 / 255f, 25 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.10f,
                    0.10f,
                    -0.20f,
                    36,
                    18
                    , 9));
            objects.get(0).getChildObject().get(1).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(1).translateObject(0f, 0.18f, 0f);

            //      Cincin Tabung Cannon Tengah
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 124 / 255f, 122 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.115f,
                    0.115f,
                    -0.05f,
                    36,
                    18
                    , 9));
            objects.get(0).getChildObject().get(2).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(2).translateObject(0f, 0.18f, 0f);

            //      Pantat Tabung Cannon 4 (Sphere)
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(36 / 255f, 28 / 255f, 25 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.06f,
                    0.06f,
                    0.06f,
                    36,
                    18
                    , 2));
            objects.get(0).getChildObject().get(3).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(3).translateObject(0f, 0.18f, 0.27f);

            //      Cincin Tabung Cannon Belakang
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 124 / 255f, 122 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.13f,
                    0.13f,
                    -0.05f,
                    36,
                    18
                    , 9));
            objects.get(0).getChildObject().get(4).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(4).translateObject(0f, 0.18f, 0.20f);

            //      Fondasi Cannon 2
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(29 / 255f, 27 / 255f, 23 / 255f, 1.0f),

                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.45f,
                    -0.012f,
                    -0.45f,
                    36,
                    18
                    , 17));
            objects.get(0).getChildObject().get(5).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(5).translateObject(0.0f, 0.05f, 0f);

            //      Fondasi Cannon 3
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(39 / 255f, 37 / 255f, 33 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.35f,
                    -0.012f,
                    -0.35f,
                    36,
                    18
                    , 17));
            objects.get(0).getChildObject().get(6).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(6).translateObject(0.0f, 0.075f, 0f);

            //      Cincin Tabung Cannon Depan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 124 / 255f, 122 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.09f,
                    0.09f,
                    0.03f,
                    36,
                    18
                    , 9));
            objects.get(0).getChildObject().get(7).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(7).translateObject(0.0f, 0.18f, -0.27f);

            //      Moncong Tabung Cannon tipis
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(56 / 255f, 48 / 255f, 45 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.075f,
                    0.075f,
                    0.26f,
                    36,
                    18
                    , 9));
            objects.get(0).getChildObject().get(8).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(8).translateObject(0f, 0.18f, 0f);

            //      Moncong Tabung Cannon sedang
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(46 / 255f, 38 / 255f, 35 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.085f,
                    0.085f,
                    0.20f,
                    36,
                    18
                    , 9));
            objects.get(0).getChildObject().get(9).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(9).translateObject(0f, 0.18f, 0f);

            //      Lubang Meriam
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(56 / 255f, 48 / 255f, 45 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.065f,
                    0.065f,
                    0.04f,
                    500,
                    500
                    , 9));
            objects.get(0).getChildObject().get(10).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(10).translateObject(0f, 0.18f, -0.26f);

            //      Lubang Meriam Kecil
//        objects.get(0).getChildObject().add(new Sphere(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(228 / 255f, 160 / 255f, 57 / 255f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.055f,
//                0.055f,
//                0.04f,
//                500,
//                500
//                , 9));
//        objects.get(0).getChildObject().get(11).scaleObject(1f, 1f, 1f);
//        objects.get(0).getChildObject().get(11).translateObject(0.5f, 0.18f, -0.26f);

            //      Kaki Trapesium 1
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(64 / 255f, 54 / 255f, 52 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.050f,
                    0.055f,
                    0.095f,
                    36,
                    18
                    , 20));

            objects.get(0).getChildObject().get(11).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(11).rotateObject(450f, 0f, 1f, 0f);
            objects.get(0).getChildObject().get(11).translateObject(0.165f, -0.053f, 0.165f);

            //      Kaki Trapesium 2
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(64 / 255f, 54 / 255f, 52 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.050f,
                    0.055f,
                    0.095f,
                    36,
                    18
                    , 20));

            objects.get(0).getChildObject().get(12).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(12).rotateObject(-150f, 0f, 1f, 0f);
            objects.get(0).getChildObject().get(12).translateObject(-0.165f, -0.053f, -0.165f);

            //      Kaki Trapesium 3
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(64 / 255f, 54 / 255f, 52 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.050f,
                    0.055f,
                    0.095f,
                    36,
                    18
                    , 20));
            objects.get(0).getChildObject().get(13).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(13).rotateObject(-450f, 0f, 1f, 0f);
            objects.get(0).getChildObject().get(13).translateObject(-0.165f, -0.053f, 0.165f);

//      Kaki Trapesium 4
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(64 / 255f, 54 / 255f, 52 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.050f,
                    0.055f,
                    0.095f,
                    36,
                    18
                    , 20));
            objects.get(0).getChildObject().get(14).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(14).rotateObject(150f, 0f, 1f, 0f);
            objects.get(0).getChildObject().get(14).translateObject(0.165f, -0.053f, -0.165f);

            //      Kaki Fondasi  4
//        objects.get(0).getChildObject().add(new Sphere(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.5f, 0.3f, 0f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.075f,
//                0.020f,
//                0.075f,
//                36,
//                18
//                , 13));
//        objects.get(0).getChildObject().get(17).scaleObject(3f, 3f, 3f);
//        objects.get(0).getChildObject().get(17).rotateObject(-300f,0f,0f,1f);
//        objects.get(0).getChildObject().get(17).rotateObject(-45f,0f,1f,0f);
//        objects.get(0).getChildObject().get(17).translateObject(0.25f, -0.200f, -0.25f);

//        Rotate untuk bkin prisma segitiga nya tidur
//        objects.get(0).getChildObject().get(17).rotateObject(300f,1f,0f,0f);
//        objects.get(0).getChildObject().get(17).rotateObject(45f,0f,1f,0f);

            //      Fondasi Cannon
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(174 / 255f, 172 / 255f, 175 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.4f,
                    0.05f,
                    0.4f,
                    36,
                    18
                    , 1));
            objects.get(0).getChildObject().get(15).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(15).translateObject(0f, 0f, 0f);

            //      Fondasi Tuas
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.7f, 0.7f, 0.7f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.10f,
                    0.02f,
                    0.15f,
                    36,
                    18
                    , 1));
            objects.get(0).getChildObject().get(16).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(16).translateObject(0.30f, -0.070f, 0f);

            //      Fondasi Tuas 2
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.7f, 0.4f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.050f,
                    0.050f,
                    0.025f,
                    36,
                    18
                    , 15));
            objects.get(0).getChildObject().get(17).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(17).rotateObject(300f, 0.0f, 1.0f, 0f);
            objects.get(0).getChildObject().get(17).translateObject(0.29f, -0.060f, 0f);


            //      Fondasi Tuas 3
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.7f, 0.4f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.050f,
                    0.050f,
                    0.025f,
                    36,
                    18
                    , 15));
            objects.get(0).getChildObject().get(18).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(18).rotateObject(300f, 0.0f, 1.0f, 0f);
            objects.get(0).getChildObject().get(18).rotateObject(300f, 0.0f, 1.0f, 0f);
            objects.get(0).getChildObject().get(18).rotateObject(300f, 0.0f, 1.0f, 0f);
            objects.get(0).getChildObject().get(18).translateObject(0.31f, -0.060f, 0f);

            //      Tuas Biru 1
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0f, 156 / 255f, 239 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.0075f,
                    0.08f,
                    0.0075f,
                    36,
                    18
                    , 10));
            objects.get(0).getChildObject().get(19).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(19).rotateObject(180f, 1f, 0f, 0f);
            objects.get(0).getChildObject().get(19).translateObject(0.30f, -0.020f, 0f);

            //      Tuas Biru 2
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0f, 156 / 255f, 239 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.012f,
                    0.025f,
                    0.012f,
                    36,
                    18
                    , 10));
            objects.get(0).getChildObject().get(20).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(20).rotateObject(180f, 1f, 0f, 0f);
            objects.get(0).getChildObject().get(20).translateObject(0.30f, 0.020f, 0.053f);

            //      Lapis emas samping kanan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(207 / 255f, 137 / 255f, 58 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.01f,
                    0.05f,
                    0.15f,
                    36,
                    18
                    , 1));
            objects.get(0).getChildObject().get(21).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(21).translateObject(0.205f, 0.00f, 0.0f);

            //      Lapis emas samping kiri
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(207 / 255f, 137 / 255f, 58 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.01f,
                    0.05f,
                    0.15f,
                    36,
                    18
                    , 1));
            objects.get(0).getChildObject().get(22).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(22).translateObject(-0.205f, 0.00f, 0.0f);

            //      Lapis emas samping belakang
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(207 / 255f, 137 / 255f, 58 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.15f,
                    0.05f,
                    0.01f,
                    36,
                    18
                    , 1));
            objects.get(0).getChildObject().get(23).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(23).translateObject(0f, 0.00f, 0.205f);

            //      Lapis emas samping depan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(207 / 255f, 137 / 255f, 58 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.15f,
                    0.05f,
                    0.01f,
                    36,
                    18
                    , 1));
            objects.get(0).getChildObject().get(24).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(24).translateObject(0f, 0.00f, -0.205f);

            //      Lapis emas atas kanan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(207 / 255f, 137 / 255f, 58 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.10f,
                    0.01f,
                    0.15f,
                    36,
                    18
                    , 1));
            objects.get(0).getChildObject().get(25).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(25).translateObject(0.16f, 0.030f, 0.0f);

            //      Lapis emas atas kiri
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(207 / 255f, 137 / 255f, 58 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.10f,
                    0.01f,
                    0.15f,
                    36,
                    18
                    , 1));
            objects.get(0).getChildObject().get(26).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(26).translateObject(-0.16f, 0.030f, 0.0f);

            //      Lapis emas atas belakang
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(207 / 255f, 137 / 255f, 58 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.15f,
                    0.01f,
                    0.10f,
                    36,
                    18
                    , 1));
            objects.get(0).getChildObject().get(27).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(27).translateObject(0.f, 0.030f, 0.16f);

            //      Lapis emas atas depan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(207 / 255f, 137 / 255f, 58 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.15f,
                    0.01f,
                    0.10f,
                    36,
                    18
                    , 1));
            objects.get(0).getChildObject().get(28).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(28).translateObject(0.f, 0.030f, -0.16f);

//      Tabung kecil samping kanan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(254 / 255f, 184 / 255f, 72 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.03f,
                    0.03f,
                    0.01f,
                    36,
                    18
                    , 9));
            objects.get(0).getChildObject().get(29).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(29).rotateObject(300f, 0f, 1f, 0f);
            objects.get(0).getChildObject().get(29).translateObject(0.210f, 0.0050f, 0.0f);

//      Tabung kecil samping kiri
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(254 / 255f, 184 / 255f, 72 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.03f,
                    0.03f,
                    0.01f,
                    36,
                    18
                    , 9));
            objects.get(0).getChildObject().get(30).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(30).rotateObject(300f, 0f, 1f, 0f);
            objects.get(0).getChildObject().get(30).translateObject(-0.220f, 0.0050f, 0.0f);

            //      Tabung kecil samping belakang
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(254 / 255f, 184 / 255f, 72 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.03f,
                    0.03f,
                    0.01f,
                    36,
                    18
                    , 9));
            objects.get(0).getChildObject().get(31).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(31).translateObject(0.0f, 0.0050f, 0.220f);

//      Tabung kecil samping depan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(254 / 255f, 184 / 255f, 72 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.03f,
                    0.03f,
                    0.01f,
                    36,
                    18
                    , 9));
            objects.get(0).getChildObject().get(32).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(32).translateObject(0.0f, 0.0050f, -0.210f);

            //      Elips kecil samping kanan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(219 / 255f, 133 / 255f, 26 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.02f,
                    0.015f,
                    0.02f,
                    36,
                    18
                    , 3));
            objects.get(0).getChildObject().get(33).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(33).rotateObject(300f, 0f, 1f, 0f);
            objects.get(0).getChildObject().get(33).translateObject(0.220f, 0.0050f, 0.0f);

            //      Elips kecil samping kiri
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(219 / 255f, 133 / 255f, 26 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.02f,
                    0.015f,
                    0.02f,
                    36,
                    18
                    , 3));
            objects.get(0).getChildObject().get(34).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(34).rotateObject(300f, 0f, 1f, 0f);
            objects.get(0).getChildObject().get(34).translateObject(-0.220f, 0.0050f, 0.0f);

            //      Elips kecil samping belakang
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(219 / 255f, 133 / 255f, 26 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.02f,
                    0.015f,
                    0.02f,
                    36,
                    18
                    , 3));
            objects.get(0).getChildObject().get(35).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(35).translateObject(0.0f, 0.0050f, 0.220f);

            //      Elips kecil samping depan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(219 / 255f, 133 / 255f, 26 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.02f,
                    0.015f,
                    0.02f,
                    36,
                    18
                    , 3));
            objects.get(0).getChildObject().get(36).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(36).translateObject(0.0f, 0.0050f, -0.220f);

            //      Limas segi4 kanan belakang
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(77 / 255f, 86 / 255f, 97 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.06f,
                    0.030f,
                    0.06f,
                    36,
                    18
                    , 12));
            objects.get(0).getChildObject().get(37).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(37).translateObject(0.14f, 0.026f, 0.14f);

            //      Limas segi4 kiri belakang
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(77 / 255f, 86 / 255f, 97 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.06f,
                    0.030f,
                    0.06f,
                    36,
                    18
                    , 12));
            objects.get(0).getChildObject().get(38).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(38).translateObject(-0.14f, 0.026f, 0.14f);

            //      Limas segi4 kiri depan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(77 / 255f, 86 / 255f, 97 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.06f,
                    0.030f,
                    0.06f,
                    36,
                    18
                    , 12));
            objects.get(0).getChildObject().get(39).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(39).translateObject(-0.14f, 0.026f, -0.14f);

            //      Limas segi4 kanan depan
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(77 / 255f, 86 / 255f, 97 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.06f,
                    0.030f,
                    0.06f,
                    36,
                    18
                    , 12));
            objects.get(0).getChildObject().get(40).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(40).translateObject(0.14f, 0.026f, -0.14f);

            //      Duri Kaki 1
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(254 / 255f, 184 / 255f, 72 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.0025f,
                    0.0025f,
                    0.005f,
                    36,
                    18
                    , 21));

            objects.get(0).getChildObject().get(41).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(41).rotateObject(450f, 0f, 1f, 0f);
            objects.get(0).getChildObject().get(41).translateObject(0.23f, -0.053f, 0.23f);

            //      Duri Kaki 2
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(254 / 255f, 184 / 255f, 72 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.0025f,
                    0.0025f,
                    0.005f,
                    36,
                    18
                    , 21));

            objects.get(0).getChildObject().get(42).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(42).rotateObject(-450f, 0f, 1f, 0f);
            objects.get(0).getChildObject().get(42).translateObject(-0.23f, -0.053f, 0.23f);

            //      Duri Kaki 3
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(254 / 255f, 184 / 255f, 72 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.0025f,
                    0.0025f,
                    0.005f,
                    36,
                    18
                    , 21));

            objects.get(0).getChildObject().get(43).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(43).rotateObject(150f, 0f, 1f, 0f);
            objects.get(0).getChildObject().get(43).translateObject(0.23f, -0.053f, -0.23f);

            //      Duri Kaki 4
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(254 / 255f, 184 / 255f, 72 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.0025f,
                    0.0025f,
                    0.005f,
                    36,
                    18
                    , 21));

            objects.get(0).getChildObject().get(44).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(44).rotateObject(-150f, 0f, 1f, 0f);
            objects.get(0).getChildObject().get(44).translateObject(-0.23f, -0.053f, -0.23f);

            //Bezier 1 (Lempengan atas kanan)
            curveBezierJoy.add(new Object(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(), new Vector4f(135 / 255f, 124 / 255f, 122 / 255f, 1.0f)
            ));

            List<Vector3f> curPoints = curveBezierJoy.get(0).getVertices();
            curveBezierJoy.get(0).addVertices(new Vector3f(0.04f, 0.30f, 0.20f));
            curveBezierJoy.get(0).addVertices(new Vector3f(0.07f, 0.27f, 0.10f));
            curveBezierJoy.get(0).addVertices(new Vector3f(0.10f, 0.25f, 0.20f));

            curveBezierJoy.get(0).updateCurve(new ArrayList<>(curPoints));

            objects.get(0).getChildObject().add(curveBezierJoy.get(0));

            //Bezier 2 (Lempengan atas kiri)
            curveBezierJoy2.add(new Object(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(), new Vector4f(135 / 255f, 124 / 255f, 122 / 255f, 1.0f)
            ));
            List<Vector3f> curPoints2 = curveBezierJoy2.get(0).getVertices();
            curveBezierJoy2.get(0).addVertices(new Vector3f(-0.04f, 0.30f, 0.20f));
            curveBezierJoy2.get(0).addVertices(new Vector3f(-0.07f, 0.27f, 0.10f));
            curveBezierJoy2.get(0).addVertices(new Vector3f(-0.10f, 0.25f, 0.20f));

            curveBezierJoy2.get(0).updateCurve(new ArrayList<>(curPoints2));

            objects.get(0).getChildObject().add(curveBezierJoy2.get(0));

            //Bezier 3 (Lempengan bawah kiri)
            curveBezierJoy3.add(new Object(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(), new Vector4f(135 / 255f, 124 / 255f, 122 / 255f, 1.0f)
            ));
            List<Vector3f> curPoints3 = curveBezierJoy3.get(0).getVertices();
            curveBezierJoy3.get(0).addVertices(new Vector3f(-0.12f, 0.15f, 0.20f));
            curveBezierJoy3.get(0).addVertices(new Vector3f(-0.08f, 0.12f, 0.10f));
            curveBezierJoy3.get(0).addVertices(new Vector3f(-0.07f, 0.10f, 0.20f));

            curveBezierJoy3.get(0).updateCurve(new ArrayList<>(curPoints3));

            objects.get(0).getChildObject().add(curveBezierJoy3.get(0));

            //Bezier 4 (Lempengan bawah kanan)
            curveBezierJoy4.add(new Object(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(), new Vector4f(135 / 255f, 124 / 255f, 122 / 255f, 1.0f)
            ));
            List<Vector3f> curPoints4 = curveBezierJoy4.get(0).getVertices();
            curveBezierJoy4.get(0).addVertices(new Vector3f(0.12f, 0.15f, 0.20f));
            curveBezierJoy4.get(0).addVertices(new Vector3f(0.08f, 0.12f, 0.10f));
            curveBezierJoy4.get(0).addVertices(new Vector3f(0.07f, 0.10f, 0.20f));

            curveBezierJoy4.get(0).updateCurve(new ArrayList<>(curPoints4));

            objects.get(0).getChildObject().add(curveBezierJoy4.get(0));

            //      Cincin Tabung Cannon 3
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(135 / 255f, 124 / 255f, 122 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.10f,
                    0.10f,
                    0.03f,
                    36,
                    18
                    , 9));
            objects.get(0).getChildObject().get(49).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(49).translateObject(0.0f, 0.18f, -0.10f);

            //      Rumput
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0f, 1f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    1f,
                    0.1f,
                    1f,
                    36,
                    18
                    , 1));
            objects.get(0).getChildObject().get(50).scaleObject(1f, 1f, 1f);
            objects.get(0).getChildObject().get(50).translateObject(0f, -0.13f, 0f);

            //      Peluru Cannon
            objects.get(0).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(254 / 255f, 184 / 255f, 72 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.5f,
                    0.5f,
                    36,
                    18
                    , 2));
            objects.get(0).getChildObject().get(51).scaleObject(0.1f, 0.1f, 0.1f);
            objects.get(0).getChildObject().get(51).translateObject(0.0f, 0.18f, 0.0f);
            recallPeluru = objects.get(0).getChildObject().get(51).getModel();

        }
    }

    float rotateX = 0.0f;
    float rotateZ = -0.05f;
    int loopNoHold = 0;
    int countRotate = 0;

    public void input() {
        {
            //Tembak Cannon
            if ((window.isKeyPressed(GLFW_KEY_V)) && !tembakPeluru) {
                tembakPeluru = true;
            }

            if (tembakPeluru) {
                objects.get(0).getChildObject().get(51).translateObject(rotateX, 0f, rotateZ);
            }

            //Recall Peluru
            if ((window.isKeyPressed(GLFW_KEY_C))) {
                objects.get(0).getChildObject().get(51).getModel().set(recallPeluru);
                tembakPeluru = false;
            }

            if (window.isKeyPressed(GLFW_KEY_Q)) {
//                for (Object i : objects) {
//                    i.rotateObjectOnPoint(0.010f, 0f, 0f, 1f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
//                }
            }

            if (window.isKeyPressed(GLFW_KEY_E)) {
//                for (Object i : objects) {
//                    i.rotateObjectOnPoint(-0.010f, 0f, 0f, 1f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
//                }
            }

            if (window.isKeyPressed(GLFW_KEY_W)) {
                camera.addRotation((float) Math.toRadians(0.1), (float) Math.toRadians(0));
//                for (Object i : objects) {
//                    i.rotateObjectOnPoint(0.010f, 1f, 0f, 0f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
//                }
            }

            if (window.isKeyPressed(GLFW_KEY_S)) {
                camera.addRotation((float) Math.toRadians(-0.1), (float) Math.toRadians(0));
//                for (Object i : objects) {
//                    i.rotateObjectOnPoint(-0.010f, 1f, 0f, 0f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
//                }
            }

            if (window.isKeyPressed(GLFW_KEY_A)) {
                camera.addRotation((float) Math.toRadians(0), (float) Math.toRadians(0.1));
//                for (Object i : objects) {
//                    i.rotateObjectOnPoint(0.010f, 0f, 1f, 0f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
//                }
            }

            if (window.isKeyPressed(GLFW_KEY_D)) {
                camera.addRotation((float) Math.toRadians(0), (float) Math.toRadians(-0.1));
//                for (Object i : objects) {
//                    i.rotateObjectOnPoint(-0.010f, 0f, 1f, 0f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
//                }
            }

            if (loopNoHold > 0) {
                loopNoHold -= 1;
            }

            if (window.isKeyPressed(GLFW_KEY_SPACE) && loopNoHold == 0) {
                Vector3f tes = objects.get(0).getChildObject().get(7).getModel().transformPosition(new Vector3f(0f, 0f, 0f));
                objects.get(0).getChildObject().get(0).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(1).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(2).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(3).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(4).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(7).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(8).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(9).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(10).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(45).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(46).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(47).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(48).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(49).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(51).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                if (countRotate == 3) {
                    countRotate = 0;
                } else {
                    countRotate += 1;
                }
                if (countRotate == 1) {
                    rotateZ = 0;
                    rotateX = -0.05f;
                } else if (countRotate == 2) {
                    rotateX = 0;
                    rotateZ = 0.05f;
                } else if (countRotate == 3) {
                    rotateZ = 0;
                    rotateX = 0.05f;
                } else if (countRotate == 0) {
                    rotateX = 0;
                    rotateZ = -0.05f;
                }
                loopNoHold = 100;
                if (panggilPeluru) {
                    objects.get(0).getChildObject().get(51).translateObject(0f, 0f, 0.01f);
                    panggilPeluru = false;
                }
            }


            if (window.isKeyPressed(GLFW_KEY_N) && loopNoHold == 0) {
                objects.get(0).getChildObject().get(0).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(1).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(2).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(3).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(4).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(7).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(8).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(9).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(10).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(45).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(46).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(47).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(48).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(49).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(0).getChildObject().get(1).getCenterPoint().get(0), objects.get(0).getChildObject().get(1).getCenterPoint().get(1), objects.get(0).getChildObject().get(1).getCenterPoint().get(2));

                if (countRotate == 0) {
                    countRotate = 3;
                } else {
                    countRotate -= 1;
                }
                if (countRotate == 1) {
                    rotateZ = 0;
                    rotateX = -0.05f;
                } else if (countRotate == 2) {
                    rotateX = 0;
                    rotateZ = 0.05f;
                } else if (countRotate == 3) {
                    rotateZ = 0;
                    rotateX = 0.05f;
                } else if (countRotate == 0) {
                    rotateX = 0;
                    rotateZ = -0.05f;
                }
                loopNoHold = 100;
                if (panggilPeluru) {
                    objects.get(0).getChildObject().get(51).translateObject(0f, 0f, 0.01f);
                    panggilPeluru = false;
                }
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
                camera.moveUp(0.01f);
            }

            if (window.isKeyPressed(GLFW_KEY_K)) {
                camera.moveDown(0.01f);
            }

            if (window.isKeyPressed(GLFW_KEY_J)) {
                camera.moveLeft(0.01f);
            }

            if (window.isKeyPressed(GLFW_KEY_L)) {
                camera.moveRight(0.01f);
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
        new MainJoy().run();
    }
}