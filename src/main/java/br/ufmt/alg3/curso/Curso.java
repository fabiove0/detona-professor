package br.ufmt.alg3.curso;

public class Curso {
    private String nome;
    private String periodo; //   mat, vesp, not
    private float nota; // 0-5 numeros reais
    private String comentario; 
    private String rga;
    private String semestre; //  2024/1
    /* encapsulamente: limitacao da interacao do usuario com o programa, permitindo */
    // void 'e um tipo de retorno. Logo C e Java nao tem procedimentos

    public Curso(){
        periodo = "Matutino";
    }
    public Curso(String nome){
        this.nome=nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPeriodo(String periodo){
        this.periodo=periodo;
    }

    public String getPeriodo(){
        return periodo;
    }

    public void setNota(float nota){
        this.nota=nota;
    }

    public float getNota(){
        return nota;
    }

    public void setComentario(String comentario){
        this.comentario=comentario;
    }

    public String getComentario(){
        return comentario;
    }

    public void setRga(String rga){
        this.rga=rga;
    }

    public String getRga(){
        return rga;
    }

    public void setSemestre(String semestre){
        this.semestre=semestre;
    }

    public String getSemestre(){
        return semestre;
    }
}
