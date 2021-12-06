import br.com.dio.challenge.domain.Bootcamp;
import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Dev;
import br.com.dio.challenge.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Java Course");
        course1.setDescription("Java Beginner");
        course1.setCreditHour(8);
        
        Course course2 = new Course();
        course2.setTitle("JavaScript course");
        course2.setDescription("JS intermediate");
        course2.setCreditHour(4);
        
        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Java mentoring");
        mentoring.setDescription("From beginner to Intermediate");
        mentoring.setDate(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Bootcamp Java Backend Developer");
        bootcamp.getContent().add(course1);
        bootcamp.getContent().add(course2);
        bootcamp.getContent().add(mentoring);
    
        System.out.println();
        
        Dev devCaio = new Dev();
        devCaio.setName("Caio");
        devCaio.subscribeBootcamp(bootcamp);
        System.out.println("Caio Subscribed Contents:" + devCaio.getSubscribedContents());
        devCaio.makeProgress();
        devCaio.makeProgress();
        System.out.println("-");
        System.out.println("Caio Subscribed Contents:" + devCaio.getSubscribedContents());
        System.out.println();
        System.out.println("Caio Completed Contents:" + devCaio.getCompletedContents());
        System.out.println("XP:" + devCaio.calculateTotalXp());
        System.out.println();
        
        System.out.println("-------");
        
        Dev devJoao = new Dev();
        devJoao.setName("John");
        devJoao.subscribeBootcamp(bootcamp);
        System.out.println("John Subscribed Contents:" + devJoao.getSubscribedContents());
        devJoao.makeProgress();
        devJoao.makeProgress();
        devJoao.makeProgress();
        System.out.println("-");
        System.out.println("John Subscribed Contents:" + devJoao.getSubscribedContents());
        System.out.println();
        System.out.println("John Completed Contents:" + devJoao.getCompletedContents());
        System.out.println("XP:" + devJoao.calculateTotalXp());
        
    }
    
}