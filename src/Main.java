import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição do curso JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria JAVA");
        mentoria.setDescricao("Descrição da mentoria JAVA");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA Developer");
        bootcamp.setDescricao("Descrição do bootcamp JAVA Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devItallo = new Dev();
        devItallo.setNome("Itallo");
        devItallo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Itallo:" + devItallo.getConteudosInscritos());
        devItallo.progredir();
        devItallo.progredir();
        devItallo.progredir();
        System.out.println("Conteúdos inscritos Itallo:" + devItallo.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Itallo:" + devItallo.getConteudosConcluidos());
        System.out.println("XP de Itallo:" + devItallo.calcularTotalXp());

        System.out.println("================================================================");

        Dev devCamila = new Dev();
        devCamila.setNome("João");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP de Itallo:" + devCamila.calcularTotalXp());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(
//                "Mentoria{" +
//                        "titulo='" + mentoria.getTitulo() + '\'' +
//                        ", descricao='" + mentoria.getDescricao() + '\'' +
//                        ", data=" + mentoria.getData().format(formatter) +
//                        '}'
//        );

    }
}
