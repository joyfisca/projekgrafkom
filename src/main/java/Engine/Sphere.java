package Engine;

import org.joml.Vector3f;
import org.joml.Vector4f;

import java.util.ArrayList;
import java.util.List;

import static org.lwjgl.opengl.GL11.*;

public class Sphere extends Circle {
    float radiusZ;
    int stackCount;
    int sectorCount;

    public Sphere(List<ShaderModuleData> shaderModuleDataList, List<Vector3f> vertices, Vector4f color, List<Float> centerPoint, Float radiusX, Float radiusY, Float radiusZ,
                  int sectorCount, int stackCount, int option) {
        super(shaderModuleDataList, vertices, color, centerPoint, radiusX, radiusY);
        this.radiusZ = radiusZ;
        this.stackCount = stackCount;
        this.sectorCount = sectorCount;

        if (option == 1) {
            createBox();
        } else if (option == 2) {
            createSphere();
        } else if (option == 3) {
            createElipsoid();
        } else if (option == 4) {
            createHyperboloid1Side();
        } else if (option == 5) {
            createHyperboloid2ide();
        } else if (option == 6) {
            createEllipticCone();
        } else if (option == 7) {
            createEllipticParaboloid();
        } else if (option == 8) {
            createHyperboloidParaboloid();
        } else if (option == 9) {
            createCylinder();
        } else if (option == 10) {
            createStandCylinder();
        } else if (option == 11) {
            createLimas();
        } else if (option == 12) {
            createLimasSegiempat();
        } else if (option == 13) {
            createPrism();
        } else if (option == 14) {
            createHexagonalPrism();
        } else if (option == 15) {
            createHalfCylinder();
        } else if (option == 16) {
            createOctagonalPrism();
        } else if (option == 17) {
            createDecagonalPrism();
        } else if (option == 18) {
            createNonagonalPrism();
        } else if (option == 19) {
            createPrismaSegitiga();
        } else if (option == 20) {
            createTrapezoidwithSquare();
        } else if (option == 21) {
            createEllipticCone2();
        }
        setupVAOVBO();

    }

    public void createBox() {
        Vector3f temp = new Vector3f();
        ArrayList<Vector3f> tempVertices = new ArrayList<>();
        //TITIK 1 KIRI ATAS BELAKANG (PERLU DITURUNIN)
        temp.x = centerPoint.get(0) - radiusX / 2.0f;
        temp.y = centerPoint.get(1) + radiusY / 2.0f;
        temp.z = centerPoint.get(2) - radiusZ / 2.0f;
        tempVertices.add(temp);
        temp = new Vector3f();
        //TITIK 2 KANAN ATAS BELAKANG (PERLU DITURUNIN)
        temp.x = centerPoint.get(0) + radiusX / 2.0f;
        temp.y = centerPoint.get(1) + radiusY / 2.0f;
        temp.z = centerPoint.get(2) - radiusZ / 2.0f;
        tempVertices.add(temp);
        temp = new Vector3f();
        //TITIK 3 KANAN BAWAH BELAKANG
        temp.x = centerPoint.get(0) + radiusX / 2.0f;
        temp.y = centerPoint.get(1) - radiusY / 2.0f;
        temp.z = centerPoint.get(2) - radiusZ / 2.0f;
        tempVertices.add(temp);
        temp = new Vector3f();
        //TITIK 4 KIRI BAWAH BELAKANG
        temp.x = centerPoint.get(0) - radiusX / 2.0f;
        temp.y = centerPoint.get(1) - radiusY / 2.0f;
        temp.z = centerPoint.get(2) - radiusZ / 2.0f;
        tempVertices.add(temp);
        temp = new Vector3f();
        //TITIK 5 KIRI ATAS DEPAN (PERLU DITURUNIN)
        temp.x = centerPoint.get(0) - radiusX / 2.0f;
        temp.y = centerPoint.get(1) + radiusY / 2.0f;
        temp.z = centerPoint.get(2) + radiusZ / 2.0f;
        tempVertices.add(temp);
        temp = new Vector3f();
        //TITIK 6 KANAN ATAS DEPAN (PERLU DITURUNIN)
        temp.x = centerPoint.get(0) + radiusX / 2.0f;
        temp.y = centerPoint.get(1) + radiusY / 2.0f;
        temp.z = centerPoint.get(2) + radiusZ / 2.0f;
        tempVertices.add(temp);
        temp = new Vector3f();
        //TITIK 7 KANAN BAWAH DEPAN
        temp.x = centerPoint.get(0) + radiusX / 2.0f;
        temp.y = centerPoint.get(1) - radiusY / 2.0f;
        temp.z = centerPoint.get(2) + radiusZ / 2.0f;
        tempVertices.add(temp);
        temp = new Vector3f();
        //TITIK 8 KIRI BAWAH DEPAN
        temp.x = centerPoint.get(0) - radiusX / 2.0f;
        temp.y = centerPoint.get(1) - radiusY / 2.0f;
        temp.z = centerPoint.get(2) + radiusZ / 2.0f;
        tempVertices.add(temp);
        temp = new Vector3f();

        vertices.clear();
        //kotak yg sisi belakang
        vertices.add(tempVertices.get(0));
        vertices.add(tempVertices.get(1));
        vertices.add(tempVertices.get(2));
        vertices.add(tempVertices.get(3));
        //kotak yg sisi depan
        vertices.add(tempVertices.get(4));
        vertices.add(tempVertices.get(5));
        vertices.add(tempVertices.get(6));
        vertices.add(tempVertices.get(7));
        //kotak yg sisi kiri
        vertices.add(tempVertices.get(0));
        vertices.add(tempVertices.get(4));
        vertices.add(tempVertices.get(7));
        vertices.add(tempVertices.get(3));
        //kotak yg sisi kanan
        vertices.add(tempVertices.get(1));
        vertices.add(tempVertices.get(5));
        vertices.add(tempVertices.get(6));
        vertices.add(tempVertices.get(2));
        //kotak yg sisi atas
        vertices.add(tempVertices.get(0));
        vertices.add(tempVertices.get(1));
        vertices.add(tempVertices.get(5));
        vertices.add(tempVertices.get(4));
        //kotak yg sisi bawah
        vertices.add(tempVertices.get(3));
        vertices.add(tempVertices.get(2));
        vertices.add(tempVertices.get(7));
        vertices.add(tempVertices.get(6));
    }

    public void draw() {
//        drawSetup();
        glLineWidth(1); //ketebalan garis
        glPointSize(1); //besar kecil vertex
        glDrawArrays(GL_LINE_STRIP,
                0,
                vertices.size());
    }

    public void createSphere() {
        float pi = (float) Math.PI;

        float sectorStep = 2 * (float) Math.PI / sectorCount;
        float stackStep = (float) Math.PI / stackCount;
        float sectorAngle, StackAngle, x, y, z;

        for (int i = 0; i <= stackCount; ++i) {
            StackAngle = pi / 2 - i * stackStep;
            x = radiusX * (float) Math.cos(StackAngle);
            y = radiusY * (float) Math.cos(StackAngle);
            z = radiusZ * (float) Math.sin(StackAngle);

            for (int j = 0; j <= sectorCount; ++j) {
                sectorAngle = j * sectorStep;
                Vector3f temp_vector = new Vector3f();
                temp_vector.x = centerPoint.get(0) + x * (float) Math.cos(sectorAngle);
                temp_vector.y = centerPoint.get(1) + y * (float) Math.sin(sectorAngle);
                temp_vector.z = centerPoint.get(2) + z;
                vertices.add(temp_vector);
            }
        }
    }

    public void createElipsoid() {
        ArrayList<Vector3f> temp = new ArrayList<>();

        for (double v = -Math.PI / 2; v <= Math.PI / 2; v += Math.PI / 60) {
            for (double u = -Math.PI; u <= Math.PI; u += Math.PI / 60) {
                float x = radiusX * (float) (Math.cos(v) * Math.cos(u));
                float y = radiusY * (float) (Math.cos(v) * Math.sin(u));
                float z = radiusZ * (float) (Math.sin(v));
                temp.add(new Vector3f(x, z, y));
            }
        }
//        System.out.println(temp.size());
        vertices = temp;
    }

    public void createHyperboloid1Side() {
        ArrayList<Vector3f> temp = new ArrayList<>();

        for (double v = -Math.PI / 2; v <= Math.PI / 2; v += Math.PI / 60) {
            for (double u = -Math.PI; u <= Math.PI; u += Math.PI / 60) {
                float x = 0.5f * (float) (1 / Math.cos(v) * Math.cos(u));
                float y = 0.3f * (float) (1 / Math.cos(v) * Math.sin(u));
                float z = 0.5f * (float) (Math.tan(v));
                temp.add(new Vector3f(x, z, y));
            }
        }
        System.out.println(temp.size());
        vertices = temp;
    }

    public void createHyperboloid2ide() {
        ArrayList<Vector3f> temp = new ArrayList<>();

        for (double v = -Math.PI / 2; v <= Math.PI / 2; v += Math.PI / 60) {
            for (double u = Math.PI / 2; u <= 3 * Math.PI / 2; u += Math.PI / 60) {
                float x = 0.5f * (float) (Math.tan(v) * Math.cos(u));
                float y = 0.3f * (float) (Math.tan(v) * Math.sin(u));
                float z = 0.5f * (float) (1 / Math.cos(v));
                temp.add(new Vector3f(x, z, y));
            }
        }
        System.out.println(temp.size());
        vertices = temp;
    }

    public void createEllipticCone() {
        ArrayList<Vector3f> temp = new ArrayList<>();

        for (double v = -Math.PI / 2; v <= Math.PI / 2; v += Math.PI / 60) {
            for (double u = -Math.PI; u <= Math.PI / 2; u += Math.PI / 60) {
                float x = (float) (0.5f * v * Math.cos(u));
                float y = 0.3f * (float) (v * Math.sin(u));
                float z = 0.5f * (float) v;
                temp.add(new Vector3f(x, z, y));
            }
        }
        System.out.println(temp.size());
        vertices = temp;
    }

    public void createEllipticParaboloid() {
        ArrayList<Vector3f> temp = new ArrayList<>();

        for (double v = -Math.PI / 2; v <= Math.PI / 2; v += Math.PI / 60) {
            for (double u = -Math.PI; u <= Math.PI / 2; u += Math.PI / 60) {
                float x = (float) (0.5f * v * Math.cos(u));
                float y = 0.3f * (float) (v * Math.sin(u));
                float z = 0.5f * (float) v * (float) v;
                temp.add(new Vector3f(x, z, y));
            }
        }
        System.out.println(temp.size());
        vertices = temp;
    }

    public void createHyperboloidParaboloid() {
        ArrayList<Vector3f> temp = new ArrayList<>();
        for (double v = -Math.PI / 2; v <= Math.PI / 2; v += Math.PI / 60) {
            for (double u = -Math.PI; u <= Math.PI; u += Math.PI / 60) {
                float x = 0.5f * (float) v * (float) (Math.tan(u));
                float y = 0.3f * (float) v * (float) (1 / Math.cos(u));
                float z = (float) v * (float) v;
                temp.add(new Vector3f(x, y, z));
            }
        }
        vertices = temp;
    }

    public void createCylinder() {
        vertices.clear();
        ArrayList<Vector3f> temp = new ArrayList<>();

        for (double i = 0; i < 360; i += 0.1) {
            float x = centerPoint.get(0) + radiusX * (float) Math.cos(Math.toRadians(i));
            float y = centerPoint.get(1) + radiusY * (float) Math.sin(Math.toRadians(i));

            temp.add(new Vector3f((float) x, (float) y, 0.0f));
            temp.add(new Vector3f((float) x, (float) y, -radiusZ));

            temp.add(new Vector3f((float) x, (float) y, 0.0f));
        }
        vertices = temp;
    }

    public void createStandCylinder() {
        vertices.clear();
        ArrayList<Vector3f> temp = new ArrayList<>();

        for (double i = 0; i < 360; i += 0.1) {
            float x = centerPoint.get(0) + radiusX * (float) Math.cos(Math.toRadians(i));
            float z = centerPoint.get(1) + radiusZ * (float) Math.sin(Math.toRadians(i));

            temp.add(new Vector3f((float) x, 0.0f, (float) z));
            temp.add(new Vector3f((float) x, -radiusY, (float) z));
        }
        vertices = temp;
    }

    public void createLimas() {
        Vector3f temp = new Vector3f();
        ArrayList<Vector3f> tempVertices = new ArrayList<>();
        //TITIK 1   kiri
        temp.x = centerPoint.get(0) - radiusX / 2.0f;
        temp.y = 0;
        temp.z = 0;
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 2   depan
        temp.x = 0;
        temp.y = 0;
        temp.z = centerPoint.get(2) + radiusZ;
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 3   kanan
        temp.x = centerPoint.get(0) + radiusX / 2.0f;
        temp.y = 0;
        temp.z = 0;
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 4   atas
        temp.x = 0;
        temp.y = centerPoint.get(1) + radiusY;
        temp.z = centerPoint.get(2) + 0.5f * radiusZ;
        tempVertices.add(temp);
        temp = new Vector3f();

        vertices.clear();
        //kotak yg sisi belakang
        vertices.add(tempVertices.get(0));
        vertices.add(tempVertices.get(1));
        vertices.add(tempVertices.get(2));
        vertices.add(tempVertices.get(0));

        vertices.add(tempVertices.get(0));
        vertices.add(tempVertices.get(3));
        vertices.add(tempVertices.get(1));
        vertices.add(tempVertices.get(3));
        vertices.add(tempVertices.get(2));
    }

    public void createPrismaSegitiga() {
        Vector3f temp = new Vector3f();
        ArrayList<Vector3f> tempVertices = new ArrayList<>();
        //TITIK 1   A
        temp.x = centerPoint.get(0) + radiusX / 2.0f;
        temp.y = 0;
        temp.z = centerPoint.get(2) + radiusZ / 2.0f;
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 2   B
        temp.x = centerPoint.get(0) + radiusX;
        temp.y = 0;
        temp.z = 0;
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 3   C
        temp.x = 0;
        temp.y = 0;
        temp.z = 0;
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 4   D
        temp.x = centerPoint.get(0) + radiusX / 2.0f;
        temp.y = centerPoint.get(1) + radiusY;
        temp.z = centerPoint.get(2) + radiusZ / 2.0f;
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 5   E
        temp.x = centerPoint.get(0) + radiusX;
        temp.y = centerPoint.get(1) + radiusY;
        temp.z = 0;
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 6   F
        temp.x = 0;
        temp.y = centerPoint.get(1) + radiusY;
        temp.z = 0;
        tempVertices.add(temp);
        temp = new Vector3f();


        vertices.clear();
        //kotak yg sisi belakang
        vertices.add(tempVertices.get(0));
        vertices.add(tempVertices.get(1));
        vertices.add(tempVertices.get(2));
        vertices.add(tempVertices.get(0));

        vertices.add(tempVertices.get(3));
        vertices.add(tempVertices.get(4));
        vertices.add(tempVertices.get(5));
        vertices.add(tempVertices.get(3));

        vertices.add(tempVertices.get(4));
        vertices.add(tempVertices.get(1));
        vertices.add(tempVertices.get(2));
        vertices.add(tempVertices.get(5));

    }

    public void createPrism() {
        Vector3f temp = new Vector3f();
        ArrayList<Vector3f> tempVertices = new ArrayList<>();

        //TITIK 1 A
        temp.x = centerPoint.get(0) + radiusX / 2.0f;
        temp.y = 0;
        temp.z = centerPoint.get(2) + radiusZ / 2.0f;
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 2   B
        temp.x = centerPoint.get(0) + radiusX;
        temp.y = 0;
        temp.z = centerPoint.get(2) + radiusZ / 2.0f;
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 3   C
        temp.x = centerPoint.get(0) + radiusX / 2.0f;
        temp.y = 0;
        temp.z = centerPoint.get(2);
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 4   D
        temp.x = centerPoint.get(0) + radiusX / 2.0f;
        temp.y = centerPoint.get(1) + radiusY;
        temp.z = centerPoint.get(2) + radiusZ / 2.0f;
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 5   E
        temp.x = centerPoint.get(0) + radiusX;
        temp.y = centerPoint.get(1) + radiusY;
        temp.z = centerPoint.get(2) + radiusZ / 2.0f;
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 6   F
        temp.x = centerPoint.get(0) + radiusX / 2.0f;
        temp.y = centerPoint.get(1) + radiusY;
        temp.z = centerPoint.get(2);
        tempVertices.add(temp);
        temp = new Vector3f();


        vertices.clear();
        //kotak yg sisi belakang
        vertices.add(tempVertices.get(0));
        vertices.add(tempVertices.get(1));
        vertices.add(tempVertices.get(2));
        vertices.add(tempVertices.get(0));

        vertices.add(tempVertices.get(3));
        vertices.add(tempVertices.get(4));
        vertices.add(tempVertices.get(5));
        vertices.add(tempVertices.get(3));

        vertices.add(tempVertices.get(4));
        vertices.add(tempVertices.get(1));
        vertices.add(tempVertices.get(2));
        vertices.add(tempVertices.get(5));
    }

    public void createHexagonalPrism() {
        ArrayList<Vector3f> tempVertices = new ArrayList<>();
        float height = radiusY * 2;
        float halfSideLength = (float) (radiusX / Math.sqrt(3));
        float distanceFromCenter = (float) (radiusX * Math.sqrt(3) / 2);
        //TITIK 1
        Vector3f temp = new Vector3f(centerPoint.get(0) - halfSideLength, centerPoint.get(1), centerPoint.get(2) - distanceFromCenter);
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 2
        temp = new Vector3f(centerPoint.get(0) + halfSideLength, centerPoint.get(1), centerPoint.get(2) - distanceFromCenter);
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 3
        temp = new Vector3f(centerPoint.get(0) + radiusX, centerPoint.get(1), centerPoint.get(2));
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 4
        temp = new Vector3f(centerPoint.get(0) + halfSideLength, centerPoint.get(1), centerPoint.get(2) + distanceFromCenter);
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 5
        temp = new Vector3f(centerPoint.get(0) - halfSideLength, centerPoint.get(1), centerPoint.get(2) + distanceFromCenter);
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 6
        temp = new Vector3f(centerPoint.get(0) - radiusX, centerPoint.get(1), centerPoint.get(2));
        tempVertices.add(temp);

        vertices.clear();
        //Sisi belakang
        vertices.add(tempVertices.get(0));
        vertices.add(tempVertices.get(1));
        vertices.add(tempVertices.get(2));
        vertices.add(tempVertices.get(3));
        vertices.add(tempVertices.get(4));
        vertices.add(tempVertices.get(5));
        vertices.add(tempVertices.get(0));
        //Sisi depan
        vertices.add(new Vector3f(tempVertices.get(0).x, tempVertices.get(0).y + height, tempVertices.get(0).z));
        vertices.add(new Vector3f(tempVertices.get(1).x, tempVertices.get(1).y + height, tempVertices.get(1).z));
        vertices.add(new Vector3f(tempVertices.get(2).x, tempVertices.get(2).y + height, tempVertices.get(2).z));
        vertices.add(new Vector3f(tempVertices.get(3).x, tempVertices.get(3).y + height, tempVertices.get(3).z));
        vertices.add(new Vector3f(tempVertices.get(4).x, tempVertices.get(4).y + height, tempVertices.get(4).z));
        vertices.add(new Vector3f(tempVertices.get(5).x, tempVertices.get(5).y + height, tempVertices.get(5).z));
        vertices.add(new Vector3f(tempVertices.get(0).x, tempVertices.get(0).y + height, tempVertices.get(0).z));
        //Sisi-sisi
        vertices.add(tempVertices.get(0));
        vertices.add(new Vector3f(tempVertices.get(0).x, tempVertices.get(0).y + height, tempVertices.get(0).z));
        vertices.add(tempVertices.get(1));
        vertices.add(new Vector3f(tempVertices.get(1).x, tempVertices.get(1).y + height, tempVertices.get(1).z));
        vertices.add(tempVertices.get(2));
        vertices.add(new Vector3f(tempVertices.get(2).x, tempVertices.get(2).y + height, tempVertices.get(2).z));
        vertices.add(tempVertices.get(3));
        vertices.add(new Vector3f(tempVertices.get(3).x, tempVertices.get(3).y + height, tempVertices.get(3).z));
        vertices.add(tempVertices.get(4));
        vertices.add(new Vector3f(tempVertices.get(4).x, tempVertices.get(4).y + height, tempVertices.get(4).z));
        vertices.add(tempVertices.get(5));
        vertices.add(new Vector3f(tempVertices.get(5).x, tempVertices.get(5).y + height, tempVertices.get(5).z));
    }

    public void createHalfCylinder() {
        vertices.clear();
        ArrayList<Vector3f> temp = new ArrayList<>();

        for (double i = 0; i <= 180; i += 1) {
            float x = centerPoint.get(0) + radiusX * (float) Math.cos(Math.toRadians(i));
            float y = centerPoint.get(1) + radiusY * (float) Math.sin(Math.toRadians(i));
//
//            if (i > 180){
//
//            }

            temp.add(new Vector3f((float) x, (float) y, 0.0f));
            temp.add(new Vector3f((float) x, (float) y, -radiusZ));

            temp.add(new Vector3f((float) x, (float) y, 0.0f));
        }
        vertices = temp;
    }

    public void createOctagonalPrism() {
        ArrayList<Vector3f> tempVertices = new ArrayList<>();
        float height = radiusY * 2;
        float sideLength = (float) (radiusX / Math.sqrt(2 - 2 * Math.cos(Math.toRadians(360.0 / 8))));
        float distanceFromCenter = (float) (radiusX * Math.sqrt(2 - 2 * Math.cos(Math.toRadians(360.0 / 8))) / 2);

        // Calculate the 8 vertices
        for (int i = 0; i < 8; i++) {
            float angle = (float) Math.toRadians(i * 45);
            float x = centerPoint.get(0) + (float) (distanceFromCenter * Math.cos(angle));
            float z = centerPoint.get(2) - (float) (distanceFromCenter * Math.sin(angle));
            tempVertices.add(new Vector3f(x, centerPoint.get(1), z));
        }

        vertices.clear();
        // Add the back face
        vertices.add(tempVertices.get(0));
        vertices.add(tempVertices.get(1));
        vertices.add(tempVertices.get(2));
        vertices.add(tempVertices.get(3));
        vertices.add(tempVertices.get(4));
        vertices.add(tempVertices.get(5));
        vertices.add(tempVertices.get(6));
        vertices.add(tempVertices.get(7));
        vertices.add(tempVertices.get(0));

        // Add the front face
        for (int i = 0; i < 8; i++) {
            Vector3f vertex = tempVertices.get(i);
            vertices.add(new Vector3f(vertex.x, vertex.y + height, vertex.z));
        }
        vertices.add(tempVertices.get(0));
        vertices.add(tempVertices.get(1));
        vertices.add(tempVertices.get(2));
        vertices.add(tempVertices.get(3));
        vertices.add(tempVertices.get(4));
        vertices.add(tempVertices.get(5));
        vertices.add(tempVertices.get(6));
        vertices.add(tempVertices.get(7));
        vertices.add(tempVertices.get(0));

        // Add the side faces
        for (int i = 0; i < 8; i++) {
            Vector3f vertex1 = tempVertices.get(i);
            Vector3f vertex2 = tempVertices.get((i + 1) % 8);
            Vector3f vertex3 = new Vector3f(vertex1.x, vertex1.y + height, vertex1.z);
            Vector3f vertex4 = new Vector3f(vertex2.x, vertex2.y + height, vertex2.z);
            vertices.add(vertex1);
            vertices.add(vertex2);
            vertices.add(vertex3);
            vertices.add(vertex4);
        }
    }

    public void createDecagonalPrism() {
        ArrayList<Vector3f> tempVertices = new ArrayList<>();
        float height = radiusY * 2;
        float sideLength = (float) (radiusX / Math.sqrt(2 - 2 * Math.cos(Math.toRadians(360.0 / 10))));
        float distanceFromCenter = (float) (radiusX * Math.sqrt(2 - 2 * Math.cos(Math.toRadians(360.0 / 10))) / 2);

        // Calculate the 10 vertices
        for (int i = 0; i < 10; i++) {
            float angle = (float) Math.toRadians(i * 36);
            float x = centerPoint.get(0) + (float) (distanceFromCenter * Math.cos(angle));
            float z = centerPoint.get(2) - (float) (distanceFromCenter * Math.sin(angle));
            tempVertices.add(new Vector3f(x, centerPoint.get(1), z));
        }

        vertices.clear();
        // Add the back face
        vertices.add(tempVertices.get(0));
        vertices.add(tempVertices.get(1));
        vertices.add(tempVertices.get(2));
        vertices.add(tempVertices.get(3));
        vertices.add(tempVertices.get(4));
        vertices.add(tempVertices.get(5));
        vertices.add(tempVertices.get(6));
        vertices.add(tempVertices.get(7));
        vertices.add(tempVertices.get(8));
        vertices.add(tempVertices.get(9));
        vertices.add(tempVertices.get(0));

        // Add the front face
        for (int i = 0; i < 10; i++) {
            Vector3f vertex = tempVertices.get(i);
            vertices.add(new Vector3f(vertex.x, vertex.y + height, vertex.z));
        }
        vertices.add(tempVertices.get(0));
        vertices.add(tempVertices.get(1));
        vertices.add(tempVertices.get(2));
        vertices.add(tempVertices.get(3));
        vertices.add(tempVertices.get(4));
        vertices.add(tempVertices.get(5));
        vertices.add(tempVertices.get(6));
        vertices.add(tempVertices.get(7));
        vertices.add(tempVertices.get(8));
        vertices.add(tempVertices.get(9));
        vertices.add(tempVertices.get(0));

        // Add the side faces
        for (int i = 0; i < 10; i++) {
            Vector3f vertex1 = tempVertices.get(i);
            Vector3f vertex2 = tempVertices.get((i + 1) % 10);
            Vector3f vertex3 = new Vector3f(vertex1.x, vertex1.y + height, vertex1.z);
            Vector3f vertex4 = new Vector3f(vertex2.x, vertex2.y + height, vertex2.z);
            vertices.add(vertex1);
            vertices.add(vertex2);
            vertices.add(vertex3);
            vertices.add(vertex4);
        }
    }

    public void createNonagonalPrism() {
        ArrayList<Vector3f> tempVertices = new ArrayList<>();
        float height = radiusY * 2;
        float sideLength = (float) (radiusX / Math.sqrt(2 - 2 * Math.cos(Math.toRadians(360.0 / 9))));
        float distanceFromCenter = (float) (radiusX * Math.sqrt(2 - 2 * Math.cos(Math.toRadians(360.0 / 18))));

        // Calculate the 9 vertices
        for (int i = 0; i < 9; i++) {
            float angle = (float) Math.toRadians(i * 40);
            float x = centerPoint.get(0) + (float) (distanceFromCenter * Math.cos(angle));
            float z = centerPoint.get(2) - (float) (distanceFromCenter * Math.sin(angle));
            tempVertices.add(new Vector3f(x, centerPoint.get(1), z));
        }

        vertices.clear();
        // Add the back face
        vertices.add(tempVertices.get(0));
        vertices.add(tempVertices.get(1));
        vertices.add(tempVertices.get(2));
        vertices.add(tempVertices.get(3));
        vertices.add(tempVertices.get(4));
        vertices.add(tempVertices.get(5));
        vertices.add(tempVertices.get(6));
        vertices.add(tempVertices.get(7));
        vertices.add(tempVertices.get(8));
        vertices.add(tempVertices.get(0));

        // Add the front face
        for (int i = 0; i < 9; i++) {
            Vector3f vertex = tempVertices.get(i);
            vertices.add(new Vector3f(vertex.x, vertex.y + height, vertex.z));
        }
        vertices.add(tempVertices.get(0));
        vertices.add(tempVertices.get(1));
        vertices.add(tempVertices.get(2));
        vertices.add(tempVertices.get(3));
        vertices.add(tempVertices.get(4));
        vertices.add(tempVertices.get(5));
        vertices.add(tempVertices.get(6));
        vertices.add(tempVertices.get(7));
        vertices.add(tempVertices.get(8));
        vertices.add(tempVertices.get(0));

        // Add the side faces
        for (int i = 0; i < 9; i++) {
            Vector3f vertex1 = tempVertices.get(i);
            Vector3f vertex2 = tempVertices.get((i + 1) % 9);
            Vector3f vertex3 = new Vector3f(vertex1.x, vertex1.y + height, vertex1.z);
            Vector3f vertex4 = new Vector3f(vertex2.x, vertex2.y + height, vertex2.z);
            vertices.add(vertex1);
            vertices.add(vertex2);
            vertices.add(vertex3);
            vertices.add(vertex4);
        }
    }

    public void createLimasSegiempat() {
        Vector3f temp = new Vector3f();
        ArrayList<Vector3f> tempVertices = new ArrayList<>();

        //TITIK 1   kiri depan
        temp.x = centerPoint.get(0) - radiusX / 2.0f;
        temp.y = centerPoint.get(1);
        temp.z = centerPoint.get(2) + radiusZ / 2.0f;
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 2   kanan depan
        temp.x = centerPoint.get(0) + radiusX / 2.0f;
        temp.y = centerPoint.get(1);
        temp.z = centerPoint.get(2) + radiusZ / 2.0f;
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 3   kanan belakang
        temp.x = centerPoint.get(0) + radiusX / 2.0f;
        temp.y = centerPoint.get(1);
        temp.z = centerPoint.get(2) - radiusZ / 2.0f;
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 4   kiri belakang
        temp.x = centerPoint.get(0) - radiusX / 2.0f;
        temp.y = centerPoint.get(1);
        temp.z = centerPoint.get(2) - radiusZ / 2.0f;
        tempVertices.add(temp);
        temp = new Vector3f();

        //TITIK 5   puncak
        temp.x = centerPoint.get(0);
        temp.y = centerPoint.get(1) + radiusY;
        temp.z = centerPoint.get(2);
        tempVertices.add(temp);

        vertices.clear();
        //sisi bawah
        vertices.add(tempVertices.get(0));
        vertices.add(tempVertices.get(1));
        vertices.add(tempVertices.get(2));
        vertices.add(tempVertices.get(3));
        vertices.add(tempVertices.get(0));

        //sisi segitiga
        vertices.add(tempVertices.get(0));
        vertices.add(tempVertices.get(4));
        vertices.add(tempVertices.get(1));

        vertices.add(tempVertices.get(1));
        vertices.add(tempVertices.get(4));
        vertices.add(tempVertices.get(2));

        vertices.add(tempVertices.get(2));
        vertices.add(tempVertices.get(4));
        vertices.add(tempVertices.get(3));

        vertices.add(tempVertices.get(3));
        vertices.add(tempVertices.get(4));
        vertices.add(tempVertices.get(0));
    }

    public void createTrapezoidwithSquare() {
        Vector3f temp = new Vector3f();
        ArrayList<Vector3f> tempVertices = new ArrayList<>();

        //titik 1 kiri atas belakang
        temp.x = (float)centerPoint.get(0) - radiusX/2;
        temp.y = (float)centerPoint.get(1)+ radiusY/2;
        temp.z = (float)centerPoint.get(2)- radiusZ/2;
        tempVertices.add(temp);
        temp = new Vector3f();

        //titik 2 kiri bawah belakang
        temp.x = (float)centerPoint.get(0) - radiusX/2f;
        temp.y = (float)centerPoint.get(1) - radiusY/1.95f;
        temp.z = (float)centerPoint.get(2) - radiusZ/1.1f;
        tempVertices.add(temp);
        temp = new Vector3f();

        //titik 3 kanan bawah belakang
        temp.x = (float)centerPoint.get(0) + radiusX/2f;
        temp.y = (float)centerPoint.get(1) - radiusY/1.95f;
        temp.z = (float)centerPoint.get(2) - radiusZ/1.1f;
        tempVertices.add(temp);
        temp = new Vector3f();

        //titik 4 kanan atas belakang
        temp.x = (float)centerPoint.get(0) + radiusX/2;
        temp.y = (float)centerPoint.get(1) + radiusY/2;
        temp.z = (float)centerPoint.get(2) - radiusZ/2;
        tempVertices.add(temp);
        temp = new Vector3f();

        //titik 5 kiri atas depan
        temp.x = (float)centerPoint.get(0) - radiusX/2;
        temp.y = (float)centerPoint.get(1) + radiusY/2;
        temp.z = (float)centerPoint.get(2) + radiusZ/6;
        tempVertices.add(temp);
        temp = new Vector3f();

        //titik 6 kiri bawah depan
        temp.x = (float)centerPoint.get(0) - radiusX/2f;
        temp.y = (float)centerPoint.get(1) - radiusY/2f;
        temp.z = (float)centerPoint.get(2) + radiusZ/6f;
        tempVertices.add(temp);
        temp = new Vector3f();

        //titik 7 kanan bawah depan
        temp.x = (float)centerPoint.get(0) + radiusX/2f;
        temp.y = (float)centerPoint.get(1) - radiusY/2f;
        temp.z = (float)centerPoint.get(2) + radiusZ/6f;
        tempVertices.add(temp);
        temp = new Vector3f();

        //titik 8 kanan atas depan
        temp.x = (float)centerPoint.get(0) + radiusX/2;
        temp.y = (float)centerPoint.get(1) + radiusY/2;
        temp.z = (float)centerPoint.get(2) + radiusZ/6;
        tempVertices.add(temp);

        vertices.clear();
        {
            //BAGIAN ATAS KOTAK
            vertices.add(tempVertices.get(0));
            vertices.add(tempVertices.get(3));
            vertices.add(tempVertices.get(7));
            vertices.add(tempVertices.get(4));
            vertices.add(tempVertices.get(0));

            //TITIK MIRING KANAN DEPAN DAN TITIK MIRING KIRI DEPAN SERTA SAMBUNGKAN DEPAN
            vertices.add(tempVertices.get(1));
            vertices.add(tempVertices.get(0));
            vertices.add(tempVertices.get(4));
            vertices.add(tempVertices.get(5));
            vertices.add(tempVertices.get(1));

            //TITIK MIRING KANAN BELAKANG DAN SAMBUNGKAN KANAN
            vertices.add(tempVertices.get(0));
            vertices.add(tempVertices.get(3));
            vertices.add(tempVertices.get(2));
            vertices.add(tempVertices.get(1));

            //TITIK MIRING KIRI BELAKANG DAN SAMBUNGKAN BELAKANG
            vertices.add(tempVertices.get(0));
            vertices.add(tempVertices.get(3));
            vertices.add(tempVertices.get(7));
            vertices.add(tempVertices.get(6));
            vertices.add(tempVertices.get(2));

            //SAMBUNGKAN KIRI
            vertices.add(tempVertices.get(6));
            vertices.add(tempVertices.get(5));
        }
    }

    public void createEllipticCone2() {
        vertices.clear();
        ArrayList<Vector3f> temp = new ArrayList<>();

        for (double v = 0; v <= 2 * Math.PI; v += Math.PI / 60) {
            for (double u = -Math.PI; u <= Math.PI; u += Math.PI / 60) {
                float x = (float) ((radiusX) * v * Math.cos(u));
                float y = (float) ((radiusY) * v * Math.sin(u));
                float z = (float) ((radiusZ) * v);
                temp.add(new Vector3f(x, y, z));
            }
        }
        vertices = temp;
    }

}