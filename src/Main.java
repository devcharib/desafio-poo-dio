import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("descrição curso Js");
        curso2.setCargaHoraria(4);

        //Conteudo conteudo = new Curso(); //Polimorfismo - criando classe de conteudo apartir de Curso

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("nome mentoria");
        mentoria.setDescricao("descrição mentoria");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP :" + devCamila.calcularTotalXp());
        devCamila.progredir();
        System.out.println("XP :" + devCamila.calcularTotalXp());


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joao:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Joao:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Joao:" + devJoao.getConteudosConcluidos());
        System.out.println("XP :" + devJoao.calcularTotalXp());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("XP :" + devJoao.calcularTotalXp());


    }
}
