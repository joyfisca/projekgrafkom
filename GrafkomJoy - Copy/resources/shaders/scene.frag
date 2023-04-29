#version 330

//out artinya var dilempar keluar
out vec4 frag_color;
uniform vec4 uni_color;     //memberikan warna
void main() {
    //frag_color = vec4(1.0,0.0,0.0,1.0);
    frag_color = uni_color;
}