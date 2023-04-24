package org.example;

import Engine.Object;
import Engine.*;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL30.*;

public class Main {
    private Window window =
            new Window
                    (800, 800, "COC");
    private ArrayList<Object> objects
            = new ArrayList<>();

    //JOY
    private ArrayList<Object> curveBezierJoy
            = new ArrayList<>();
    private ArrayList<Object> curveBezierJoy2
            = new ArrayList<>();
    private ArrayList<Object> curveBezierJoy3
            = new ArrayList<>();
    private ArrayList<Object> curveBezierJoy4
            = new ArrayList<>();
    private ArrayList<Object> curveBezierJoy5
            = new ArrayList<>();
    private ArrayList<Object> curveBezierJoy6
            = new ArrayList<>();
    private ArrayList<Object> curveBezierJoy7
            = new ArrayList<>();
    private ArrayList<Object> curveBezierJoy8
            = new ArrayList<>();
    private ArrayList<Object> curveBezierJoy9
            = new ArrayList<>();
    private ArrayList<Object> curveBezierJoy10
            = new ArrayList<>();
    private ArrayList<Object> curveBezierJoy11
            = new ArrayList<>();
    private ArrayList<Object> curveBezierJoy12
            = new ArrayList<>();
    private ArrayList<Object> curveBezierJoy13
            = new ArrayList<>();
    private ArrayList<Object> curveBezierJoy14
            = new ArrayList<>();
    private ArrayList<Object> curveBezierJoy15
            = new ArrayList<>();
    private ArrayList<Object> curveBezierJoy16
            = new ArrayList<>();


    //CHRISTO
    private ArrayList<Object> curveBezier
            = new ArrayList<>();
    private ArrayList<Object> curveBezier2
            = new ArrayList<>();


    //MARTIN
    private ArrayList<Object> objectsBerzier
            = new ArrayList<>();
    private ArrayList<Object> objectsBerzier2
            = new ArrayList<>();
    private ArrayList<Object> objectsBerzier3
            = new ArrayList<>();
    private ArrayList<Object> objectsBerzier4
            = new ArrayList<>();


    private MouseInput mouseInput;
    int countDegree = 0;
    Projection projection = new Projection(window.getWidth(), window.getHeight());
    Camera camera = new Camera();


    boolean panggilPeluru = true;
    boolean tembakPeluru = false;
    Matrix4f recallPeluru = new Matrix4f();

    boolean panggilPeluru2 = true;
    boolean tembakPeluru2 = false;
    Matrix4f recallPeluru2 = new Matrix4f();

    float rotateX = 0.0f;
    float rotateZ = -0.05f;
    int loopNoHold = 0;
    int countRotate = 0;

    float rotateX2 = 0.0f;
    float rotateZ2 = -0.05f;
    int loopNoHold2 = 0;
    int countRotate2 = 0;

    public void init() {
        window.init();
        GL.createCapabilities();
        mouseInput = window.getMouseInput();
        camera.setPosition(0f, 2.5f, 8.5f);
        camera.setRotation((float) Math.toRadians(0.0f), (float) Math.toRadians(0.0f));

        //CANNON COC KIRI
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

            List<Vector3f> curPointsJoy1 = curveBezierJoy.get(0).getVertices();
            curveBezierJoy.get(0).addVertices(new Vector3f(0.04f, 0.30f, 0.20f));
            curveBezierJoy.get(0).addVertices(new Vector3f(0.07f, 0.27f, 0.10f));
            curveBezierJoy.get(0).addVertices(new Vector3f(0.10f, 0.25f, 0.20f));

            curveBezierJoy.get(0).updateCurve(new ArrayList<>(curPointsJoy1));

            objects.get(0).getChildObject().add(curveBezierJoy.get(0));

            //Bezier 2 (Lempengan atas kiri)
            curveBezierJoy2.add(new Object(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(), new Vector4f(135 / 255f, 124 / 255f, 122 / 255f, 1.0f)
            ));
            List<Vector3f> curPointsJoy2 = curveBezierJoy2.get(0).getVertices();
            curveBezierJoy2.get(0).addVertices(new Vector3f(-0.04f, 0.30f, 0.20f));
            curveBezierJoy2.get(0).addVertices(new Vector3f(-0.07f, 0.27f, 0.10f));
            curveBezierJoy2.get(0).addVertices(new Vector3f(-0.10f, 0.25f, 0.20f));

            curveBezierJoy2.get(0).updateCurve(new ArrayList<>(curPointsJoy2));

            objects.get(0).getChildObject().add(curveBezierJoy2.get(0));

            //Bezier 3 (Lempengan bawah kiri)
            curveBezierJoy3.add(new Object(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(), new Vector4f(135 / 255f, 124 / 255f, 122 / 255f, 1.0f)
            ));
            List<Vector3f> curPointsJoy3 = curveBezierJoy3.get(0).getVertices();
            curveBezierJoy3.get(0).addVertices(new Vector3f(-0.12f, 0.15f, 0.20f));
            curveBezierJoy3.get(0).addVertices(new Vector3f(-0.08f, 0.12f, 0.10f));
            curveBezierJoy3.get(0).addVertices(new Vector3f(-0.07f, 0.10f, 0.20f));

            curveBezierJoy3.get(0).updateCurve(new ArrayList<>(curPointsJoy3));

            objects.get(0).getChildObject().add(curveBezierJoy3.get(0));

            //Bezier 4 (Lempengan bawah kanan)
            curveBezierJoy4.add(new Object(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(), new Vector4f(135 / 255f, 124 / 255f, 122 / 255f, 1.0f)
            ));
            List<Vector3f> curPointsJoy4 = curveBezierJoy4.get(0).getVertices();
            curveBezierJoy4.get(0).addVertices(new Vector3f(0.12f, 0.15f, 0.20f));
            curveBezierJoy4.get(0).addVertices(new Vector3f(0.08f, 0.12f, 0.10f));
            curveBezierJoy4.get(0).addVertices(new Vector3f(0.07f, 0.10f, 0.20f));

            curveBezierJoy4.get(0).updateCurve(new ArrayList<>(curPointsJoy4));

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
            objects.get(0).getChildObject().get(50).scaleObject(0.1f, 0.1f, 0.1f);
            objects.get(0).getChildObject().get(50).translateObject(0f, 0.18f, 0.0f);
            recallPeluru.set(objects.get(0).getChildObject().get(50).getModel());
        }

        //BOMB COC
        {
            //bomb-nya (sphere -> lingkaran)
            objects.add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0f, 0.0f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0f,
                    0f,
                    0f,
                    500,
                    500
                    , 2));
            objects.get(1).scaleObject(1f, 1f, 1f);

            //bagian atas bomb (kotak)
            objects.get(1).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.3f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.08f,
                    0.1f,
                    0.07f,
                    500,
                    500
                    , 1));

            objects.get(1).getChildObject().get(0).scaleObject(0.5f, 0.5f, 0.5f);
            objects.get(1).getChildObject().get(0).translateObject(0.0f, 0.1f, 0.0f);

            //kotak emas di sekitar bomb (4)
            //1
            objects.get(1).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.9f, 0.5f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.05f,
                    0.05f,
                    0.04f,
                    500,
                    500
                    , 1));

            objects.get(1).getChildObject().get(1).scaleObject(0.7f, 0.7f, 0.2f);
            objects.get(1).getChildObject().get(1).translateObject(0.0f, 0.0f, 0.105f);

            //2
            objects.get(1).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.9f, 0.5f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.05f,
                    0.05f,
                    0.05f,
                    500,
                    500
                    , 1));

            objects.get(1).getChildObject().get(2).scaleObject(0.7f, 0.7f, 0.2f);
            objects.get(1).getChildObject().get(2).translateObject(0.0f, 0.0f, -0.105f);

            //3
            objects.get(1).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.9f, 0.5f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.05f,
                    0.05f,
                    0.05f,
                    500,
                    500
                    , 1));

            objects.get(1).getChildObject().get(3).scaleObject(0.2f, 0.7f, 0.7f);
            objects.get(1).getChildObject().get(3).translateObject(0.105f, 0.0f, 0.0f);

            //4
            objects.get(1).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.9f, 0.5f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.05f,
                    0.05f,
                    0.05f,
                    500,
                    500
                    , 1));

            objects.get(1).getChildObject().get(4).scaleObject(0.2f, 0.7f, 0.7f);
            objects.get(1).getChildObject().get(4).translateObject(-0.105f, 0.0f, 0.0f);

            //duri bomb 1 depan
            objects.get(1).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.9f, 0.3f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.03f,
                    0.03f,
                    0.03f,
                    500,
                    500
                    , 12));

            objects.get(1).getChildObject().get(5).scaleObject(1f, 1f, 1f);
            objects.get(1).getChildObject().get(5).rotateObject(-300f, 1f, 0.0f, 0f);
            objects.get(1).getChildObject().get(5).translateObject(0.00020f, 0.0f, 0.109f);

            //duri bomb 2 belakang
            objects.get(1).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.9f, 0.3f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.03f,
                    0.03f,
                    0.03f,
                    500,
                    500
                    , 12));

            objects.get(1).getChildObject().get(6).scaleObject(1f, 1f, 1f);
            objects.get(1).getChildObject().get(6).rotateObject(300f, 1.0f, 0.0f, 0f);
            objects.get(1).getChildObject().get(6).translateObject(-0.0002f, 0.0f, -0.111f);

            //duri bomb 3 kanan
            objects.get(1).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.9f, 0.3f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.03f,
                    0.03f,
                    0.03f,
                    500,
                    500
                    , 12));

            objects.get(1).getChildObject().get(7).scaleObject(1f, 1f, 1f);
            objects.get(1).getChildObject().get(7).rotateObject(300f, 0.0f, 0.0f, 1f);
            objects.get(1).getChildObject().get(7).rotateObject(300f, 1f, 0.0f, 0f);
            objects.get(1).getChildObject().get(7).translateObject(0.11f, 0.f, 0f);

            //duri bomb 4 kiri
            objects.get(1).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.9f, 0.3f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.03f,
                    0.03f,
                    0.03f,
                    500,
                    500
                    , 12));

            objects.get(1).getChildObject().get(8).scaleObject(1f, 1f, 1f);
            objects.get(1).getChildObject().get(8).rotateObject(-300f, 0.0f, 0.0f, 1f);
            objects.get(1).getChildObject().get(8).rotateObject(-300f, 1f, 0.0f, 0f);
            objects.get(1).getChildObject().get(8).translateObject(-0.111f, 0.f, 0f);

            //bola bomb
            objects.get(1).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(211 / 255f, 154 / 255f, 24 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.1f,
                    0.1f,
                    0.1f,
                    500,
                    500
                    , 2));

            objects.get(1).getChildObject().get(9).scaleObject(1f, 1f, 1f);
            objects.get(1).getChildObject().get(9).translateObject(0.0f, 0.0f, 0.0f);

            //bola tabung hitam
            objects.get(1).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0f, 0f, 0.3f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.102f,
                    0.06f,
                    0.102f,
                    500,
                    500
                    , 10));

            objects.get(1).getChildObject().get(10).scaleObject(1f, 1f, 1f);
            objects.get(1).getChildObject().get(10).translateObject(0.0f, 0.027f, 0.0f);

            //kurva pertama
            curveBezier.add(new Object(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(
                    ),
                    new Vector4f(175 / 255f, 48 / 255f, 16 / 255f, 0.0f)
            ));

            List<Vector3f> curPointsChristo1 = curveBezier.get(0).getVertices();
            curveBezier.get(0).addVertices(new Vector3f(-0.1f, 0.025f, 0.00f));
            curveBezier.get(0).addVertices(new Vector3f(0.06f, 0.1f, 0.00f));
            curveBezier.get(0).addVertices(new Vector3f(-0.02f, 0.17f, 0.0f));
            curveBezier.get(0).addVertices(new Vector3f(-0.005f, 0.2f, 0.0f));

            curveBezier.get(0).updateCurve(new ArrayList<>(curPointsChristo1));

            objects.get(1).getChildObject().add(curveBezier.get(0));
        }

        //AIR SWEEPER COC KIRI DEPAN
        {

            //Fondasi air sweeper (abu)
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
            objects.get(2).scaleObject(0f, 0f, 0f);

            //pump hexa merah
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1f, 0f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.7f,
                    0.58f,
                    0.7f,
                    72,
                    36
                    , 14));

            objects.get(2).getChildObject().get(0).scaleObject(0.6f, 0.6f, 0.6f);
            objects.get(2).getChildObject().get(0).translateObject(0f, -0.75f, 0f);

            //bagian kaki kiri belakang
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.58f, 0.29f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.09f,
                    0.58f,
                    0.09f,
                    72,
                    36
                    , 1));

            objects.get(2).getChildObject().get(1).scaleObject(1.5f, 1.8f, 1.62f);
            objects.get(2).getChildObject().get(1).rotateObject(50f, 0f, 0.0f, 1f);
            objects.get(2).getChildObject().get(1).translateObject(-0.47f, -0.55f, 0.47f);

            //bagian kaki kanan belakang
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.58f, 0.29f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.09f,
                    0.58f,
                    0.09f,
                    72,
                    36
                    , 1));

            objects.get(2).getChildObject().get(2).scaleObject(1.5f, 1.8f, 1.62f);
            objects.get(2).getChildObject().get(2).rotateObject(-50f, 0f, 0.0f, 1f);
            objects.get(2).getChildObject().get(2).translateObject(0.47f, -0.55f, 0.47f);

            //bagian kaki kiri depan
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.58f, 0.29f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.09f,
                    0.58f,
                    0.09f,
                    72,
                    36
                    , 1));

            objects.get(2).getChildObject().get(3).scaleObject(1.5f, 1.8f, 1.62f);
            objects.get(2).getChildObject().get(3).rotateObject(-50f, 0f, 0.0f, -1f);
            objects.get(2).getChildObject().get(3).translateObject(-0.47f, -0.55f, -0.47f);

            //bagian kaki kanan depan
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.58f, 0.29f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.09f,
                    0.58f,
                    0.09f,
                    72,
                    36
                    , 1));

            objects.get(2).getChildObject().get(4).scaleObject(1.5f, 1.8f, 1.62f);
            objects.get(2).getChildObject().get(4).rotateObject(-50f, 0f, 0.0f, 1f);
            objects.get(2).getChildObject().get(4).translateObject(0.47f, -0.55f, -0.47f);

            //bagian lingkaran atas (merah)
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1f, 0f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.7f,
                    0.07f,
                    0.7f,
                    72,
                    36
                    , 10));

            objects.get(2).getChildObject().get(5).scaleObject(0.55f, 0.55f, 0.55f);
            objects.get(2).getChildObject().get(5).translateObject(0.0f, 0.1f, 0.0f);

            //bagian hexa bawah (emas)
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.83f, 0.68f, 0.21f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.7f,
                    0.1f,
                    0.7f,
                    72,
                    36
                    , 14));

            objects.get(2).getChildObject().get(6).scaleObject(0.62f, 0.33f, 0.62f);
            objects.get(2).getChildObject().get(6).translateObject(0.0f, -0.81f, 0.0f);

            //bagian nosel lingkaran bawah
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.18f, 0.30f, 0.30f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.7f,
                    0.3f,
                    0.7f,
                    72,
                    36
                    , 10));

            objects.get(2).getChildObject().get(7).scaleObject(0.4f, 0.4f, 0.4f);
            objects.get(2).getChildObject().get(7).translateObject(0.0f, 0.2f, 0.0f);

            //bagian nosel lingkaran atas
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.43f, 0.50f, 0.56f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.7f,
                    0.3f,
                    0.7f,
                    72,
                    36
                    , 10));

            objects.get(2).getChildObject().get(8).scaleObject(0.3f, 0.3f, 0.3f);
            objects.get(2).getChildObject().get(8).translateObject(0.0f, 0.27f, 0.0f);

            //bagian nosel atasnya lagi
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.41f, 0.41f, 0.41f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.95f,
                    0.3f,
                    72,
                    36
                    , 10));

            objects.get(2).getChildObject().get(9).scaleObject(0.4f, 0.4f, 0.4f);
            objects.get(2).getChildObject().get(9).translateObject(0.0f, 0.63f, 0.0f);

            //bagian pinggir kotak emas kiri
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.83f, 0.68f, 0.21f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.07f,
                    3.7f,
                    72,
                    36
                    , 1));

            objects.get(2).getChildObject().get(10).scaleObject(0.3f, 0.3f, 0.3f);
            objects.get(2).getChildObject().get(10).translateObject(-0.51f, 0.062f, 0.0f);

            //bagian pinggir kotak emas kanan
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.83f, 0.68f, 0.21f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.07f,
                    3.7f,
                    72,
                    36
                    , 1));

            objects.get(2).getChildObject().get(11).scaleObject(0.3f, 0.3f, 0.3f);
            objects.get(2).getChildObject().get(11).translateObject(0.51f, 0.062f, 0.0f);

            //bagian pinggir kotak emas belakang
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.83f, 0.68f, 0.21f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    3.7f,
                    0.07f,
                    0.3f,
                    72,
                    36
                    , 1));

            objects.get(2).getChildObject().get(12).scaleObject(0.3f, 0.3f, 0.3f);
            objects.get(2).getChildObject().get(12).translateObject(0.0f, 0.062f, 0.51f);

            //bagian pinggir kotak emas depan
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.83f, 0.68f, 0.21f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    3.7f,
                    0.07f,
                    0.3f,
                    72,
                    36
                    , 1));

            objects.get(2).getChildObject().get(13).scaleObject(0.3f, 0.3f, 0.3f);
            objects.get(2).getChildObject().get(13).translateObject(0.0f, 0.062f, -0.51f);

            //bagian moncong nosel ujung belakang
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.66f, 0.66f, 0.66f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.3f,
                    1f,
                    72,
                    36
                    , 9));

            objects.get(2).getChildObject().get(14).scaleObject(0.35f, 0.35f, 0.35f);
            objects.get(2).getChildObject().get(14).translateObject(0.0f, 0.5f, -0.07f);

            //bagian moncong tengah antara nosel
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.50f, 0.50f, 0.50f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.3f,
                    0.3f,
                    72,
                    36
                    , 9));

            objects.get(2).getChildObject().get(15).scaleObject(0.4f, 0.4f, 0.4f);
            objects.get(2).getChildObject().get(15).translateObject(0.0f, 0.5f, -0.33f);

            //bagian moncong nosel ujung depan
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.66f, 0.66f, 0.66f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.3f,
                    0.3f,
                    72,
                    36
                    , 9));

            objects.get(2).getChildObject().get(16).scaleObject(0.39f, 0.39f, 0.39f);
            objects.get(2).getChildObject().get(16).translateObject(0.0f, 0.5f, -0.37f);

            //bagian tengah kotak emas Horizontal
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.83f, 0.68f, 0.21f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    3.7f,
                    0.07f,
                    0.3f,
                    72,
                    36
                    , 1));

            objects.get(2).getChildObject().get(17).scaleObject(0.3f, 0.3f, 0.3f);
            objects.get(2).getChildObject().get(17).translateObject(0.0f, 0.062f, 0.0f);

            //bagian tengah kotak emas vertikal
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.83f, 0.68f, 0.21f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.07f,
                    3.7f,
                    72,
                    36
                    , 1));

            objects.get(2).getChildObject().get(18).scaleObject(0.3f, 0.3f, 0.3f);
            objects.get(2).getChildObject().get(18).translateObject(0.0f, 0.062f, 0.0f);

            //fondasi kotak abu tengah (CHILD)
            objects.get(2).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.66f, 0.66f, 0.66f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.56f,
                    0.05f,
                    0.56f,
                    36,
                    18
                    , 1));

            objects.get(2).getChildObject().get(19).scaleObject(2f, 2f, 2f);
            objects.get(2).getChildObject().get(19).translateObject(0.0f, 0.0f, 0.0f);

            //angin (berzier)
            objectsBerzier.add(new Object(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(
                    ),
                    new Vector4f(1f, 1f, 1f, 1f)
            ));

            List<Vector3f> curPoints1 = objectsBerzier.get(0).getVertices();
            objectsBerzier.get(0).addVertices(new Vector3f(0.7f, 0.5f, 0f));
            objectsBerzier.get(0).addVertices(new Vector3f(0f, 1f, 0f));
            objectsBerzier.get(0).addVertices(new Vector3f(-0.7f, 0.5f, 0f));
            // objectsBerzier.get(0).addVertices(new Vector3f(0f, 0.5f,-2.5f));
            objectsBerzier.get(0).updateCurve(new ArrayList<>(curPoints1));
            objects.get(2).getChildObject().add(objectsBerzier.get(0));

            //angin2 (berzier)
            objectsBerzier2.add(new Object(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(
                    ),
                    new Vector4f(1f, 1f, 1f, 1f)
            ));
            List<Vector3f> curPoints2 = objectsBerzier2.get(0).getVertices();
            objectsBerzier2.get(0).addVertices(new Vector3f(1, 0.7f, 0f));
            objectsBerzier2.get(0).addVertices(new Vector3f(0f, 1.3f, 0f));
            objectsBerzier2.get(0).addVertices(new Vector3f(-1f, 0.7f, 0f));
            // objectsBerzier.get(0).addVertices(new Vector3f(0f, 0.5f,-2.5f));
            objectsBerzier2.get(0).updateCurve(new ArrayList<>(curPoints2));
            objects.get(2).getChildObject().add(objectsBerzier2.get(0));

        }

        //TOWN HALL COC
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
            objects.get(3).scaleObject(1f, 1f, 1f);

            //      Rumput
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(0).translateObject(0f, 0f, 0f);

            //      Fondasi TownHall
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(1).translateObject(0f, 0.55f, 0f);

            //      Lapisan bawah kanan
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(2).translateObject(1.28f, 0.15f, 0f);

            //      Lapisan bawah kiri
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(3).translateObject(-1.28f, 0.15f, 0f);

//      Lapisan bawah belakang
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(4).translateObject(0f, 0.15f, -1.28f);

            //      Lapisan bawah depan kiri
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(5).translateObject(-0.82f, 0.15f, 1.28f);

//      Lapisan bawah depan kanan
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(6).translateObject(0.82f, 0.15f, 1.28f);

//      Lapisan atas kiri
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(7).translateObject(-1.3f, 0.975f, 0f);

//      Lapisan atas kanan
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(8).translateObject(1.3f, 0.975f, 0f);

            //      Atap 1
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(9).rotateObject(300f, 1f, 0f, 0f);
            objects.get(3).getChildObject().get(9).translateObject(-1.35f, 1.09f, 1.3f);

            //      Kayu kiri 2
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(10).translateObject(1.3f, 0.46f, 0f);

            //      Kayu kiri 1
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(11).translateObject(1.3f, 0.46f, 0.85f);

            //      Kayu kiri 3
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(12).translateObject(1.3f, 0.46f, -0.85f);

            //      Jendela kiri 1
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(13).translateObject(1.15f, 0.55f, 0.425f);

            //      Jendela kiri 2
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(14).translateObject(1.15f, 0.55f, -0.425f);

            //      Kayu kanan 2
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(15).translateObject(-1.3f, 0.46f, 0f);

            //      Kayu kanan 1
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(16).translateObject(-1.3f, 0.46f, 0.85f);

            //      Kayu kanan 3
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(17).translateObject(-1.3f, 0.46f, -0.85f);

            //      Jendela kanan 1
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(18).translateObject(-1.28f, 0.55f, 0.425f);

            //      Jendela kanan 2
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(19).translateObject(-1.28f, 0.55f, -0.425f);


            //      Kayu belakang 2
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(20).translateObject(0f, 0.46f, -1.3f);

            //      Kayu belakang 1
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(21).translateObject(0.85f, 0.46f, -1.3f);

            //      Kayu belakang 3
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(22).translateObject(-0.85f, 0.46f, -1.3f);

            //      Jendela belakang 1
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(23).translateObject(-0.425f, 0.55f, -1.25f);

            //      Jendela belakang 2
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(24).translateObject(0.425f, 0.55f, -1.25f);

            //      Lapisan atas belakang
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(25).translateObject(0f, 0.975f, -1.3f);

            //      Kayu depan 1
            objects.get(3).getChildObject().add(new Sphere(
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

//        objects.get(3).getChildObject().get(26).translateObject(0.85f, 0.46f, -1.3f);
            objects.get(3).getChildObject().get(26).translateObject(0.85f, 0.46f, 1.3f);

            //      Kayu depan 2
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(27).translateObject(-0.85f, 0.46f, 1.3f);

            //      Kayu depan atas
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(28).translateObject(0f, 0.95f, 1.3f);

//      Pintu Kayu Kanan
            objects.get(3).getChildObject().add(new Sphere(
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

//        objects.get(3).getChildObject().get(26).translateObject(0.85f, 0.46f, -1.3f);
            objects.get(3).getChildObject().get(29).translateObject(0.35f, 0.4f, 1.325f);

//      Pintu Kayu Kiri
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(30).translateObject(-0.35f, 0.40f, 1.325f);

            //      Pintu Kayu Atas
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(31).translateObject(0f, 0.675f, 1.325f);

            //      Atap 2
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(32).translateObject(0f, 1.25f, 0f);

            //Balok abu abu tengah
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(33).translateObject(0f, 1.675f, 0f);

            //Balok abu abu kanan
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(34).translateObject(0.37f, 1.675f, 0f);

            //Balok abu abu kiri
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(35).translateObject(-0.37f, 1.675f, 0f);

            //Balok abu abu horizontal 2
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(36).translateObject(0f, 1.675f, 0.15f);

            //Balok abu abu horizontal 3
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(37).translateObject(0f, 1.675f, -0.15f);

            //Balok abu abu horizontal 4
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(38).translateObject(0f, 1.675f, 0.45f);

            //Balok abu abu horizontal 1
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(39).translateObject(0f, 1.675f, -0.45f);

//Balok abu abu belakang kanan
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(40).translateObject(0.725f, 1.675f, -0.725f);

//Balok abu abu depan kanan
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(41).translateObject(0.725f, 1.675f, 0.725f);

//Balok abu abu belakang kiri
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(42).translateObject(-0.725f, 1.675f, -0.725f);

//Balok abu abu depan kiri
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(43).translateObject(-0.725f, 1.675f, 0.725f);


            //      Atap 3
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(44).translateObject(0f, 1.78f, 0f);

            //Balok coklat tengah
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(45).translateObject(0f, 1.865f, 0f);

            //Balok abu abu kanan
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(46).translateObject(0.310f, 1.865f, 0f);

            //Balok abu abu kiri
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(47).translateObject(-0.310f, 1.865f, 0f);

            //Balok abu abu horizontal 2
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(48).translateObject(0f, 1.865f, 0.125f);

            //Balok abu abu horizontal 3
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(49).translateObject(0f, 1.865f, -0.125f);

            //Balok abu abu horizontal 4
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(50).translateObject(0f, 1.865f, 0.385f);

            //Balok abu abu horizontal 1
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(51).translateObject(0f, 1.865f, -0.385f);

//Balok abu abu belakang kanan
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(52).translateObject(0.62f, 1.865f, -0.635f);

//Balok abu abu depan kanan
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(53).translateObject(0.62f, 1.865f, 0.635f);

//Balok abu abu belakang kiri
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(54).translateObject(-0.62f, 1.865f, -0.635f);

//Balok abu abu depan kiri
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(55).translateObject(-0.62f, 1.865f, 0.635f);

            //      Atap 4
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(56).translateObject(0f, 1.97f, 0f);

            //      Cerobong asap
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(57).translateObject(0.3f, 2.035f, 0.35f);


            //      Cerobong asap
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(58).translateObject(0.3f, 2.175f, 0.5f);

            //      Cerobong asap
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(59).translateObject(0.3f, 2.175f, 0.2f);

            //      Cerobong asap
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(60).translateObject(0.15f, 2.175f, 0.35f);

            //      Cerobong asap
            objects.get(3).getChildObject().add(new Sphere(
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

            objects.get(3).getChildObject().get(61).translateObject(0.45f, 2.175f, 0.35f);

            //WALL BESAR
            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.25f, 0.25f, 0.25f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    10f,
                    0.7f,
                    0.5f,
                    36,
                    18
                    , 1));

            objects.get(3).getChildObject().get(62).translateObject(0f, 0.4f, 4.75f);

            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.25f, 0.25f, 0.25f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    10f,
                    0.7f,
                    0.5f,
                    36,
                    18
                    , 1));

            objects.get(3).getChildObject().get(63).translateObject(0f, 0.4f, -4.75f);

            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.25f, 0.25f, 0.25f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.7f,
                    10f,
                    36,
                    18
                    , 1));

            objects.get(3).getChildObject().get(64).translateObject(4.75f, 0.4f, 0f);

            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.25f, 0.25f, 0.25f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.7f,
                    10f,
                    36,
                    18
                    , 1));

            objects.get(3).getChildObject().get(65).translateObject(-4.75f, 0.4f, 0f);

            //Batang Pohon 1
            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(122 / 255f, 79 / 255f, 44 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    1.45f,
                    0.3f,
                    36,
                    18
                    , 10));

            objects.get(3).getChildObject().get(66).translateObject(-3f, 1.5f, -3f);

            //Daun Pohon 2
            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(126 / 255f, 165 / 255f, 51 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    1.1f,
                    1.1f,
                    1.1f,
                    36,
                    18
                    , 2));

            objects.get(3).getChildObject().get(67).translateObject(-3f, 2.1f, -3f);

            //Batang Pohon 2
            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(122 / 255f, 79 / 255f, 44 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    1.45f,
                    0.3f,
                    36,
                    18
                    , 10));

            objects.get(3).getChildObject().get(68).translateObject(3f, 1.5f, -3f);

            //Daun Pohon 2
            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(126 / 255f, 165 / 255f, 51 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.15f,
                    0.15f,
                    0.30f,
                    36,
                    18
                    , 21));

            objects.get(3).getChildObject().get(69).rotateObject(-300f, 1f, 0f, 0f);
            objects.get(3).getChildObject().get(69).translateObject(3f, 3f, -3f);

            //AWAN 1 TENGAH
            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(187 / 255f, 204 / 255f, 229 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.5f,
                    0.5f,
                    36,
                    18
                    , 2));

            objects.get(3).getChildObject().get(70).translateObject(-1.2f, 7f, -1f);

            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(187 / 255f, 204 / 255f, 229 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.5f,
                    0.5f,
                    36,
                    18
                    , 2));

            objects.get(3).getChildObject().get(71).translateObject(-0.7f, 7.4f, -1f);

            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(187 / 255f, 204 / 255f, 229 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.5f,
                    0.5f,
                    36,
                    18
                    , 2));

            objects.get(3).getChildObject().get(72).translateObject(-0.3f, 7.2f, -1f);

            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(187 / 255f, 204 / 255f, 229 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.5f,
                    0.5f,
                    36,
                    18
                    , 2));

            objects.get(3).getChildObject().get(73).translateObject(0.1f, 7.35f, -1f);

            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(187 / 255f, 204 / 255f, 229 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.5f,
                    0.5f,
                    36,
                    18
                    , 2));

            objects.get(3).getChildObject().get(74).translateObject(0.6f, 7f, -1f);

            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(187 / 255f, 204 / 255f, 229 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.5f,
                    0.5f,
                    36,
                    18
                    , 2));

            objects.get(3).getChildObject().get(75).translateObject(-0.3f, 6.8f, -1f);

            //AWAN 2
            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(187 / 255f, 204 / 255f, 229 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.5f,
                    0.5f,
                    36,
                    18
                    , 2));

            objects.get(3).getChildObject().get(76).translateObject(2.7f, 6f, -1f);

            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(187 / 255f, 204 / 255f, 229 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.5f,
                    0.5f,
                    36,
                    18
                    , 2));

            objects.get(3).getChildObject().get(77).translateObject(2.3f, 5.5f, -1f);

            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(187 / 255f, 204 / 255f, 229 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.5f,
                    0.5f,
                    36,
                    18
                    , 2));

            objects.get(3).getChildObject().get(78).translateObject(3f, 5.5f, -1f);

            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(187 / 255f, 204 / 255f, 229 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.5f,
                    0.5f,
                    36,
                    18
                    , 2));

            objects.get(3).getChildObject().get(79).translateObject(3.4f, 5.85f, -1f);

            //AWAW 3 KIRI
            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(187 / 255f, 204 / 255f, 229 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.5f,
                    0.5f,
                    36,
                    18
                    , 2));

            objects.get(3).getChildObject().get(80).translateObject(-2f, 5f, -1f);

            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(187 / 255f, 204 / 255f, 229 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.5f,
                    0.5f,
                    36,
                    18
                    , 2));

            objects.get(3).getChildObject().get(81).translateObject(-2.4f, 5.4f, -1f);

            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(187 / 255f, 204 / 255f, 229 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.5f,
                    0.5f,
                    36,
                    18
                    , 2));

            objects.get(3).getChildObject().get(82).translateObject(-3f, 5.1f, -1f);

            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(187 / 255f, 204 / 255f, 229 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.5f,
                    0.5f,
                    36,
                    18
                    , 2));

            objects.get(3).getChildObject().get(83).translateObject(-3.3f, 4.7f, -1f);

            objects.get(3).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(187 / 255f, 204 / 255f, 229 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.5f,
                    0.5f,
                    36,
                    18
                    , 2));

            objects.get(3).getChildObject().get(84).translateObject(-2.4f, 4.5f, -1f);

        }

        //CANNON COC KANAN
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
            objects.get(4).scaleObject(1f, 1f, 1f);

            //      Moncong Tabung Cannon Besar
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(0).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(0).translateObject(0f, 0.18f, 0f);

            //      Pantat Tabung Cannon
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(1).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(1).translateObject(0f, 0.18f, 0f);

            //      Cincin Tabung Cannon Tengah
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(2).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(2).translateObject(0f, 0.18f, 0f);

            //      Pantat Tabung Cannon 4 (Sphere)
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(3).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(3).translateObject(0f, 0.18f, 0.27f);

            //      Cincin Tabung Cannon Belakang
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(4).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(4).translateObject(0f, 0.18f, 0.20f);

            //      Fondasi Cannon 2
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(5).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(5).translateObject(0.0f, 0.05f, 0f);

            //      Fondasi Cannon 3
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(6).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(6).translateObject(0.0f, 0.075f, 0f);

            //      Cincin Tabung Cannon Depan
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(7).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(7).translateObject(0.0f, 0.18f, -0.27f);

            //      Moncong Tabung Cannon tipis
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(8).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(8).translateObject(0f, 0.18f, 0f);

            //      Moncong Tabung Cannon sedang
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(9).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(9).translateObject(0f, 0.18f, 0f);

            //      Lubang Meriam
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(10).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(10).translateObject(0f, 0.18f, -0.26f);

            //      Kaki Trapesium 1
            objects.get(4).getChildObject().add(new Sphere(
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

            objects.get(4).getChildObject().get(11).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(11).rotateObject(450f, 0f, 1f, 0f);
            objects.get(4).getChildObject().get(11).translateObject(0.165f, -0.053f, 0.165f);

            //      Kaki Trapesium 2
            objects.get(4).getChildObject().add(new Sphere(
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

            objects.get(4).getChildObject().get(12).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(12).rotateObject(-150f, 0f, 1f, 0f);
            objects.get(4).getChildObject().get(12).translateObject(-0.165f, -0.053f, -0.165f);

            //      Kaki Trapesium 3
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(13).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(13).rotateObject(-450f, 0f, 1f, 0f);
            objects.get(4).getChildObject().get(13).translateObject(-0.165f, -0.053f, 0.165f);

//      Kaki Trapesium 4
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(14).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(14).rotateObject(150f, 0f, 1f, 0f);
            objects.get(4).getChildObject().get(14).translateObject(0.165f, -0.053f, -0.165f);

            //      Fondasi Cannon
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(15).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(15).translateObject(0f, 0f, 0f);

            //      Fondasi Tuas
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(16).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(16).translateObject(0.30f, -0.070f, 0f);

            //      Fondasi Tuas 2
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(17).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(17).rotateObject(300f, 0.0f, 1.0f, 0f);
            objects.get(4).getChildObject().get(17).translateObject(0.29f, -0.060f, 0f);


            //      Fondasi Tuas 3
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(18).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(18).rotateObject(300f, 0.0f, 1.0f, 0f);
            objects.get(4).getChildObject().get(18).rotateObject(300f, 0.0f, 1.0f, 0f);
            objects.get(4).getChildObject().get(18).rotateObject(300f, 0.0f, 1.0f, 0f);
            objects.get(4).getChildObject().get(18).translateObject(0.31f, -0.060f, 0f);

            //      Tuas Biru 1
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(19).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(19).rotateObject(180f, 1f, 0f, 0f);
            objects.get(4).getChildObject().get(19).translateObject(0.30f, -0.020f, 0f);

            //      Tuas Biru 2
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(20).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(20).rotateObject(180f, 1f, 0f, 0f);
            objects.get(4).getChildObject().get(20).translateObject(0.30f, 0.020f, 0.053f);

            //      Lapis emas samping kanan
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(21).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(21).translateObject(0.205f, 0.00f, 0.0f);

            //      Lapis emas samping kiri
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(22).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(22).translateObject(-0.205f, 0.00f, 0.0f);

            //      Lapis emas samping belakang
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(23).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(23).translateObject(0f, 0.00f, 0.205f);

            //      Lapis emas samping depan
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(24).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(24).translateObject(0f, 0.00f, -0.205f);

            //      Lapis emas atas kanan
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(25).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(25).translateObject(0.16f, 0.030f, 0.0f);

            //      Lapis emas atas kiri
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(26).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(26).translateObject(-0.16f, 0.030f, 0.0f);

            //      Lapis emas atas belakang
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(27).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(27).translateObject(0.f, 0.030f, 0.16f);

            //      Lapis emas atas depan
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(28).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(28).translateObject(0.f, 0.030f, -0.16f);

//      Tabung kecil samping kanan
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(29).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(29).rotateObject(300f, 0f, 1f, 0f);
            objects.get(4).getChildObject().get(29).translateObject(0.210f, 0.0050f, 0.0f);

//      Tabung kecil samping kiri
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(30).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(30).rotateObject(300f, 0f, 1f, 0f);
            objects.get(4).getChildObject().get(30).translateObject(-0.220f, 0.0050f, 0.0f);

            //      Tabung kecil samping belakang
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(31).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(31).translateObject(0.0f, 0.0050f, 0.220f);

//      Tabung kecil samping depan
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(32).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(32).translateObject(0.0f, 0.0050f, -0.210f);

            //      Elips kecil samping kanan
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(33).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(33).rotateObject(300f, 0f, 1f, 0f);
            objects.get(4).getChildObject().get(33).translateObject(0.220f, 0.0050f, 0.0f);

            //      Elips kecil samping kiri
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(34).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(34).rotateObject(300f, 0f, 1f, 0f);
            objects.get(4).getChildObject().get(34).translateObject(-0.220f, 0.0050f, 0.0f);

            //      Elips kecil samping belakang
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(35).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(35).translateObject(0.0f, 0.0050f, 0.220f);

            //      Elips kecil samping depan
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(36).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(36).translateObject(0.0f, 0.0050f, -0.220f);

            //      Limas segi4 kanan belakang
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(37).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(37).translateObject(0.14f, 0.026f, 0.14f);

            //      Limas segi4 kiri belakang
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(38).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(38).translateObject(-0.14f, 0.026f, 0.14f);

            //      Limas segi4 kiri depan
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(39).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(39).translateObject(-0.14f, 0.026f, -0.14f);

            //      Limas segi4 kanan depan
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(40).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(40).translateObject(0.14f, 0.026f, -0.14f);

            //      Duri Kaki 1
            objects.get(4).getChildObject().add(new Sphere(
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

            objects.get(4).getChildObject().get(41).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(41).rotateObject(450f, 0f, 1f, 0f);
            objects.get(4).getChildObject().get(41).translateObject(0.23f, -0.053f, 0.23f);

            //      Duri Kaki 2
            objects.get(4).getChildObject().add(new Sphere(
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

            objects.get(4).getChildObject().get(42).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(42).rotateObject(-450f, 0f, 1f, 0f);
            objects.get(4).getChildObject().get(42).translateObject(-0.23f, -0.053f, 0.23f);

            //      Duri Kaki 3
            objects.get(4).getChildObject().add(new Sphere(
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

            objects.get(4).getChildObject().get(43).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(43).rotateObject(150f, 0f, 1f, 0f);
            objects.get(4).getChildObject().get(43).translateObject(0.23f, -0.053f, -0.23f);

            //      Duri Kaki 4
            objects.get(4).getChildObject().add(new Sphere(
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

            objects.get(4).getChildObject().get(44).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(44).rotateObject(-150f, 0f, 1f, 0f);
            objects.get(4).getChildObject().get(44).translateObject(-0.23f, -0.053f, -0.23f);

            //Bezier 1 (Lempengan atas kanan)
            curveBezierJoy5.add(new Object(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(), new Vector4f(135 / 255f, 124 / 255f, 122 / 255f, 1.0f)
            ));

            List<Vector3f> curPointsJoy1 = curveBezierJoy5.get(0).getVertices();
            curveBezierJoy5.get(0).addVertices(new Vector3f(0.04f, 0.30f, 0.20f));
            curveBezierJoy5.get(0).addVertices(new Vector3f(0.07f, 0.27f, 0.10f));
            curveBezierJoy5.get(0).addVertices(new Vector3f(0.10f, 0.25f, 0.20f));

            curveBezierJoy5.get(0).updateCurve(new ArrayList<>(curPointsJoy1));

            objects.get(4).getChildObject().add(curveBezierJoy5.get(0));

            //Bezier 2 (Lempengan atas kiri)
            curveBezierJoy6.add(new Object(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(), new Vector4f(135 / 255f, 124 / 255f, 122 / 255f, 1.0f)
            ));
            List<Vector3f> curPointsJoy2 = curveBezierJoy6.get(0).getVertices();
            curveBezierJoy6.get(0).addVertices(new Vector3f(-0.04f, 0.30f, 0.20f));
            curveBezierJoy6.get(0).addVertices(new Vector3f(-0.07f, 0.27f, 0.10f));
            curveBezierJoy6.get(0).addVertices(new Vector3f(-0.10f, 0.25f, 0.20f));

            curveBezierJoy6.get(0).updateCurve(new ArrayList<>(curPointsJoy2));

            objects.get(4).getChildObject().add(curveBezierJoy6.get(0));

            //Bezier 3 (Lempengan bawah kiri)
            curveBezierJoy7.add(new Object(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(), new Vector4f(135 / 255f, 124 / 255f, 122 / 255f, 1.0f)
            ));
            List<Vector3f> curPointsJoy3 = curveBezierJoy7.get(0).getVertices();
            curveBezierJoy7.get(0).addVertices(new Vector3f(-0.12f, 0.15f, 0.20f));
            curveBezierJoy7.get(0).addVertices(new Vector3f(-0.08f, 0.12f, 0.10f));
            curveBezierJoy7.get(0).addVertices(new Vector3f(-0.07f, 0.10f, 0.20f));

            curveBezierJoy7.get(0).updateCurve(new ArrayList<>(curPointsJoy3));

            objects.get(4).getChildObject().add(curveBezierJoy7.get(0));

            //Bezier 4 (Lempengan bawah kanan)
            curveBezierJoy8.add(new Object(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(), new Vector4f(135 / 255f, 124 / 255f, 122 / 255f, 1.0f)
            ));
            List<Vector3f> curPointsJoy4 = curveBezierJoy8.get(0).getVertices();
            curveBezierJoy8.get(0).addVertices(new Vector3f(0.12f, 0.15f, 0.20f));
            curveBezierJoy8.get(0).addVertices(new Vector3f(0.08f, 0.12f, 0.10f));
            curveBezierJoy8.get(0).addVertices(new Vector3f(0.07f, 0.10f, 0.20f));

            curveBezierJoy8.get(0).updateCurve(new ArrayList<>(curPointsJoy4));

            objects.get(4).getChildObject().add(curveBezierJoy8.get(0));

            //      Cincin Tabung Cannon 3
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(49).scaleObject(1f, 1f, 1f);
            objects.get(4).getChildObject().get(49).translateObject(0.0f, 0.18f, -0.10f);

            //      Peluru Cannon
            objects.get(4).getChildObject().add(new Sphere(
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
            objects.get(4).getChildObject().get(50).scaleObject(0.1f, 0.1f, 0.1f);
            objects.get(4).getChildObject().get(50).translateObject(0f, 0.18f, 0.0f);
            recallPeluru2.set(objects.get(4).getChildObject().get(50).getModel());

        }

        //AIR SWEEPER COC KANAN DEPAN
        {
            //Fondasi air sweeper (abu)
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
            objects.get(5).scaleObject(0f, 0f, 0f);

            //pump hexa merah
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1f, 0f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.7f,
                    0.58f,
                    0.7f,
                    72,
                    36
                    , 14));

            objects.get(5).getChildObject().get(0).scaleObject(0.6f, 0.6f, 0.6f);
            objects.get(5).getChildObject().get(0).translateObject(0f, -0.75f, 0f);

            //bagian kaki kiri belakang
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.58f, 0.29f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.09f,
                    0.58f,
                    0.09f,
                    72,
                    36
                    , 1));

            objects.get(5).getChildObject().get(1).scaleObject(1.5f, 1.8f, 1.62f);
            objects.get(5).getChildObject().get(1).rotateObject(50f, 0f, 0.0f, 1f);
            objects.get(5).getChildObject().get(1).translateObject(-0.47f, -0.55f, 0.47f);

            //bagian kaki kanan belakang
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.58f, 0.29f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.09f,
                    0.58f,
                    0.09f,
                    72,
                    36
                    , 1));

            objects.get(5).getChildObject().get(2).scaleObject(1.5f, 1.8f, 1.62f);
            objects.get(5).getChildObject().get(2).rotateObject(-50f, 0f, 0.0f, 1f);
            objects.get(5).getChildObject().get(2).translateObject(0.47f, -0.55f, 0.47f);

            //bagian kaki kiri depan
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.58f, 0.29f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.09f,
                    0.58f,
                    0.09f,
                    72,
                    36
                    , 1));

            objects.get(5).getChildObject().get(3).scaleObject(1.5f, 1.8f, 1.62f);
            objects.get(5).getChildObject().get(3).rotateObject(-50f, 0f, 0.0f, -1f);
            objects.get(5).getChildObject().get(3).translateObject(-0.47f, -0.55f, -0.47f);

            //bagian kaki kanan depan
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.58f, 0.29f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.09f,
                    0.58f,
                    0.09f,
                    72,
                    36
                    , 1));

            objects.get(5).getChildObject().get(4).scaleObject(1.5f, 1.8f, 1.62f);
            objects.get(5).getChildObject().get(4).rotateObject(-50f, 0f, 0.0f, 1f);
            objects.get(5).getChildObject().get(4).translateObject(0.47f, -0.55f, -0.47f);

            //bagian lingkaran atas (merah)
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1f, 0f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.7f,
                    0.07f,
                    0.7f,
                    72,
                    36
                    , 10));

            objects.get(5).getChildObject().get(5).scaleObject(0.55f, 0.55f, 0.55f);
            objects.get(5).getChildObject().get(5).translateObject(0.0f, 0.1f, 0.0f);

            //bagian hexa bawah (emas)
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.83f, 0.68f, 0.21f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.7f,
                    0.1f,
                    0.7f,
                    72,
                    36
                    , 14));

            objects.get(5).getChildObject().get(6).scaleObject(0.62f, 0.33f, 0.62f);
            objects.get(5).getChildObject().get(6).translateObject(0.0f, -0.81f, 0.0f);

            //bagian nosel lingkaran bawah
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.18f, 0.30f, 0.30f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.7f,
                    0.3f,
                    0.7f,
                    72,
                    36
                    , 10));

            objects.get(5).getChildObject().get(7).scaleObject(0.4f, 0.4f, 0.4f);
            objects.get(5).getChildObject().get(7).translateObject(0.0f, 0.2f, 0.0f);

            //bagian nosel lingkaran atas
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.43f, 0.50f, 0.56f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.7f,
                    0.3f,
                    0.7f,
                    72,
                    36
                    , 10));

            objects.get(5).getChildObject().get(8).scaleObject(0.3f, 0.3f, 0.3f);
            objects.get(5).getChildObject().get(8).translateObject(0.0f, 0.27f, 0.0f);

            //bagian nosel atasnya lagi
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.41f, 0.41f, 0.41f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.95f,
                    0.3f,
                    72,
                    36
                    , 10));

            objects.get(5).getChildObject().get(9).scaleObject(0.4f, 0.4f, 0.4f);
            objects.get(5).getChildObject().get(9).translateObject(0.0f, 0.63f, 0.0f);

            //bagian pinggir kotak emas kiri
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.83f, 0.68f, 0.21f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.07f,
                    3.7f,
                    72,
                    36
                    , 1));

            objects.get(5).getChildObject().get(10).scaleObject(0.3f, 0.3f, 0.3f);
            objects.get(5).getChildObject().get(10).translateObject(-0.51f, 0.062f, 0.0f);

            //bagian pinggir kotak emas kanan
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.83f, 0.68f, 0.21f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.07f,
                    3.7f,
                    72,
                    36
                    , 1));

            objects.get(5).getChildObject().get(11).scaleObject(0.3f, 0.3f, 0.3f);
            objects.get(5).getChildObject().get(11).translateObject(0.51f, 0.062f, 0.0f);

            //bagian pinggir kotak emas belakang
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.83f, 0.68f, 0.21f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    3.7f,
                    0.07f,
                    0.3f,
                    72,
                    36
                    , 1));

            objects.get(5).getChildObject().get(12).scaleObject(0.3f, 0.3f, 0.3f);
            objects.get(5).getChildObject().get(12).translateObject(0.0f, 0.062f, 0.51f);

            //bagian pinggir kotak emas depan
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.83f, 0.68f, 0.21f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    3.7f,
                    0.07f,
                    0.3f,
                    72,
                    36
                    , 1));

            objects.get(5).getChildObject().get(13).scaleObject(0.3f, 0.3f, 0.3f);
            objects.get(5).getChildObject().get(13).translateObject(0.0f, 0.062f, -0.51f);

            //bagian moncong nosel ujung belakang
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.66f, 0.66f, 0.66f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.3f,
                    1f,
                    72,
                    36
                    , 9));

            objects.get(5).getChildObject().get(14).scaleObject(0.35f, 0.35f, 0.35f);
            objects.get(5).getChildObject().get(14).translateObject(0.0f, 0.5f, -0.07f);

            //bagian moncong tengah antara nosel
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.50f, 0.50f, 0.50f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.3f,
                    0.3f,
                    72,
                    36
                    , 9));

            objects.get(5).getChildObject().get(15).scaleObject(0.4f, 0.4f, 0.4f);
            objects.get(5).getChildObject().get(15).translateObject(0.0f, 0.5f, -0.33f);

            //bagian moncong nosel ujung depan
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.66f, 0.66f, 0.66f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.3f,
                    0.3f,
                    72,
                    36
                    , 9));

            objects.get(5).getChildObject().get(16).scaleObject(0.39f, 0.39f, 0.39f);
            objects.get(5).getChildObject().get(16).translateObject(0.0f, 0.5f, -0.37f);

            //bagian tengah kotak emas Horizontal
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.83f, 0.68f, 0.21f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    3.7f,
                    0.07f,
                    0.3f,
                    72,
                    36
                    , 1));

            objects.get(5).getChildObject().get(17).scaleObject(0.3f, 0.3f, 0.3f);
            objects.get(5).getChildObject().get(17).translateObject(0.0f, 0.062f, 0.0f);

            //bagian tengah kotak emas vertikal
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.83f, 0.68f, 0.21f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.07f,
                    3.7f,
                    72,
                    36
                    , 1));

            objects.get(5).getChildObject().get(18).scaleObject(0.3f, 0.3f, 0.3f);
            objects.get(5).getChildObject().get(18).translateObject(0.0f, 0.062f, 0.0f);

            //fondasi kotak abu tengah (CHILD)
            objects.get(5).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.66f, 0.66f, 0.66f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.56f,
                    0.05f,
                    0.56f,
                    36,
                    18
                    , 1));

            objects.get(5).getChildObject().get(19).scaleObject(2f, 2f, 2f);
            objects.get(5).getChildObject().get(19).translateObject(0.0f, 0.0f, 0.0f);

            //angin (berzier)
            objectsBerzier3.add(new Object(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(
                    ),
                    new Vector4f(1f, 1f, 1f, 1f)
            ));

            List<Vector3f> curPoints1 = objectsBerzier3.get(0).getVertices();
            objectsBerzier3.get(0).addVertices(new Vector3f(0.7f, 0.5f, 0f));
            objectsBerzier3.get(0).addVertices(new Vector3f(0f, 1f, 0f));
            objectsBerzier3.get(0).addVertices(new Vector3f(-0.7f, 0.5f, 0f));
            // objectsBerzier3.get(0).addVertices(new Vector3f(0f, 0.5f,-2.5f));
            objectsBerzier3.get(0).updateCurve(new ArrayList<>(curPoints1));
            objects.get(5).getChildObject().add(objectsBerzier3.get(0));

            //angin2 (berzier)
            objectsBerzier4.add(new Object(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(
                    ),
                    new Vector4f(1f, 1f, 1f, 1f)
            ));
            List<Vector3f> curPoints2 = objectsBerzier4.get(0).getVertices();
            objectsBerzier4.get(0).addVertices(new Vector3f(1, 0.7f, 0f));
            objectsBerzier4.get(0).addVertices(new Vector3f(0f, 1.3f, 0f));
            objectsBerzier4.get(0).addVertices(new Vector3f(-1f, 0.7f, 0f));
            // objectsBerzier3.get(0).addVertices(new Vector3f(0f, 0.5f,-2.5f));
            objectsBerzier4.get(0).updateCurve(new ArrayList<>(curPoints2));
            objects.get(5).getChildObject().add(objectsBerzier4.get(0));

        }

        //BOMB COC 2
        {
            //bomb-nya (sphere -> lingkaran)
            objects.add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0f, 0.0f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0f,
                    0f,
                    0f,
                    500,
                    500
                    , 2));
            objects.get(6).scaleObject(1f, 1f, 1f);

            //bagian atas bomb (kotak)
            objects.get(6).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.0f, 0.0f, 0.3f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.08f,
                    0.1f,
                    0.07f,
                    500,
                    500
                    , 1));

            objects.get(6).getChildObject().get(0).scaleObject(0.5f, 0.5f, 0.5f);
            objects.get(6).getChildObject().get(0).translateObject(0.0f, 0.1f, 0.0f);

            //kotak emas di sekitar bomb (4)
            //1
            objects.get(6).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.9f, 0.5f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.05f,
                    0.05f,
                    0.04f,
                    500,
                    500
                    , 1));

            objects.get(6).getChildObject().get(1).scaleObject(0.7f, 0.7f, 0.2f);
            objects.get(6).getChildObject().get(1).translateObject(0.0f, 0.0f, 0.105f);

            //2
            objects.get(6).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.9f, 0.5f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.05f,
                    0.05f,
                    0.05f,
                    500,
                    500
                    , 1));

            objects.get(6).getChildObject().get(2).scaleObject(0.7f, 0.7f, 0.2f);
            objects.get(6).getChildObject().get(2).translateObject(0.0f, 0.0f, -0.105f);

            //3
            objects.get(6).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.9f, 0.5f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.05f,
                    0.05f,
                    0.05f,
                    500,
                    500
                    , 1));

            objects.get(6).getChildObject().get(3).scaleObject(0.2f, 0.7f, 0.7f);
            objects.get(6).getChildObject().get(3).translateObject(0.105f, 0.0f, 0.0f);

            //4
            objects.get(6).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.9f, 0.5f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.05f,
                    0.05f,
                    0.05f,
                    500,
                    500
                    , 1));

            objects.get(6).getChildObject().get(4).scaleObject(0.2f, 0.7f, 0.7f);
            objects.get(6).getChildObject().get(4).translateObject(-0.105f, 0.0f, 0.0f);

            //duri bomb 1 depan
            objects.get(6).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.9f, 0.3f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.03f,
                    0.03f,
                    0.03f,
                    500,
                    500
                    , 12));

            objects.get(6).getChildObject().get(5).scaleObject(1f, 1f, 1f);
            objects.get(6).getChildObject().get(5).rotateObject(-300f, 1f, 0.0f, 0f);
            objects.get(6).getChildObject().get(5).translateObject(0.00020f, 0.0f, 0.109f);

            //duri bomb 2 belakang
            objects.get(6).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.9f, 0.3f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.03f,
                    0.03f,
                    0.03f,
                    500,
                    500
                    , 12));

            objects.get(6).getChildObject().get(6).scaleObject(1f, 1f, 1f);
            objects.get(6).getChildObject().get(6).rotateObject(300f, 1.0f, 0.0f, 0f);
//       objects.get(0).getChildObject().get(7).rotateObject(-900f, 0.0f, 1f, 0.0f);
//        objects.get(0).getChildObject().get(7).rotateObject(90f, 1f, 0.0f, 0f);
            objects.get(6).getChildObject().get(6).translateObject(-0.0002f, 0.0f, -0.111f);

            //duri bomb 3 kanan
            objects.get(6).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.9f, 0.3f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.03f,
                    0.03f,
                    0.03f,
                    500,
                    500
                    , 12));

            objects.get(6).getChildObject().get(7).scaleObject(1f, 1f, 1f);
            objects.get(6).getChildObject().get(7).rotateObject(300f, 0.0f, 0.0f, 1f);
//        objects.get(0).getChildObject().get(8).rotateObject(300f, 0.0f, 1f, 0.0f);
            objects.get(6).getChildObject().get(7).rotateObject(300f, 1f, 0.0f, 0f);
            objects.get(6).getChildObject().get(7).translateObject(0.11f, 0.f, 0f);

            //duri bomb 4 kiri
            objects.get(6).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.9f, 0.3f, 0.0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.03f,
                    0.03f,
                    0.03f,
                    500,
                    500
                    , 12));

            objects.get(6).getChildObject().get(8).scaleObject(1f, 1f, 1f);
            objects.get(6).getChildObject().get(8).rotateObject(-300f, 0.0f, 0.0f, 1f);
            objects.get(6).getChildObject().get(8).rotateObject(-300f, 1f, 0.0f, 0f);
            objects.get(6).getChildObject().get(8).translateObject(-0.111f, 0.f, 0f);

            //bola bomb
            objects.get(6).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(211 / 255f, 154 / 255f, 24 / 255f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.1f,
                    0.1f,
                    0.1f,
                    500,
                    500
                    , 2));

            objects.get(6).getChildObject().get(9).scaleObject(1f, 1f, 1f);
            objects.get(6).getChildObject().get(9).translateObject(0.0f, 0.0f, 0.0f);

            //bola tabung hitam
            objects.get(6).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0f, 0f, 0.3f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.102f,
                    0.06f,
                    0.102f,
                    500,
                    500
                    , 10));

            objects.get(6).getChildObject().get(10).scaleObject(1f, 1f, 1f);
            objects.get(6).getChildObject().get(10).translateObject(0.0f, 0.027f, 0.0f);

            //kurva pertama
            curveBezier2.add(new Object(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(
                    ),
                    new Vector4f(175 / 255f, 48 / 255f, 16 / 255f, 0.0f)
            ));

            List<Vector3f> curPointsChristo1 = curveBezier2.get(0).getVertices();
            curveBezier2.get(0).addVertices(new Vector3f(-0.1f, 0.025f, 0.00f));
            curveBezier2.get(0).addVertices(new Vector3f(0.06f, 0.1f, 0.00f));
            curveBezier2.get(0).addVertices(new Vector3f(-0.02f, 0.17f, 0.0f));
            curveBezier2.get(0).addVertices(new Vector3f(-0.005f, 0.2f, 0.0f));

            curveBezier2.get(0).updateCurve(new ArrayList<>(curPointsChristo1));

            objects.get(6).getChildObject().add(curveBezier2.get(0));

        }

        //BALON COC
        {
            //Fondasi Parrent (invisible)
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
            objects.get(7).scaleObject(0f, 0f, 0f);

            //Ballon lingkaran merah
            objects.get(7).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(1f, 0f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    1.5f,
                    1.5f,
                    1.5f,
                    72,
                    36
                    , 2));

            objects.get(7).getChildObject().get(0).scaleObject(1f, 1f, 1f);
            objects.get(7).getChildObject().get(0).translateObject(0f, 1f, 0f);

            //wadah skeleton tp gada skeleton oke, hehe
            objects.get(7).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.227f, 0.133f, 0.074f, 0.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.3f,
                    0.5f,
                    72,
                    36
                    , 14));

            objects.get(7).getChildObject().get(1).scaleObject(1f, 1f, 1f);
            objects.get(7).getChildObject().get(1).translateObject(0f, -2f, 0f);

            //tali kiri belakang
            objects.get(7).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.850f, 0.635f, 0.450f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.1f,
                    1.2f,
                    0.1f,
                    72,
                    36
                    , 1));

            objects.get(7).getChildObject().get(2).scaleObject(0.1f, 1f, 0.2f);
            objects.get(7).getChildObject().get(2).translateObject(-0.64f, -0.68f, 0.42f);
            objects.get(7).getChildObject().get(2).rotateObject(-50f, 0f, 0.0f, 1f);

            //tali kiri depan
            objects.get(7).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.850f, 0.635f, 0.450f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.1f,
                    1.2f,
                    0.1f,
                    72,
                    36
                    , 1));

            objects.get(7).getChildObject().get(3).scaleObject(0.1f, 1f, 0.2f);
            objects.get(7).getChildObject().get(3).translateObject(-0.64f, -0.68f, -0.42f);
            objects.get(7).getChildObject().get(3).rotateObject(-50f, 0f, 0.0f, 1f);

            //tali kanan belakang
            objects.get(7).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.850f, 0.635f, 0.450f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.1f,
                    1.2f,
                    0.1f,
                    72,
                    36
                    , 1));

            objects.get(7).getChildObject().get(4).scaleObject(0.1f, 1f, 0.2f);
            objects.get(7).getChildObject().get(4).translateObject(0.64f, -0.68f, 0.42f);
            objects.get(7).getChildObject().get(4).rotateObject(50f, 0f, 0.0f, 1f);

            //tali kanan depan
            objects.get(7).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.850f, 0.635f, 0.450f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.1f,
                    1.2f,
                    0.1f,
                    72,
                    36
                    , 1));

            objects.get(7).getChildObject().get(5).scaleObject(0.1f, 1f, 0.2f);
            objects.get(7).getChildObject().get(5).translateObject(0.64f, -0.68f, -0.42f);
            objects.get(7).getChildObject().get(5).rotateObject(50f, 0f, 0.0f, 1f);

            //wadah skeleton tp gada skeleton oke, hehe tp ini yg nigga ehehe2x
            objects.get(7).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0f, 0f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.5f,
                    0.3f,
                    0.5f,
                    72,
                    36
                    , 14));

            objects.get(7).getChildObject().get(6).scaleObject(0.9f, 0.1f, 0.9f);
            objects.get(7).getChildObject().get(6).translateObject(0f, -1.45f, 0f);


            //tmpt api
            objects.get(7).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0f, 0f, 0f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.3f,
                    0.1f,
                    0.3f,
                    72,
                    36
                    , 2));

            objects.get(7).getChildObject().get(7).scaleObject(0.9f, 0.1f, 0.9f);
            objects.get(7).getChildObject().get(7).translateObject(0f, -0.8f, 0f);

            //tali api kiri belakang
            objects.get(7).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.850f, 0.635f, 0.450f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.1f,
                    0.4f,
                    0.1f,
                    72,
                    36
                    , 1));

            objects.get(7).getChildObject().get(8).scaleObject(0.1f, 1f, 0.2f);
            objects.get(7).getChildObject().get(8).translateObject(-0.4f, -0.53f, 0.2f);
            objects.get(7).getChildObject().get(8).rotateObject(-50f, 0f, 0.0f, 1f);

            //tali api kiri depan
            objects.get(7).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.850f, 0.635f, 0.450f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.1f,
                    0.4f,
                    0.1f,
                    72,
                    36
                    , 1));

            objects.get(7).getChildObject().get(9).scaleObject(0.1f, 1f, 0.2f);
            objects.get(7).getChildObject().get(9).translateObject(-0.4f, -0.53f, -0.2f);
            objects.get(7).getChildObject().get(9).rotateObject(-50f, 0f, 0.0f, 1f);

            //tali api kanan belakang
            objects.get(7).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.850f, 0.635f, 0.450f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.1f,
                    0.4f,
                    0.1f,
                    72,
                    36
                    , 1));

            objects.get(7).getChildObject().get(10).scaleObject(0.1f, 1f, 0.2f);
            objects.get(7).getChildObject().get(10).translateObject(0.4f, -0.53f, 0.2f);
            objects.get(7).getChildObject().get(10).rotateObject(50f, 0f, 0.0f, 1f);

            //tali api kanan depan
            objects.get(7).getChildObject().add(new Sphere(
                    Arrays.asList(
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                            new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                    ),
                    new ArrayList<>(),
                    new Vector4f(0.850f, 0.635f, 0.450f, 1.0f),
                    Arrays.asList(0.0f, 0.0f, 0.0f),
                    0.1f,
                    0.4f,
                    0.1f,
                    72,
                    36
                    , 1));

            objects.get(7).getChildObject().get(11).scaleObject(0.1f, 1f, 0.2f);
            objects.get(7).getChildObject().get(11).translateObject(0.4f, -0.53f, -0.2f);
            objects.get(7).getChildObject().get(11).rotateObject(50f, 0f, 0.0f, 1f);

        }

        //Translasi dan Scaling Objek
        {
            //Cannon Kiri
            objects.get(0).translateObject(-1.5f, 0.1f, 0f);
            objects.get(0).scaleObject(2f, 2f, 2f);

            //Cannon Kanan
            objects.get(4).translateObject(1.5f, 0.1f, 0f);
            objects.get(4).scaleObject(2f, 2f, 2f);

            //Bomb 1
            objects.get(1).scaleObject(2f, 2f, 2f);
            objects.get(1).translateObject(0.6f, 0.2f, 2.3f);

            //Bomb 2
            objects.get(6).scaleObject(2f, 2f, 2f);
            objects.get(6).translateObject(-0.6f, 0.2f, 2.3f);

            //Air Sweeper Kiri Depan
            objects.get(2).translateObject(-5.75f, 1.2f, 6f);
            objects.get(2).scaleObject(0.50f, 0.50f, 0.50f);

            //Air Sweeper Kanan Depan
            objects.get(5).translateObject(5.75f, 1.2f, 6f);
            objects.get(5).scaleObject(0.50f, 0.50f, 0.50f);

            //Balon
            objects.get(7).translateObject(0f, 5f, -3f);
//                objects.get(7).scaleObject(0.50f, 0.50f, 0.50f);
        }

    }

    public void input() {
        //INPUT JOY
        {
            //Tembak Cannon 1
            if ((window.isKeyPressed(GLFW_KEY_V)) && !tembakPeluru) {
                tembakPeluru = true;
            }

            if (tembakPeluru) {
                objects.get(0).getChildObject().get(50).translateObject(rotateX, 0f, rotateZ);
            }

            //Recall Peluru 1
            if ((window.isKeyPressed(GLFW_KEY_C))) {
                objects.get(0).getChildObject().get(50).getModel().set(recallPeluru);
                objects.get(0).getChildObject().get(50).scaleObject(2.7f, 2.7f, 2.7f);
                objects.get(0).getChildObject().get(50).translateObject(-3.0f, 0.1f, 0.0f);

                tembakPeluru = false;
            }

            //No Hold 1
            if (loopNoHold > 0) {
                loopNoHold -= 1;
            }

            //MUTER KIRI CANNON 1
            if (window.isKeyPressed(GLFW_KEY_F) && loopNoHold == 0) {
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
                    objects.get(0).getChildObject().get(50).translateObject(0f, 0f, 0.01f);
                    panggilPeluru = false;
                }
            }

            //MUTER KANAN CANNON 1
            if (window.isKeyPressed(GLFW_KEY_G) && loopNoHold == 0) {
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
                    objects.get(0).getChildObject().get(50).translateObject(0f, 0f, 0.01f);
                    panggilPeluru = false;
                }
            }

            //Tembak Cannon 2
            if ((window.isKeyPressed(GLFW_KEY_4)) && !tembakPeluru2) {
                tembakPeluru2 = true;
            }

            if (tembakPeluru2) {
                objects.get(4).getChildObject().get(50).translateObject(rotateX2, 0f, rotateZ2);
            }

            //Recall Peluru 2
            if ((window.isKeyPressed(GLFW_KEY_3))) {
                objects.get(4).getChildObject().get(50).getModel().set(recallPeluru2);
                objects.get(4).getChildObject().get(50).scaleObject(2.7f, 2.7f, 2.7f);
                objects.get(4).getChildObject().get(50).translateObject(3.0f, 0.1f, 0.0f);

                tembakPeluru2 = false;
            }

            //No Hold 2
            if (loopNoHold2 > 0) {
                loopNoHold2 -= 1;
            }

            //MUTER KIRI CANNON 2
            if (window.isKeyPressed(GLFW_KEY_1) && loopNoHold2 == 0) {
                Vector3f tes = objects.get(0).getChildObject().get(7).getModel().transformPosition(new Vector3f(0f, 0f, 0f));
                objects.get(4).getChildObject().get(0).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(1).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(2).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(3).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(4).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(7).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(8).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(9).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(10).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(45).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(46).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(47).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(48).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(49).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, 1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));

                if (countRotate2 == 3) {
                    countRotate2 = 0;
                } else {
                    countRotate2 += 1;
                }
                if (countRotate2 == 1) {
                    rotateZ2 = 0;
                    rotateX2 = -0.05f;
                } else if (countRotate2 == 2) {
                    rotateX2 = 0;
                    rotateZ2 = 0.05f;
                } else if (countRotate2 == 3) {
                    rotateZ2 = 0;
                    rotateX2 = 0.05f;
                } else if (countRotate2 == 0) {
                    rotateX2 = 0;
                    rotateZ2 = -0.05f;
                }
                loopNoHold2 = 100;
                if (panggilPeluru2) {
                    objects.get(4).getChildObject().get(50).translateObject(0f, 0f, 0.01f);
                    panggilPeluru2 = false;
                }
            }

            //MUTER KANAN CANNON 2
            if (window.isKeyPressed(GLFW_KEY_2) && loopNoHold2 == 0) {
                objects.get(4).getChildObject().get(0).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(1).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(2).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(3).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(4).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(7).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(8).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(9).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(10).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(45).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(46).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(47).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(48).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));
                objects.get(4).getChildObject().get(49).rotateObjectOnPoint((float) Math.toRadians(90f), 0f, -1f, 0f, objects.get(4).getChildObject().get(1).getCenterPoint().get(0), objects.get(4).getChildObject().get(1).getCenterPoint().get(1), objects.get(4).getChildObject().get(1).getCenterPoint().get(2));

                if (countRotate2 == 0) {
                    countRotate2 = 3;
                } else {
                    countRotate2 -= 1;
                }
                if (countRotate2 == 1) {
                    rotateZ2 = 0;
                    rotateX2 = -0.05f;
                } else if (countRotate2 == 2) {
                    rotateX2 = 0;
                    rotateZ2 = 0.05f;
                } else if (countRotate2 == 3) {
                    rotateZ2 = 0;
                    rotateX2 = 0.05f;
                } else if (countRotate2 == 0) {
                    rotateX2 = 0;
                    rotateZ2 = -0.05f;
                }
                loopNoHold2 = 100;
                if (panggilPeluru2) {
                    objects.get(4).getChildObject().get(50).translateObject(0f, 0f, 0.01f);
                    panggilPeluru2 = false;
                }
            }


        }

        //INPUT CHRISTO
        {
            //Bomb Muter
            if (window.isKeyPressed(GLFW_KEY_5)) {
                //putar kiri kanan
                objects.get(1).getChildObject().get(0).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(1).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(2).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(3).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(4).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(5).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(6).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(7).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(8).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(9).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(10).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(11).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));

                //putar atas bawah
                objects.get(1).getChildObject().get(0).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(1).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(2).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(3).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(4).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(5).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(6).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(7).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(8).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(9).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(10).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(1).getChildObject().get(11).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(1).getChildObject().get(0).getCenterPoint().get(0), objects.get(1).getChildObject().get(0).getCenterPoint().get(1), objects.get(1).getChildObject().get(0).getCenterPoint().get(2));

                objects.get(6).getChildObject().get(0).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(1).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(2).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(3).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(4).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(5).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(6).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(7).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(8).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(9).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(10).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(11).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));

                //putar atas bawah
                objects.get(6).getChildObject().get(0).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(1).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(2).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(3).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(4).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(5).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(6).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(7).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(8).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(9).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(10).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(6).getChildObject().get(11).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(6).getChildObject().get(0).getCenterPoint().get(0), objects.get(6).getChildObject().get(0).getCenterPoint().get(1), objects.get(6).getChildObject().get(0).getCenterPoint().get(2));

            }

        }

        //INPUT MARTIN
        {
            if (window.isKeyPressed(GLFW_KEY_M)) {
                objects.get(2).getChildObject().get(9).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(2).getChildObject().get(0).getCenterPoint().get(0), objects.get(2).getChildObject().get(0).getCenterPoint().get(1), objects.get(2).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(2).getChildObject().get(14).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(2).getChildObject().get(0).getCenterPoint().get(0), objects.get(2).getChildObject().get(0).getCenterPoint().get(1), objects.get(2).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(2).getChildObject().get(15).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(2).getChildObject().get(0).getCenterPoint().get(0), objects.get(2).getChildObject().get(0).getCenterPoint().get(1), objects.get(2).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(2).getChildObject().get(16).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(2).getChildObject().get(0).getCenterPoint().get(0), objects.get(2).getChildObject().get(0).getCenterPoint().get(1), objects.get(2).getChildObject().get(0).getCenterPoint().get(2));

                objects.get(5).getChildObject().get(9).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(5).getChildObject().get(0).getCenterPoint().get(0), objects.get(5).getChildObject().get(0).getCenterPoint().get(1), objects.get(5).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(5).getChildObject().get(14).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(5).getChildObject().get(0).getCenterPoint().get(0), objects.get(5).getChildObject().get(0).getCenterPoint().get(1), objects.get(5).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(5).getChildObject().get(15).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(5).getChildObject().get(0).getCenterPoint().get(0), objects.get(5).getChildObject().get(0).getCenterPoint().get(1), objects.get(5).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(5).getChildObject().get(16).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(5).getChildObject().get(0).getCenterPoint().get(0), objects.get(5).getChildObject().get(0).getCenterPoint().get(1), objects.get(5).getChildObject().get(0).getCenterPoint().get(2));
            }

            if (window.isKeyPressed(GLFW_KEY_B)) {
                objects.get(2).getChildObject().get(20).rotateObjectOnPoint(0.010f, 1f, 0f, 0f, objects.get(2).getChildObject().get(0).getCenterPoint().get(0), objects.get(2).getChildObject().get(0).getCenterPoint().get(1), objects.get(2).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(2).getChildObject().get(21).rotateObjectOnPoint(0.010f, 1f, 0f, 0f, objects.get(2).getChildObject().get(0).getCenterPoint().get(0), objects.get(2).getChildObject().get(0).getCenterPoint().get(1), objects.get(2).getChildObject().get(0).getCenterPoint().get(2));

                objects.get(5).getChildObject().get(20).rotateObjectOnPoint(0.010f, 1f, 0f, 0f, objects.get(5).getChildObject().get(0).getCenterPoint().get(0), objects.get(5).getChildObject().get(0).getCenterPoint().get(1), objects.get(5).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(5).getChildObject().get(21).rotateObjectOnPoint(0.010f, 1f, 0f, 0f, objects.get(5).getChildObject().get(0).getCenterPoint().get(0), objects.get(5).getChildObject().get(0).getCenterPoint().get(1), objects.get(5).getChildObject().get(0).getCenterPoint().get(2));
            }
        }

        //WASD + QE
        {
            if (window.isKeyPressed(GLFW_KEY_W)) {
                camera.addRotation((float) Math.toRadians(0.1), (float) Math.toRadians(0));
            }

            if (window.isKeyPressed(GLFW_KEY_S)) {
                camera.addRotation((float) Math.toRadians(-0.1), (float) Math.toRadians(0));
            }

            if (window.isKeyPressed(GLFW_KEY_A)) {
                camera.addRotation((float) Math.toRadians(0), (float) Math.toRadians(0.1));
            }

            if (window.isKeyPressed(GLFW_KEY_D)) {
                camera.addRotation((float) Math.toRadians(0), (float) Math.toRadians(-0.1));
            }

//            if (window.isKeyPressed(GLFW_KEY_W)) {
//                for (Object i : objects) {
//                    i.rotateObjectOnPoint(0.010f, 1f, 0f, 0f, 0, 0, 0);
//                }
//            }
//
//            if (window.isKeyPressed(GLFW_KEY_S)) {
//                for (Object i : objects) {
//                    i.rotateObjectOnPoint(-0.010f, 1f, 0f, 0f, 0, 0, 0);
//                }
//            }
//
//            if (window.isKeyPressed(GLFW_KEY_A)) {
//                for (Object i : objects) {
//                    i.rotateObjectOnPoint(0.010f, 0f, 1f, 0f, 0, 0, 0);
//                }
//            }
//
//            if (window.isKeyPressed(GLFW_KEY_D)) {
//                for (Object i : objects) {
//                    i.rotateObjectOnPoint(-0.010f, 0f, 1f, 0f, 0, 0, 0);
//                }
//            }

        }

        //IJKL + SHIFT + CTRTL
        {
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

//            if (window.isKeyPressed(GLFW_KEY_I)) {
//                for (Object i : objects) {
//                    i.translateObject(0f, 0.01f, 0f);
//                }
//            }
//
//            if (window.isKeyPressed(GLFW_KEY_K)) {
//                for (Object i : objects) {
//                    i.translateObject(0f, -0.01f, 0f);
//                }
//            }
//
//            if (window.isKeyPressed(GLFW_KEY_J)) {
//                for (Object i : objects) {
//                    i.translateObject(-0.01f, 0f, 0f);
//                }
//            }
//
//            if (window.isKeyPressed(GLFW_KEY_L)) {
//                for (Object i : objects) {
//                    i.translateObject(0.01f, 0f, 0f);
//                }
//            }

            if (window.isKeyPressed(GLFW_KEY_LEFT_SHIFT)) {
                camera.moveForward(0.010f);
            }

            if (window.isKeyPressed(GLFW_KEY_LEFT_CONTROL)) {
                camera.moveBackwards(0.010f);
            }

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
            for (Object objectCurve : curveBezierJoy5) {
                objectCurve.drawCurve(camera, projection);
            }
            for (Object objectCurve : curveBezierJoy6) {
                objectCurve.drawCurve(camera, projection);
            }
            for (Object objectCurve : curveBezierJoy7) {
                objectCurve.drawCurve(camera, projection);
            }
            for (Object objectCurve : curveBezierJoy8) {
                objectCurve.drawCurve(camera, projection);
            }
            for (Object objectCurve : curveBezierJoy9) {
                objectCurve.drawCurve(camera, projection);
            }
            for (Object objectCurve : curveBezierJoy10) {
                objectCurve.drawCurve(camera, projection);
            }
            for (Object objectCurve : curveBezierJoy11) {
                objectCurve.drawCurve(camera, projection);
            }
            for (Object objectCurve : curveBezierJoy12) {
                objectCurve.drawCurve(camera, projection);
            }
            for (Object objectCurve : curveBezierJoy13) {
                objectCurve.drawCurve(camera, projection);
            }
            for (Object objectCurve : curveBezierJoy14) {
                objectCurve.drawCurve(camera, projection);
            }
            for (Object objectCurve : curveBezierJoy15) {
                objectCurve.drawCurve(camera, projection);
            }
            for (Object objectCurve : curveBezierJoy16) {
                objectCurve.drawCurve(camera, projection);
            }


            for (Object curveObject : curveBezier) {
                curveObject.drawCurveForLineStrip(camera, projection);
            }
            for (Object curveObject : curveBezier2) {
                curveObject.drawCurveForLineStrip(camera, projection);
            }


            for (Object object : objectsBerzier) {
                object.drawCurveForLineStrip(camera, projection);
            }
            for (Object object : objectsBerzier2) {
                object.drawCurveForLineStrip(camera, projection);
            }
            for (Object object : objectsBerzier3) {
                object.drawCurveForLineStrip(camera, projection);
            }
            for (Object object : objectsBerzier4) {
                object.drawCurveForLineStrip(camera, projection);
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
        new Main().run();
    }
}