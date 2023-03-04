import br.com.desafio.poo.dio.dominio.Bootcamp;
import br.com.desafio.poo.dio.dominio.Curso;
import br.com.desafio.poo.dio.dominio.Dev;
import br.com.desafio.poo.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

    /*    System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp develope java");
        bootcamp.setDescricao("descriçãojava develope");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLet = new Dev();
        devLet.setNome("Leticia");
        devLet.inscrerBootcamp(bootcamp);
        System.out.println("conteudos inscritos" + devLet.getConteudoInscritos());
        devLet.progredir();
        devLet.progredir();
        System.out.println("conteudos inscritos" + devLet.getConteudoInscritos());
        System.out.println("conteudos concluídos" + devLet.getConteudoConcluidos());
        System.out.println("XP: "+ devLet.calcularTotalXp());
        System.out.println("----------------------");


        Dev devJoao = new Dev();
        devJoao.inscrerBootcamp(bootcamp);
        devJoao.setNome("João");
        System.out.println("conteudos inscritos" + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("conteudos inscritos" + devJoao.getConteudoInscritos());
        System.out.println("conteudos concluídos" + devJoao.getConteudoConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());
    }
}