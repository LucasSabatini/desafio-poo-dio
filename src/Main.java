import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Desafio 'Abstraindo um Bootcamp Usando Orientação a Objetos em Java' do curso Spring Experience oferecido pela DIO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Curso Imaginário de JavaScript para testes");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso2);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lucas:" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lucas:" + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lucas:" + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularXp());

        System.out.println("---------------");

        Dev devMarco = new Dev();
        devMarco.setNome("Marco");
        devMarco.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marco:" + devMarco.getConteudosInscritos());
        devMarco.progredir();
        devMarco.progredir();
        devMarco.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Marco:" + devMarco.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Marco:" + devMarco.getConteudosConcluidos());
        System.out.println("XP: " + devMarco.calcularXp());

    }
}
