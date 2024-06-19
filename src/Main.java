import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java Backend");
        curso.setDescricao("Descricao Curso Java Backend");
        curso.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descriçao Mentoria Java Backend");
        mentoria.setData(LocalDate.now());
        /* System.out.println(curso);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devMonique = new Dev();
        devMonique.setNome("Monique");
        devMonique.inscreverBootcamp(bootcamp);
        System.out.println("Dev " + devMonique.getNome() + " Conteudos Inscritos " + devMonique.getConteudosInscritos() );
        devMonique.progredir();
        System.out.println("Dev " + devMonique.getNome() + " Conteudos Concluidos " + devMonique.getConteudosConcluidos() );
        System.out.println("Dev " + devMonique.getNome() + " Conteudos Inscritos " + devMonique.getConteudosInscritos() );
        devMonique.progredir();
        System.out.println("Dev " + devMonique.getNome() + " Conteudos Concluidos " + devMonique.getConteudosConcluidos() );
        System.out.println("Dev " + devMonique.getNome() + " Conteudos Inscritos " + devMonique.getConteudosInscritos() );
        System.out.println("XP Dev " + devMonique.getNome() + " = " + devMonique.calcularXP());

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Dev " + devGabriel.getNome() + " Conteudos Inscritos " + devGabriel.getConteudosInscritos() );
        devGabriel.progredir();
        System.out.println("Dev " + devGabriel.getNome() + " Conteudos Concluidos " + devGabriel.getConteudosConcluidos() );
        System.out.println("Dev " + devGabriel.getNome() + " Conteudos Inscritos " + devGabriel.getConteudosInscritos() );
        System.out.println("XP Dev " + devGabriel.getNome() + " = " + devGabriel.calcularXP());
    }
}
