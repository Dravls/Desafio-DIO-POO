import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java POO");
        curso2.setDescricao("Descrição curso java poo");
        curso2.setCargaHoraria(8);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso Spring");
        curso3.setDescricao("Descrição curso Spring");
        curso3.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDolly = new Dev();
        devDolly.setNome("Dolly");
        devDolly.inscreverBootcamp(bootcamp);
        System.out.println("Dolly");
        System.out.println("Conteudos inscritos: " + devDolly.getConteudosIncritos());
        devDolly.progredir();
        System.out.println("Conteudos inscritos: " + devDolly.getConteudosIncritos());
        System.out.println("Conteudos concluidos: " + devDolly.getConteudosConcluidos());
        System.out.println("XP: " + devDolly.calcularTotalXp());

        System.out.println();

        Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Jose");
        System.out.println("Conteudos inscritos: " + devJose.getConteudosIncritos());
        System.out.println("Conteudos concluidos: " + devJose.getConteudosConcluidos());
    }
}
