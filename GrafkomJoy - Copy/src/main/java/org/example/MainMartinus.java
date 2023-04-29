package org.example;

import Engine.*;
import Engine.Object;
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

public class MainMartinus {
    private Window window =
            new Window
                    (800,800,"Air Sweeper COC ");
    private ArrayList<Object> objects
            = new ArrayList<>();
    private ArrayList<Object> objectsRectangle
            = new ArrayList<>();

    private ArrayList<Object> objectsPointsControl
            = new ArrayList<>();

    private ArrayList<Object> objectsBerzier
            = new ArrayList<>();
    private ArrayList<Object> objectsBerzier2
            = new ArrayList<>();


    private MouseInput mouseInput;
    int countDegree = 0;
    Projection projection = new Projection(window.getWidth(),window.getHeight());
    Camera camera = new Camera();
    public void init(){
        window.init();
        GL.createCapabilities();
        mouseInput = window.getMouseInput();
        camera.setPosition(0f,0f,0.5f);
        camera.setRotation((float)Math.toRadians(0.0f),(float)Math.toRadians(0.0f));

        //Fondasi air sweeper (abu)
        objects.add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f,0f,0f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.1f,
                0.1f,
                0.1f,
                36,
                18
                ,1));
//        objects.get(0).scaleObject(0f,0f,0f);

        //pump hexa merah
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(0).scaleObject(0.6f, 0.6f, 0.6f);
        objects.get(0).getChildObject().get(0).translateObject(0f,-0.75f, 0f);

//        //bagian tabung (merah)
//        objects.get(0).getChildObject().add(new Sphere(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1f, 0f, 0f, 1.0f),
//                Arrays.asList(0.0f, 0.0f, 0.0f),
//                0.7f,
//                1.2f,
//                0.7f,
//                72,
//                36
//                , 10));
//
//        objects.get(0).getChildObject().get(0).scaleObject(0.6f, 0.6f, 0.6f);
//        objects.get(0).getChildObject().get(0).translateObject(0.0f,-0.05f, 0.0f);

        //bagian kaki kiri belakang
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(1).scaleObject(1.5f, 1.8f, 1.62f);
        objects.get(0).getChildObject().get(1).rotateObject(50f,0f,0.0f,1f);
        objects.get(0).getChildObject().get(1).translateObject(-0.47f,-0.55f, 0.47f);


        //bagian kaki kanan belakang
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(2).scaleObject(1.5f, 1.8f, 1.62f);
        objects.get(0).getChildObject().get(2).rotateObject(-50f,0f,0.0f,1f);
        objects.get(0).getChildObject().get(2).translateObject(0.47f,-0.55f, 0.47f);

        //bagian kaki kiri depan
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(3).scaleObject(1.5f, 1.8f, 1.62f);
        objects.get(0).getChildObject().get(3).rotateObject(-50f,0f,0.0f,-1f);
        objects.get(0).getChildObject().get(3).translateObject(-0.47f,-0.55f, -0.47f);

        //bagian kaki kanan depan
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(4).scaleObject(1.5f, 1.8f, 1.62f);
        objects.get(0).getChildObject().get(4).rotateObject(-50f,0f,0.0f,1f);
        objects.get(0).getChildObject().get(4).translateObject(0.47f,-0.55f, -0.47f);

        //bagian lingkaran atas (merah)
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(5).scaleObject(0.55f, 0.55f, 0.55f);
        objects.get(0).getChildObject().get(5).translateObject(0.0f,0.1f, 0.0f);

        //bagian hexa bawah (emas)
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(6).scaleObject(0.62f, 0.33f, 0.62f);
        objects.get(0).getChildObject().get(6).translateObject(0.0f,-0.81f, 0.0f);

        //bagian nosel lingkaran bawah
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(7).scaleObject(0.4f, 0.4f, 0.4f);
        objects.get(0).getChildObject().get(7).translateObject(0.0f,0.2f, 0.0f);

        //bagian nosel lingkaran atas
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(8).scaleObject(0.3f, 0.3f, 0.3f);
        objects.get(0).getChildObject().get(8).translateObject(0.0f,0.27f, 0.0f);

        //bagian nosel atasnya lagi
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(9).scaleObject(0.4f, 0.4f, 0.4f);
        objects.get(0).getChildObject().get(9).translateObject(0.0f,0.63f, 0.0f);

        //bagian pinggir kotak emas kiri
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(10).scaleObject(0.3f, 0.3f, 0.3f);
        objects.get(0).getChildObject().get(10).translateObject(-0.51f,0.062f, 0.0f);

        //bagian pinggir kotak emas kanan
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(11).scaleObject(0.3f, 0.3f, 0.3f);
        objects.get(0).getChildObject().get(11).translateObject(0.51f,0.062f, 0.0f);

        //bagian pinggir kotak emas belakang
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(12).scaleObject(0.3f, 0.3f, 0.3f);
        objects.get(0).getChildObject().get(12).translateObject(0.0f,0.062f, 0.51f);

        //bagian pinggir kotak emas depan
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(13).scaleObject(0.3f, 0.3f, 0.3f);
        objects.get(0).getChildObject().get(13).translateObject(0.0f,0.062f, -0.51f);

        //bagian moncong nosel ujung belakang
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(14).scaleObject(0.35f, 0.35f, 0.35f);
        objects.get(0).getChildObject().get(14).translateObject(0.0f,0.5f, -0.07f);

        //bagian moncong tengah antara nosel
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(15).scaleObject(0.4f, 0.4f, 0.4f);
        objects.get(0).getChildObject().get(15).translateObject(0.0f,0.5f, -0.33f);

        //bagian moncong nosel ujung depan
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(16).scaleObject(0.39f, 0.39f, 0.39f);
        objects.get(0).getChildObject().get(16).translateObject(0.0f,0.5f, -0.37f);


        //bagian tengah kotak emas Horizontal
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(17).scaleObject(0.3f, 0.3f, 0.3f);
        objects.get(0).getChildObject().get(17).translateObject(0.0f,0.062f, 0.0f);

        //bagian tengah kotak emas vertikal
        objects.get(0).getChildObject().add(new Sphere(
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

        objects.get(0).getChildObject().get(18).scaleObject(0.3f, 0.3f, 0.3f);
        objects.get(0).getChildObject().get(18).translateObject(0.0f,0.062f, 0.0f);

        //fondasi kotak abu tengah (CHILD)
        objects.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.66f,0.66f,0.66f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.56f,
                0.05f,
                0.56f,
                36,
                18
                ,1));

        objects.get(0).getChildObject().get(19).scaleObject(2f, 2f, 2f);
        objects.get(0).getChildObject().get(19).translateObject(0.0f,0.0f, 0.0f);

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
        objectsBerzier.get(0).addVertices(new Vector3f(0f, 1f,0f));
        objectsBerzier.get(0).addVertices(new Vector3f(-0.7f, 0.5f,0f));
        // objectsBerzier.get(0).addVertices(new Vector3f(0f, 0.5f,-2.5f));
        objectsBerzier.get(0).updateCurve(new ArrayList<>(curPoints1));
        objects.get(0).getChildObject().add(objectsBerzier.get(0));


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
        objectsBerzier2.get(0).addVertices(new Vector3f(0f, 1.3f,0f));
        objectsBerzier2.get(0).addVertices(new Vector3f(-1f, 0.7f,0f));
        // objectsBerzier.get(0).addVertices(new Vector3f(0f, 0.5f,-2.5f));
        objectsBerzier2.get(0).updateCurve(new ArrayList<>(curPoints2));
        objects.get(0).getChildObject().add(objectsBerzier2.get(0));

        //      Rumput
        objects.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 1f, 0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                4f,
                0.3f,
                4f,
                36,
                18
                , 1));
        objects.get(0).getChildObject().get(22).scaleObject(1f, 1f, 1f);
        objects.get(0).getChildObject().get(22).translateObject(0f, -1.2f, 0f);





        objects.get(0).scaleObject(0.01f, 0.01f, 0.01f);
    }
    public void input() {

        {
            if(window.isKeyPressed(GLFW_KEY_Q))
            {
                for (Object i: objects)
                {
                    i.rotateObjectOnPoint(0.01f, 0f, 0f, 1f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
                }
            }

            if(window.isKeyPressed(GLFW_KEY_E))
            {
                for (Object i: objects)
                {
                    i.rotateObjectOnPoint(-0.01f, 0f, 0f, 1f , i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
                }
            }

            if(window.isKeyPressed(GLFW_KEY_W))
            {
                for (Object i: objects)
                {
                    i.rotateObjectOnPoint(0.01f, 1f, 0f, 0f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
                }
            }

            if(window.isKeyPressed(GLFW_KEY_S))
            {
                for (Object i: objects)
                {
                    i.rotateObjectOnPoint(-0.01f, 1f, 0f, 0f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
                }
            }

            if(window.isKeyPressed(GLFW_KEY_A))
            {
                for (Object i: objects)
                {
                    i.rotateObjectOnPoint(0.01f, 0f, 1f, 0f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
                }
            }

            if(window.isKeyPressed(GLFW_KEY_D))
            {
                for (Object i: objects)
                {
                    i.rotateObjectOnPoint(-0.01f, 0f, 1f, 0f, i.getCenterPoint().get(0), i.getCenterPoint().get(1), i.getCenterPoint().get(2));
                }
            }
        }

        //================================================================================

        {
            if(window.isKeyPressed(GLFW_KEY_U))
            {
                for (Object i: objects)
                {
                    i.translateObject(0f, 0f, 0.001f);
                }
            }

            if(window.isKeyPressed(GLFW_KEY_O))
            {
                for (Object i: objects)
                {
                    i.translateObject(0f, 0f, -0.001f);
                }
            }

            if(window.isKeyPressed(GLFW_KEY_I))
            {
                for (Object i: objects)
                {
                    i.translateObject(0f, 0.01f, 0f);
                }
            }

            if(window.isKeyPressed(GLFW_KEY_K))
            {
                for (Object i: objects)
                {
                    i.translateObject(0f, -0.01f, 0f);
                }
            }

            if(window.isKeyPressed(GLFW_KEY_J))
            {
                for (Object i: objects)
                {
                    i.translateObject(-0.01f, 0f, 0f);
                }
            }

            if(window.isKeyPressed(GLFW_KEY_L))
            {
                for (Object i: objects)
                {
                    i.translateObject(0.01f, 0f, 0f);
                }
            }
        }

        if(window.isKeyPressed(GLFW_KEY_LEFT_SHIFT))
        {
            camera.moveForward(0.01f);
        }

        if(window.isKeyPressed(GLFW_KEY_LEFT_CONTROL))
        {
            camera.moveBackwards(0.02f);
        }

        //=========================================================================

        if (window.isKeyPressed(GLFW_KEY_SPACE)) {
            objects.get(0).getChildObject().get(9).rotateObjectOnPoint(0.010f,0f,1f,0f,objects.get(0).getChildObject().get(0).getCenterPoint().get(0),objects.get(0).getChildObject().get(0).getCenterPoint().get(1),objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
            objects.get(0).getChildObject().get(14).rotateObjectOnPoint(0.010f,0f,1f,0f,objects.get(0).getChildObject().get(0).getCenterPoint().get(0),objects.get(0).getChildObject().get(0).getCenterPoint().get(1),objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
            objects.get(0).getChildObject().get(15).rotateObjectOnPoint(0.010f,0f,1f,0f,objects.get(0).getChildObject().get(0).getCenterPoint().get(0),objects.get(0).getChildObject().get(0).getCenterPoint().get(1),objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
            objects.get(0).getChildObject().get(16).rotateObjectOnPoint(0.010f,0f,1f,0f,objects.get(0).getChildObject().get(0).getCenterPoint().get(0),objects.get(0).getChildObject().get(0).getCenterPoint().get(1),objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
        }

        if (window.isKeyPressed(GLFW_KEY_B)) {
            objects.get(0).getChildObject().get(20).rotateObjectOnPoint(0.010f,1f,0f,0f,objects.get(0).getChildObject().get(0).getCenterPoint().get(0),objects.get(0).getChildObject().get(0).getCenterPoint().get(1),objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
            objects.get(0).getChildObject().get(21).rotateObjectOnPoint(0.010f,1f,0f,0f,objects.get(0).getChildObject().get(0).getCenterPoint().get(0),objects.get(0).getChildObject().get(0).getCenterPoint().get(1),objects.get(0).getChildObject().get(0).getCenterPoint().get(2));
        }    }
    public void loop(){
        while (window.isOpen()) {
            window.update();
            glClearColor(11/255f, 174/255f, 246/255f, 0.0f);
            GL.createCapabilities();
            input();

            //code
            for(Object object: objects){
                object.draw(camera,projection);
            }
            for(Object object: objectsBerzier){
                object.drawCurveForLineStrip(camera,projection);
            }
            for(Object object: objectsBerzier2){
                object.drawCurveForLineStrip(camera,projection);
            }
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
        new MainMartinus().run();
    }
}