#version 330

//out artinya var dilempar keluar

out vec4 fragColor;
in vec4 out_color;

void main() {
    //frag_color = vec4(1.0,0.0,0.0,1.0);
    fragColor = out_color;
}