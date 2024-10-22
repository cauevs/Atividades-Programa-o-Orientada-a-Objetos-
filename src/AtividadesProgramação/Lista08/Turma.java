/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.Lista08;

import java.util.ArrayList;

/**
 *
 * @author Cauê
 */
public class Turma {

    private String disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Turno turno;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public ArrayList<Aluno> getAluno() {
        return alunos;
    }

    public void incluirAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public Aluno obterAlunoMelhorNotaEnem() {
        if (getAluno().size() == 0) {
            return null;
        } else {
            Aluno alunoMelhorNota = alunos.get(0);
            for (Aluno a : getAluno()) {
                if (a.getNotaEnem() > alunoMelhorNota.getNotaEnem()) {
                    alunoMelhorNota = a;
                }
            }
            return alunoMelhorNota;
        }

    }
}
