package org.example;

import Engine.*;
import Engine.Object;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL30.*;

public class MainChristo {
    private Window window =
            new Window
                    (800, 800, "Trap Bomb COC");
    private ArrayList<Object> objects
            = new ArrayList<>();
    private ArrayList<Object> objectsSkull
            = new ArrayList<>();
    private ArrayList<Object> objectsSkull2
            = new ArrayList<>();
    private ArrayList<Object> objectsSkull3
            = new ArrayList<>();
    private ArrayList<Object> curveBezier
            = new ArrayList<>();
    private MouseInput mouseInput;
    Projection projection = new Projection(window.getWidth(), window.getHeight());
    Camera camera = new Camera();

    public void init() {
        window.init();
        GL.createCapabilities();
        mouseInput = window.getMouseInput();
        camera.setPosition(0f, 0f, 0.5f);
        camera.setRotation((float) Math.toRadians(0.0f), (float) Math.toRadians(0.0f));

        //OBJECT BOMB COC

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
        objects.get(0).scaleObject(1f, 1f, 1f);

        //bagian atas bomb (kotak)
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(0).scaleObject(0.5f, 0.5f, 0.5f);
        objects.get(0).getChildObject().get(0).translateObject(0.0f, 0.1f, 0.0f);

        //kotak emas di sekitar bomb (4)
        //1
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(1).scaleObject(0.7f, 0.7f, 0.2f);
        objects.get(0).getChildObject().get(1).translateObject(0.0f, 0.0f, 0.105f);

        //2
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(2).scaleObject(0.7f, 0.7f, 0.2f);
        objects.get(0).getChildObject().get(2).translateObject(0.0f, 0.0f, -0.105f);

        //3
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(3).scaleObject(0.2f, 0.7f, 0.7f);
        objects.get(0).getChildObject().get(3).translateObject(0.105f, 0.0f, 0.0f);

        //4
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(4).scaleObject(0.2f, 0.7f, 0.7f);
        objects.get(0).getChildObject().get(4).translateObject(-0.105f, 0.0f, 0.0f);

        //duri bomb 1 depan
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(5).scaleObject(1f, 1f, 1f);
        objects.get(0).getChildObject().get(5).rotateObject(-300f, 1f, 0.0f, 0f);
        objects.get(0).getChildObject().get(5).translateObject(0.00020f, 0.0f, 0.109f);

        //duri bomb 2 belakang
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(6).scaleObject(1f, 1f, 1f);
        objects.get(0).getChildObject().get(6).rotateObject(300f, 1.0f, 0.0f, 0f);
//       objects.get(0).getChildObject().get(7).rotateObject(-900f, 0.0f, 1f, 0.0f);
//        objects.get(0).getChildObject().get(7).rotateObject(90f, 1f, 0.0f, 0f);
        objects.get(0).getChildObject().get(6).translateObject(-0.0002f, 0.0f, -0.111f);

        //duri bomb 3 kanan
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(7).scaleObject(1f, 1f, 1f);
        objects.get(0).getChildObject().get(7).rotateObject(300f, 0.0f, 0.0f, 1f);
//        objects.get(0).getChildObject().get(8).rotateObject(300f, 0.0f, 1f, 0.0f);
        objects.get(0).getChildObject().get(7).rotateObject(300f, 1f, 0.0f, 0f);
        objects.get(0).getChildObject().get(7).translateObject(0.11f, 0.f, 0f);

        //duri bomb 4 kiri
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(8).scaleObject(1f, 1f, 1f);
        objects.get(0).getChildObject().get(8).rotateObject(-300f, 0.0f, 0.0f, 1f);
//        objects.get(0).getChildObject().get(9).rotateObject(300f, 0.0f, 1f, 0.0f);
        objects.get(0).getChildObject().get(8).rotateObject(-300f, 1f, 0.0f, 0f);
        objects.get(0).getChildObject().get(8).translateObject(-0.111f, 0.f, 0f);

        //bola bomb
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(9).scaleObject(1f, 1f, 1f);
        objects.get(0).getChildObject().get(9).translateObject(0.0f, 0.0f, 0.0f);

        //bola tabung hitam
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(10).scaleObject(1f, 1f, 1f);
        objects.get(0).getChildObject().get(10).translateObject(0.0f, 0.027f, 0.0f);

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

        List<Vector3f> curPoints1 = curveBezier.get(0).getVertices();
        curveBezier.get(0).addVertices(new Vector3f(-0.1f, 0.025f, 0.00f));
        curveBezier.get(0).addVertices(new Vector3f(0.06f, 0.1f, 0.00f));
        curveBezier.get(0).addVertices(new Vector3f(-0.02f, 0.17f, 0.0f));
        curveBezier.get(0).addVertices(new Vector3f(-0.005f, 0.2f, 0.0f));

        curveBezier.get(0).updateCurve(new ArrayList<>(curPoints1));

        objects.get(0).getChildObject().add(curveBezier.get(0));

        //KEPALA TENGKORAK 1 ================================================================================================

        //bagian atas tengkorak
        objectsSkull.add(new Sphere(
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
        objectsSkull.get(0).scaleObject(1f, 1f, 1f);


        //bagian atas tengkorak
        objectsSkull.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.04f,
                0.04f,
                0.1f,
                500,
                500
                , 2));

        objectsSkull.get(0).getChildObject().get(0).scaleObject(1f, 1f, 0.4f);
        objectsSkull.get(0).getChildObject().get(0).translateObject(0.0f, 0.29f, 0.0f);

        //bagian tengah tengkorak
        objectsSkull.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.04f,
                0.06f,
                0.1f,
                500,
                500
                , 10));

        objectsSkull.get(0).getChildObject().get(1).scaleObject(1f, 1f, 0.4f);
        objectsSkull.get(0).getChildObject().get(1).translateObject(0.0f, 0.29f, 0.0f);

        //bagian lubang mata kiri
        objectsSkull.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.2f, 0.2f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.01f,
                0.01f,
                0.03f,
                500,
                500
                , 2));

        objectsSkull.get(0).getChildObject().get(2).scaleObject(1f, 1f, 0.4f);
        objectsSkull.get(0).getChildObject().get(2).translateObject(-0.015f, 0.25f, 0.1f);

        //bagian lubang mata kanan
        objectsSkull.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.2f, 0.2f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.01f,
                0.01f,
                0.03f,
                500,
                500
                , 2));

        objectsSkull.get(0).getChildObject().get(3).scaleObject(1f, 1f, 0.4f);
        objectsSkull.get(0).getChildObject().get(3).translateObject(0.015f, 0.25f, 0.1f);

        // bagian lubang mulut
        objectsSkull.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.2f, 0.2f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.01f,
                0.017f,
                0.03f,
                500,
                500
                , 2));

        objectsSkull.get(0).getChildObject().get(4).scaleObject(1f, 1f, 0.4f);
        objectsSkull.get(0).getChildObject().get(4).translateObject(0.f, 0.2123f, 0.1f);

        //KEPALA TENGKORAK 2================================================================================================

        //bagian atas tengkorak
        objectsSkull2.add(new Sphere(
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
        objectsSkull2.get(0).scaleObject(1f, 1f, 1f);

        //bagian atas tengkorak
        objectsSkull2.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.04f,
                0.04f,
                0.1f,
                500,
                500
                , 2));

        objectsSkull2.get(0).getChildObject().get(0).scaleObject(1f, 1f, 0.4f);
        objectsSkull2.get(0).getChildObject().get(0).translateObject(0.0f, 0.29f, 0.0f);

        //bagian tengah tengkorak
        objectsSkull2.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.04f,
                0.06f,
                0.1f,
                500,
                500
                , 10));

        objectsSkull2.get(0).getChildObject().get(1).scaleObject(1f, 1f, 0.4f);
        objectsSkull2.get(0).getChildObject().get(1).translateObject(0.0f, 0.29f, 0.0f);

        //bagian lubang mata kiri
        objectsSkull2.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.2f, 0.2f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.01f,
                0.01f,
                0.03f,
                500,
                500
                , 2));

        objectsSkull2.get(0).getChildObject().get(2).scaleObject(1f, 1f, 0.4f);
        objectsSkull2.get(0).getChildObject().get(2).translateObject(-0.015f, 0.25f, 0.1f);

        //bagian lubang mata kanan
        objectsSkull2.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.2f, 0.2f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.01f,
                0.01f,
                0.03f,
                500,
                500
                , 2));

        objectsSkull2.get(0).getChildObject().get(3).scaleObject(1f, 1f, 0.4f);
        objectsSkull2.get(0).getChildObject().get(3).translateObject(0.015f, 0.25f, 0.1f);

        // bagian lubang mulut
        objectsSkull2.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.2f, 0.2f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.01f,
                0.017f,
                0.03f,
                500,
                500
                , 2));

        objectsSkull2.get(0).getChildObject().get(4).scaleObject(1f, 1f, 0.4f);
        objectsSkull2.get(0).getChildObject().get(4).translateObject(0.f, 0.2123f, 0.1f);

        //KEPALA TENGKORAK 3 ================================================================================================

        //bagian atas tengkorak
        objectsSkull3.add(new Sphere(
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
        objectsSkull3.get(0).scaleObject(1f, 1f, 1f);

        //bagian atas tengkorak
        objectsSkull3.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.04f,
                0.04f,
                0.1f,
                500,
                500
                , 2));

        objectsSkull3.get(0).getChildObject().get(0).scaleObject(1f, 1f, 0.4f);
        objectsSkull3.get(0).getChildObject().get(0).translateObject(0.0f, 0.29f, 0.0f);

        //bagian tengah tengkorak
        objectsSkull3.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.04f,
                0.06f,
                0.1f,
                500,
                500
                , 10));

        objectsSkull3.get(0).getChildObject().get(1).scaleObject(1f, 1f, 0.4f);
        objectsSkull3.get(0).getChildObject().get(1).translateObject(0.0f, 0.29f, 0.0f);

        //bagian lubang mata kiri
        objectsSkull3.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.2f, 0.2f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.01f,
                0.01f,
                0.03f,
                500,
                500
                , 2));

        objectsSkull3.get(0).getChildObject().get(2).scaleObject(1f, 1f, 0.4f);
        objectsSkull3.get(0).getChildObject().get(2).translateObject(-0.015f, 0.25f, 0.1f);

        //bagian lubang mata kanan
        objectsSkull3.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.2f, 0.2f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.01f,
                0.01f,
                0.03f,
                500,
                500
                , 2));

        objectsSkull3.get(0).getChildObject().get(3).scaleObject(1f, 1f, 0.4f);
        objectsSkull3.get(0).getChildObject().get(3).translateObject(0.015f, 0.25f, 0.1f);

        // bagian lubang mulut
        objectsSkull3.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.2f, 0.2f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.01f,
                0.017f,
                0.03f,
                500,
                500
                , 2));

        objectsSkull3.get(0).getChildObject().get(4).scaleObject(1f, 1f, 0.4f);
        objectsSkull3.get(0).getChildObject().get(4).translateObject(0.f, 0.2123f, 0.1f);

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
        objects.get(0).getChildObject().get(12).scaleObject(1f, 1f, 1f);
        objects.get(0).getChildObject().get(12).translateObject(0f, -0.16f, 0f);

    }

    public void input() {

        {
            if (window.isKeyPressed(GLFW_KEY_Q)) {
                for (Object i : objects) {
                    i.rotateObjectOnPoint(0.01f, 0f, 0f, 1f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
                }
            }

            if (window.isKeyPressed(GLFW_KEY_E)) {
                for (Object i : objects) {
                    i.rotateObjectOnPoint(-0.01f, 0f, 0f, 1f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
                }
            }

            if (window.isKeyPressed(GLFW_KEY_W)) {
                for (Object i : objects) {
                    i.rotateObjectOnPoint(0.01f, 1f, 0f, 0f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
                }
            }

            if (window.isKeyPressed(GLFW_KEY_S)) {
                for (Object i : objects) {
                    i.rotateObjectOnPoint(-0.01f, 1f, 0f, 0f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
                }
            }

            if (window.isKeyPressed(GLFW_KEY_A)) {
                for (Object i : objects) {
                    i.rotateObjectOnPoint(0.01f, 0f, 1f, 0f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
                }
            }

            if (window.isKeyPressed(GLFW_KEY_D)) {
                for (Object i : objects) {
                    i.rotateObjectOnPoint(-0.01f, 0f, 1f, 0f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
                }
            }
        }

        {
            if (window.isKeyPressed(GLFW_KEY_1))    //up
            {
                for (Object i : objectsSkull) {
                    i.translateObject(0f, 0.001f, 0f);
                }
            }

            if (window.isKeyPressed(GLFW_KEY_2))  //down
            {
                for (Object i : objectsSkull) {
                    i.translateObject(0f, -0.001f, 0f);
                }
            }

            if (window.isKeyPressed(GLFW_KEY_3))  //left
            {
                for (Object i : objectsSkull) {
                    i.translateObject(-0.001f, 0f, 0f);
                }
            }

            if (window.isKeyPressed(GLFW_KEY_4)) {   //right
                for (Object i : objectsSkull) {
                    i.translateObject(0.001f, 0f, 0f);
                }
            }

            if (window.isKeyPressed(GLFW_KEY_1))    //up
            {
                for (Object i : objectsSkull2) {
                    i.translateObject(0f, 0.001f, 0f);
                }
            }

            if (window.isKeyPressed(GLFW_KEY_2))  //down
            {
                for (Object i : objectsSkull2) {
                    i.translateObject(0f, -0.001f, 0f);
                }
            }

            if (window.isKeyPressed(GLFW_KEY_3))  //left
            {
                for (Object i : objectsSkull2) {
                    i.translateObject(0.001f, 0f, 0f);
                }
            }

            if (window.isKeyPressed(GLFW_KEY_4)) {   //right
                for (Object i : objectsSkull2) {
                    i.translateObject(-0.001f, 0f, 0f);
                }
            }
            if (window.isKeyPressed(GLFW_KEY_SPACE)) {   //gone
                for (Object i : objectsSkull3) {    //tengah
                    i.translateObject(0f, 0.0005f, 0f);
                }
                for (Object i : objectsSkull2) {    //kiri
                    i.translateObject(-0.0005f, 0.0005f, 0f);
                }
                for (Object i : objectsSkull) {     //kanan
                    i.translateObject(0.0005f, 0.0005f, 0f);
                }
                //putar kiri kanan
                objects.get(0).getChildObject().get(0).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(1).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(2).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(3).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(4).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(5).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(6).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(7).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(8).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(9).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(10).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(11).rotateObjectOnPoint(0.010f, 0f, 1f, 0f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));

                //putar atas bawah
                objects.get(0).getChildObject().get(0).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(1).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(2).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(3).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(4).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(5).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(6).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(7).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(8).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(9).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(10).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
                objects.get(0).getChildObject().get(11).rotateObjectOnPoint(0.003f, 0f, 0f, 1f, objects.get(0).getChildObject().get(0).getCenterPoint().get(0), objects.get(0).getChildObject().get(0).getCenterPoint().get(1), objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
            }

            if (window.isKeyPressed(GLFW_KEY_6)) {
                objects.get(0).getChildObject().get(0).scaleObject(0.8f, 0.8f, -0.8f);
                objects.get(0).getChildObject().get(1).scaleObject(0.8f, 0.8f, -0.8f);
                objects.get(0).getChildObject().get(2).scaleObject(0.8f, 0.8f, -0.8f);
                objects.get(0).getChildObject().get(3).scaleObject(0.8f, 0.8f, -0.8f);
                objects.get(0).getChildObject().get(4).scaleObject(0.8f, 0.8f, -0.8f);
                objects.get(0).getChildObject().get(5).scaleObject(0.8f, 0.8f, -0.8f);
                objects.get(0).getChildObject().get(6).scaleObject(0.8f, 0.8f, -0.8f);
                objects.get(0).getChildObject().get(7).scaleObject(0.8f, 0.8f, -0.8f);
                objects.get(0).getChildObject().get(8).scaleObject(0.8f, 0.8f, -0.8f);
                objects.get(0).getChildObject().get(9).scaleObject(0.8f, 0.8f, -0.8f);
                objects.get(0).getChildObject().get(10).scaleObject(0.8f, 0.8f, -0.8f);
                objects.get(0).getChildObject().get(11).scaleObject(0.8f, 0.8f, -0.8f);
            }
            if (window.isKeyPressed(GLFW_KEY_7)) {
                objects.get(0).getChildObject().get(0).scaleObject(1.2f, 1.2f, 1.2f);
                objects.get(0).getChildObject().get(1).scaleObject(1.2f, 1.2f, 1.2f);
                objects.get(0).getChildObject().get(2).scaleObject(1.2f, 1.2f, 1.2f);
                objects.get(0).getChildObject().get(3).scaleObject(1.2f, 1.2f, 1.2f);
                objects.get(0).getChildObject().get(4).scaleObject(1.2f, 1.2f, 1.2f);
                objects.get(0).getChildObject().get(5).scaleObject(1.2f, 1.2f, 1.2f);
                objects.get(0).getChildObject().get(6).scaleObject(1.2f, 1.2f, 1.2f);
                objects.get(0).getChildObject().get(7).scaleObject(1.2f, 1.2f, 1.2f);
                objects.get(0).getChildObject().get(8).scaleObject(1.2f, 1.2f, 1.2f);
                objects.get(0).getChildObject().get(9).scaleObject(1.2f, 1.2f, 1.2f);
                objects.get(0).getChildObject().get(10).scaleObject(1.2f, 1.2f, 1.2f);
                objects.get(0).getChildObject().get(11).scaleObject(1.2f, 1.2f, 1.2f);
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
                    i.translateObject(0f, 0.001f, 0f);
                }
            }

            if (window.isKeyPressed(GLFW_KEY_K)) {
                for (Object i : objects) {
                    i.translateObject(0f, -0.001f, 0f);
                }
            }

            if (window.isKeyPressed(GLFW_KEY_J)) {
                for (Object i : objects) {
                    i.translateObject(-0.001f, 0f, 0f);
                }
            }

            if (window.isKeyPressed(GLFW_KEY_L)) {
                for (Object i : objects) {
                    i.translateObject(0.001f, 0f, 0f);
                }
            }
        }

        if (window.isKeyPressed(GLFW_KEY_LEFT_SHIFT)) {
            camera.moveForward(0.02f);
        }

        if (window.isKeyPressed(GLFW_KEY_LEFT_CONTROL)) {
            camera.moveBackwards(0.02f);
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
            for (Object objectSkull : objectsSkull) {
                objectSkull.draw(camera, projection);
            }
            for (Object objectSkull2 : objectsSkull2) {
                objectSkull2.draw(camera, projection);
            }
            for (Object objectSkull3 : objectsSkull3) {
                objectSkull3.draw(camera, projection);
            }
            for (Object curveObject : curveBezier) {
                curveObject.drawCurveForLineStrip(camera, projection);
            }
//            for(Object object: objectsRectangle){
//                object.draw();
//            }
//            for(Object object: objectsPointsControl){
//                object.drawLine();
//            }

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
        new MainChristo().run();
    }
}